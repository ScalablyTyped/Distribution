package typings.officeUiFabricReact.anon

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/SpinButton/SpinButton.types.ISpinButtonStyles> */
@js.native
trait PartialISpinButtonStyles extends js.Object {
  var arrowButtonsContainer: js.UndefOr[IStyle] = js.native
  var arrowButtonsContainerDisabled: js.UndefOr[IStyle] = js.native
  var icon: js.UndefOr[IStyle] = js.native
  var iconDisabled: js.UndefOr[IStyle] = js.native
  var input: js.UndefOr[IStyle] = js.native
  var inputDisabled: js.UndefOr[IStyle] = js.native
  var inputTextSelected: js.UndefOr[IStyle] = js.native
  var label: js.UndefOr[IStyle] = js.native
  var labelDisabled: js.UndefOr[IStyle] = js.native
  var labelWrapper: js.UndefOr[IStyle] = js.native
  var labelWrapperBottom: js.UndefOr[IStyle] = js.native
  var labelWrapperEnd: js.UndefOr[IStyle] = js.native
  var labelWrapperStart: js.UndefOr[IStyle] = js.native
  var labelWrapperTop: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
  var spinButtonWrapper: js.UndefOr[IStyle] = js.native
  var spinButtonWrapperDisabled: js.UndefOr[IStyle] = js.native
  var spinButtonWrapperFocused: js.UndefOr[IStyle] = js.native
  var spinButtonWrapperHovered: js.UndefOr[IStyle] = js.native
  var spinButtonWrapperTopBottom: js.UndefOr[IStyle] = js.native
}

object PartialISpinButtonStyles {
  @scala.inline
  def apply(): PartialISpinButtonStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISpinButtonStyles]
  }
  @scala.inline
  implicit class PartialISpinButtonStylesOps[Self <: PartialISpinButtonStyles] (val x: Self) extends AnyVal {
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
    def setArrowButtonsContainer(value: IStyle): Self = this.set("arrowButtonsContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowButtonsContainer: Self = this.set("arrowButtonsContainer", js.undefined)
    @scala.inline
    def setArrowButtonsContainerNull: Self = this.set("arrowButtonsContainer", null)
    @scala.inline
    def setArrowButtonsContainerDisabled(value: IStyle): Self = this.set("arrowButtonsContainerDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowButtonsContainerDisabled: Self = this.set("arrowButtonsContainerDisabled", js.undefined)
    @scala.inline
    def setArrowButtonsContainerDisabledNull: Self = this.set("arrowButtonsContainerDisabled", null)
    @scala.inline
    def setIcon(value: IStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setIconDisabled(value: IStyle): Self = this.set("iconDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconDisabled: Self = this.set("iconDisabled", js.undefined)
    @scala.inline
    def setIconDisabledNull: Self = this.set("iconDisabled", null)
    @scala.inline
    def setInput(value: IStyle): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setInputNull: Self = this.set("input", null)
    @scala.inline
    def setInputDisabled(value: IStyle): Self = this.set("inputDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDisabled: Self = this.set("inputDisabled", js.undefined)
    @scala.inline
    def setInputDisabledNull: Self = this.set("inputDisabled", null)
    @scala.inline
    def setInputTextSelected(value: IStyle): Self = this.set("inputTextSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputTextSelected: Self = this.set("inputTextSelected", js.undefined)
    @scala.inline
    def setInputTextSelectedNull: Self = this.set("inputTextSelected", null)
    @scala.inline
    def setLabel(value: IStyle): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    @scala.inline
    def setLabelDisabled(value: IStyle): Self = this.set("labelDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDisabled: Self = this.set("labelDisabled", js.undefined)
    @scala.inline
    def setLabelDisabledNull: Self = this.set("labelDisabled", null)
    @scala.inline
    def setLabelWrapper(value: IStyle): Self = this.set("labelWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelWrapper: Self = this.set("labelWrapper", js.undefined)
    @scala.inline
    def setLabelWrapperNull: Self = this.set("labelWrapper", null)
    @scala.inline
    def setLabelWrapperBottom(value: IStyle): Self = this.set("labelWrapperBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelWrapperBottom: Self = this.set("labelWrapperBottom", js.undefined)
    @scala.inline
    def setLabelWrapperBottomNull: Self = this.set("labelWrapperBottom", null)
    @scala.inline
    def setLabelWrapperEnd(value: IStyle): Self = this.set("labelWrapperEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelWrapperEnd: Self = this.set("labelWrapperEnd", js.undefined)
    @scala.inline
    def setLabelWrapperEndNull: Self = this.set("labelWrapperEnd", null)
    @scala.inline
    def setLabelWrapperStart(value: IStyle): Self = this.set("labelWrapperStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelWrapperStart: Self = this.set("labelWrapperStart", js.undefined)
    @scala.inline
    def setLabelWrapperStartNull: Self = this.set("labelWrapperStart", null)
    @scala.inline
    def setLabelWrapperTop(value: IStyle): Self = this.set("labelWrapperTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelWrapperTop: Self = this.set("labelWrapperTop", js.undefined)
    @scala.inline
    def setLabelWrapperTopNull: Self = this.set("labelWrapperTop", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setSpinButtonWrapper(value: IStyle): Self = this.set("spinButtonWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinButtonWrapper: Self = this.set("spinButtonWrapper", js.undefined)
    @scala.inline
    def setSpinButtonWrapperNull: Self = this.set("spinButtonWrapper", null)
    @scala.inline
    def setSpinButtonWrapperDisabled(value: IStyle): Self = this.set("spinButtonWrapperDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinButtonWrapperDisabled: Self = this.set("spinButtonWrapperDisabled", js.undefined)
    @scala.inline
    def setSpinButtonWrapperDisabledNull: Self = this.set("spinButtonWrapperDisabled", null)
    @scala.inline
    def setSpinButtonWrapperFocused(value: IStyle): Self = this.set("spinButtonWrapperFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinButtonWrapperFocused: Self = this.set("spinButtonWrapperFocused", js.undefined)
    @scala.inline
    def setSpinButtonWrapperFocusedNull: Self = this.set("spinButtonWrapperFocused", null)
    @scala.inline
    def setSpinButtonWrapperHovered(value: IStyle): Self = this.set("spinButtonWrapperHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinButtonWrapperHovered: Self = this.set("spinButtonWrapperHovered", js.undefined)
    @scala.inline
    def setSpinButtonWrapperHoveredNull: Self = this.set("spinButtonWrapperHovered", null)
    @scala.inline
    def setSpinButtonWrapperTopBottom(value: IStyle): Self = this.set("spinButtonWrapperTopBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinButtonWrapperTopBottom: Self = this.set("spinButtonWrapperTopBottom", js.undefined)
    @scala.inline
    def setSpinButtonWrapperTopBottomNull: Self = this.set("spinButtonWrapperTopBottom", null)
  }
  
}

