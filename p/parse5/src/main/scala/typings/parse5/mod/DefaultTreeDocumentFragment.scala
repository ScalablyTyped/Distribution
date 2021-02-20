package typings.parse5.mod

import typings.parse5.parse5Strings.`Numbersigndocument-fragment`
import org.scalablytyped.runtime.StObject
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
  implicit class DefaultTreeDocumentFragmentMutableBuilder[Self <: DefaultTreeDocumentFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeName(value: `Numbersigndocument-fragment`): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
  }
}
