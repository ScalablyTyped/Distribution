package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error returned by the JavaScript library, as opposed to an error
  * object from the REST API (which we represent with IError).
  */
@js.native
trait IJSError extends StObject {
  
  /**
    * The error code.
    */
  var error: String = js.native
  
  /**
    * A description of the error.
    */
  var error_description: String = js.native
}
object IJSError {
  
  @scala.inline
  def apply(error: String, error_description: String): IJSError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], error_description = error_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJSError]
  }
  
  @scala.inline
  implicit class IJSErrorMutableBuilder[Self <: IJSError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
  }
}
