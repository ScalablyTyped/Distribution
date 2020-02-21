package typings.officeUiFabricReact

import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellProps
import typings.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import typings.react.mod.FunctionComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker", JSImport.Namespace)
@js.native
object swatchColorPickerMod extends js.Object {
  @js.native
  class ColorPickerGridCellBase ()
    extends typings.officeUiFabricReact.colorPickerGridCellBaseMod.ColorPickerGridCellBase
  
  @js.native
  class SwatchColorPickerBase protected ()
    extends typings.officeUiFabricReact.swatchColorPickerBaseMod.SwatchColorPickerBase {
    def this(props: ISwatchColorPickerProps) = this()
  }
  
  val ColorPickerGridCell: FunctionComponent[IColorPickerGridCellProps] = js.native
  val SwatchColorPicker: FunctionComponent[ISwatchColorPickerProps] = js.native
  /* static members */
  @js.native
  object ColorPickerGridCellBase extends js.Object {
    var defaultProps: Partial[IColorPickerGridCellProps] = js.native
  }
  
  /* static members */
  @js.native
  object SwatchColorPickerBase extends js.Object {
    var defaultProps: ISwatchColorPickerProps = js.native
  }
  
}

