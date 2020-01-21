package typings.officeUiFabricReact

import typings.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionProps
import typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ChoiceGroup", JSImport.Namespace)
@js.native
object choiceGroupMod extends js.Object {
  @js.native
  class ChoiceGroupBase protected ()
    extends typings.officeUiFabricReact.choiceGroupBaseMod.ChoiceGroupBase {
    def this(props: IChoiceGroupProps) = this()
  }
  
  val ChoiceGroup: StatelessComponent[IChoiceGroupProps] = js.native
  val ChoiceGroupOption: StatelessComponent[IChoiceGroupOptionProps] = js.native
}

