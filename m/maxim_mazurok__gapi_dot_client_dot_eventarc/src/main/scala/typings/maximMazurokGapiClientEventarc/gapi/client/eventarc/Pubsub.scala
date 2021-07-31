package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pubsub extends StObject {
  
  /**
    * The name of the Pub/Sub subscription created and managed by Eventarc system as a transport for the event delivery. The value must be in the form of
    * `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}
    */
  var subscription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Pub/Sub topic created and managed by Eventarc system as a transport for the event delivery. The value must be in the form of
    * `projects/{PROJECT_ID}/topics/{TOPIC_NAME}
    */
  var topic: js.UndefOr[String] = js.undefined
}
object Pubsub {
  
  @scala.inline
  def apply(): Pubsub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pubsub]
  }
  
  @scala.inline
  implicit class PubsubMutableBuilder[Self <: Pubsub] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
