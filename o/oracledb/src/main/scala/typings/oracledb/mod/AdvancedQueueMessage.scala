package typings.oracledb.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message dequeued from an advanced queue.
  * 
  * @since 4.0
  */
@js.native
trait AdvancedQueueMessage[T] extends js.Object {
  /** Correlation that was used during enqueue. */
  var correlation: String = js.native
  /** Number of seconds the message was delayed before it could be dequeued. */
  var delay: Double = js.native
  /** Delivery mode the messages was enqueued with. */
  var deliveryMode: Double = js.native
  /** Name of the exception queue defined when the message was enqueued. */
  var exceptionQueue: String = js.native
  /** Number of seconds until expiration defined when the message was enqueued. */
  var expiration: Double = js.native
  /** Contains the unique identifier of the message. */
  var msgId: Buffer = js.native
  /** Number of attempts that were made to dequeue the message. */
  var numAttempts: Double = js.native
  /** Contains the unique identifier of the message in the last queue that generated it. */
  var originalMsgId: Buffer = js.native
  /** Contains the payload of the message, with type depending on the value of queue.payloadType.
    * Note that enqueued Strings are returned as UTF-8 encoded Buffers.
    */
  var payload: Buffer | DBObjectOUT[T] = js.native
  /** Priority of the message when it was enqueued. */
  var priority: Double = js.native
  /** State of the message. It can be any one of the AQ_MSG_STATE constants. */
  var state: Double = js.native
}

object AdvancedQueueMessage {
  @scala.inline
  def apply[T](
    correlation: String,
    delay: Double,
    deliveryMode: Double,
    exceptionQueue: String,
    expiration: Double,
    msgId: Buffer,
    numAttempts: Double,
    originalMsgId: Buffer,
    payload: Buffer | DBObjectOUT[T],
    priority: Double,
    state: Double
  ): AdvancedQueueMessage[T] = {
    val __obj = js.Dynamic.literal(correlation = correlation.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], deliveryMode = deliveryMode.asInstanceOf[js.Any], exceptionQueue = exceptionQueue.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], msgId = msgId.asInstanceOf[js.Any], numAttempts = numAttempts.asInstanceOf[js.Any], originalMsgId = originalMsgId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedQueueMessage[T]]
  }
  @scala.inline
  implicit class AdvancedQueueMessageOps[Self <: AdvancedQueueMessage[_], T] (val x: Self with AdvancedQueueMessage[T]) extends AnyVal {
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
    def setCorrelation(value: String): Self = this.set("correlation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeliveryMode(value: Double): Self = this.set("deliveryMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExceptionQueue(value: String): Self = this.set("exceptionQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiration(value: Double): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsgId(value: Buffer): Self = this.set("msgId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumAttempts(value: Double): Self = this.set("numAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalMsgId(value: Buffer): Self = this.set("originalMsgId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Buffer | DBObjectOUT[T]): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

