package typings.nano.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nano.anon.Headers
import typings.nano.nanoStrings.couch
import typings.nano.nanoStrings.non_200
import typings.nano.nanoStrings.request
import typings.nano.nanoStrings.socket
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An error triggered by nano */
trait RequestError
  extends StObject
     with Error {
  
  // string; // 'non_200'
  var description: js.UndefOr[String] = js.undefined
  
  /** Error identifier */
  var errid: js.UndefOr[non_200 | request] = js.undefined
  
  /** An error code. */
  var error: js.UndefOr[String] = js.undefined
  
  /** Response headers */
  var headers: js.UndefOr[StringDictionary[String | Double]] = js.undefined
  
  // 'not_found', 'file_exists'
  /** Human readable reason for the error. */
  var reason: js.UndefOr[String] = js.undefined
  
  // 404;
  /** Request sent to Couch */
  var request: js.UndefOr[Headers] = js.undefined
  
  // 'missing', 'The database could not be created, the file already exists.';
  /** Was the problem at the socket or couch level */
  var scope: js.UndefOr[couch | socket] = js.undefined
  
  /** Status code returned by the server */
  var statusCode: js.UndefOr[Double] = js.undefined
}
object RequestError {
  
  inline def apply(message: String, name: String): RequestError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestError] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setErrid(value: non_200 | request): Self = StObject.set(x, "errid", value.asInstanceOf[js.Any])
    
    inline def setErridUndefined: Self = StObject.set(x, "errid", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRequest(value: Headers): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setScope(value: couch | socket): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
