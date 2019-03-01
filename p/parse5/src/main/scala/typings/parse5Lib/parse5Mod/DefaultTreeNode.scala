package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeNode extends js.Object {
  /**
    * The name of the node. E.g. {@link Document} will have `nodeName` equal to '#document'`.
    */
  var nodeName: java.lang.String
}

object DefaultTreeNode {
  @scala.inline
  def apply(nodeName: java.lang.String): DefaultTreeNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.asInstanceOf[DefaultTreeNode]
  }
}

