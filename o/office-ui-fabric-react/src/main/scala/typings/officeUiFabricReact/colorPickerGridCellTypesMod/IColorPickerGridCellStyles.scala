package typings.officeUiFabricReact.colorPickerGridCellTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerGridCellStyles extends js.Object {
  /**
    * Style to apply to a colorCell in the color picker.
    */
  var colorCell: IStyle
  /**
    * Style to apply to the svg element that renders the color.
    */
  var svg: IStyle
}

object IColorPickerGridCellStyles {
  @scala.inline
  def apply(colorCell: js.UndefOr[Null | IStyle] = js.undefined, svg: js.UndefOr[Null | IStyle] = js.undefined): IColorPickerGridCellStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorCell)) __obj.updateDynamic("colorCell")(colorCell.asInstanceOf[js.Any])
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerGridCellStyles]
  }
}

