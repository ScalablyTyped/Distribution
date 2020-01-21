package typings.officeUiFabricReact

import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellProps
import typings.react.mod.Component
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/ColorPickerGridCell.base", JSImport.Namespace)
@js.native
object colorPickerGridCellBaseMod extends js.Object {
  @js.native
  class ColorPickerGridCellBase ()
    extends Component[IColorPickerGridCellProps, js.Object, js.Any] {
    var _classNames: js.Any = js.native
    /**
      * Validate if the cell's color is white or not to apply whiteCell style
      * @param inputColor - The color of the current cell
      * @returns - Whether the cell's color is white or not.
      */
    var _isWhiteCell: js.Any = js.native
    /**
      * Render the core of a color cell
      * @returns - Element representing the core of the item
      */
    var _onRenderColorOption: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ColorPickerGridCellBase extends js.Object {
    var defaultProps: Partial[IColorPickerGridCellProps] = js.native
  }
  
}

