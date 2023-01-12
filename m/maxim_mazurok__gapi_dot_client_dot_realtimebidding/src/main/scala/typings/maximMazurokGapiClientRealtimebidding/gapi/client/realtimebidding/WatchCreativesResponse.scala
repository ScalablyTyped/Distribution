package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchCreativesResponse extends StObject {
  
  /**
    * The Pub/Sub subscription that can be used to pull creative status notifications. This would be of the format `projects/{project_id}/subscriptions/{subscription_id}`. Subscription is
    * created with pull delivery. All service accounts belonging to the bidder will have read access to this subscription. Subscriptions that are inactive for more than 90 days will be
    * disabled. Please use watchCreatives to re-enable the subscription.
    */
  var subscription: js.UndefOr[String] = js.undefined
  
  /** The Pub/Sub topic that will be used to publish creative serving status notifications. This would be of the format `projects/{project_id}/topics/{topic_id}`. */
  var topic: js.UndefOr[String] = js.undefined
}
object WatchCreativesResponse {
  
  inline def apply(): WatchCreativesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchCreativesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchCreativesResponse] (val x: Self) extends AnyVal {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
