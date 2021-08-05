package typings.msportalfxMock

import typings.msportalfxMock.mod.Request
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajaxHelperMod {
  
  object AjaxHelper {
    
    @JSImport("msportalfx-mock/lib/src/Helpers/ajaxHelper", "AjaxHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Forward the passed in request to the passed in host and returns the response.
      *
      * @param request The incoming request to forward.
      * @param host The target host.
      * @param port The target host port.
      * @return A promise that will resolve with the response body from the forwarded request.
      */
    inline def fwdAjax(request: js.Any, host: String): Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fwdAjax")(request.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Promise[js.Any]]
    inline def fwdAjax(request: js.Any, host: String, port: Double): Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fwdAjax")(request.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Promise[js.Any]]
    
    /**
      * Gets the JSON data from the body of the response. If it fails to parse as valid JSON, the original data will be returned.
      *
      * @param response The response object.
      * @return A promise that is resolved with the data.
      */
    inline def getJsonData(response: js.Any): Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsonData")(response.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Any]]
    
    /**
      * Forwards the request back to the same host but a different path.
      *
      * @param request The incoming request to forward.
      * @param port The target host port.
      * @param method The forward request method.
      * @return A promise that will resolve with the response body from the forwarded request.
      */
    inline def loopbackAjax(request: Request, path: String): Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loopbackAjax")(request.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Promise[js.Any]]
    inline def loopbackAjax(request: Request, path: String, method: String): Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loopbackAjax")(request.asInstanceOf[js.Any], path.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Promise[js.Any]]
  }
}
