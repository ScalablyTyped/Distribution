package typings.monacoDashEditor

import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IDocComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocComment extends js.Object {
  var docComment: js.UndefOr[IDocComment] = js.undefined
}

object Anon_DocComment {
  @scala.inline
  def apply(docComment: IDocComment = null): Anon_DocComment = {
    val __obj = js.Dynamic.literal()
    if (docComment != null) __obj.updateDynamic("docComment")(docComment)
    __obj.asInstanceOf[Anon_DocComment]
  }
}

