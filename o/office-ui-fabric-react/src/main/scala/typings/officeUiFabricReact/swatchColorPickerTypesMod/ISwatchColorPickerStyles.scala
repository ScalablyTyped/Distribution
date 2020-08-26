package typings.officeUiFabricReact.swatchColorPickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwatchColorPickerStyles extends js.Object {
  /**
    * Style for the FocusZone container for the grid.
    */
  var focusedContainer: js.UndefOr[IStyle] = js.native
  /**
    * Style applied to the container grid.
    */
  var root: IStyle = js.native
  /**
    * Style for the table cells of the grid.
    */
  var tableCell: IStyle = js.native
}

object ISwatchColorPickerStyles {
  @scala.inline
  def apply(): ISwatchColorPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISwatchColorPickerStyles]
  }
  @scala.inline
  implicit class ISwatchColorPickerStylesOps[Self <: ISwatchColorPickerStyles] (val x: Self) extends AnyVal {
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
    def setFocusedContainer(value: IStyle): Self = this.set("focusedContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusedContainer: Self = this.set("focusedContainer", js.undefined)
    @scala.inline
    def setFocusedContainerNull: Self = this.set("focusedContainer", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setTableCell(value: IStyle): Self = this.set("tableCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCell: Self = this.set("tableCell", js.undefined)
    @scala.inline
    def setTableCellNull: Self = this.set("tableCell", null)
  }
  
}

