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

