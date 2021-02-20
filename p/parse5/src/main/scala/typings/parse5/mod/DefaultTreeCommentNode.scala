package typings.parse5.mod

import typings.parse5.parse5Strings.Numbersigncomment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultTreeCommentNode extends DefaultTreeChildNode {
  
  /**
    * Comment text.
    */
  var data: String = js.native
  
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeCommentNode: Numbersigncomment = js.native
  
  /**
    * Comment source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.native
}
object DefaultTreeCommentNode {
  
  @scala.inline
  def apply(data: String, nodeName: Numbersigncomment, parentNode: DefaultTreeParentNode): DefaultTreeCommentNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeCommentNode]
  }
  
  @scala.inline
  implicit class DefaultTreeCommentNodeMutableBuilder[Self <: DefaultTreeCommentNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: Numbersigncomment): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
  }
}
