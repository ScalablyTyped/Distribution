package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailTransferRequest extends StObject {
  
  var Amount: Money
  
  var Comment: js.UndefOr[String] = js.undefined
  
  var Password: String
  
  var SourceAccountId: String
  
  var TargetEmail: String
  
  var UserName: String
}
object EmailTransferRequest {
  
  inline def apply(Amount: Money, Password: String, SourceAccountId: String, TargetEmail: String, UserName: String): EmailTransferRequest = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], SourceAccountId = SourceAccountId.asInstanceOf[js.Any], TargetEmail = TargetEmail.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTransferRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailTransferRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setSourceAccountId(value: String): Self = StObject.set(x, "SourceAccountId", value.asInstanceOf[js.Any])
    
    inline def setTargetEmail(value: String): Self = StObject.set(x, "TargetEmail", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
