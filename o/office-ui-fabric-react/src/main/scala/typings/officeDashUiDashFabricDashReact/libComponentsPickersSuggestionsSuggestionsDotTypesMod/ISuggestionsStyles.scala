package typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
    forceResolveButton: IStyle,
    noSuggestions: IStyle,
    root: IStyle,
    searchForMoreButton: IStyle,
    subComponentStyles: ISuggestionsSubComponentStyles,
    suggestionsAvailable: IStyle,
    suggestionsContainer: IStyle,
    title: IStyle
  ): ISuggestionsStyles = {
    val __obj = js.Dynamic.literal(forceResolveButton = forceResolveButton.asInstanceOf[js.Any], noSuggestions = noSuggestions.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], searchForMoreButton = searchForMoreButton.asInstanceOf[js.Any], subComponentStyles = subComponentStyles, suggestionsAvailable = suggestionsAvailable.asInstanceOf[js.Any], suggestionsContainer = suggestionsContainer.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISuggestionsStyles]
  }
}

