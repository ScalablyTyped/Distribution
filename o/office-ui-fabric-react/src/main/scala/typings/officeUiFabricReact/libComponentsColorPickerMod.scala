package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIColorPickerProps
import typings.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsColorPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker", "ColorPicker")
  @js.native
  val ColorPicker: FunctionComponent[IColorPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker", "ColorPickerBase")
  @js.native
  open class ColorPickerBase protected ()
    extends typings.officeUiFabricReact.libComponentsColorPickerColorPickerDotbaseMod.ColorPickerBase {
    def this(props: IColorPickerProps) = this()
  }
  /* static members */
  object ColorPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker", "ColorPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker", "ColorPickerBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorPickerProps = js.native
    inline def defaultProps_=(x: PartialIColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
