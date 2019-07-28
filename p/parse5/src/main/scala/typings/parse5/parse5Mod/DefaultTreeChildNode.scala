package typings.parse5.parse5Mod

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
    val __obj = js.Dynamic.literal(nodeName = nodeName, parentNode = parentNode)
  
    __obj.asInstanceOf[DefaultTreeChildNode]
  }
}

