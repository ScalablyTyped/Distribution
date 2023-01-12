package typings.parse5

import typings.parse5.distCommonHtmlMod.DOCUMENT_MODE
import typings.parse5.distCommonHtmlMod.NS
import typings.parse5.distCommonTokenMod.Attribute
import typings.parse5.distCommonTokenMod.ElementLocation
import typings.parse5.distCommonTokenMod.Location
import typings.parse5.distTreeAdaptersInterfaceMod.TreeAdapter
import typings.parse5.distTreeAdaptersInterfaceMod.TreeAdapterTypeMap
import typings.parse5.parse5Strings.Numbersigncomment
import typings.parse5.parse5Strings.Numbersigndocument
import typings.parse5.parse5Strings.NumbersigndocumentType
import typings.parse5.parse5Strings.Numbersigntext
import typings.parse5.parse5Strings.`Numbersigndocument-fragment`
import typings.parse5.parse5Strings.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTreeAdaptersDefaultMod {
  
  @JSImport("parse5/dist/tree-adapters/default", "defaultTreeAdapter")
  @js.native
  val defaultTreeAdapter: TreeAdapter[DefaultTreeAdapterMap] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.parse5.distTreeAdaptersDefaultMod.Element
    - typings.parse5.distTreeAdaptersDefaultMod.Template
    - typings.parse5.distTreeAdaptersDefaultMod.CommentNode
    - typings.parse5.distTreeAdaptersDefaultMod.TextNode
    - typings.parse5.distTreeAdaptersDefaultMod.DocumentType
  */
  trait ChildNode
    extends StObject
       with Node
  object ChildNode {
    
    inline def CommentNode(data: String): typings.parse5.distTreeAdaptersDefaultMod.CommentNode = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], nodeName = "#comment", parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.CommentNode]
    }
    
    inline def DocumentType(name: String, publicId: String, systemId: String): typings.parse5.distTreeAdaptersDefaultMod.DocumentType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeName = "#documentType", publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.DocumentType]
    }
    
    inline def Element(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      namespaceURI: NS,
      nodeName: String,
      tagName: String
    ): typings.parse5.distTreeAdaptersDefaultMod.Element = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.Element]
    }
    
    inline def Template(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      content: DocumentFragment,
      namespaceURI: NS
    ): typings.parse5.distTreeAdaptersDefaultMod.Template = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = "template", tagName = "template", parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.Template]
    }
    
    inline def TextNode(value: String): typings.parse5.distTreeAdaptersDefaultMod.TextNode = {
      val __obj = js.Dynamic.literal(nodeName = "#text", value = value.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.TextNode]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommentNode] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentFragment] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentType] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
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
    - typings.parse5.distTreeAdaptersDefaultMod.ParentNode
    - typings.parse5.distTreeAdaptersDefaultMod.ChildNode
  */
  trait Node extends StObject
  object Node {
    
    inline def CommentNode(data: String): typings.parse5.distTreeAdaptersDefaultMod.CommentNode = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], nodeName = "#comment", parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.CommentNode]
    }
    
    inline def Document(childNodes: js.Array[ChildNode], mode: DOCUMENT_MODE): typings.parse5.distTreeAdaptersDefaultMod.Document = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nodeName = "#document")
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.Document]
    }
    
    inline def DocumentFragment(childNodes: js.Array[ChildNode]): typings.parse5.distTreeAdaptersDefaultMod.DocumentFragment = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = "#document-fragment")
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.DocumentFragment]
    }
    
    inline def DocumentType(name: String, publicId: String, systemId: String): typings.parse5.distTreeAdaptersDefaultMod.DocumentType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeName = "#documentType", publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.DocumentType]
    }
    
    inline def Element(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      namespaceURI: NS,
      nodeName: String,
      tagName: String
    ): typings.parse5.distTreeAdaptersDefaultMod.Element = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.Element]
    }
    
    inline def Template(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      content: DocumentFragment,
      namespaceURI: NS
    ): typings.parse5.distTreeAdaptersDefaultMod.Template = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = "template", tagName = "template", parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.Template]
    }
    
    inline def TextNode(value: String): typings.parse5.distTreeAdaptersDefaultMod.TextNode = {
      val __obj = js.Dynamic.literal(nodeName = "#text", value = value.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.TextNode]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parse5.distTreeAdaptersDefaultMod.Document
    - typings.parse5.distTreeAdaptersDefaultMod.DocumentFragment
    - typings.parse5.distTreeAdaptersDefaultMod.Element
    - typings.parse5.distTreeAdaptersDefaultMod.Template
  */
  trait ParentNode
    extends StObject
       with Node
  object ParentNode {
    
    inline def Document(childNodes: js.Array[ChildNode], mode: DOCUMENT_MODE): typings.parse5.distTreeAdaptersDefaultMod.Document = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nodeName = "#document")
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.Document]
    }
    
    inline def DocumentFragment(childNodes: js.Array[ChildNode]): typings.parse5.distTreeAdaptersDefaultMod.DocumentFragment = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = "#document-fragment")
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.DocumentFragment]
    }
    
    inline def Element(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      namespaceURI: NS,
      nodeName: String,
      tagName: String
    ): typings.parse5.distTreeAdaptersDefaultMod.Element = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.Element]
    }
    
    inline def Template(
      attrs: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      content: DocumentFragment,
      namespaceURI: NS
    ): typings.parse5.distTreeAdaptersDefaultMod.Template = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = "template", tagName = "template", parentNode = null)
      __obj.asInstanceOf[typings.parse5.distTreeAdaptersDefaultMod.Template]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.parse5.distTreeAdaptersDefaultMod.Node because Already inherited
  - typings.parse5.distTreeAdaptersDefaultMod.ParentNode because Already inherited
  - typings.parse5.distTreeAdaptersDefaultMod.ChildNode because Already inherited */ trait Template
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextNode] (val x: Self) extends AnyVal {
      
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
