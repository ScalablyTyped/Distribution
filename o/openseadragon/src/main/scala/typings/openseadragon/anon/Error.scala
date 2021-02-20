package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  def error(obj: js.Object): Unit = js.native
  
  var headers: js.Object = js.native
  
  var responseType: String = js.native
  
  def success(obj: js.Object): Unit = js.native
  
  var url: String = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object Error {
  
  @scala.inline
  def apply(
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
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Object => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: js.Object => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
