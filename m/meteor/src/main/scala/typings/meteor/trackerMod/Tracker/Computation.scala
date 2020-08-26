package typings.meteor.trackerMod.Tracker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Computation extends js.Object {
  var firstRun: Boolean = js.native
  var invalidated: Boolean = js.native
  var stopped: Boolean = js.native
  def invalidate(): Unit = js.native
  def onInvalidate(callback: js.Function): Unit = js.native
  def onStop(callback: js.Function): Unit = js.native
  def stop(): Unit = js.native
}

@JSImport("meteor/tracker", "Tracker.Computation")
@js.native
object Computation extends js.Object {
  def apply(): Unit = js.native
}

