package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuickSuggestionsOptions extends js.Object {
  var comments: Boolean
  var other: Boolean
  var strings: Boolean
}

object IQuickSuggestionsOptions {
  @scala.inline
  def apply(comments: Boolean, other: Boolean, strings: Boolean): IQuickSuggestionsOptions = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IQuickSuggestionsOptions]
  }
}

