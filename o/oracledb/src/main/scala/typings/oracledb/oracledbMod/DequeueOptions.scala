package typings.oracledb.oracledbMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * Options to use when dequeuing messages. Attributes can be set before each queue.deqOne() or queue.deqMany().
  * 
  * @see https://oracle.github.io/node-oracledb/doc/api.html#aqoptions
  * @since 4.0
  */
trait DequeueOptions extends js.Object {
  /** Condition that must be satisfied in order for a message to be dequeued. */
  var condition: String
  /** Name of the consumer that is dequeuing messages. */
  var consumerName: String
  /** Correlation to use when dequeuing. */
  var correlation: String
  /** Mode to use for dequeuing messages. It can be any one of the AQ_DEQ_MODE constants. */
  var mode: Double
  /** Unique identifier specifying the message to be dequeued. */
  var msgId: Buffer
  /** Position in the queue of the message that is to be dequeued. It can be any one of the AQ_DEQ_NAV constants. */
  var navigation: Double
  /** Transformation that will take place on messages when they are dequeued. */
  var transformation: String
  /** Defines whether the dequeue occurs in the current transaction or as a separate transaction. It can be any one of the AQ_VISIBILITY constants. */
  var visibility: Double
  /** Number of seconds to wait for a message matching the search criteria to become available. It can be any one of the AQ_DEQ wait constants. */
  @JSName("wait")
  var wait_FDequeueOptions: Double
}

object DequeueOptions {
  @scala.inline
  def apply(
    condition: String,
    consumerName: String,
    correlation: String,
    mode: Double,
    msgId: Buffer,
    navigation: Double,
    transformation: String,
    visibility: Double,
    wait: Double
  ): DequeueOptions = {
    val __obj = js.Dynamic.literal(condition = condition, consumerName = consumerName, correlation = correlation, mode = mode, msgId = msgId, navigation = navigation, transformation = transformation, visibility = visibility, wait = wait)
  
    __obj.asInstanceOf[DequeueOptions]
  }
}

