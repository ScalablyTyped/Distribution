package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeChildNode extends DefaultTreeNode {
  /**
    * Parent node.
    */
  var parentNode: DefaultTreeParentNode
}

object DefaultTreeChildNode {
  @scala.inline
  def apply(nodeName: String, parentNode: DefaultTreeParentNode): DefaultTreeChildNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultTreeChildNode]
  }
}

