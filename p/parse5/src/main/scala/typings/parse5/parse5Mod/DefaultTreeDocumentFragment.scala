package typings.parse5.parse5Mod

import typings.parse5.parse5Strings.`Numbersigndocument-fragment`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeDocumentFragment extends DefaultTreeParentNode {
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocumentFragment: `Numbersigndocument-fragment`
}

object DefaultTreeDocumentFragment {
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], nodeName: `Numbersigndocument-fragment`): DefaultTreeDocumentFragment = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultTreeDocumentFragment]
  }
}

