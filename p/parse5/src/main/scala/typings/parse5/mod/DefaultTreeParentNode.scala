package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeParentNode extends DefaultTreeNode {
  /**
    * Child nodes.
    */
  var childNodes: js.Array[DefaultTreeNode]
}

object DefaultTreeParentNode {
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], nodeName: String): DefaultTreeParentNode = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultTreeParentNode]
  }
}

