package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Error object contains info about an error that is returned by the
  * Live Connect APIs.
  */
@js.native
trait IError extends StObject {
  
  /**
    * Info about the error.
    */
  var error: Code = js.native
}
object IError {
  
  @scala.inline
  def apply(error: Code): IError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  
  @scala.inline
  implicit class IErrorMutableBuilder[Self <: IError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
