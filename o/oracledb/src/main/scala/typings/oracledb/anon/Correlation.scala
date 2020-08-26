package typings.oracledb.anon

import typings.node.Buffer
import typings.oracledb.mod.DBObjectIN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Correlation[T] extends js.Object {
  /** Correlation that was used during enqueue. */
  var correlation: String = js.native
  /** Number of seconds the message was delayed before it could be dequeued. */
  var delay: Double = js.native
  /** Name of the exception queue defined when the message was enqueued. */
  var exceptionQueue: String = js.native
  /** Number of seconds until expiration defined when the message was enqueued. */
  var expiration: Double = js.native
  /** Contains the payload of the message, with type depending on the value of queue.payloadType.
    * Note that enqueued Strings are returned as UTF-8 encoded Buffers.
    */
  var payload: String | Buffer | DBObjectIN[T] = js.native
  /** Priority of the message when it was enqueued. */
  var priority: Double = js.native
}

object Correlation {
  @scala.inline
  def apply[T](
    correlation: String,
    delay: Double,
    exceptionQueue: String,
    expiration: Double,
    payload: String | Buffer | DBObjectIN[T],
    priority: Double
  ): Correlation[T] = {
    val __obj = js.Dynamic.literal(correlation = correlation.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], exceptionQueue = exceptionQueue.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Correlation[T]]
  }
  @scala.inline
  implicit class CorrelationOps[Self <: Correlation[_], T] (val x: Self with Correlation[T]) extends AnyVal {
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
    def setExceptionQueue(value: String): Self = this.set("exceptionQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiration(value: Double): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: String | Buffer | DBObjectIN[T]): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
  }
  
}

