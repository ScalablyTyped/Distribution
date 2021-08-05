package typings.msportalfxMock

import typings.msportalfxMock.armManagerMod.ArmManager.Manager
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object armHelperMod {
  
  object ArmHelper {
    
    @JSImport("msportalfx-mock/lib/src/ArmProxy/armHelper", "ArmHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines if the controller should handle the incoming request if mock/proxy is setup.
      * Triggers passed in callback or executes the next middleware.
      *
      * @param req The incoming request.
      * @param res The outgoing response.
      * @param next The next handler in express.
      * @param callback The handler to be called if the request should be handled by mock/proxy.
      */
    inline def handleRequest(req: js.Any, res: js.Any, next: js.Any, callback: HandleRequestCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Proxies request to target, and pipes failures back immediatly.
      *
      * @param req The incoming request.
      * @param res The outgoing response.
      * @param defaultVal If proxy is not setup will return this.
      * @return A promise that resolve with the content if the proxied request succeeds, and reject if the request failed.
      */
    inline def proxyReq[T](req: js.Any): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyReq")(req.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
    inline def proxyReq[T](req: js.Any, res: js.Any): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyReq")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
    inline def proxyReq[T](req: js.Any, res: js.Any, defaultVal: T): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyReq")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], defaultVal.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
    inline def proxyReq[T](req: js.Any, res: Unit, defaultVal: T): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyReq")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], defaultVal.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
    
    type HandleRequestCallback = js.Function1[/* armManager */ Manager, Unit]
  }
}
