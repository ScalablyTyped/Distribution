package typings.officeUiFabricReact

import typings.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionProps
import typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/ChoiceGroup", JSImport.Namespace)
@js.native
object libChoiceGroupMod extends js.Object {
  @js.native
  class ChoiceGroupBase protected ()
    extends typings.officeUiFabricReact.choiceGroupMod.ChoiceGroupBase {
    def this(props: IChoiceGroupProps) = this()
  }
  
  val ChoiceGroup: FunctionComponent[IChoiceGroupProps] = js.native
  val ChoiceGroupOption: FunctionComponent[IChoiceGroupOptionProps] = js.native
}

