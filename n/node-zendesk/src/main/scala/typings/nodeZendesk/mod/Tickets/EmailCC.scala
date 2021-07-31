package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailCC extends StObject {
  
  var action: String
  
  var user_email: js.UndefOr[String] = js.undefined
  
  var user_id: js.UndefOr[ZendeskID] = js.undefined
}
object EmailCC {
  
  @scala.inline
  def apply(action: String): EmailCC = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailCC]
  }
  
  @scala.inline
  implicit class EmailCCMutableBuilder[Self <: EmailCC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_email(value: String): Self = StObject.set(x, "user_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_emailUndefined: Self = StObject.set(x, "user_email", js.undefined)
    
    @scala.inline
    def setUser_id(value: ZendeskID): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
