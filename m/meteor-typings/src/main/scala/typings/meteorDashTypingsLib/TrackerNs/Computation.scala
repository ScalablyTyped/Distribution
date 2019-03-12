package typings
package meteorDashTypingsLib.TrackerNs

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
    invalidate: () => scala.Unit,
    invalidated: scala.Boolean,
    onInvalidate: js.Function => scala.Unit,
    onStop: js.Function => scala.Unit,
    stop: () => scala.Unit,
    stopped: scala.Boolean
  ): Computation = {
    val __obj = js.Dynamic.literal(firstRun = firstRun, invalidate = js.Any.fromFunction0(invalidate), invalidated = invalidated, onInvalidate = js.Any.fromFunction1(onInvalidate), onStop = js.Any.fromFunction1(onStop), stop = js.Any.fromFunction0(stop), stopped = stopped)
  
    __obj.asInstanceOf[Computation]
  }
}

