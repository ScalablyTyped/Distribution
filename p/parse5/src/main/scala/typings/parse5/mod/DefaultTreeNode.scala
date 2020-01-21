package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeNode extends js.Object {
  /**
    * The name of the node. E.g. {@link Document} will have `nodeName` equal to '#document'`.
    */
  var nodeName: String
}

object DefaultTreeNode {
  @scala.inline
  def apply(nodeName: String): DefaultTreeNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultTreeNode]
  }
}

