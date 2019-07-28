package typings.parse5.parse5Mod

import typings.parse5.parse5Strings.`#document-fragment`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeDocumentFragment extends DefaultTreeParentNode {
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocumentFragment: `#document-fragment`
}

object DefaultTreeDocumentFragment {
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], nodeName: `#document-fragment`): DefaultTreeDocumentFragment = {
    val __obj = js.Dynamic.literal(childNodes = childNodes, nodeName = nodeName)
  
    __obj.asInstanceOf[DefaultTreeDocumentFragment]
  }
}

