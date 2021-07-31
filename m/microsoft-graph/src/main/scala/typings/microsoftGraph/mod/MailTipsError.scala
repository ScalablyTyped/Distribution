package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailTipsError extends StObject {
  
  // The error code.
  var code: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The error message.
  var message: js.UndefOr[NullableOption[String]] = js.undefined
}
object MailTipsError {
  
  @scala.inline
  def apply(): MailTipsError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailTipsError]
  }
  
  @scala.inline
  implicit class MailTipsErrorMutableBuilder[Self <: MailTipsError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = StObject.set(x, "code", null)
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
