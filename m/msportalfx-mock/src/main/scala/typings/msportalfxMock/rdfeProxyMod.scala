package typings.msportalfxMock

import typings.express.mod.Express
import typings.msportalfxMock.httpsProxyMod.HttpsProxy.ExpressServer
import typings.msportalfxMock.httpsProxyMod.HttpsProxy.ProxyServer
import typings.msportalfxMock.rdfeManagerMod.RdfeManager.Manager
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdfeProxyMod {
  
  object RdfeProxy {
    
    @JSImport("msportalfx-mock/lib/src/RdfeProxy/rdfeProxy", "RdfeProxy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an rdfe proxy instance and setups firewal and certificates.
      *
      * @param rdfeEndpoint The rdfe endpoint to proxy.
      * @param serverPort The local server port.
      * @param rdfeManager The rdfe mock manager.
      * @param enablePassthrough If to enable passthrough to actual rdfe.
      * @return A promise that completes when local proxy is setup.
      */
    inline def create(rdfeEndpoint: String, serverPort: Double): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: Unit,
      customRoutes: js.Function1[/* app */ Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: Unit,
      customRoutes: js.Function1[/* app */ Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: Unit,
      customRoutes: Unit,
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(rdfeEndpoint: String, serverPort: Double, rdfeManager: Manager): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: Manager,
      customRoutes: js.Function1[/* app */ Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: Manager,
      customRoutes: js.Function1[/* app */ Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: Manager,
      customRoutes: Unit,
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    
    /**
      * Dispose local proxy
      *
      * @param rdfeEndpoint The rdfe endpoint to proxy.
      * @param serverPort The local server port.
      * @param enablePassthrough If to enable passthrough to actual rdfe.
      * @return A promise that completes when local proxy is setup.
      */
    inline def dispose(proxy: ProxyServer): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(proxy.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
    
    @js.native
    trait RdfeExpressServer extends ExpressServer {
      
      /**
        * The instance of rdfe manager.
        */
      var rdfeManager: js.UndefOr[Manager] = js.native
    }
  }
}
