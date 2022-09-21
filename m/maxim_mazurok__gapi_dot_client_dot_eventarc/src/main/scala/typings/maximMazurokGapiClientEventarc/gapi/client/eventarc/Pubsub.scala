package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pubsub extends StObject {
  
  /**
    * Output only. The name of the Pub/Sub subscription created and managed by Eventarc as a transport for the event delivery. Format:
    * `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
    */
  var subscription: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The name of the Pub/Sub topic created and managed by Eventarc as a transport for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`. You can set an
    * existing topic for triggers of the type `google.cloud.pubsub.topic.v1.messagePublished`. The topic you provide here is not deleted by Eventarc at trigger deletion.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object Pubsub {
  
  inline def apply(): Pubsub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pubsub]
  }
  
  extension [Self <: Pubsub](x: Self) {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
