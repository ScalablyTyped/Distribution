package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pubsub extends js.Object {
  
  /**
    * The name of the Pub/Sub subscription created and managed by Eventarc system as a transport for the event delivery. The value must be in the form of
    * `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}
    */
  var subscription: js.UndefOr[String] = js.native
  
  /**
    * The name of the Pub/Sub topic created and managed by Eventarc system as a transport for the event delivery. The value must be in the form of
    * `projects/{PROJECT_ID}/topics/{TOPIC_NAME}
    */
  var topic: js.UndefOr[String] = js.native
}
object Pubsub {
  
  @scala.inline
  def apply(): Pubsub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pubsub]
  }
  
  @scala.inline
  implicit class PubsubOps[Self <: Pubsub] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
}
