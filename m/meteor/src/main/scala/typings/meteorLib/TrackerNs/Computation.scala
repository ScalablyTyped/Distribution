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

object Computation {
  @scala.inline
  def apply(
    firstRun: scala.Boolean,
    invalidate: js.Function0[scala.Unit],
    invalidated: scala.Boolean,
    onInvalidate: js.Function1[js.Function, scala.Unit],
    onStop: js.Function1[js.Function, scala.Unit],
    stop: js.Function0[scala.Unit],
    stopped: scala.Boolean
  ): Computation = {
    val __obj = js.Dynamic.literal(firstRun = firstRun, invalidate = invalidate, invalidated = invalidated, onInvalidate = onInvalidate, onStop = onStop, stop = stop, stopped = stopped)
  
    __obj.asInstanceOf[Computation]
  }
}

