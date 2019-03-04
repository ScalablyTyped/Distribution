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
  def apply(diff: js.Function0[scala.Double], start: js.Function0[Precise], stop: js.Function0[Precise]): Precise = {
    val __obj = js.Dynamic.literal(diff = diff, start = start, stop = stop)
  
    __obj.asInstanceOf[Precise]
  }
}

