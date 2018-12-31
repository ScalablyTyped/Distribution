package typings
package meteorLib.TrackerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Computation extends js.Object {
  var firstRun: scala.Boolean
  var invalidated: scala.Boolean
  var stopped: scala.Boolean
  def invalidate(): scala.Unit
  def onInvalidate(callback: js.Function): scala.Unit
  def onStop(callback: js.Function): scala.Unit
  def stop(): scala.Unit
}

