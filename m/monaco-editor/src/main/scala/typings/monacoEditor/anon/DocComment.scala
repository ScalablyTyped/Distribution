package typings.monacoEditor.anon

import typings.monacoEditor.mod.languages.IDocComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocComment extends js.Object {
  var docComment: js.UndefOr[IDocComment] = js.native
}

object DocComment {
  @scala.inline
  def apply(): DocComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocComment]
  }
  @scala.inline
  implicit class DocCommentOps[Self <: DocComment] (val x: Self) extends AnyVal {
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
    def setDocComment(value: IDocComment): Self = this.set("docComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocComment: Self = this.set("docComment", js.undefined)
  }
  
}

