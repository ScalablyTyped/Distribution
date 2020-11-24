package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.OnRenderItem
import typings.officeUiFabricReact.basePickerMod.BasePicker
import typings.officeUiFabricReact.tagPickerTypesMod.ITag
import typings.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker", JSImport.Namespace)
@js.native
object tagPickerMod extends js.Object {
  
  val TagPicker: FunctionComponent[ITagPickerProps] = js.native
  
  @js.native
  class TagPickerBase protected () extends BasePicker[ITag, ITagPickerProps] {
    def this(props: ITagPickerProps) = this()
  }
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    
    var defaultProps: OnRenderItem = js.native
  }
}
