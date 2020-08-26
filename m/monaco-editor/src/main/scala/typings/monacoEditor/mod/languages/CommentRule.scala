package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentRule extends js.Object {
  /**
    * The block comment character pair, like `/ * block comment *&#47;`
    */
  var blockComment: js.UndefOr[CharacterPair | Null] = js.native
  /**
    * The line comment token, like `// this is a comment`
    */
  var lineComment: js.UndefOr[String | Null] = js.native
}

object CommentRule {
  @scala.inline
  def apply(): CommentRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentRule]
  }
  @scala.inline
  implicit class CommentRuleOps[Self <: CommentRule] (val x: Self) extends AnyVal {
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
    def setBlockComment(value: CharacterPair): Self = this.set("blockComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockComment: Self = this.set("blockComment", js.undefined)
    @scala.inline
    def setBlockCommentNull: Self = this.set("blockComment", null)
    @scala.inline
    def setLineComment(value: String): Self = this.set("lineComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineComment: Self = this.set("lineComment", js.undefined)
    @scala.inline
    def setLineCommentNull: Self = this.set("lineComment", null)
  }
  
}

