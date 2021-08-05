package typings.parse5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.parse5.mod.DefaultTreeNode because Already inherited
- typings.parse5.mod.DefaultTreeParentNode because var conflicts: nodeName. Inlined childNodes */ trait DefaultTreeElement
  extends StObject
     with DefaultTreeChildNode {
  
  /**
    * List of element attributes.
    */
  var attrs: js.Array[Attribute]
  
  /**
    * Child nodes.
    */
  var childNodes: js.Array[DefaultTreeNode]
  
  /**
    * Element namespace.
    */
  var namespaceURI: String
  
  /**
    * Element source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[ElementLocation] = js.undefined
  
  /**
    * Element tag name.
    */
  var tagName: String
}
object DefaultTreeElement {
  
  inline def apply(
    attrs: js.Array[Attribute],
    childNodes: js.Array[DefaultTreeNode],
    namespaceURI: String,
    nodeName: String,
    parentNode: DefaultTreeParentNode,
    tagName: String
  ): DefaultTreeElement = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeElement]
  }
  
  extension [Self <: DefaultTreeElement](x: Self) {
    
    inline def setAttrs(value: js.Array[Attribute]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsVarargs(value: Attribute*): Self = StObject.set(x, "attrs", js.Array(value :_*))
    
    inline def setChildNodes(value: js.Array[DefaultTreeNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setChildNodesVarargs(value: DefaultTreeNode*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
    
    inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeLocation(value: ElementLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
