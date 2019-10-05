package typings.meteorDashTypings.meteorTrackerMod.Tracker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Computation extends js.Object {
  var firstRun: Boolean
  var invalidated: Boolean
  var stopped: Boolean
  def invalidate(): Unit
  def onInvalidate(callback: js.Function): Unit
  def onStop(callback: js.Function): Unit
  def stop(): Unit
}

@JSImport("meteor/tracker", "Tracker.Computation")
@js.native
object Computation extends js.Object {
  def apply(): Unit = js.native
}

