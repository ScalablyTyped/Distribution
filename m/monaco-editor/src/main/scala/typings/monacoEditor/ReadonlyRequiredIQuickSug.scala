package typings.monacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IQuickSuggestionsOptions>> */
trait ReadonlyRequiredIQuickSug extends js.Object {
  val comments: Boolean
  val other: Boolean
  val strings: Boolean
}

object ReadonlyRequiredIQuickSug {
  @scala.inline
  def apply(comments: Boolean, other: Boolean, strings: Boolean): ReadonlyRequiredIQuickSug = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyRequiredIQuickSug]
  }
}

