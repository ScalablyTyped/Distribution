package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requests extends StObject {
  
  /**
    * The request ID
    */
  var ID: String
  
  /**
    * If the request is synchronous or asynchronous (if available)
    */
  var async: Boolean
  
  /**
    * The request headers
    */
  var headers: Record[String, String]
  
  /**
    * The HTTP method
    */
  var method: String
  
  /**
    * Array of embedded requests ($batch) Each request object within the array contains the following properties:
    * URL, method, headers, response object
    */
  var requests: js.Array[Any]
  
  /**
    * The response object - empty object if no response The response object contains the following properties:
    * message, success, headers, statusCode, statusText, responseText
    */
  var response: js.Object
  
  /**
    * Request was successful or not
    */
  var success: Boolean
  
  /**
    * The URL which is sent to the backend
    */
  var url: String
}
object Requests {
  
  inline def apply(
    ID: String,
    async: Boolean,
    headers: Record[String, String],
    method: String,
    requests: js.Array[Any],
    response: js.Object,
    success: Boolean,
    url: String
  ): Requests = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requests]
  }
  
  extension [Self <: Requests](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequests(value: js.Array[Any]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsVarargs(value: Any*): Self = StObject.set(x, "requests", js.Array(value*))
    
    inline def setResponse(value: js.Object): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
