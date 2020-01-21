package typings.newrelic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionHandle extends js.Object {
  /**
    * Parses incoming distributed trace header payload.
    */
  def acceptDistributedTracePayload(payload: DistributedTracePayload): Unit = js.native
  /**
    * Creates a distributed trace payload.
    */
  def createDistributedTracePayload(): DistributedTracePayload = js.native
  /**
    * End the transaction.
    */
  def end(): Unit = js.native
  def end(callback: js.Function0[_]): Unit = js.native
  /**
    * Mark the transaction to be ignored.
    */
  def ignore(): Unit = js.native
}

