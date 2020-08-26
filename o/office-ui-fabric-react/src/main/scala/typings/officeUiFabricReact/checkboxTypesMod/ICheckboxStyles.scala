package typings.officeUiFabricReact.checkboxTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxStyles extends js.Object {
  /**
    * Style for checkbox in its default unchecked/enabled state.
    */
  var checkbox: js.UndefOr[IStyle] = js.native
  /**
    * Style for the checkmark in the default enabled/unchecked state.
    */
  var checkmark: js.UndefOr[IStyle] = js.native
  /**
    * INTERNAL: This is mostly an internal implementation detail which you should avoid styling.
    * This refers to the <input type="checkbox"> element that is typically hidden and not rendered on screen.
    */
  var input: js.UndefOr[IStyle] = js.native
  /**
    * Style for the label part (contains the customized checkbox + text) when enabled.
    */
  var label: js.UndefOr[IStyle] = js.native
  /**
    * Style for the root element (a button) of the checkbox component in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.native
  /**
    * Style for text appearing with the checkbox in its default enabled state.
    */
  var text: js.UndefOr[IStyle] = js.native
}

object ICheckboxStyles {
  @scala.inline
  def apply(): ICheckboxStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxStyles]
  }
  @scala.inline
  implicit class ICheckboxStylesOps[Self <: ICheckboxStyles] (val x: Self) extends AnyVal {
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
    def setCheckbox(value: IStyle): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckbox: Self = this.set("checkbox", js.undefined)
    @scala.inline
    def setCheckboxNull: Self = this.set("checkbox", null)
    @scala.inline
    def setCheckmark(value: IStyle): Self = this.set("checkmark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckmark: Self = this.set("checkmark", js.undefined)
    @scala.inline
    def setCheckmarkNull: Self = this.set("checkmark", null)
    @scala.inline
    def setInput(value: IStyle): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setInputNull: Self = this.set("input", null)
    @scala.inline
    def setLabel(value: IStyle): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setText(value: IStyle): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
  
}

