package typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  def apply(colorCell: IStyle, svg: IStyle): IColorPickerGridCellStyles = {
    val __obj = js.Dynamic.literal(colorCell = colorCell.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColorPickerGridCellStyles]
  }
}

