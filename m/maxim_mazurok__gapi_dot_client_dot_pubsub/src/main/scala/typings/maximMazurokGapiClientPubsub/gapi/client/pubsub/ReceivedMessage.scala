package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceivedMessage extends js.Object {
  
  /** This ID can be used to acknowledge the received message. */
  var ackId: js.UndefOr[String] = js.native
  
  /**
    * The approximate number of times that Cloud Pub/Sub has attempted to deliver the associated message to a subscriber. More precisely, this is 1 + (number of NACKs) + (number of
    * ack_deadline exceeds) for this message. A NACK is any call to ModifyAckDeadline with a 0 deadline. An ack_deadline exceeds event is whenever a message is not acknowledged within
    * ack_deadline. Note that ack_deadline is initially Subscription.ackDeadlineSeconds, but may get extended automatically by the client library. Upon the first delivery of a given
    * message, `delivery_attempt` will have a value of 1. The value is calculated at best effort and is approximate. If a DeadLetterPolicy is not set on the subscription, this will be 0.
    */
  var deliveryAttempt: js.UndefOr[Double] = js.native
  
  /** The message. */
  var message: js.UndefOr[PubsubMessage] = js.native
}
object ReceivedMessage {
  
  @scala.inline
  def apply(): ReceivedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceivedMessage]
  }
  
  @scala.inline
  implicit class ReceivedMessageOps[Self <: ReceivedMessage] (val x: Self) extends AnyVal {
    
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
    def setAckId(value: String): Self = this.set("ackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAckId: Self = this.set("ackId", js.undefined)
    
    @scala.inline
    def setDeliveryAttempt(value: Double): Self = this.set("deliveryAttempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryAttempt: Self = this.set("deliveryAttempt", js.undefined)
    
    @scala.inline
    def setMessage(value: PubsubMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
