package typings.nosleepJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nosleep.js", JSImport.Namespace)
@js.native
class ^ () extends NoSleep {
  /**
    * Disables wake lock at some point in the future.
    *
    * @remarks
    * This does not need to be wrapped in any user input.
    */
  /* CompleteClass */
  override def disable(): Unit = js.native
  /**
    * Enables wake lock.
    *
    * @remarks
    * This function call must be wrapped in a user input event handler:
    * e.g. a mouse or touch handler.
    */
  /* CompleteClass */
  override def enable(): Unit = js.native
}

