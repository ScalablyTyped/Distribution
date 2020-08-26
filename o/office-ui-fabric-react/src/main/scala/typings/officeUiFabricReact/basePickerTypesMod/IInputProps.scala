package typings.officeUiFabricReact.basePickerTypesMod

import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputProps extends InputHTMLAttributes[HTMLInputElement] {
  /**
    * The default value to be visible when the autofill first created.
    * This is different than placeholder text because the placeholder text will disappear and re-appear. This
    * text persists until deleted or changed.
    */
  var defaultVisibleValue: js.UndefOr[String] = js.native
}

object IInputProps {
  @scala.inline
  def apply(): IInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInputProps]
  }
  @scala.inline
  implicit class IInputPropsOps[Self <: IInputProps] (val x: Self) extends AnyVal {
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
    def setDefaultVisibleValue(value: String): Self = this.set("defaultVisibleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVisibleValue: Self = this.set("defaultVisibleValue", js.undefined)
  }
  
}

