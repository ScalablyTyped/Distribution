package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkError extends StObject {
  
  /**
    * error code
    */
  var errorCode: ErrorCode
  
  /**
    * Optional description for the error. This may contain useful information for web-app developers.
    * This string will not be localized and is not for end-user consumption.
    * App should not depend on the string content. The exact value may change. This is only for debugging purposes.
    */
  var message: js.UndefOr[String] = js.undefined
}
object SdkError {
  
  inline def apply(errorCode: ErrorCode): SdkError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SdkError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
