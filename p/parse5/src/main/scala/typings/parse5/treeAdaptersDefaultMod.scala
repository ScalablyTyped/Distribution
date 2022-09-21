package typings.parse5

import typings.parse5.commonHtmlMod.DOCUMENT_MODE
import typings.parse5.commonHtmlMod.NS
import typings.parse5.commonTokenMod.Attribute
import typings.parse5.commonTokenMod.ElementLocation
import typings.parse5.commonTokenMod.Location
import typings.parse5.parse5Strings.Numbersigncomment
import typings.parse5.parse5Strings.Numbersigndocument
import typings.parse5.parse5Strings.NumbersigndocumentType
import typings.parse5.parse5Strings.Numbersigntext
import typings.parse5.parse5Strings.`Numbersigndocument-fragment`
import typings.parse5.parse5Strings.template
import typings.parse5.treeAdaptersInterfaceMod.TreeAdapter
import typings.parse5.treeAdaptersInterfaceMod.TreeAdapterTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeAdaptersDefaultMod {
  
  @JSImport("parse5/dist/tree-adapters/default", "defaultTreeAdapter")
  @js.native
  val defaultTreeAdapter: TreeAdapter[DefaultTreeAdapterMap] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.parse5.treeAdaptersDefaultMod.Element
    - typings.parse5.treeAdaptersDefaultMod.Template
    - typings.parse5.treeAdaptersDefaultMod.CommentNode
    - typings.parse5.treeAdaptersDefaultMod.TextNode
    - typings.parse5.treeAdaptersDefaultMod.DocumentType
  */
  trait ChildNode
    extends StObject
       with Node
  object ChildNode {
    
    inline def CommentNode(data: String): typings.parse5.treeAdaptersDefaultMod.CommentNode = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], nodeName = "#comment", parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.CommentNode]
    }
    
    inline def DocumentType(name: String, publicId: String, systemId: String): typings.parse5.treeAdaptersDefaultMod.DocumentType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeName = "#documentType", publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.DocumentType]
    }
    
    inline def Element(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      namespaceURI: NS,
      nodeName: String,
      tagName: String
    ): typings.parse5.treeAdaptersDefaultMod.Element = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.Element]
    }
    
    inline def Template(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      content: DocumentFragment,
      namespaceURI: NS
    ): typings.parse5.treeAdaptersDefaultMod.Template = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = "template", tagName = "template", parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.Template]
    }
    
    inline def TextNode(value: String): typings.parse5.treeAdaptersDefaultMod.TextNode = {
      val __obj = js.Dynamic.literal(nodeName = "#text", value = value.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.TextNode]
    }
  }
  
  trait CommentNode
    extends StObject
       with ChildNode {
    
    /** Comment text. */
    var data: String
    
    /** The name of the node. */
    var nodeName: Numbersigncomment
    
    /** Parent node. */
    var parentNode: ParentNode | Null
    
    /** Comment source code location info. Available if location info is enabled. */
    var sourceCodeLocation: js.UndefOr[Location | Null] = js.undefined
  }
  object CommentNode {
    
    inline def apply(data: String): CommentNode = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], nodeName = "#comment", parentNode = null)
      __obj.asInstanceOf[CommentNode]
    }
    
    extension [Self <: CommentNode](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: Numbersigncomment): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setParentNode(value: ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationNull: Self = StObject.set(x, "sourceCodeLocation", null)
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    }
  }
  
  type DefaultTreeAdapterMap = TreeAdapterTypeMap[
    Node, 
    ParentNode, 
    ChildNode, 
    Document, 
    DocumentFragment, 
    Element, 
    CommentNode, 
    TextNode, 
    Template, 
    DocumentType
  ]
  
  trait Document
    extends StObject
       with ParentNode {
    
    /** The node's children. */
    var childNodes: js.Array[ChildNode]
    
    /**
      * Document mode.
      *
      * @see {@link DOCUMENT_MODE} */
    var mode: DOCUMENT_MODE
    
    /** The name of the node. */
    var nodeName: Numbersigndocument
    
    /** Comment source code location info. Available if location info is enabled. */
    var sourceCodeLocation: js.UndefOr[Location | Null] = js.undefined
  }
  object Document {
    
    inline def apply(childNodes: js.Array[ChildNode], mode: DOCUMENT_MODE): Document = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nodeName = "#document")
      __obj.asInstanceOf[Document]
    }
    
    extension [Self <: Document](x: Self) {
      
      inline def setChildNodes(value: js.Array[ChildNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: ChildNode*): Self = StObject.set(x, "childNodes", js.Array(value*))
      
      inline def setMode(value: DOCUMENT_MODE): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: Numbersigndocument): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationNull: Self = StObject.set(x, "sourceCodeLocation", null)
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    }
  }
  
  trait DocumentFragment
    extends StObject
       with ParentNode {
    
    /** The node's children. */
    var childNodes: js.Array[ChildNode]
    
    /** The name of the node. */
    var nodeName: `Numbersigndocument-fragment`
    
    /** Comment source code location info. Available if location info is enabled. */
    var sourceCodeLocation: js.UndefOr[Location | Null] = js.undefined
  }
  object DocumentFragment {
    
    inline def apply(childNodes: js.Array[ChildNode]): DocumentFragment = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = "#document-fragment")
      __obj.asInstanceOf[DocumentFragment]
    }
    
    extension [Self <: DocumentFragment](x: Self) {
      
      inline def setChildNodes(value: js.Array[ChildNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: ChildNode*): Self = StObject.set(x, "childNodes", js.Array(value*))
      
      inline def setNodeName(value: `Numbersigndocument-fragment`): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationNull: Self = StObject.set(x, "sourceCodeLocation", null)
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    }
  }
  
  trait DocumentType
    extends StObject
       with ChildNode {
    
    /** Document type name. */
    var name: String
    
    /** The name of the node. */
    var nodeName: NumbersigndocumentType
    
    /** Parent node. */
    var parentNode: ParentNode | Null
    
    /** Document type public identifier. */
    var publicId: String
    
    /** Comment source code location info. Available if location info is enabled. */
    var sourceCodeLocation: js.UndefOr[Location | Null] = js.undefined
    
    /** Document type system identifier. */
    var systemId: String
  }
  object DocumentType {
    
    inline def apply(name: String, publicId: String, systemId: String): DocumentType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeName = "#documentType", publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[DocumentType]
    }
    
    extension [Self <: DocumentType](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: NumbersigndocumentType): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setParentNode(value: ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationNull: Self = StObject.set(x, "sourceCodeLocation", null)
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element
    extends StObject
       with ChildNode
       with ParentNode {
    
    /** List of element attributes. */
    var attrs: js.Array[Attribute]
    
    /** The node's children. */
    var childNodes: js.Array[ChildNode]
    
    /** Element namespace. */
    var namespaceURI: NS
    
    /** Element tag name. Same as {@link tagName}. */
    var nodeName: String
    
    /** Parent node. */
    var parentNode: ParentNode | Null
    
    /** Element source code location info, with attributes. Available if location info is enabled. */
    var sourceCodeLocation: js.UndefOr[ElementLocation | Null] = js.undefined
    
    /** Element tag name. Same as {@link nodeName}. */
    var tagName: String
  }
  object Element {
    
    inline def apply(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      namespaceURI: NS,
      nodeName: String,
      tagName: String
    ): Element = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setAttrs(value: js.Array[Attribute]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsVarargs(value: Attribute*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setChildNodes(value: js.Array[ChildNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: ChildNode*): Self = StObject.set(x, "childNodes", js.Array(value*))
      
      inline def setNamespaceURI(value: NS): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setParentNode(value: ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      inline def setSourceCodeLocation(value: ElementLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationNull: Self = StObject.set(x, "sourceCodeLocation", null)
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parse5.treeAdaptersDefaultMod.ParentNode
    - typings.parse5.treeAdaptersDefaultMod.ChildNode
  */
  trait Node extends StObject
  object Node {
    
    inline def CommentNode(data: String): typings.parse5.treeAdaptersDefaultMod.CommentNode = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], nodeName = "#comment", parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.CommentNode]
    }
    
    inline def Document(childNodes: js.Array[ChildNode], mode: DOCUMENT_MODE): typings.parse5.treeAdaptersDefaultMod.Document = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nodeName = "#document")
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.Document]
    }
    
    inline def DocumentFragment(childNodes: js.Array[ChildNode]): typings.parse5.treeAdaptersDefaultMod.DocumentFragment = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = "#document-fragment")
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.DocumentFragment]
    }
    
    inline def DocumentType(name: String, publicId: String, systemId: String): typings.parse5.treeAdaptersDefaultMod.DocumentType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeName = "#documentType", publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.DocumentType]
    }
    
    inline def Element(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      namespaceURI: NS,
      nodeName: String,
      tagName: String
    ): typings.parse5.treeAdaptersDefaultMod.Element = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.Element]
    }
    
    inline def Template(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      content: DocumentFragment,
      namespaceURI: NS
    ): typings.parse5.treeAdaptersDefaultMod.Template = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = "template", tagName = "template", parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.Template]
    }
    
    inline def TextNode(value: String): typings.parse5.treeAdaptersDefaultMod.TextNode = {
      val __obj = js.Dynamic.literal(nodeName = "#text", value = value.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.TextNode]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parse5.treeAdaptersDefaultMod.Document
    - typings.parse5.treeAdaptersDefaultMod.DocumentFragment
    - typings.parse5.treeAdaptersDefaultMod.Element
    - typings.parse5.treeAdaptersDefaultMod.Template
  */
  trait ParentNode
    extends StObject
       with Node
  object ParentNode {
    
    inline def Document(childNodes: js.Array[ChildNode], mode: DOCUMENT_MODE): typings.parse5.treeAdaptersDefaultMod.Document = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nodeName = "#document")
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.Document]
    }
    
    inline def DocumentFragment(childNodes: js.Array[ChildNode]): typings.parse5.treeAdaptersDefaultMod.DocumentFragment = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = "#document-fragment")
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.DocumentFragment]
    }
    
    inline def Element(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      namespaceURI: NS,
      nodeName: String,
      tagName: String
    ): typings.parse5.treeAdaptersDefaultMod.Element = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.Element]
    }
    
    inline def Template(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      content: DocumentFragment,
      namespaceURI: NS
    ): typings.parse5.treeAdaptersDefaultMod.Template = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = "template", tagName = "template", parentNode = null)
      __obj.asInstanceOf[typings.parse5.treeAdaptersDefaultMod.Template]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.parse5.treeAdaptersDefaultMod.Node because Already inherited
  - typings.parse5.treeAdaptersDefaultMod.ParentNode because Already inherited
  - typings.parse5.treeAdaptersDefaultMod.ChildNode because Already inherited */ trait Template
    extends StObject
       with Element {
    
    /** The content of a `template` tag. */
    var content: DocumentFragment
    
    @JSName("nodeName")
    var nodeName_Template: template
    
    @JSName("tagName")
    var tagName_Template: template
  }
  object Template {
    
    inline def apply(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      content: DocumentFragment,
      namespaceURI: NS
    ): Template = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = "template", tagName = "template", parentNode = null)
      __obj.asInstanceOf[Template]
    }
    
    extension [Self <: Template](x: Self) {
      
      inline def setContent(value: DocumentFragment): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: template): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: template): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextNode
    extends StObject
       with ChildNode {
    
    var nodeName: Numbersigntext
    
    /** Parent node. */
    var parentNode: ParentNode | Null
    
    /** Comment source code location info. Available if location info is enabled. */
    var sourceCodeLocation: js.UndefOr[Location | Null] = js.undefined
    
    /** Text content. */
    var value: String
  }
  object TextNode {
    
    inline def apply(value: String): TextNode = {
      val __obj = js.Dynamic.literal(nodeName = "#text", value = value.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[TextNode]
    }
    
    extension [Self <: TextNode](x: Self) {
      
      inline def setNodeName(value: Numbersigntext): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setParentNode(value: ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationNull: Self = StObject.set(x, "sourceCodeLocation", null)
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
