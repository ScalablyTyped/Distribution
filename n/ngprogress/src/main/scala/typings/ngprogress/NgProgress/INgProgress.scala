package typings.ngprogress.NgProgress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgProgress extends js.Object {
  def color(color: String): Unit
  def complete(): Unit
  def height(height: String): Unit
  def reset(): Unit
  def set(value: Double): Unit
  def start(): Unit
  def status(): Double
  def stop(): Unit
}

object INgProgress {
  @scala.inline
  def apply(
    color: String => Unit,
    complete: () => Unit,
    height: String => Unit,
    reset: () => Unit,
    set: Double => Unit,
    start: () => Unit,
    status: () => Double,
    stop: () => Unit
  ): INgProgress = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction1(color), complete = js.Any.fromFunction0(complete), height = js.Any.fromFunction1(height), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), status = js.Any.fromFunction0(status), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[INgProgress]
  }
}

