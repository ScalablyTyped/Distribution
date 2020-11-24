package typings.parse5.mod

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
  implicit class DefaultTreeElementOps[Self <: DefaultTreeElement] (val x: Self) extends AnyVal {
    
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
    def setAttrsVarargs(value: Attribute*): Self = this.set("attrs", js.Array(value :_*))
    
    @scala.inline
    def setAttrs(value: js.Array[Attribute]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodesVarargs(value: DefaultTreeNode*): Self = this.set("childNodes", js.Array(value :_*))
    
    @scala.inline
    def setChildNodes(value: js.Array[DefaultTreeNode]): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("namespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocation(value: ElementLocation): Self = this.set("sourceCodeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeLocation: Self = this.set("sourceCodeLocation", js.undefined)
  }
}
