package typings.onfleetNodeOnfleet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientName extends StObject {
  
  var recipientName: String | Null = js.native
  
  var recipientNotes: String | Null = js.native
  
  var recipientSkipSMSNotifications: String | Null = js.native
  
  var useMerchantForProxy: String | Null = js.native
}
object RecipientName {
  
  @scala.inline
  def apply(): RecipientName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientName]
  }
  
  @scala.inline
  implicit class RecipientNameMutableBuilder[Self <: RecipientName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientNameNull: Self = StObject.set(x, "recipientName", null)
    
    @scala.inline
    def setRecipientNotes(value: String): Self = StObject.set(x, "recipientNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientNotesNull: Self = StObject.set(x, "recipientNotes", null)
    
    @scala.inline
    def setRecipientSkipSMSNotifications(value: String): Self = StObject.set(x, "recipientSkipSMSNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientSkipSMSNotificationsNull: Self = StObject.set(x, "recipientSkipSMSNotifications", null)
    
    @scala.inline
    def setUseMerchantForProxy(value: String): Self = StObject.set(x, "useMerchantForProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMerchantForProxyNull: Self = StObject.set(x, "useMerchantForProxy", null)
  }
}
