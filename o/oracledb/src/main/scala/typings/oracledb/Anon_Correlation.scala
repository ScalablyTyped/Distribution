package typings.oracledb

import typings.node.Buffer
import typings.oracledb.oracledbMod.DBObject
import typings.oracledb.oracledbMod._EnqueueMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Correlation extends _EnqueueMessage {
  /** Correlation that was used during enqueue. */
  var correlation: String
  /** Number of seconds the message was delayed before it could be dequeued. */
  var delay: Double
  /** Name of the exception queue defined when the message was enqueued. */
  var exceptionQueue: String
  /** Number of seconds until expiration defined when the message was enqueued. */
  var expiration: Double
  /** Contains the payload of the message, with type depending on the value of queue.payloadType.
    * Note that enqueued Strings are returned as UTF-8 encoded Buffers.
    */
  var payload: Buffer | DBObject
  /** Priority of the message when it was enqueued. */
  var priority: Double
}

object Anon_Correlation {
  @scala.inline
  def apply(
    correlation: String,
    delay: Double,
    exceptionQueue: String,
    expiration: Double,
    payload: Buffer | DBObject,
    priority: Double
  ): Anon_Correlation = {
    val __obj = js.Dynamic.literal(correlation = correlation, delay = delay, exceptionQueue = exceptionQueue, expiration = expiration, payload = payload.asInstanceOf[js.Any], priority = priority)
  
    __obj.asInstanceOf[Anon_Correlation]
  }
}

