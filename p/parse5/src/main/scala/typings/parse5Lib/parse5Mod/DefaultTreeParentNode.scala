package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeParentNode extends js.Object {
  /**
    * Child nodes.
    */
  var childNodes: js.Array[DefaultTreeNode]
}

object DefaultTreeParentNode {
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode]): DefaultTreeParentNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childNodes")(childNodes)
    __obj.asInstanceOf[DefaultTreeParentNode]
  }
}

