package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIColorPickerGridCe
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellProps
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorPickerGridCellBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/ColorPickerGridCell.base", "ColorPickerGridCellBase")
  @js.native
  class ColorPickerGridCellBase protected ()
    extends PureComponent[IColorPickerGridCellProps, js.Object, js.Any] {
    def this(props: IColorPickerGridCellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IColorPickerGridCellProps, context: js.Any) = this()
    
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
  object ColorPickerGridCellBase {
    
    @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/ColorPickerGridCell.base", "ColorPickerGridCellBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/ColorPickerGridCell.base", "ColorPickerGridCellBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorPickerGridCe = js.native
    @scala.inline
    def defaultProps_=(x: PartialIColorPickerGridCe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
