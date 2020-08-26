package typings.officeUiFabricReact.detailsHeaderTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsHeaderStyles extends js.Object {
  var accessibleLabel: IStyle = js.native
  /**
    * @deprecated Not used
    */
  var cellIsActionable: IStyle = js.native
  var cellIsCheck: IStyle = js.native
  /**
    * @deprecated Not used
    */
  var cellIsEmpty: IStyle = js.native
  var cellIsGroupExpander: IStyle = js.native
  var cellIsResizing: IStyle = js.native
  var cellSizer: IStyle = js.native
  var cellSizerEnd: IStyle = js.native
  var cellSizerStart: IStyle = js.native
  /**
    * @deprecated Not used
    */
  var cellWrapperPadded: IStyle = js.native
  var check: IStyle = js.native
  var checkTooltip: IStyle = js.native
  var collapseButton: IStyle = js.native
  var dropHintCaretStyle: IStyle = js.native
  var dropHintCircleStyle: IStyle = js.native
  var dropHintLineStyle: IStyle = js.native
  var dropHintStyle: IStyle = js.native
  var root: IStyle = js.native
  var sizingOverlay: IStyle = js.native
}

object IDetailsHeaderStyles {
  @scala.inline
  def apply(): IDetailsHeaderStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsHeaderStyles]
  }
  @scala.inline
  implicit class IDetailsHeaderStylesOps[Self <: IDetailsHeaderStyles] (val x: Self) extends AnyVal {
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
    def setAccessibleLabel(value: IStyle): Self = this.set("accessibleLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibleLabel: Self = this.set("accessibleLabel", js.undefined)
    @scala.inline
    def setAccessibleLabelNull: Self = this.set("accessibleLabel", null)
    @scala.inline
    def setCellIsActionable(value: IStyle): Self = this.set("cellIsActionable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIsActionable: Self = this.set("cellIsActionable", js.undefined)
    @scala.inline
    def setCellIsActionableNull: Self = this.set("cellIsActionable", null)
    @scala.inline
    def setCellIsCheck(value: IStyle): Self = this.set("cellIsCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIsCheck: Self = this.set("cellIsCheck", js.undefined)
    @scala.inline
    def setCellIsCheckNull: Self = this.set("cellIsCheck", null)
    @scala.inline
    def setCellIsEmpty(value: IStyle): Self = this.set("cellIsEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIsEmpty: Self = this.set("cellIsEmpty", js.undefined)
    @scala.inline
    def setCellIsEmptyNull: Self = this.set("cellIsEmpty", null)
    @scala.inline
    def setCellIsGroupExpander(value: IStyle): Self = this.set("cellIsGroupExpander", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIsGroupExpander: Self = this.set("cellIsGroupExpander", js.undefined)
    @scala.inline
    def setCellIsGroupExpanderNull: Self = this.set("cellIsGroupExpander", null)
    @scala.inline
    def setCellIsResizing(value: IStyle): Self = this.set("cellIsResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIsResizing: Self = this.set("cellIsResizing", js.undefined)
    @scala.inline
    def setCellIsResizingNull: Self = this.set("cellIsResizing", null)
    @scala.inline
    def setCellSizer(value: IStyle): Self = this.set("cellSizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSizer: Self = this.set("cellSizer", js.undefined)
    @scala.inline
    def setCellSizerNull: Self = this.set("cellSizer", null)
    @scala.inline
    def setCellSizerEnd(value: IStyle): Self = this.set("cellSizerEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSizerEnd: Self = this.set("cellSizerEnd", js.undefined)
    @scala.inline
    def setCellSizerEndNull: Self = this.set("cellSizerEnd", null)
    @scala.inline
    def setCellSizerStart(value: IStyle): Self = this.set("cellSizerStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSizerStart: Self = this.set("cellSizerStart", js.undefined)
    @scala.inline
    def setCellSizerStartNull: Self = this.set("cellSizerStart", null)
    @scala.inline
    def setCellWrapperPadded(value: IStyle): Self = this.set("cellWrapperPadded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellWrapperPadded: Self = this.set("cellWrapperPadded", js.undefined)
    @scala.inline
    def setCellWrapperPaddedNull: Self = this.set("cellWrapperPadded", null)
    @scala.inline
    def setCheck(value: IStyle): Self = this.set("check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    @scala.inline
    def setCheckNull: Self = this.set("check", null)
    @scala.inline
    def setCheckTooltip(value: IStyle): Self = this.set("checkTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckTooltip: Self = this.set("checkTooltip", js.undefined)
    @scala.inline
    def setCheckTooltipNull: Self = this.set("checkTooltip", null)
    @scala.inline
    def setCollapseButton(value: IStyle): Self = this.set("collapseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseButton: Self = this.set("collapseButton", js.undefined)
    @scala.inline
    def setCollapseButtonNull: Self = this.set("collapseButton", null)
    @scala.inline
    def setDropHintCaretStyle(value: IStyle): Self = this.set("dropHintCaretStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropHintCaretStyle: Self = this.set("dropHintCaretStyle", js.undefined)
    @scala.inline
    def setDropHintCaretStyleNull: Self = this.set("dropHintCaretStyle", null)
    @scala.inline
    def setDropHintCircleStyle(value: IStyle): Self = this.set("dropHintCircleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropHintCircleStyle: Self = this.set("dropHintCircleStyle", js.undefined)
    @scala.inline
    def setDropHintCircleStyleNull: Self = this.set("dropHintCircleStyle", null)
    @scala.inline
    def setDropHintLineStyle(value: IStyle): Self = this.set("dropHintLineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropHintLineStyle: Self = this.set("dropHintLineStyle", js.undefined)
    @scala.inline
    def setDropHintLineStyleNull: Self = this.set("dropHintLineStyle", null)
    @scala.inline
    def setDropHintStyle(value: IStyle): Self = this.set("dropHintStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropHintStyle: Self = this.set("dropHintStyle", js.undefined)
    @scala.inline
    def setDropHintStyleNull: Self = this.set("dropHintStyle", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setSizingOverlay(value: IStyle): Self = this.set("sizingOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizingOverlay: Self = this.set("sizingOverlay", js.undefined)
    @scala.inline
    def setSizingOverlayNull: Self = this.set("sizingOverlay", null)
  }
  
}

