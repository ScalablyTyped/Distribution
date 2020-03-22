package typings.newrelic.mod

import org.scalablytyped.runtime.StringDictionary
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
  /**
    * Inserts distributed trace headers into the provided headers map.
    */
  def insertDistributedTraceHeaders(headers: StringDictionary[js.UndefOr[Double | String | js.Array[String]]]): Unit = js.native
}

