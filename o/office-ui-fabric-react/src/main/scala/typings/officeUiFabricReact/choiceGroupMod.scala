package typings.officeUiFabricReact

import typings.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionProps
import typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choiceGroupMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup", "ChoiceGroup")
  @js.native
  val ChoiceGroup: FunctionComponent[IChoiceGroupProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup", "ChoiceGroupBase")
  @js.native
  open class ChoiceGroupBase protected ()
    extends typings.officeUiFabricReact.choiceGroupBaseMod.ChoiceGroupBase {
    def this(props: IChoiceGroupProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup", "ChoiceGroupOption")
  @js.native
  val ChoiceGroupOption: FunctionComponent[IChoiceGroupOptionProps] = js.native
}
