package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIColorPickerProps
import typings.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/ColorPicker", JSImport.Namespace)
@js.native
object colorPickerMod extends js.Object {
  
  val ColorPicker: FunctionComponent[IColorPickerProps] = js.native
  
  @js.native
  class ColorPickerBase protected ()
    extends typings.officeUiFabricReact.colorPickerBaseMod.ColorPickerBase {
    def this(props: IColorPickerProps) = this()
  }
  /* static members */
  @js.native
  object ColorPickerBase extends js.Object {
    
    var defaultProps: PartialIColorPickerProps = js.native
  }
}
