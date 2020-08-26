package typings.officeUiFabricReact.suggestionsControlMod

import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsControlState[T] extends js.Object {
  var selectedFooterIndex: Double = js.native
  var selectedHeaderIndex: Double = js.native
  var suggestions: js.Array[ISuggestionModel[T]] = js.native
}

object ISuggestionsControlState {
  @scala.inline
  def apply[T](
    selectedFooterIndex: Double,
    selectedHeaderIndex: Double,
    suggestions: js.Array[ISuggestionModel[T]]
  ): ISuggestionsControlState[T] = {
    val __obj = js.Dynamic.literal(selectedFooterIndex = selectedFooterIndex.asInstanceOf[js.Any], selectedHeaderIndex = selectedHeaderIndex.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsControlState[T]]
  }
  @scala.inline
  implicit class ISuggestionsControlStateOps[Self <: ISuggestionsControlState[_], T] (val x: Self with ISuggestionsControlState[T]) extends AnyVal {
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
    def setSelectedFooterIndex(value: Double): Self = this.set("selectedFooterIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedHeaderIndex(value: Double): Self = this.set("selectedHeaderIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestionsVarargs(value: ISuggestionModel[T]*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[ISuggestionModel[T]]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
  }
  
}

