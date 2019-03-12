package typings
package preciseLib.preciseMod.underscorePreciseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Precise extends js.Object {
  /**
    * Returns the nanoseconds from `start()` to `stop()`
    */
  def diff(): scala.Double
  /**
    * Starts a timer
    */
  def start(): Precise
  /**
    * Stops a timer
    */
  def stop(): Precise
}

object Precise {
  @scala.inline
  def apply(diff: () => scala.Double, start: () => Precise, stop: () => Precise): Precise = {
    val __obj = js.Dynamic.literal(diff = js.Any.fromFunction0(diff), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Precise]
  }
}

