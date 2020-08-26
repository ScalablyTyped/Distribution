package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserStrings.Apostrophe
import typings.postcssValueParser.postcssValueParserStrings.Quotationmark
import typings.postcssValueParser.postcssValueParserStrings.`unicode-range`
import typings.postcssValueParser.postcssValueParserStrings.comment
import typings.postcssValueParser.postcssValueParserStrings.div
import typings.postcssValueParser.postcssValueParserStrings.function
import typings.postcssValueParser.postcssValueParserStrings.space
import typings.postcssValueParser.postcssValueParserStrings.string
import typings.postcssValueParser.postcssValueParserStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any node parsed from a CSS value
  */
/* Rewritten from type alias, can be one of: 
  - typings.postcssValueParser.mod.CommentNode
  - typings.postcssValueParser.mod.DivNode
  - typings.postcssValueParser.mod.FunctionNode
  - typings.postcssValueParser.mod.SpaceNode
  - typings.postcssValueParser.mod.StringNode
  - typings.postcssValueParser.mod.UnicodeRangeNode
  - typings.postcssValueParser.mod.WordNode
*/
trait Node extends js.Object

object Node {
  @scala.inline
  def WordNode(sourceIndex: Double, `type`: word, value: String): Node = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def UnicodeRangeNode(sourceIndex: Double, `type`: `unicode-range`, value: String): Node = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def SpaceNode(sourceIndex: Double, `type`: space, value: String): Node = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def DivNode(after: String, before: String, sourceIndex: Double, `type`: div, value: String): Node = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def FunctionNode(
    after: String,
    before: String,
    nodes: js.Array[Node],
    sourceIndex: Double,
    `type`: function,
    value: String
  ): Node = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def CommentNode(sourceIndex: Double, `type`: comment, value: String): Node = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def StringNode(quote: Quotationmark | Apostrophe, sourceIndex: Double, `type`: string, value: String): Node = {
    val __obj = js.Dynamic.literal(quote = quote.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

