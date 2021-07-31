package typings.parse5.mod

import typings.parse5.parse5Strings.Numbersigndocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultTreeDocument
  extends StObject
     with DefaultTreeParentNode {
  
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
  def apply(childNodes: js.Array[DefaultTreeNode], mode: DocumentMode): DefaultTreeDocument = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nodeName = "#document")
    __obj.asInstanceOf[DefaultTreeDocument]
  }
  
  @scala.inline
  implicit class DefaultTreeDocumentMutableBuilder[Self <: DefaultTreeDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: DocumentMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: Numbersigndocument): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
  }
}
