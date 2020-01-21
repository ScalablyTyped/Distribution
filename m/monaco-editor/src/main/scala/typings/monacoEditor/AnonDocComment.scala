package typings.monacoEditor

import typings.monacoEditor.mod.languages.IDocComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocComment extends js.Object {
  var docComment: js.UndefOr[IDocComment] = js.undefined
}

object AnonDocComment {
  @scala.inline
  def apply(docComment: IDocComment = null): AnonDocComment = {
    val __obj = js.Dynamic.literal()
    if (docComment != null) __obj.updateDynamic("docComment")(docComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocComment]
  }
}

