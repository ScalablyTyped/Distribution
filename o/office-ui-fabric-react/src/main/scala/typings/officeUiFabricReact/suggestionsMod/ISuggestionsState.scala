package typings.officeUiFabricReact.suggestionsMod

import typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsState extends js.Object {
  var selectedActionType: SuggestionActionType
}

object ISuggestionsState {
  @scala.inline
  def apply(selectedActionType: SuggestionActionType): ISuggestionsState = {
    val __obj = js.Dynamic.literal(selectedActionType = selectedActionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsState]
  }
}

