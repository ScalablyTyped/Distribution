package typings.parse5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.parse5.mod.DefaultTreeNode because Already inherited
- typings.parse5.mod.DefaultTreeParentNode because var conflicts: nodeName. Inlined childNodes */ @js.native
trait DefaultTreeElement extends DefaultTreeChildNode {
  
  /**
    * List of element attributes.
    */
  var attrs: js.Array[Attribute] = js.native
  
  /**
    * Child nodes.
    */
  var childNodes: js.Array[DefaultTreeNode] = js.native
  
  /**
    * Element namespace.
    */
  var namespaceURI: String = js.native
  
  /**
    * Element source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[ElementLocation] = js.native
  
  /**
    * Element tag name.
    */
  var tagName: String = js.native
}
object DefaultTreeElement {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DefaultTreeElementMutableBuilder[Self <: DefaultTreeElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: js.Array[Attribute]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsVarargs(value: Attribute*): Self = StObject.set(x, "attrs", js.Array(value :_*))
    
    @scala.inline
    def setChildNodes(value: js.Array[DefaultTreeNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodesVarargs(value: DefaultTreeNode*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
    
    @scala.inline
    def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocation(value: ElementLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
