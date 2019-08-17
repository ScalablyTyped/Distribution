package typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsItemStyles extends js.Object {
  /** Refers to the remove button in case it's rendered. */
  var closeButton: IStyle
  /** Refers to the CommandButton holding the content of the suggested item. */
  var itemButton: IStyle
  /** Root element of the suggested item. */
  var root: IStyle
}

object ISuggestionsItemStyles {
  @scala.inline
  def apply(closeButton: IStyle, itemButton: IStyle, root: IStyle): ISuggestionsItemStyles = {
    val __obj = js.Dynamic.literal(closeButton = closeButton.asInstanceOf[js.Any], itemButton = itemButton.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISuggestionsItemStyles]
  }
}

