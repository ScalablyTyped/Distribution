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
    subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles,
    personaWrapper: IStyle = null,
    root: IStyle = null
  ): IPeoplePickerItemSuggestionStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    if (personaWrapper != null) __obj.updateDynamic("personaWrapper")(personaWrapper.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSuggestionStyles]
  }
}

