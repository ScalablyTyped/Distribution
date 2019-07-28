package typings.meteor.TrackerNs

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

object Computation {
  @scala.inline
  def apply(
    firstRun: Boolean,
    invalidate: () => Unit,
    invalidated: Boolean,
    onInvalidate: js.Function => Unit,
    onStop: js.Function => Unit,
    stop: () => Unit,
    stopped: Boolean
  ): Computation = {
    val __obj = js.Dynamic.literal(firstRun = firstRun, invalidate = js.Any.fromFunction0(invalidate), invalidated = invalidated, onInvalidate = js.Any.fromFunction1(onInvalidate), onStop = js.Any.fromFunction1(onStop), stop = js.Any.fromFunction0(stop), stopped = stopped)
  
    __obj.asInstanceOf[Computation]
  }
}

