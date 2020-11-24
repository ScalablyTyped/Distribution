package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends js.Object {
  
  /**
    * The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is
    * delivered and before it is acknowledged, it is considered to be *outstanding*. During that time period, the message will not be redelivered (on a best-effort basis). For pull
    * subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if
    * using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The
    * maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set
    * the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message.
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  
  /**
    * A policy that specifies the conditions for dead lettering messages in this subscription. If dead_letter_policy is not set, dead lettering is disabled. The Cloud Pub/Sub service
    * account associated with this subscriptions's parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Acknowledge() messages on
    * this subscription.
    */
  var deadLetterPolicy: js.UndefOr[DeadLetterPolicy] = js.native
  
  /**
    * Indicates whether the subscription is detached from its topic. Detached subscriptions don't receive messages from their topic and don't retain any backlog. `Pull` and
    * `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will not be made.
    */
  var detached: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, messages published with the same `ordering_key` in `PubsubMessage` will be delivered to the subscribers in the order in which they are received by the Pub/Sub system.
    * Otherwise, they may be delivered in any order.
    */
  var enableMessageOrdering: js.UndefOr[Boolean] = js.native
  
  /**
    * A policy that specifies the conditions for this subscription's expiration. A subscription is considered active as long as any connected subscriber is successfully consuming messages
    * from the subscription or is issuing operations on the subscription. If `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed
    * value for `expiration_policy.ttl` is 1 day.
    */
  var expirationPolicy: js.UndefOr[ExpirationPolicy] = js.native
  
  /**
    * An expression written in the Pub/Sub [filter language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only `PubsubMessage`s whose `attributes` field matches the
    * filter are delivered on this subscription. If empty, then no messages are filtered out.
    */
  var filter: js.UndefOr[String] = js.native
  
  /** See Creating and managing labels. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.Subscription with TopLevel[js.Any]
  ] = js.native
  
  /**
    * How long to retain unacknowledged messages in the subscription's backlog, from the moment a message is published. If `retain_acked_messages` is true, then this also configures the
    * retention of acknowledged messages, and thus configures how far back in time a `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
    */
  var messageRetentionDuration: js.UndefOr[String] = js.native
  
  /**
    * Required. The name of the subscription. It must have the format `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter, and contain only
    * letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in
    * length, and it must not start with `"goog"`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If push delivery is used with this subscription, this field is used to configure it. An empty `pushConfig` signifies that the subscriber will pull and ack messages using API
    * methods.
    */
  var pushConfig: js.UndefOr[PushConfig] = js.native
  
  /**
    * Indicates whether to retain acknowledged messages. If true, then messages are not expunged from the subscription's backlog, even if they are acknowledged, until they fall out of the
    * `message_retention_duration` window. This must be true if you would like to [Seek to a timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time).
    */
  var retainAckedMessages: js.UndefOr[Boolean] = js.native
  
  /**
    * A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set, the default retry policy is applied. This generally implies that messages will be
    * retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message.
    */
  var retryPolicy: js.UndefOr[RetryPolicy] = js.native
  
  /**
    * Required. The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_`
    * if the topic has been deleted.
    */
  var topic: js.UndefOr[String] = js.native
}
object Subscription {
  
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    
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
    def setAckDeadlineSeconds(value: Double): Self = this.set("ackDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAckDeadlineSeconds: Self = this.set("ackDeadlineSeconds", js.undefined)
    
    @scala.inline
    def setDeadLetterPolicy(value: DeadLetterPolicy): Self = this.set("deadLetterPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadLetterPolicy: Self = this.set("deadLetterPolicy", js.undefined)
    
    @scala.inline
    def setDetached(value: Boolean): Self = this.set("detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    
    @scala.inline
    def setEnableMessageOrdering(value: Boolean): Self = this.set("enableMessageOrdering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMessageOrdering: Self = this.set("enableMessageOrdering", js.undefined)
    
    @scala.inline
    def setExpirationPolicy(value: ExpirationPolicy): Self = this.set("expirationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationPolicy: Self = this.set("expirationPolicy", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.Subscription with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMessageRetentionDuration(value: String): Self = this.set("messageRetentionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageRetentionDuration: Self = this.set("messageRetentionDuration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPushConfig(value: PushConfig): Self = this.set("pushConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushConfig: Self = this.set("pushConfig", js.undefined)
    
    @scala.inline
    def setRetainAckedMessages(value: Boolean): Self = this.set("retainAckedMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainAckedMessages: Self = this.set("retainAckedMessages", js.undefined)
    
    @scala.inline
    def setRetryPolicy(value: RetryPolicy): Self = this.set("retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryPolicy: Self = this.set("retryPolicy", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
}
