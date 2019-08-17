package typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeoplePickerItemSuggestionStyles extends js.Object {
  /** Refers to the element wrapping the Persona of the suggested PeoplePicker item. */
  var personaWrapper: IStyle
  /** Root container element of a suggested PeoplePicker item. */
  var root: IStyle
  /** SubComponent (Persona, PersonaCoin) styles. */
  var subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles
}

object IPeoplePickerItemSuggestionStyles {
  @scala.inline
  def apply(
    personaWrapper: IStyle,
    root: IStyle,
    subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles
  ): IPeoplePickerItemSuggestionStyles = {
    val __obj = js.Dynamic.literal(personaWrapper = personaWrapper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], subComponentStyles = subComponentStyles)
  
    __obj.asInstanceOf[IPeoplePickerItemSuggestionStyles]
  }
}

