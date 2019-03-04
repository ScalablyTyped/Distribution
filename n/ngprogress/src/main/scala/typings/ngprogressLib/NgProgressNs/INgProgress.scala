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
    color: js.Function1[java.lang.String, scala.Unit],
    complete: js.Function0[scala.Unit],
    height: js.Function1[java.lang.String, scala.Unit],
    reset: js.Function0[scala.Unit],
    set: js.Function1[scala.Double, scala.Unit],
    start: js.Function0[scala.Unit],
    status: js.Function0[scala.Double],
    stop: js.Function0[scala.Unit]
  ): INgProgress = {
    val __obj = js.Dynamic.literal(color = color, complete = complete, height = height, reset = reset, set = set, start = start, status = status, stop = stop)
  
    __obj.asInstanceOf[INgProgress]
  }
}

