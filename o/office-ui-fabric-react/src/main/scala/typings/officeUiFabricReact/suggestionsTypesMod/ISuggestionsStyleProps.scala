package typings.officeUiFabricReact.suggestionsTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<any>, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<any>, 'className' | 'suggestionsClassName'> & {  forceResolveButtonSelected ? :boolean,   searchForMoreButtonSelected ? :boolean} */
trait ISuggestionsStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /** Whether the forceResolve actionButton is selected. */
  var forceResolveButtonSelected: js.UndefOr[Boolean] = js.undefined
  /** Whether the searchForMore actionButton is selected. */
  var searchForMoreButtonSelected: js.UndefOr[Boolean] = js.undefined
  var suggestionsClassName: js.UndefOr[String] = js.undefined
  var theme: ITheme
}

object ISuggestionsStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    forceResolveButtonSelected: js.UndefOr[Boolean] = js.undefined,
    searchForMoreButtonSelected: js.UndefOr[Boolean] = js.undefined,
    suggestionsClassName: String = null
  ): ISuggestionsStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(forceResolveButtonSelected)) __obj.updateDynamic("forceResolveButtonSelected")(forceResolveButtonSelected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(searchForMoreButtonSelected)) __obj.updateDynamic("searchForMoreButtonSelected")(searchForMoreButtonSelected.get.asInstanceOf[js.Any])
    if (suggestionsClassName != null) __obj.updateDynamic("suggestionsClassName")(suggestionsClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsStyleProps]
  }
}

