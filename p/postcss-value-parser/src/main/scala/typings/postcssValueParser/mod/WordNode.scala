package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordNode
  extends BaseNode
     with Node {
  var `type`: word
}

object WordNode {
  @scala.inline
  def apply(sourceIndex: Double, `type`: word, value: String): WordNode = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordNode]
  }
}

