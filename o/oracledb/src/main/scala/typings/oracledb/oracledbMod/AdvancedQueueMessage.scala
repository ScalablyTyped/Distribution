package typings.oracledb.oracledbMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message dequeued from an advanced queue.
  * 
  * @since 4.0
  */
trait AdvancedQueueMessage extends js.Object {
  /** Correlation that was used during enqueue. */
  var correlation: String
  /** Number of seconds the message was delayed before it could be dequeued. */
  var delay: Double
  /** Delivery mode the messages was enqueued with. */
  var deliveryMode: Double
  /** Name of the exception queue defined when the message was enqueued. */
  var exceptionQueue: String
  /** Number of seconds until expiration defined when the message was enqueued. */
  var expiration: Double
  /** Contains the unique identifier of the message. */
  var msgId: Buffer
  /** Number of attempts that were made to dequeue the message. */
  var numAttempts: Double
  /** Contains the unique identifier of the message in the last queue that generated it. */
  var originalMsgId: Buffer
  /** Contains the payload of the message, with type depending on the value of queue.payloadType.
    * Note that enqueued Strings are returned as UTF-8 encoded Buffers.
    */
  var payload: Buffer | DBObject
  /** Priority of the message when it was enqueued. */
  var priority: Double
  /** State of the message. It can be any one of the AQ_MSG_STATE constants. */
  var state: Double
}

object AdvancedQueueMessage {
  @scala.inline
  def apply(
    correlation: String,
    delay: Double,
    deliveryMode: Double,
    exceptionQueue: String,
    expiration: Double,
    msgId: Buffer,
    numAttempts: Double,
    originalMsgId: Buffer,
    payload: Buffer | DBObject,
    priority: Double,
    state: Double
  ): AdvancedQueueMessage = {
    val __obj = js.Dynamic.literal(correlation = correlation, delay = delay, deliveryMode = deliveryMode, exceptionQueue = exceptionQueue, expiration = expiration, msgId = msgId, numAttempts = numAttempts, originalMsgId = originalMsgId, payload = payload.asInstanceOf[js.Any], priority = priority, state = state)
  
    __obj.asInstanceOf[AdvancedQueueMessage]
  }
}

