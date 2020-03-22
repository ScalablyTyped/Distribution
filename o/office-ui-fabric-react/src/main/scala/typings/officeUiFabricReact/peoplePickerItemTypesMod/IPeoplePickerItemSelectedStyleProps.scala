package typings.officeUiFabricReact.peoplePickerItemTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItem.types.IPeoplePickerItemSelectedProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItem.types.IPeoplePickerItemSelectedProps, 'className' | 'selected' | 'disabled'> & {  invalid ? :boolean} */
trait IPeoplePickerItemSelectedStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Whether it's invalid. */
  var invalid: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object IPeoplePickerItemSelectedStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    invalid: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): IPeoplePickerItemSelectedStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSelectedStyleProps]
  }
}

