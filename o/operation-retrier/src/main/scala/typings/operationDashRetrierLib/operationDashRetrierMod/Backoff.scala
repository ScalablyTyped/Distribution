package typings
package operationDashRetrierLib.operationDashRetrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("operation-retrier", "Backoff")
@js.native
class Backoff protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: js.Any) = this()
  var backoffDelay: js.Any = js.native
  var backoffNumber: js.Any = js.native
  val factor: js.Any = js.native
  val initialDelay: js.Any = js.native
  val maxDelay: js.Any = js.native
  var maxNumberOfRetry: js.Any = js.native
  var nextBackoffDelay: js.Any = js.native
  val randomisationFactor: js.Any = js.native
  var timeoutID: js.Any = js.native
  def backoff(): scala.Unit = js.native
  def backoff(err: js.Any): scala.Unit = js.native
  def failAfter(maxNumberOfRetry: js.Any): scala.Unit = js.native
  def next(): scala.Double = js.native
  def onBackoff(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

/* static members */
@JSImport("operation-retrier", "Backoff")
@js.native
object Backoff extends js.Object {
  def exponential(options: js.Any): operationDashRetrierLib.operationDashRetrierMod.Backoff = js.native
}

