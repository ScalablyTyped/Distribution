package typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsMod

import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsState extends js.Object {
  var selectedActionType: SuggestionActionType
}

object ISuggestionsState {
  @scala.inline
  def apply(selectedActionType: SuggestionActionType): ISuggestionsState = {
    val __obj = js.Dynamic.literal(selectedActionType = selectedActionType)
  
    __obj.asInstanceOf[ISuggestionsState]
  }
}

