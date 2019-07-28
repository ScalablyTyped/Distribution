package typings.operationDashRetrier.libBackoffMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("operation-retrier/lib/backoff", "Backoff")
@js.native
class Backoff protected () extends EventEmitter {
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
  def backoff(): Unit = js.native
  def backoff(err: js.Any): Unit = js.native
  def failAfter(maxNumberOfRetry: js.Any): Unit = js.native
  def next(): Double = js.native
  def onBackoff(): Unit = js.native
  def reset(): Unit = js.native
}

/* static members */
@JSImport("operation-retrier/lib/backoff", "Backoff")
@js.native
object Backoff extends js.Object {
  def exponential(options: js.Any): Backoff = js.native
}

