package typings.monacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IQuickSuggestionsOptions>> */
@js.native
trait ReadonlyRequiredIQuickSug extends js.Object {
  val comments: Boolean = js.native
  val other: Boolean = js.native
  val strings: Boolean = js.native
}

object ReadonlyRequiredIQuickSug {
  @scala.inline
  def apply(comments: Boolean, other: Boolean, strings: Boolean): ReadonlyRequiredIQuickSug = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIQuickSug]
  }
  @scala.inline
  implicit class ReadonlyRequiredIQuickSugOps[Self <: ReadonlyRequiredIQuickSug] (val x: Self) extends AnyVal {
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
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setOther(value: Boolean): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrings(value: Boolean): Self = this.set("strings", value.asInstanceOf[js.Any])
  }
  
}

