package typings.postmark.anon

import typings.postmark.distClientModelsWebhooksWebhookMod.BounceWebhookTrigger
import typings.postmark.distClientModelsWebhooksWebhookMod.OpenWebhookTrigger
import typings.postmark.distClientModelsWebhooksWebhookMod.SpamWebhookTrigger
import typings.postmark.distClientModelsWebhooksWebhookMod.WebhookTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounce extends StObject {
  
  var Bounce: BounceWebhookTrigger
  
  var Click: WebhookTrigger
  
  var Delivery: WebhookTrigger
  
  var Open: OpenWebhookTrigger
  
  var SpamComplaint: SpamWebhookTrigger
  
  var SubscriptionChange: WebhookTrigger
}
object Bounce {
  
  inline def apply(
    Bounce: BounceWebhookTrigger,
    Click: WebhookTrigger,
    Delivery: WebhookTrigger,
    Open: OpenWebhookTrigger,
    SpamComplaint: SpamWebhookTrigger,
    SubscriptionChange: WebhookTrigger
  ): Bounce = {
    val __obj = js.Dynamic.literal(Bounce = Bounce.asInstanceOf[js.Any], Click = Click.asInstanceOf[js.Any], Delivery = Delivery.asInstanceOf[js.Any], Open = Open.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any], SubscriptionChange = SubscriptionChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounce]
  }
  
  extension [Self <: Bounce](x: Self) {
    
    inline def setBounce(value: BounceWebhookTrigger): Self = StObject.set(x, "Bounce", value.asInstanceOf[js.Any])
    
    inline def setClick(value: WebhookTrigger): Self = StObject.set(x, "Click", value.asInstanceOf[js.Any])
    
    inline def setDelivery(value: WebhookTrigger): Self = StObject.set(x, "Delivery", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: OpenWebhookTrigger): Self = StObject.set(x, "Open", value.asInstanceOf[js.Any])
    
    inline def setSpamComplaint(value: SpamWebhookTrigger): Self = StObject.set(x, "SpamComplaint", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionChange(value: WebhookTrigger): Self = StObject.set(x, "SubscriptionChange", value.asInstanceOf[js.Any])
  }
}
