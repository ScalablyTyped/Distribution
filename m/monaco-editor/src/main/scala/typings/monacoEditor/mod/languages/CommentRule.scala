package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentRule extends js.Object {
  /**
    * The block comment character pair, like `/ * block comment *&#47;`
    */
  var blockComment: js.UndefOr[CharacterPair | Null] = js.undefined
  /**
    * The line comment token, like `// this is a comment`
    */
  var lineComment: js.UndefOr[String | Null] = js.undefined
}

object CommentRule {
  @scala.inline
  def apply(
    blockComment: js.UndefOr[Null | CharacterPair] = js.undefined,
    lineComment: js.UndefOr[Null | String] = js.undefined
  ): CommentRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockComment)) __obj.updateDynamic("blockComment")(blockComment.asInstanceOf[js.Any])
    if (!js.isUndefined(lineComment)) __obj.updateDynamic("lineComment")(lineComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentRule]
  }
}

