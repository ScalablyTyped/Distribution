package typings.officeUiFabricReact

import typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionStyleProps
import typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peoplePickerItemSuggestionStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItemSuggestion.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IPeoplePickerItemSuggestionStyleProps): IPeoplePickerItemSuggestionStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IPeoplePickerItemSuggestionStyles]
}
