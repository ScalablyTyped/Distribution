package typings.postcssValueParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdjacentAwareNode extends js.Object {
  /**
    * The token at the end of the node
    */
  var after: String
  /**
    * The token at the start of the node
    */
  var before: String
}

object AdjacentAwareNode {
  @scala.inline
  def apply(after: String, before: String): AdjacentAwareNode = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjacentAwareNode]
  }
}

