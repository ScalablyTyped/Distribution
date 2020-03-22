package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserBooleans.`true`
import typings.postcssValueParser.postcssValueParserStrings.Apostrophe
import typings.postcssValueParser.postcssValueParserStrings.Quotationmark
import typings.postcssValueParser.postcssValueParserStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringNode
  extends BaseNode
     with ClosableNode
     with Node {
  /**
    * The quote type delimiting the string
    */
  var quote: Quotationmark | Apostrophe
  var `type`: string
}

object StringNode {
  @scala.inline
  def apply(
    quote: Quotationmark | Apostrophe,
    sourceIndex: Double,
    `type`: string,
    value: String,
    unclosed: `true` = null
  ): StringNode = {
    val __obj = js.Dynamic.literal(quote = quote.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unclosed != null) __obj.updateDynamic("unclosed")(unclosed.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringNode]
  }
}

