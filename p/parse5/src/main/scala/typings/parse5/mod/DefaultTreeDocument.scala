package typings.parse5.mod

import typings.parse5.parse5Strings.Numbersigndocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultTreeDocument extends DefaultTreeParentNode {
  
  /**
    * [Document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    */
  var mode: DocumentMode = js.native
  
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocument: Numbersigndocument = js.native
}
object DefaultTreeDocument {
  
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], mode: DocumentMode, nodeName: Numbersigndocument): DefaultTreeDocument = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeDocument]
  }
  
  @scala.inline
  implicit class DefaultTreeDocumentOps[Self <: DefaultTreeDocument] (val x: Self) extends AnyVal {
    
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
    def setMode(value: DocumentMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: Numbersigndocument): Self = this.set("nodeName", value.asInstanceOf[js.Any])
  }
}
