package typings.officeUiFabricReact.peoplePickerItemTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItem.types.IPeoplePickerItemSuggestionProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItem.types.IPeoplePickerItemSuggestionProps, 'className'> & {} */
@js.native
trait IPeoplePickerItemSuggestionStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var theme: ITheme = js.native
}

object IPeoplePickerItemSuggestionStyleProps {
  @scala.inline
  def apply(theme: ITheme): IPeoplePickerItemSuggestionStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSuggestionStyleProps]
  }
  @scala.inline
  implicit class IPeoplePickerItemSuggestionStylePropsOps[Self <: IPeoplePickerItemSuggestionStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
  
}

