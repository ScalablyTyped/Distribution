package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.OnRenderItem
import typings.officeUiFabricReact.libComponentsPickersBasePickerMod.BasePicker
import typings.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITag
import typings.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITagPickerProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPickersTagPickerTagPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker", "TagPicker")
  @js.native
  val TagPicker: FunctionComponent[ITagPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker", "TagPickerBase")
  @js.native
  open class TagPickerBase protected () extends BasePicker[ITag, ITagPickerProps] {
    def this(props: ITagPickerProps) = this()
  }
  /* static members */
  object TagPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker", "TagPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker", "TagPickerBase.defaultProps")
    @js.native
    def defaultProps: OnRenderItem = js.native
    inline def defaultProps_=(x: OnRenderItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
