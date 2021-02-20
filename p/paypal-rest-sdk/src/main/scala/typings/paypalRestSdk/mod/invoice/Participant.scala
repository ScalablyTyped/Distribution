package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Participant extends Person {
  
  var additional_info: js.UndefOr[String] = js.native
  
  @JSName("email")
  var email_Participant: String = js.native
  
  var fax: js.UndefOr[Phone] = js.native
}
object Participant {
  
  @scala.inline
  def apply(email: String): Participant = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
  
  @scala.inline
  implicit class ParticipantMutableBuilder[Self <: Participant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditional_info(value: String): Self = StObject.set(x, "additional_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditional_infoUndefined: Self = StObject.set(x, "additional_info", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFax(value: Phone): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxUndefined: Self = StObject.set(x, "fax", js.undefined)
  }
}
