package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.PartialIColorPickerProps
import typings.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "ColorPickerBase")
@js.native
class ColorPickerBase protected ()
  extends typings.officeUiFabricReact.libColorPickerMod.ColorPickerBase {
  def this(props: IColorPickerProps) = this()
}
/* static members */
object ColorPickerBase {
  
  @JSImport("office-ui-fabric-react", "ColorPickerBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "ColorPickerBase.defaultProps")
  @js.native
  def defaultProps: PartialIColorPickerProps = js.native
  @scala.inline
  def defaultProps_=(x: PartialIColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
