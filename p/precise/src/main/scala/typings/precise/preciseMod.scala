package typings.precise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("precise", JSImport.Namespace)
@js.native
object preciseMod extends js.Object {
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
  
  def apply(): Precise = js.native
}

