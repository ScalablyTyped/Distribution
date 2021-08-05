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
  
  inline def apply(): MailTipsError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailTipsError]
  }
  
  extension [Self <: MailTipsError](x: Self) {
    
    inline def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
