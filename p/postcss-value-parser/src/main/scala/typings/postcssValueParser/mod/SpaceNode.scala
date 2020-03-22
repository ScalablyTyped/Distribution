package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceNode
  extends BaseNode
     with Node {
  var `type`: space
}

object SpaceNode {
  @scala.inline
  def apply(sourceIndex: Double, `type`: space, value: String): SpaceNode = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceNode]
  }
}

