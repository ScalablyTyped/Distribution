package typings
package parse5Lib.parse5Mod

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
  def apply(nodeName: java.lang.String, parentNode: DefaultTreeParentNode): DefaultTreeChildNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName, parentNode = parentNode)
  
    __obj.asInstanceOf[DefaultTreeChildNode]
  }
}

