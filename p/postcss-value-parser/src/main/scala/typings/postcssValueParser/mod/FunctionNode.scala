package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserBooleans.`true`
import typings.postcssValueParser.postcssValueParserStrings.function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionNode
  extends BaseNode
     with ClosableNode
     with AdjacentAwareNode
     with Node {
  /**
    * Nodes inside the function
    */
  var nodes: js.Array[Node]
  var `type`: function
}

object FunctionNode {
  @scala.inline
  def apply(
    after: String,
    before: String,
    nodes: js.Array[Node],
    sourceIndex: Double,
    `type`: function,
    value: String,
    unclosed: `true` = null
  ): FunctionNode = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unclosed != null) __obj.updateDynamic("unclosed")(unclosed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionNode]
  }
}

