package typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeoplePickerItemSelectedStyles extends js.Object {
  /** Refers to the element holding the content (Persona) of the PeoplePicker item already picked. */
  var itemContent: IStyle
  /** Refers to the remove action button on a picked PeoplePicker item. */
  var removeButton: IStyle
  /** Root element of picked PeoplePicker item */
  var root: IStyle
  /** SubComponent (Persona, PersonaCoin) styles. */
  var subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles
}

object IPeoplePickerItemSelectedStyles {
  @scala.inline
  def apply(
    subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles,
    itemContent: IStyle = null,
    removeButton: IStyle = null,
    root: IStyle = null
  ): IPeoplePickerItemSelectedStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    if (itemContent != null) __obj.updateDynamic("itemContent")(itemContent.asInstanceOf[js.Any])
    if (removeButton != null) __obj.updateDynamic("removeButton")(removeButton.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSelectedStyles]
  }
}

