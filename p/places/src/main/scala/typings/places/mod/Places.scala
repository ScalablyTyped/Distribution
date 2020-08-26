package typings.places.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Places extends js.Object {
  var query: js.Any = js.native
  var rawAnswer: js.Any = js.native
  var suggestion: js.Any = js.native
  var suggestionIndex: js.Any = js.native
}

object Places {
  @scala.inline
  def apply(query: js.Any, rawAnswer: js.Any, suggestion: js.Any, suggestionIndex: js.Any): Places = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], rawAnswer = rawAnswer.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], suggestionIndex = suggestionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Places]
  }
  @scala.inline
  implicit class PlacesOps[Self <: Places] (val x: Self) extends AnyVal {
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
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawAnswer(value: js.Any): Self = this.set("rawAnswer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestion(value: js.Any): Self = this.set("suggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestionIndex(value: js.Any): Self = this.set("suggestionIndex", value.asInstanceOf[js.Any])
  }
  
}

