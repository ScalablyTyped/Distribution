package typings.msportalfxMock

import typings.msportalfxMock.armManagerMod.ArmManager.Manager
import typings.msportalfxMock.httpsProxyMod.HttpsProxy.ExpressServer
import typings.msportalfxMock.httpsProxyMod.HttpsProxy.ProxyServer
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object armProxyMod {
  
  object ArmProxy {
    
    @JSImport("msportalfx-mock/lib/src/ArmProxy/armProxy", "ArmProxy")
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
    @scala.inline
    def create(armEndpoint: String, serverPort: Double): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    @scala.inline
    def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Unit,
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    @scala.inline
    def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Unit,
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    @scala.inline
    def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Unit,
      customRoutes: Unit,
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    @scala.inline
    def create(armEndpoint: String, serverPort: Double, armManager: Manager): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    @scala.inline
    def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Manager,
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    @scala.inline
    def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Manager,
      customRoutes: js.Function1[/* app */ typings.msportalfxMock.mod.Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    @scala.inline
    def create(
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
    @scala.inline
    def dispose(proxy: ProxyServer): Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(proxy.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Any]]
    
    @js.native
    trait ArmExpressServer extends ExpressServer {
      
      /**
        * The instance of arm manager.
        */
      var armManager: js.UndefOr[Manager] = js.native
    }
  }
}
