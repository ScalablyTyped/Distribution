package typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod

import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsControlState[T] extends js.Object {
  var selectedFooterIndex: Double
  var selectedHeaderIndex: Double
  var suggestions: js.Array[ISuggestionModel[T]]
}

object ISuggestionsControlState {
  @scala.inline
  def apply[T](
    selectedFooterIndex: Double,
    selectedHeaderIndex: Double,
    suggestions: js.Array[ISuggestionModel[T]]
  ): ISuggestionsControlState[T] = {
    val __obj = js.Dynamic.literal(selectedFooterIndex = selectedFooterIndex, selectedHeaderIndex = selectedHeaderIndex, suggestions = suggestions)
  
    __obj.asInstanceOf[ISuggestionsControlState[T]]
  }
}

