package typings.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPOptions extends StObject {
  
  /**
    * The body of the request.
    * If it is a JSON object, then the Content-Type set in the headers must be application/x-www-form-urlencoded or application/json.
    * You can also set this to a Buffer object to send raw bytes.
    * If you use a Buffer, you should also set the Content-Type header explicitly to describe what these bytes represent.
    */
  var body: js.UndefOr[String | Buffer | Object[Attributes]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.undefined
  
  /**
    * Defaults to 'false'.
    */
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The headers for the request.
    */
  var headers: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
  
  /**
    * The method of the request (i.e GET, POST, etc).
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The query portion of the url.
    */
  var params: js.UndefOr[js.Any] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.undefined
  
  /**
    * The url to send the request to.
    */
  var url: String
}
object HTTPOptions {
  
  /**
    * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
    *
    *     import Buffer = require("buffer").Buffer;
    */
  @JSGlobal("Parse.Cloud.HTTPOptions")
  @js.native
  val ^ : Instantiable0[HTTPOptions] = js.native
  
  extension [Self <: HTTPOptions](x: Self) {
    
    inline def setBody(value: String | Buffer | Object[Attributes]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setError(value: /* response */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
    
    inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setSuccess(value: /* response */ js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
