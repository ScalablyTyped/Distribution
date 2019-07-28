package typings.precise.preciseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("precise", "Precise")
@js.native
class Precise () extends js.Object {
  /**
    * Returns the nanoseconds from `start()` to `stop()`
    */
  def diff(): Double = js.native
  /**
    * Starts a timer
    */
  def start(): Precise = js.native
  /**
    * Stops a timer
    */
  def stop(): Precise = js.native
}

