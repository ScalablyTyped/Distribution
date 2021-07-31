package typings.officeUiFabricReact

import typings.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionProps
import typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChoiceGroupMod {
  
  @JSImport("office-ui-fabric-react/lib/ChoiceGroup", "ChoiceGroup")
  @js.native
  val ChoiceGroup: FunctionComponent[IChoiceGroupProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/ChoiceGroup", "ChoiceGroupBase")
  @js.native
  class ChoiceGroupBase protected ()
    extends typings.officeUiFabricReact.choiceGroupMod.ChoiceGroupBase {
    def this(props: IChoiceGroupProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/ChoiceGroup", "ChoiceGroupOption")
  @js.native
  val ChoiceGroupOption: FunctionComponent[IChoiceGroupOptionProps] = js.native
}
