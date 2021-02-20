package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// other types
@js.native
trait SendParamsRecipient extends StObject {
  
  var Email: String = js.native
  
  var Name: js.UndefOr[String] = js.native
}
object SendParamsRecipient {
  
  @scala.inline
  def apply(Email: String): SendParamsRecipient = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParamsRecipient]
  }
  
  @scala.inline
  implicit class SendParamsRecipientMutableBuilder[Self <: SendParamsRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
