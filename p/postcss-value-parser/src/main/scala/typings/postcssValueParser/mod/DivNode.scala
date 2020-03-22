package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivNode
  extends BaseNode
     with AdjacentAwareNode
     with Node {
  var `type`: div
}

object DivNode {
  @scala.inline
  def apply(after: String, before: String, sourceIndex: Double, `type`: div, value: String): DivNode = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivNode]
  }
}

