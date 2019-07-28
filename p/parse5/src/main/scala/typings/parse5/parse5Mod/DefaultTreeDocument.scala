package typings.parse5.parse5Mod

import typings.parse5.parse5Strings.`#document`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeDocument extends DefaultTreeParentNode {
  /**
    * [Document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    */
  var mode: DocumentMode
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocument: `#document`
}

object DefaultTreeDocument {
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], mode: DocumentMode, nodeName: `#document`): DefaultTreeDocument = {
    val __obj = js.Dynamic.literal(childNodes = childNodes, mode = mode, nodeName = nodeName)
  
    __obj.asInstanceOf[DefaultTreeDocument]
  }
}

