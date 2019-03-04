package typings
package parse5Lib.parse5Mod

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
  var nodeName: parse5Lib.parse5LibStrings.`#document`
}

object DefaultTreeDocument {
  @scala.inline
  def apply(
    childNodes: js.Array[DefaultTreeNode],
    mode: DocumentMode,
    nodeName: parse5Lib.parse5LibStrings.`#document`
  ): DefaultTreeDocument = {
    val __obj = js.Dynamic.literal(childNodes = childNodes, mode = mode, nodeName = nodeName)
  
    __obj.asInstanceOf[DefaultTreeDocument]
  }
}

