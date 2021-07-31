package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.OnRenderItem
import typings.officeUiFabricReact.basePickerMod.BasePicker
import typings.officeUiFabricReact.tagPickerTypesMod.ITag
import typings.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker", "TagPicker")
  @js.native
  val TagPicker: FunctionComponent[ITagPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker", "TagPickerBase")
  @js.native
  class TagPickerBase protected () extends BasePicker[ITag, ITagPickerProps] {
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
    @scala.inline
    def defaultProps_=(x: OnRenderItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
