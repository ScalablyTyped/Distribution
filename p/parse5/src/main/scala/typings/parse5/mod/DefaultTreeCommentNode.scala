package typings.parse5.mod

import typings.parse5.parse5Strings.Numbersigncomment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultTreeCommentNode
  extends StObject
     with DefaultTreeChildNode {
  
  /**
    * Comment text.
    */
  var data: String
  
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeCommentNode: Numbersigncomment
  
  /**
    * Comment source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
}
object DefaultTreeCommentNode {
  
  inline def apply(data: String, parentNode: DefaultTreeParentNode): DefaultTreeCommentNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], nodeName = "#comment", parentNode = parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeCommentNode]
  }
  
  extension [Self <: DefaultTreeCommentNode](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: Numbersigncomment): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
  }
}
