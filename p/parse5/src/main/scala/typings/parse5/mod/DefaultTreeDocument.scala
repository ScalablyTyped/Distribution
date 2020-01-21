package typings.parse5.mod

import typings.parse5.parse5Strings.Numbersigndocument
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
  var nodeName_DefaultTreeDocument: Numbersigndocument
}

object DefaultTreeDocument {
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], mode: DocumentMode, nodeName: Numbersigndocument): DefaultTreeDocument = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultTreeDocument]
  }
}

