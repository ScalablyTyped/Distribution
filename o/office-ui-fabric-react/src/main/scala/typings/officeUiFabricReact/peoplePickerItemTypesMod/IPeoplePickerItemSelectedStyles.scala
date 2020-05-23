package typings.officeUiFabricReact.peoplePickerItemTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    itemContent: js.UndefOr[Null | IStyle] = js.undefined,
    removeButton: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IPeoplePickerItemSelectedStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(itemContent)) __obj.updateDynamic("itemContent")(itemContent.asInstanceOf[js.Any])
    if (!js.isUndefined(removeButton)) __obj.updateDynamic("removeButton")(removeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSelectedStyles]
  }
}

