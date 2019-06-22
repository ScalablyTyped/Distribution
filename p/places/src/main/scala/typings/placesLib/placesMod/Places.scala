package typings
package placesLib.placesMod

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
    val __obj = js.Dynamic.literal(query = query, rawAnswer = rawAnswer, suggestion = suggestion, suggestionIndex = suggestionIndex)
  
    __obj.asInstanceOf[Places]
  }
}

