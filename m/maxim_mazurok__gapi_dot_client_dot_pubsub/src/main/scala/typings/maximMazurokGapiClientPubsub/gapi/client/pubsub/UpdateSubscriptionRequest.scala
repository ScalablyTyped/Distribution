package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubscriptionRequest extends StObject {
  
  /** Required. The updated subscription object. */
  var subscription: js.UndefOr[Subscription] = js.undefined
  
  /** Required. Indicates which fields in the provided subscription to update. Must be specified and non-empty. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object UpdateSubscriptionRequest {
  
  @scala.inline
  def apply(): UpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubscriptionRequest]
  }
  
  @scala.inline
  implicit class UpdateSubscriptionRequestMutableBuilder[Self <: UpdateSubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
