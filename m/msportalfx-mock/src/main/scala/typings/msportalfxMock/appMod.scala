package typings.msportalfxMock

import typings.msportalfxMock.armManagerMod.ArmManager.Manager
import typings.msportalfxMock.httpsProxyMod.HttpsProxy.ProxyOptions
import typings.msportalfxMock.httpsProxyMod.HttpsProxy.ProxyServer
import typings.msportalfxMock.httpsProxyMod.HttpsProxy.ServerOptions
import typings.msportalfxMock.mod.RequestHandler
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod {
  
  object ArmProxy {
    
    @JSImport("msportalfx-mock/lib/src/app", "ArmProxy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an Arm proxy instance and setups firewal and certificates.
      *
      * @param armEndpoint The arm endpoint to proxy.
      * @param serverPort The local server port.
      * @param armManager The arm mock manager.
      * @param enablePassthrough If to enable passthrough to actual arm.
      * @return A promise that completes when local proxy is setup.
      */
    inline def create(armEndpoint: String, serverPort: Double): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Unit,
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Unit,
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Unit,
      customRoutes: Unit,
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(armEndpoint: String, serverPort: Double, armManager: Manager): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Manager,
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Manager,
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Manager,
      customRoutes: Unit,
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    
    /**
      * Dispose local proxy
      *
      * @param armEndpoint The arm endpoint to proxy.
      * @param serverPort The local server port.
      * @param enablePassthrough If to enable passthrough to actual arm.
      * @return A promise that completes when local proxy is setup.
      */
    inline def dispose(proxy: ProxyServer): Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(proxy.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Any]]
  }
  
  object HttpsProxy {
    
    @JSImport("msportalfx-mock/lib/src/app", "HttpsProxy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a local server running express.
      *
      * @param sslOptions The ssl options for the local https server.
      * @param targetHost The target host for the proxy.
      * @param options The local https server options.
      * @param defaultHandler The default handler for incoming requests. The default handler return 404.
      * @return A promise that when resolved will return the proxy server.
      */
    inline def createServer(sslOptions: js.Any, targetHost: String, options: ServerOptions): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def createServer(sslOptions: js.Any, targetHost: String, options: ServerOptions, defaultHandler: RequestHandler): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any], defaultHandler.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    
    /**
      * Creates a local server running express with a proxy to allow forwarding call to a target host.
      *
      * @param sslOptions The ssl options for the local https server.
      * @param targetHost The target host for the proxy.
      * @param serverOptions The local https server options.
      * @param proxOptions The proxy options.
      * @return A promise that when resolved will return the proxy server.
      */
    inline def createServerWithProxy(sslOptions: js.Any, targetHost: String, serverOptions: ServerOptions): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerWithProxy")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def createServerWithProxy(sslOptions: js.Any, targetHost: String, serverOptions: ServerOptions, proxOptions: ProxyOptions): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerWithProxy")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any], proxOptions.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
  }
  
  object RdfeProxy {
    
    @JSImport("msportalfx-mock/lib/src/app", "RdfeProxy")
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
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: Unit,
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: Unit,
      customRoutes: Unit,
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: typings.msportalfxMock.rdfeManagerMod.RdfeManager.Manager
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: typings.msportalfxMock.rdfeManagerMod.RdfeManager.Manager,
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: typings.msportalfxMock.rdfeManagerMod.RdfeManager.Manager,
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: typings.msportalfxMock.rdfeManagerMod.RdfeManager.Manager,
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
    inline def dispose(proxy: ProxyServer): Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(proxy.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Any]]
  }
}
