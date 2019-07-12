package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeDocumentFragment extends DefaultTreeParentNode {
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocumentFragment: parse5Lib.parse5LibStrings.`#document-fragment`
}

object DefaultTreeDocumentFragment {
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], nodeName: parse5Lib.parse5LibStrings.`#document-fragment`): DefaultTreeDocumentFragment = {
    val __obj = js.Dynamic.literal(childNodes = childNodes, nodeName = nodeName)
  
    __obj.asInstanceOf[DefaultTreeDocumentFragment]
  }
}

