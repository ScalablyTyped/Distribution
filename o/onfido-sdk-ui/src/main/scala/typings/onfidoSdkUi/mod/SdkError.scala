package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.onfidoSdkUiStrings.exception
import typings.onfidoSdkUi.onfidoSdkUiStrings.expired_token
import typings.onfidoSdkUi.onfidoSdkUiStrings.expired_trial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkError extends StObject {
  
  var message: String
  
  var `type`: exception | expired_token | expired_trial
}
object SdkError {
  
  inline def apply(message: String, `type`: exception | expired_token | expired_trial): SdkError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SdkError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: exception | expired_token | expired_trial): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
