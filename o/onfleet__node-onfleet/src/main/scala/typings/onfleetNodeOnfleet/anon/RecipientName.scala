package typings.onfleetNodeOnfleet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientName extends StObject {
  
  var recipientName: String | Null
  
  var recipientNotes: String | Null
  
  var recipientSkipSMSNotifications: String | Null
  
  var useMerchantForProxy: String | Null
}
object RecipientName {
  
  inline def apply(): RecipientName = {
    val __obj = js.Dynamic.literal(recipientName = null, recipientNotes = null, recipientSkipSMSNotifications = null, useMerchantForProxy = null)
    __obj.asInstanceOf[RecipientName]
  }
  
  extension [Self <: RecipientName](x: Self) {
    
    inline def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
    
    inline def setRecipientNameNull: Self = StObject.set(x, "recipientName", null)
    
    inline def setRecipientNotes(value: String): Self = StObject.set(x, "recipientNotes", value.asInstanceOf[js.Any])
    
    inline def setRecipientNotesNull: Self = StObject.set(x, "recipientNotes", null)
    
    inline def setRecipientSkipSMSNotifications(value: String): Self = StObject.set(x, "recipientSkipSMSNotifications", value.asInstanceOf[js.Any])
    
    inline def setRecipientSkipSMSNotificationsNull: Self = StObject.set(x, "recipientSkipSMSNotifications", null)
    
    inline def setUseMerchantForProxy(value: String): Self = StObject.set(x, "useMerchantForProxy", value.asInstanceOf[js.Any])
    
    inline def setUseMerchantForProxyNull: Self = StObject.set(x, "useMerchantForProxy", null)
  }
}
