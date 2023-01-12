package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /**
    * The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is
    * delivered and before it is acknowledged, it is considered to be *outstanding*. During that time period, the message will not be redelivered (on a best-effort basis). For pull
    * subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if
    * using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The
    * maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set
    * the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message.
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.undefined
  
  /** If delivery to BigQuery is used with this subscription, this field is used to configure it. */
  var bigqueryConfig: js.UndefOr[BigQueryConfig] = js.undefined
  
  /**
    * A policy that specifies the conditions for dead lettering messages in this subscription. If dead_letter_policy is not set, dead lettering is disabled. The Cloud Pub/Sub service
    * account associated with this subscriptions's parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Acknowledge() messages on
    * this subscription.
    */
  var deadLetterPolicy: js.UndefOr[DeadLetterPolicy] = js.undefined
  
  /**
    * Indicates whether the subscription is detached from its topic. Detached subscriptions don't receive messages from their topic and don't retain any backlog. `Pull` and
    * `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will not be made.
    */
  var detached: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, Pub/Sub provides the following guarantees for the delivery of a message with a given value of `message_id` on this subscription: * The message sent to a subscriber is
    * guaranteed not to be resent before the message's acknowledgement deadline expires. * An acknowledged message will not be resent to a subscriber. Note that subscribers may still
    * receive multiple copies of a message when `enable_exactly_once_delivery` is true if the message was published multiple times by a publisher client. These copies are considered
    * distinct by Pub/Sub and have distinct `message_id` values.
    */
  var enableExactlyOnceDelivery: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, messages published with the same `ordering_key` in `PubsubMessage` will be delivered to the subscribers in the order in which they are received by the Pub/Sub system.
    * Otherwise, they may be delivered in any order.
    */
  var enableMessageOrdering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A policy that specifies the conditions for this subscription's expiration. A subscription is considered active as long as any connected subscriber is successfully consuming messages
    * from the subscription or is issuing operations on the subscription. If `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed
    * value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but `expiration_policy.ttl` is not set, the subscription never expires.
    */
  var expirationPolicy: js.UndefOr[ExpirationPolicy] = js.undefined
  
  /**
    * An expression written in the Pub/Sub [filter language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only `PubsubMessage`s whose `attributes` field matches the
    * filter are delivered on this subscription. If empty, then no messages are filtered out.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /** See Creating and managing labels. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * How long to retain unacknowledged messages in the subscription's backlog, from the moment a message is published. If `retain_acked_messages` is true, then this also configures the
    * retention of acknowledged messages, and thus configures how far back in time a `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
    */
  var messageRetentionDuration: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the subscription. It must have the format `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter, and contain only
    * letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in
    * length, and it must not start with `"goog"`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** If push delivery is used with this subscription, this field is used to configure it. */
  var pushConfig: js.UndefOr[PushConfig] = js.undefined
  
  /**
    * Indicates whether to retain acknowledged messages. If true, then messages are not expunged from the subscription's backlog, even if they are acknowledged, until they fall out of the
    * `message_retention_duration` window. This must be true if you would like to [`Seek` to a timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past
    * to replay previously-acknowledged messages.
    */
  var retainAckedMessages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set, the default retry policy is applied. This generally implies that messages will be
    * retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message.
    */
  var retryPolicy: js.UndefOr[RetryPolicy] = js.undefined
  
  /** Output only. An output-only field indicating whether or not the subscription can receive messages. */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_`
    * if the topic has been deleted.
    */
  var topic: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Indicates the minimum duration for which a message is retained after it is published to the subscription's topic. If this field is set, messages published to the
    * subscription's topic in the last `topic_message_retention_duration` are always available to subscribers. See the `message_retention_duration` field in `Topic`. This field is set
    * only in responses from the server; it is ignored if it is set in any requests.
    */
  var topicMessageRetentionDuration: js.UndefOr[String] = js.undefined
}
object Subscription {
  
  inline def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    inline def setAckDeadlineSeconds(value: Double): Self = StObject.set(x, "ackDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setAckDeadlineSecondsUndefined: Self = StObject.set(x, "ackDeadlineSeconds", js.undefined)
    
    inline def setBigqueryConfig(value: BigQueryConfig): Self = StObject.set(x, "bigqueryConfig", value.asInstanceOf[js.Any])
    
    inline def setBigqueryConfigUndefined: Self = StObject.set(x, "bigqueryConfig", js.undefined)
    
    inline def setDeadLetterPolicy(value: DeadLetterPolicy): Self = StObject.set(x, "deadLetterPolicy", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterPolicyUndefined: Self = StObject.set(x, "deadLetterPolicy", js.undefined)
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setEnableExactlyOnceDelivery(value: Boolean): Self = StObject.set(x, "enableExactlyOnceDelivery", value.asInstanceOf[js.Any])
    
    inline def setEnableExactlyOnceDeliveryUndefined: Self = StObject.set(x, "enableExactlyOnceDelivery", js.undefined)
    
    inline def setEnableMessageOrdering(value: Boolean): Self = StObject.set(x, "enableMessageOrdering", value.asInstanceOf[js.Any])
    
    inline def setEnableMessageOrderingUndefined: Self = StObject.set(x, "enableMessageOrdering", js.undefined)
    
    inline def setExpirationPolicy(value: ExpirationPolicy): Self = StObject.set(x, "expirationPolicy", value.asInstanceOf[js.Any])
    
    inline def setExpirationPolicyUndefined: Self = StObject.set(x, "expirationPolicy", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMessageRetentionDuration(value: String): Self = StObject.set(x, "messageRetentionDuration", value.asInstanceOf[js.Any])
    
    inline def setMessageRetentionDurationUndefined: Self = StObject.set(x, "messageRetentionDuration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPushConfig(value: PushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
    
    inline def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
    
    inline def setRetainAckedMessages(value: Boolean): Self = StObject.set(x, "retainAckedMessages", value.asInstanceOf[js.Any])
    
    inline def setRetainAckedMessagesUndefined: Self = StObject.set(x, "retainAckedMessages", js.undefined)
    
    inline def setRetryPolicy(value: RetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicMessageRetentionDuration(value: String): Self = StObject.set(x, "topicMessageRetentionDuration", value.asInstanceOf[js.Any])
    
    inline def setTopicMessageRetentionDurationUndefined: Self = StObject.set(x, "topicMessageRetentionDuration", js.undefined)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
