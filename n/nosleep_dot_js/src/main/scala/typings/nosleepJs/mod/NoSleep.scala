package typings.nosleepJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSleep extends js.Object {
  /**
    * Disables wake lock at some point in the future.
    *
    * @remarks
    * This does not need to be wrapped in any user input.
    */
  def disable(): Unit
  /**
    * Enables wake lock.
    *
    * @remarks
    * This function call must be wrapped in a user input event handler:
    * e.g. a mouse or touch handler.
    */
  def enable(): Unit
}

object NoSleep {
  @scala.inline
  def apply(disable: () => Unit, enable: () => Unit): NoSleep = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
  
    __obj.asInstanceOf[NoSleep]
  }
}

