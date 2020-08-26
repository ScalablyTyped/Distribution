package typings.nosleepJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoSleep extends js.Object {
  /**
    * Disables wake lock at some point in the future.
    *
    * @remarks
    * This does not need to be wrapped in any user input.
    */
  def disable(): Unit = js.native
  /**
    * Enables wake lock.
    *
    * @remarks
    * This function call must be wrapped in a user input event handler:
    * e.g. a mouse or touch handler.
    */
  def enable(): Unit = js.native
}

object NoSleep {
  @scala.inline
  def apply(disable: () => Unit, enable: () => Unit): NoSleep = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
    __obj.asInstanceOf[NoSleep]
  }
  @scala.inline
  implicit class NoSleepOps[Self <: NoSleep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
  }
  
}

