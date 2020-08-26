package typings.officeUiFabricReact.suggestionsMod

import typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsState extends js.Object {
  var selectedActionType: SuggestionActionType = js.native
}

object ISuggestionsState {
  @scala.inline
  def apply(selectedActionType: SuggestionActionType): ISuggestionsState = {
    val __obj = js.Dynamic.literal(selectedActionType = selectedActionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsState]
  }
  @scala.inline
  implicit class ISuggestionsStateOps[Self <: ISuggestionsState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSelectedActionType(value: SuggestionActionType): Self = this.set("selectedActionType", value.asInstanceOf[js.Any])
  }
  
}

