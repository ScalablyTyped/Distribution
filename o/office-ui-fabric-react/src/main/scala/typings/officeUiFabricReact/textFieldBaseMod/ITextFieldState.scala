package typings.officeUiFabricReact.textFieldBaseMod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextFieldState extends js.Object {
  /**
    * Dynamic error message returned by `onGetErrorMessage`.
    * Use `this._errorMessage` to get the actual current error message.
    */
  var errorMessage: String | Element = js.native
  /** Is true when the control has focus. */
  var isFocused: js.UndefOr[Boolean] = js.native
  /** The currently displayed value if uncontrolled. */
  var uncontrolledValue: js.UndefOr[String] = js.native
}

object ITextFieldState {
  @scala.inline
  def apply(errorMessage: String | Element): ITextFieldState = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldState]
  }
  @scala.inline
  implicit class ITextFieldStateOps[Self <: ITextFieldState] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String | Element): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    @scala.inline
    def setUncontrolledValue(value: String): Self = this.set("uncontrolledValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncontrolledValue: Self = this.set("uncontrolledValue", js.undefined)
  }
  
}

