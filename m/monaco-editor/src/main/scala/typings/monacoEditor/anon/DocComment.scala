package typings.monacoEditor.anon

import typings.monacoEditor.mod.languages.IDocComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocComment extends js.Object {
  var docComment: js.UndefOr[IDocComment] = js.undefined
}

object DocComment {
  @scala.inline
  def apply(docComment: IDocComment = null): DocComment = {
    val __obj = js.Dynamic.literal()
    if (docComment != null) __obj.updateDynamic("docComment")(docComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocComment]
  }
}

