package typings.parse5.mod

import typings.parse5.parse5Strings.Numbersigntext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultTreeTextNode
  extends StObject
     with DefaultTreeChildNode {
  
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeTextNode: Numbersigntext
  
  /**
    * Text node source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
  
  /**
    * Text content.
    */
  var value: String
}
object DefaultTreeTextNode {
  
  inline def apply(parentNode: DefaultTreeParentNode, value: String): DefaultTreeTextNode = {
    val __obj = js.Dynamic.literal(nodeName = "#text", parentNode = parentNode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeTextNode]
  }
  
  extension [Self <: DefaultTreeTextNode](x: Self) {
    
    inline def setNodeName(value: Numbersigntext): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
