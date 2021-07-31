package typings.officeUiFabricReact

import typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peoplePickerItemSuggestionMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItemSuggestion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItemSuggestion", "PeoplePickerItemSuggestion")
  @js.native
  val PeoplePickerItemSuggestion: FunctionComponent[IPeoplePickerItemSuggestionProps] = js.native
  
  @scala.inline
  def PeoplePickerItemSuggestionBase(props: IPeoplePickerItemSuggestionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PeoplePickerItemSuggestionBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
