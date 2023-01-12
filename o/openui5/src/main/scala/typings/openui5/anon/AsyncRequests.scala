package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncRequests extends StObject {
  
  /**
    * If the request is synchronous or asynchronous (if available)
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of embedded requests ($batch) Each request object within the array contains the following properties:
    * url, method, headers
    */
  var requests: js.Array[Any]
  
  /**
    * The type of the request (if available)
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The URL which is sent to the backend.
    */
  var url: js.UndefOr[String] = js.undefined
}
object AsyncRequests {
  
  inline def apply(requests: js.Array[Any]): AsyncRequests = {
    val __obj = js.Dynamic.literal(requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncRequests]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncRequests] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setRequests(value: js.Array[Any]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsVarargs(value: Any*): Self = StObject.set(x, "requests", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
