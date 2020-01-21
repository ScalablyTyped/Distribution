package typings.officeUiFabricReact

import typings.officeUiFabricReact.basePickerMod.BasePicker
import typings.officeUiFabricReact.tagPickerTypesMod.ITag
import typings.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker", JSImport.Namespace)
@js.native
object tagPickerMod extends js.Object {
  @js.native
  class TagPickerBase () extends BasePicker[ITag, ITagPickerProps]
  
  val TagPicker: StatelessComponent[ITagPickerProps] = js.native
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    var defaultProps: AnonOnRenderItem = js.native
  }
  
}

