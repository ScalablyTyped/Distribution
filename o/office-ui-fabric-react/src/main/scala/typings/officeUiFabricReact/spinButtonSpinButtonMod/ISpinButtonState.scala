package typings.officeUiFabricReact.spinButtonSpinButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinButtonState extends js.Object {
  /**
    * Is true when the control has focus.
    */
  var isFocused: Boolean = js.native
  /**
    * keyboard spin direction, used to style the up or down button
    * as active when up/down arrow is pressed
    */
  var keyboardSpinDirection: KeyboardSpinDirection = js.native
  /**
    * the value of the spin button
    */
  var value: String = js.native
}

object ISpinButtonState {
  @scala.inline
  def apply(isFocused: Boolean, keyboardSpinDirection: KeyboardSpinDirection, value: String): ISpinButtonState = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], keyboardSpinDirection = keyboardSpinDirection.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinButtonState]
  }
  @scala.inline
  implicit class ISpinButtonStateOps[Self <: ISpinButtonState] (val x: Self) extends AnyVal {
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
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardSpinDirection(value: KeyboardSpinDirection): Self = this.set("keyboardSpinDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

