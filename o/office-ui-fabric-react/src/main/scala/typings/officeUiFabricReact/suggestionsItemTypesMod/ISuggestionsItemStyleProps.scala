package typings.officeUiFabricReact.suggestionsItemTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.types.ISuggestionItemProps<any>, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.types.ISuggestionItemProps<any>, 'className'> & {  suggested ? :boolean} */
trait ISuggestionsItemStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /** Whether the suggestion item is selected or not. */
  var suggested: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object ISuggestionsItemStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null, suggested: js.UndefOr[Boolean] = js.undefined): ISuggestionsItemStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(suggested)) __obj.updateDynamic("suggested")(suggested.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsItemStyleProps]
  }
}

