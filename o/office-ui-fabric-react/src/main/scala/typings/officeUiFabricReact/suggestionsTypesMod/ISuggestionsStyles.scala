package typings.officeUiFabricReact.suggestionsTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsStyles extends js.Object {
  /** Refers to the 'Force resolve' actionButton. */
  var forceResolveButton: IStyle
  /** Refers to the text rendered when no suggestions are found. */
  var noSuggestions: IStyle
  /** Root element of the suggestions outer wrapper. */
  var root: IStyle
  /** Refers to the 'Search for more' actionButton. */
  var searchForMoreButton: IStyle
  /** SubComponents (Spinner) styles. */
  var subComponentStyles: ISuggestionsSubComponentStyles
  /** Refers to the text displaying if more suggestions available. */
  var suggestionsAvailable: IStyle
  /** Refers to the suggestions container. */
  var suggestionsContainer: IStyle
  /** Refers to the title rendered for suggestions container header and/or footer (if provided). */
  var title: IStyle
}

object ISuggestionsStyles {
  @scala.inline
  def apply(
    subComponentStyles: ISuggestionsSubComponentStyles,
    forceResolveButton: js.UndefOr[Null | IStyle] = js.undefined,
    noSuggestions: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    searchForMoreButton: js.UndefOr[Null | IStyle] = js.undefined,
    suggestionsAvailable: js.UndefOr[Null | IStyle] = js.undefined,
    suggestionsContainer: js.UndefOr[Null | IStyle] = js.undefined,
    title: js.UndefOr[Null | IStyle] = js.undefined
  ): ISuggestionsStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(forceResolveButton)) __obj.updateDynamic("forceResolveButton")(forceResolveButton.asInstanceOf[js.Any])
    if (!js.isUndefined(noSuggestions)) __obj.updateDynamic("noSuggestions")(noSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(searchForMoreButton)) __obj.updateDynamic("searchForMoreButton")(searchForMoreButton.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestionsAvailable)) __obj.updateDynamic("suggestionsAvailable")(suggestionsAvailable.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestionsContainer)) __obj.updateDynamic("suggestionsContainer")(suggestionsContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsStyles]
  }
}

