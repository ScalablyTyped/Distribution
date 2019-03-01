package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeDocumentFragment extends DefaultTreeParentNode {
  /**
    * The name of the node.
    */
  var nodeName: parse5Lib.parse5LibStrings.`#document-fragment`
}

object DefaultTreeDocumentFragment {
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], nodeName: parse5Lib.parse5LibStrings.`#document-fragment`): DefaultTreeDocumentFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childNodes")(childNodes)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.asInstanceOf[DefaultTreeDocumentFragment]
  }
}

