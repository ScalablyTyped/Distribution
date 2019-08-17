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
    itemContent: IStyle,
    removeButton: IStyle,
    root: IStyle,
    subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles
  ): IPeoplePickerItemSelectedStyles = {
    val __obj = js.Dynamic.literal(itemContent = itemContent.asInstanceOf[js.Any], removeButton = removeButton.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], subComponentStyles = subComponentStyles)
  
    __obj.asInstanceOf[IPeoplePickerItemSelectedStyles]
  }
}

