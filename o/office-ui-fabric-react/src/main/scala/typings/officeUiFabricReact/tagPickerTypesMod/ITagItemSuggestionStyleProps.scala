package typings.officeUiFabricReact.tagPickerTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker.types.ITagItemSuggestionProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker.types.ITagItemSuggestionProps, 'className'> & {} */
trait ITagItemSuggestionStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var theme: ITheme
}

object ITagItemSuggestionStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): ITagItemSuggestionStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagItemSuggestionStyleProps]
  }
}

