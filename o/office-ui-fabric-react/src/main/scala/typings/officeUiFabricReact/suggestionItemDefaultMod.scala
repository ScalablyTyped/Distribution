package typings.officeUiFabricReact

import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggestionItemDefaultMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/SuggestionItemDefault", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def SuggestionItemNormal(persona: IPersonaProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SuggestionItemNormal")(persona.asInstanceOf[js.Any]).asInstanceOf[Element]
  @scala.inline
  def SuggestionItemNormal(persona: IPersonaProps, suggestionProps: IBasePickerSuggestionsProps[js.Any]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("SuggestionItemNormal")(persona.asInstanceOf[js.Any], suggestionProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  @scala.inline
  def SuggestionItemSmall(persona: IPersonaProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SuggestionItemSmall")(persona.asInstanceOf[js.Any]).asInstanceOf[Element]
  @scala.inline
  def SuggestionItemSmall(persona: IPersonaProps, suggestionProps: IBasePickerSuggestionsProps[js.Any]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("SuggestionItemSmall")(persona.asInstanceOf[js.Any], suggestionProps.asInstanceOf[js.Any])).asInstanceOf[Element]
}
