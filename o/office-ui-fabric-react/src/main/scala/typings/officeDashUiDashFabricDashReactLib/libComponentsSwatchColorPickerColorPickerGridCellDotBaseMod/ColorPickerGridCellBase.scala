package typings
package officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerColorPickerGridCellDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/ColorPickerGridCell.base", "ColorPickerGridCellBase")
@js.native
class ColorPickerGridCellBase ()
  extends reactLib.reactMod.Component[
      officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod.IColorPickerGridCellProps, 
      js.Object, 
      js.Any
    ] {
  var _classNames: js.Any = js.native
  /**
    * Method to override the getClassNames func in a button.
    */
  var _getClassNames: js.Any = js.native
  /**
    * Render the core of a color cell
    * @returns - Element representing the core of the item
    */
  var _onRenderColorOption: js.Any = js.native
  /**
    * Validate if the cell's color is white or not to apply whiteCell style
    * @param inputColor - The color of the current cell
    * @returns - Whether the cell's color is white or not.
    */
  /* private */ def _isWhiteCell(inputColor: js.Any): js.Any = js.native
}

@JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/ColorPickerGridCell.base", "ColorPickerGridCellBase")
@js.native
object ColorPickerGridCellBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod.IColorPickerGridCellProps = js.native
}

