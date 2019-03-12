package typings
package ngprogressLib.NgProgressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgProgress extends js.Object {
  def color(color: java.lang.String): scala.Unit
  def complete(): scala.Unit
  def height(height: java.lang.String): scala.Unit
  def reset(): scala.Unit
  def set(value: scala.Double): scala.Unit
  def start(): scala.Unit
  def status(): scala.Double
  def stop(): scala.Unit
}

object INgProgress {
  @scala.inline
  def apply(
    color: java.lang.String => scala.Unit,
    complete: () => scala.Unit,
    height: java.lang.String => scala.Unit,
    reset: () => scala.Unit,
    set: scala.Double => scala.Unit,
    start: () => scala.Unit,
    status: () => scala.Double,
    stop: () => scala.Unit
  ): INgProgress = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction1(color), complete = js.Any.fromFunction0(complete), height = js.Any.fromFunction1(height), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), status = js.Any.fromFunction0(status), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[INgProgress]
  }
}

