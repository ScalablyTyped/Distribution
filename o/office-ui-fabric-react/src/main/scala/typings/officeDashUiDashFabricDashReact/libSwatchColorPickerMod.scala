package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod.IColorPickerGridCellProps
import typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerSwatchColorPickerDotTypesMod.ISwatchColorPickerProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SwatchColorPicker", JSImport.Namespace)
@js.native
object libSwatchColorPickerMod extends js.Object {
  @js.native
  class ColorPickerGridCellBase ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerMod.ColorPickerGridCellBase
  
  @js.native
  class SwatchColorPickerBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerMod.SwatchColorPickerBase {
    def this(props: ISwatchColorPickerProps) = this()
  }
  
  val ColorPickerGridCell: StatelessComponent[IColorPickerGridCellProps] = js.native
  val SwatchColorPicker: StatelessComponent[ISwatchColorPickerProps] = js.native
  /* static members */
  @js.native
  object ColorPickerGridCellBase extends js.Object {
    var defaultProps: IColorPickerGridCellProps = js.native
  }
  
  /* static members */
  @js.native
  object SwatchColorPickerBase extends js.Object {
    var defaultProps: ISwatchColorPickerProps = js.native
  }
  
}

