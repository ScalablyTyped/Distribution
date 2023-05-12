package typings.ol

import typings.std.Error
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object netMod {
  
  @JSImport("ol/net", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/net", "ClientError")
  @js.native
  open class ClientError protected ()
    extends StObject
       with Error {
    /**
      * @param {XMLHttpRequest} client The XHR object.
      */
    def this(client: XMLHttpRequest) = this()
    
    /**
      * @type {XMLHttpRequest}
      */
    var client: XMLHttpRequest = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("ol/net", "ResponseError")
  @js.native
  open class ResponseError protected ()
    extends StObject
       with Error {
    /**
      * @param {XMLHttpRequest} response The XHR object.
      */
    def this(response: XMLHttpRequest) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * @type {XMLHttpRequest}
      */
    var response: XMLHttpRequest = js.native
  }
  
  inline def getJSON(url: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSON")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def jsonp(url: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def jsonp(url: String, callback: js.Function, errback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def jsonp(url: String, callback: js.Function, errback: js.Function, callbackParam: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errback.asInstanceOf[js.Any], callbackParam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def jsonp(url: String, callback: js.Function, errback: Unit, callbackParam: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errback.asInstanceOf[js.Any], callbackParam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def overrideXHR(xhr: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideXHR")(xhr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resolveUrl(base: String, url: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveUrl")(base.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def restoreXHR(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreXHR")().asInstanceOf[Unit]
}
