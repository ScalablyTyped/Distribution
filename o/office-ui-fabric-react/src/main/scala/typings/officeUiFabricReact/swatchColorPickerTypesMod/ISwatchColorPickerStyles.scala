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
  def apply(
    focusedContainer: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    tableCell: js.UndefOr[Null | IStyle] = js.undefined
  ): ISwatchColorPickerStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focusedContainer)) __obj.updateDynamic("focusedContainer")(focusedContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(tableCell)) __obj.updateDynamic("tableCell")(tableCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwatchColorPickerStyles]
  }
}

