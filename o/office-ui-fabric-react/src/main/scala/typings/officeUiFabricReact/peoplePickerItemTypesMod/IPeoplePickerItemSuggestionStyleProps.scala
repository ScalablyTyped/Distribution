package typings.officeUiFabricReact.peoplePickerItemTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItem.types.IPeoplePickerItemSuggestionProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItem.types.IPeoplePickerItemSuggestionProps, 'className'> & {} */
trait IPeoplePickerItemSuggestionStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var theme: ITheme
}

object IPeoplePickerItemSuggestionStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): IPeoplePickerItemSuggestionStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSuggestionStyleProps]
  }
}

