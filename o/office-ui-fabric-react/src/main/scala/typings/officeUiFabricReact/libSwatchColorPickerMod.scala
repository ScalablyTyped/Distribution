package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIColorPickerGridCe
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellProps
import typings.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/SwatchColorPicker", JSImport.Namespace)
@js.native
object libSwatchColorPickerMod extends js.Object {
  
  val ColorPickerGridCell: FunctionComponent[IColorPickerGridCellProps] = js.native
  
  val SwatchColorPicker: FunctionComponent[ISwatchColorPickerProps] = js.native
  
  @js.native
  class ColorPickerGridCellBase ()
    extends typings.officeUiFabricReact.swatchColorPickerMod.ColorPickerGridCellBase
  /* static members */
  @js.native
  object ColorPickerGridCellBase extends js.Object {
    
    var defaultProps: PartialIColorPickerGridCe = js.native
  }
  
  @js.native
  class SwatchColorPickerBase protected ()
    extends typings.officeUiFabricReact.swatchColorPickerMod.SwatchColorPickerBase {
    def this(props: ISwatchColorPickerProps) = this()
  }
  /* static members */
  @js.native
  object SwatchColorPickerBase extends js.Object {
    
    var defaultProps: ISwatchColorPickerProps = js.native
  }
}
