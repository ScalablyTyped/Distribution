package typings.parse5.mod

import typings.parse5.parse5Strings.`Numbersigndocument-fragment`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultTreeDocumentFragment extends DefaultTreeParentNode {
  
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocumentFragment: `Numbersigndocument-fragment` = js.native
}
object DefaultTreeDocumentFragment {
  
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], nodeName: `Numbersigndocument-fragment`): DefaultTreeDocumentFragment = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeDocumentFragment]
  }
  
  @scala.inline
  implicit class DefaultTreeDocumentFragmentOps[Self <: DefaultTreeDocumentFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNodeName(value: `Numbersigndocument-fragment`): Self = this.set("nodeName", value.asInstanceOf[js.Any])
  }
}
