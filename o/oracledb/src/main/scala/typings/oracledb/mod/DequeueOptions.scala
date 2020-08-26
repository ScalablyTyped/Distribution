package typings.oracledb.mod

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
@js.native
trait DequeueOptions extends js.Object {
  /** Condition that must be satisfied in order for a message to be dequeued. */
  var condition: String = js.native
  /** Name of the consumer that is dequeuing messages. */
  var consumerName: String = js.native
  /** Correlation to use when dequeuing. */
  var correlation: String = js.native
  /** Mode to use for dequeuing messages. It can be any one of the AQ_DEQ_MODE constants. */
  var mode: Double = js.native
  /** Unique identifier specifying the message to be dequeued. */
  var msgId: Buffer = js.native
  /** Position in the queue of the message that is to be dequeued. It can be any one of the AQ_DEQ_NAV constants. */
  var navigation: Double = js.native
  /** Transformation that will take place on messages when they are dequeued. */
  var transformation: String = js.native
  /** Defines whether the dequeue occurs in the current transaction or as a separate transaction. It can be any one of the AQ_VISIBILITY constants. */
  var visibility: Double = js.native
  /** Number of seconds to wait for a message matching the search criteria to become available. It can be any one of the AQ_DEQ wait constants. */
  @JSName("wait")
  var wait_FDequeueOptions: Double = js.native
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
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], consumerName = consumerName.asInstanceOf[js.Any], correlation = correlation.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], msgId = msgId.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], transformation = transformation.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[DequeueOptions]
  }
  @scala.inline
  implicit class DequeueOptionsOps[Self <: DequeueOptions] (val x: Self) extends AnyVal {
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
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumerName(value: String): Self = this.set("consumerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCorrelation(value: String): Self = this.set("correlation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsgId(value: Buffer): Self = this.set("msgId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigation(value: Double): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformation(value: String): Self = this.set("transformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibility(value: Double): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
  }
  
}

