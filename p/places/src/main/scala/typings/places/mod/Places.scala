package typings.places.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Places extends js.Object {
  var query: js.Any
  var rawAnswer: js.Any
  var suggestion: js.Any
  var suggestionIndex: js.Any
}

object Places {
  @scala.inline
  def apply(query: js.Any, rawAnswer: js.Any, suggestion: js.Any, suggestionIndex: js.Any): Places = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], rawAnswer = rawAnswer.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], suggestionIndex = suggestionIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Places]
  }
}

