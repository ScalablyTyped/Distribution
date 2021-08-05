package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.OnRenderItem
import typings.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "TagPickerBase")
@js.native
class TagPickerBase protected ()
  extends typings.officeUiFabricReact.libPickersMod.TagPickerBase {
  def this(props: ITagPickerProps) = this()
}
/* static members */
object TagPickerBase {
  
  @JSImport("office-ui-fabric-react", "TagPickerBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "TagPickerBase.defaultProps")
  @js.native
  def defaultProps: OnRenderItem = js.native
  inline def defaultProps_=(x: OnRenderItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
