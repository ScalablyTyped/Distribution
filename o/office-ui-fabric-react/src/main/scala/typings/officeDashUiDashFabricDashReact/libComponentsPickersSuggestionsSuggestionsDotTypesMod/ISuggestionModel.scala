package typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionModel[T] extends js.Object {
  /** Aria-label string for each suggested item. */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /** The suggested item of the type T */
  var item: T
  /** Whether the suggested item is selected or not. */
  var selected: Boolean
}

object ISuggestionModel {
  @scala.inline
  def apply[T](item: T, selected: Boolean, ariaLabel: String = null): ISuggestionModel[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionModel[T]]
  }
}

