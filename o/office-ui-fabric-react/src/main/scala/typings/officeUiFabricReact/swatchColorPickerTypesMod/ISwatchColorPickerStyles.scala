package typings.officeUiFabricReact.swatchColorPickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwatchColorPickerStyles extends js.Object {
  /**
    * Style for the FocusZone container for the grid.
    */
  var focusedContainer: js.UndefOr[IStyle] = js.undefined
  /**
    * Style applied to the container grid.
    */
  var root: IStyle
  /**
    * Style for the table cells of the grid.
    */
  var tableCell: IStyle
}

object ISwatchColorPickerStyles {
  @scala.inline
  def apply(focusedContainer: IStyle = null, root: IStyle = null, tableCell: IStyle = null): ISwatchColorPickerStyles = {
    val __obj = js.Dynamic.literal()
    if (focusedContainer != null) __obj.updateDynamic("focusedContainer")(focusedContainer.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (tableCell != null) __obj.updateDynamic("tableCell")(tableCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwatchColorPickerStyles]
  }
}

