package typings.postcssValueParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseNode extends js.Object {
  /**
    * The offset inside the CSS value at which the node starts
    */
  var sourceIndex: Double
  /**
    * The node's characteristic value
    */
  var value: String
}

object BaseNode {
  @scala.inline
  def apply(sourceIndex: Double, value: String): BaseNode = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
}

