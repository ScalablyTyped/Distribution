package typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagItemSuggestionStyles extends js.Object {
  /** Refers to the text element of the TagItemSuggestion */
  var suggestionTextOverflow: js.UndefOr[IStyle] = js.undefined
}

object ITagItemSuggestionStyles {
  @scala.inline
  def apply(suggestionTextOverflow: IStyle = null): ITagItemSuggestionStyles = {
    val __obj = js.Dynamic.literal()
    if (suggestionTextOverflow != null) __obj.updateDynamic("suggestionTextOverflow")(suggestionTextOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagItemSuggestionStyles]
  }
}

