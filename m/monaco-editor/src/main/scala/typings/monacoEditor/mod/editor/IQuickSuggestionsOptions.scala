package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQuickSuggestionsOptions extends js.Object {
  var comments: Boolean = js.native
  var other: Boolean = js.native
  var strings: Boolean = js.native
}

object IQuickSuggestionsOptions {
  @scala.inline
  def apply(comments: Boolean, other: Boolean, strings: Boolean): IQuickSuggestionsOptions = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuickSuggestionsOptions]
  }
  @scala.inline
  implicit class IQuickSuggestionsOptionsOps[Self <: IQuickSuggestionsOptions] (val x: Self) extends AnyVal {
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

