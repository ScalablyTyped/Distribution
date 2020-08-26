package typings.officeUiFabricReact.anon

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ComboBox/ComboBox.types.IComboBoxStyles> */
@js.native
trait PartialIComboBoxStyles extends js.Object {
  var callout: js.UndefOr[IStyle] = js.native
  var container: js.UndefOr[IStyle] = js.native
  var divider: js.UndefOr[IStyle] = js.native
  var errorMessage: js.UndefOr[IStyle] = js.native
  var header: js.UndefOr[IStyle] = js.native
  var input: js.UndefOr[IStyle] = js.native
  var inputDisabled: js.UndefOr[IStyle] = js.native
  var label: js.UndefOr[IStyle] = js.native
  var labelDisabled: js.UndefOr[IStyle] = js.native
  var optionsContainer: js.UndefOr[IStyle] = js.native
  var optionsContainerWrapper: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
  var rootDisabled: js.UndefOr[IStyle] = js.native
  var rootDisallowFreeForm: js.UndefOr[IStyle] = js.native
  var rootError: js.UndefOr[IStyle] = js.native
  var rootFocused: js.UndefOr[IStyle] = js.native
  var rootHovered: js.UndefOr[IStyle] = js.native
  var rootPressed: js.UndefOr[IStyle] = js.native
  var screenReaderText: js.UndefOr[IStyle] = js.native
}

object PartialIComboBoxStyles {
  @scala.inline
  def apply(): PartialIComboBoxStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIComboBoxStyles]
  }
  @scala.inline
  implicit class PartialIComboBoxStylesOps[Self <: PartialIComboBoxStyles] (val x: Self) extends AnyVal {
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
    def setCallout(value: IStyle): Self = this.set("callout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    @scala.inline
    def setCalloutNull: Self = this.set("callout", null)
    @scala.inline
    def setContainer(value: IStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    @scala.inline
    def setDivider(value: IStyle): Self = this.set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    @scala.inline
    def setDividerNull: Self = this.set("divider", null)
    @scala.inline
    def setErrorMessage(value: IStyle): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setErrorMessageNull: Self = this.set("errorMessage", null)
    @scala.inline
    def setHeader(value: IStyle): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
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
    def setOptionsContainer(value: IStyle): Self = this.set("optionsContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionsContainer: Self = this.set("optionsContainer", js.undefined)
    @scala.inline
    def setOptionsContainerNull: Self = this.set("optionsContainer", null)
    @scala.inline
    def setOptionsContainerWrapper(value: IStyle): Self = this.set("optionsContainerWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionsContainerWrapper: Self = this.set("optionsContainerWrapper", js.undefined)
    @scala.inline
    def setOptionsContainerWrapperNull: Self = this.set("optionsContainerWrapper", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setRootDisabled(value: IStyle): Self = this.set("rootDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDisabled: Self = this.set("rootDisabled", js.undefined)
    @scala.inline
    def setRootDisabledNull: Self = this.set("rootDisabled", null)
    @scala.inline
    def setRootDisallowFreeForm(value: IStyle): Self = this.set("rootDisallowFreeForm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDisallowFreeForm: Self = this.set("rootDisallowFreeForm", js.undefined)
    @scala.inline
    def setRootDisallowFreeFormNull: Self = this.set("rootDisallowFreeForm", null)
    @scala.inline
    def setRootError(value: IStyle): Self = this.set("rootError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootError: Self = this.set("rootError", js.undefined)
    @scala.inline
    def setRootErrorNull: Self = this.set("rootError", null)
    @scala.inline
    def setRootFocused(value: IStyle): Self = this.set("rootFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootFocused: Self = this.set("rootFocused", js.undefined)
    @scala.inline
    def setRootFocusedNull: Self = this.set("rootFocused", null)
    @scala.inline
    def setRootHovered(value: IStyle): Self = this.set("rootHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootHovered: Self = this.set("rootHovered", js.undefined)
    @scala.inline
    def setRootHoveredNull: Self = this.set("rootHovered", null)
    @scala.inline
    def setRootPressed(value: IStyle): Self = this.set("rootPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootPressed: Self = this.set("rootPressed", js.undefined)
    @scala.inline
    def setRootPressedNull: Self = this.set("rootPressed", null)
    @scala.inline
    def setScreenReaderText(value: IStyle): Self = this.set("screenReaderText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenReaderText: Self = this.set("screenReaderText", js.undefined)
    @scala.inline
    def setScreenReaderTextNull: Self = this.set("screenReaderText", null)
  }
  
}

