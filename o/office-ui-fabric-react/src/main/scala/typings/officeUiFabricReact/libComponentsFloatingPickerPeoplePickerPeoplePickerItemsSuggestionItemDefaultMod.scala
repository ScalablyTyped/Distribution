package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typings.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePickerSuggestionsProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloatingPickerPeoplePickerPeoplePickerItemsSuggestionItemDefaultMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/PeoplePickerItems/SuggestionItemDefault", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SuggestionItemNormal(persona: IPersonaProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SuggestionItemNormal")(persona.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def SuggestionItemNormal(persona: IPersonaProps, suggestionProps: IBasePickerSuggestionsProps[Any]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("SuggestionItemNormal")(persona.asInstanceOf[js.Any], suggestionProps.asInstanceOf[js.Any])).asInstanceOf[Element]
}
