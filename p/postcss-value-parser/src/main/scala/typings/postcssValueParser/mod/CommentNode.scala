package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserBooleans.`true`
import typings.postcssValueParser.postcssValueParserStrings.comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentNode
  extends BaseNode
     with ClosableNode
     with Node {
  var `type`: comment
}

object CommentNode {
  @scala.inline
  def apply(sourceIndex: Double, `type`: comment, value: String, unclosed: `true` = null): CommentNode = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unclosed != null) __obj.updateDynamic("unclosed")(unclosed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentNode]
  }
}

