package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Recipients.CreateRecipientProps> */
trait PartialCreateRecipientPro extends StObject {
  
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var phone: js.UndefOr[String] = js.undefined
  
  var skipPhoneNumberValidation: js.UndefOr[Boolean] = js.undefined
  
  var skipSMSNotifications: js.UndefOr[Boolean] = js.undefined
}
object PartialCreateRecipientPro {
  
  @scala.inline
  def apply(): PartialCreateRecipientPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateRecipientPro]
  }
  
  @scala.inline
  implicit class PartialCreateRecipientProMutableBuilder[Self <: PartialCreateRecipientPro] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setSkipPhoneNumberValidation(value: Boolean): Self = StObject.set(x, "skipPhoneNumberValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipPhoneNumberValidationUndefined: Self = StObject.set(x, "skipPhoneNumberValidation", js.undefined)
    
    @scala.inline
    def setSkipSMSNotifications(value: Boolean): Self = StObject.set(x, "skipSMSNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipSMSNotificationsUndefined: Self = StObject.set(x, "skipSMSNotifications", js.undefined)
  }
}
