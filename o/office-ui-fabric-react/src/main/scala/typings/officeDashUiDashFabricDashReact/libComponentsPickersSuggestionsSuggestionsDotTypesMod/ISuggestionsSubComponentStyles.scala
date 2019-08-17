package typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.ISpinnerStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsSubComponentStyles extends js.Object {
  /** Refers to the Spinner rendered within the Suggestions when searching or loading suggestions. */
  var spinner: IStyleFunctionOrObject[ISpinnerStyleProps, _]
}

object ISuggestionsSubComponentStyles {
  @scala.inline
  def apply(spinner: IStyleFunctionOrObject[ISpinnerStyleProps, _]): ISuggestionsSubComponentStyles = {
    val __obj = js.Dynamic.literal(spinner = spinner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISuggestionsSubComponentStyles]
  }
}

