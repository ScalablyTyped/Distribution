package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  def error(obj: js.Object): Unit
  
  var headers: js.Object
  
  var responseType: String
  
  def success(obj: js.Object): Unit
  
  var url: String
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object Error {
  
  inline def apply(
    error: js.Object => Unit,
    headers: js.Object,
    responseType: String,
    success: js.Object => Unit,
    url: String
  ): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), headers = headers.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Object => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: js.Object => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
