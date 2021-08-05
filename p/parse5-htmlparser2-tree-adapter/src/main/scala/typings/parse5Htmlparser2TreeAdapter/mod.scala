package typings.parse5Htmlparser2TreeAdapter

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.parse5.mod.DocumentMode
import typings.parse5.mod.ElementLocation
import typings.parse5.mod.Location
import typings.parse5.mod.TreeAdapter
import typings.parse5Htmlparser2TreeAdapter.parse5Htmlparser2TreeAdapterStrings.Exclamationmarkdoctype
import typings.parse5Htmlparser2TreeAdapter.parse5Htmlparser2TreeAdapterStrings.comment
import typings.parse5Htmlparser2TreeAdapter.parse5Htmlparser2TreeAdapterStrings.directive
import typings.parse5Htmlparser2TreeAdapter.parse5Htmlparser2TreeAdapterStrings.root
import typings.parse5Htmlparser2TreeAdapter.parse5Htmlparser2TreeAdapterStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("parse5-htmlparser2-tree-adapter", JSImport.Namespace)
  @js.native
  val ^ : TreeAdapter = js.native
  
  /**
    * htmlparser2 tree adapter CommentNode interface.
    */
  trait CommentNode
    extends StObject
       with Node {
    
    /**
      * Comment text.
      */
    var data: String
    
    /**
      * The name of the node.
      */
    var name: comment
    
    /**
      * Same as {@link data}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var nodeValue: String
    
    /**
      * Comment source code location info. Available if location info is enabled via ParserOptions.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.undefined
  }
  object CommentNode {
    
    inline def apply(
      data: String,
      next: Node,
      nextSibling: Node,
      nodeType: Double,
      nodeValue: String,
      parent: ParentNode,
      parentNode: ParentNode,
      prev: Node,
      previousSibling: Node,
      `type`: String
    ): CommentNode = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = "comment", next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentNode]
    }
    
    extension [Self <: CommentNode](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: comment): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    }
  }
  
  /**
    * htmlparser2 tree adapter Document interface.
    */
  trait Document
    extends StObject
       with ParentNode {
    
    /**
      * The name of the node.
      */
    var name: root
    
    /**
      * The type of the node.
      */
    @JSName("type")
    var type_Document: root
    
    /**
      * [Document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
      */
    var `x-mode`: DocumentMode
  }
  object Document {
    
    inline def apply(
      childNodes: js.Array[Node],
      children: js.Array[Node],
      firstChild: Node,
      lastChild: Node,
      next: Node,
      nextSibling: Node,
      nodeType: Double,
      parent: ParentNode,
      parentNode: ParentNode,
      prev: Node,
      previousSibling: Node,
      `x-mode`: DocumentMode
    ): Document = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = "root", next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("root")
      __obj.updateDynamic("x-mode")(`x-mode`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Document]
    }
    
    extension [Self <: Document](x: Self) {
      
      inline def setName(value: root): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def `setX-mode`(value: DocumentMode): Self = StObject.set(x, "x-mode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter DocumentFragment interface.
    */
  trait DocumentFragment
    extends StObject
       with ParentNode {
    
    /**
      * The name of the node.
      */
    var name: root
    
    /**
      * The type of the node.
      */
    @JSName("type")
    var type_DocumentFragment: root
  }
  object DocumentFragment {
    
    inline def apply(
      childNodes: js.Array[Node],
      children: js.Array[Node],
      firstChild: Node,
      lastChild: Node,
      next: Node,
      nextSibling: Node,
      nodeType: Double,
      parent: ParentNode,
      parentNode: ParentNode,
      prev: Node,
      previousSibling: Node
    ): DocumentFragment = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = "root", next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("root")
      __obj.asInstanceOf[DocumentFragment]
    }
    
    extension [Self <: DocumentFragment](x: Self) {
      
      inline def setName(value: root): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter DocumentType interface.
    */
  trait DocumentType
    extends StObject
       with Node {
    
    /**
      * Serialized doctype {@link name}, {@link publicId} and {@link systemId}.
      */
    var data: String
    
    /**
      * Node name.
      */
    var name: Exclamationmarkdoctype
    
    /**
      * The type of the node.
      */
    @JSName("type")
    var type_DocumentType: directive
    
    /**
      * Document type name.
      */
    var `x-name`: String
    
    /**
      * Document type public identifier.
      */
    var `x-publicId`: String
    
    /**
      * Document type system identifier.
      */
    var `x-systemId`: String
  }
  object DocumentType {
    
    inline def apply(
      data: String,
      next: Node,
      nextSibling: Node,
      nodeType: Double,
      parent: ParentNode,
      parentNode: ParentNode,
      prev: Node,
      previousSibling: Node,
      `x-name`: String,
      `x-publicId`: String,
      `x-systemId`: String
    ): DocumentType = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = "!doctype", next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("directive")
      __obj.updateDynamic("x-name")(`x-name`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-publicId")(`x-publicId`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-systemId")(`x-systemId`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentType]
    }
    
    extension [Self <: DocumentType](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: Exclamationmarkdoctype): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: directive): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def `setX-name`(value: String): Self = StObject.set(x, "x-name", value.asInstanceOf[js.Any])
      
      inline def `setX-publicId`(value: String): Self = StObject.set(x, "x-publicId", value.asInstanceOf[js.Any])
      
      inline def `setX-systemId`(value: String): Self = StObject.set(x, "x-systemId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter Element interface.
    */
  trait Element
    extends StObject
       with ParentNode {
    
    /**
      * Element attributes.
      */
    var attribs: StringDictionary[String]
    
    /**
      * The name of the node. Equals to element {@link tagName}.
      */
    var name: String
    
    /**
      * Element namespace.
      */
    var namespace: String
    
    /**
      * Element source code location info. Available if location info is enabled via ParserOptions.
      */
    var sourceCodeLocation: js.UndefOr[ElementLocation] = js.undefined
    
    /**
      * Element tag name.
      */
    var tagName: String
    
    /**
      * Element attribute namespaces.
      */
    var `x-attribsNamespace`: StringDictionary[String]
    
    /**
      * Element attribute namespace-related prefixes.
      */
    var `x-attribsPrefix`: StringDictionary[String]
  }
  object Element {
    
    inline def apply(
      attribs: StringDictionary[String],
      childNodes: js.Array[Node],
      children: js.Array[Node],
      firstChild: Node,
      lastChild: Node,
      name: String,
      namespace: String,
      next: Node,
      nextSibling: Node,
      nodeType: Double,
      parent: ParentNode,
      parentNode: ParentNode,
      prev: Node,
      previousSibling: Node,
      tagName: String,
      `type`: String,
      `x-attribsNamespace`: StringDictionary[String],
      `x-attribsPrefix`: StringDictionary[String]
    ): Element = {
      val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-attribsNamespace")(`x-attribsNamespace`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-attribsPrefix")(`x-attribsPrefix`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setAttribs(value: StringDictionary[String]): Self = StObject.set(x, "attribs", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocation(value: ElementLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def `setX-attribsNamespace`(value: StringDictionary[String]): Self = StObject.set(x, "x-attribsNamespace", value.asInstanceOf[js.Any])
      
      inline def `setX-attribsPrefix`(value: StringDictionary[String]): Self = StObject.set(x, "x-attribsPrefix", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter Node interface.
    */
  trait Node extends StObject {
    
    /**
      * Next sibling.
      */
    var next: Node
    
    /**
      * Same as {@link next}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var nextSibling: Node
    
    /**
      * [DOM spec](https://dom.spec.whatwg.org/#dom-node-nodetype)-compatible node {@link type}.
      */
    var nodeType: Double
    
    /**
      * Parent node.
      */
    var parent: ParentNode
    
    /**
      * Same as {@link parent}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var parentNode: ParentNode
    
    /**
      * Previous sibling.
      */
    var prev: Node
    
    /**
      * Same as {@link prev}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var previousSibling: Node
    
    /**
      * The type of the node. E.g. {@link Document} will have `type` equal to 'root'`.
      */
    var `type`: String
  }
  object Node {
    
    inline def apply(
      next: Node,
      nextSibling: Node,
      nodeType: Double,
      parent: ParentNode,
      parentNode: ParentNode,
      prev: Node,
      previousSibling: Node,
      `type`: String
    ): Node = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setNext(value: Node): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextSibling(value: Node): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setParent(value: ParentNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNode(value: ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: Node): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPreviousSibling(value: Node): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter ParentNode interface.
    */
  trait ParentNode
    extends StObject
       with Node {
    
    /**
      * Same as {@link children}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var childNodes: js.Array[Node]
    
    /**
      * Child nodes.
      */
    var children: js.Array[Node]
    
    /**
      * First child of the node.
      */
    var firstChild: Node
    
    /**
      * Last child of the node.
      */
    var lastChild: Node
  }
  object ParentNode {
    
    inline def apply(
      childNodes: js.Array[Node],
      children: js.Array[Node],
      firstChild: Node,
      lastChild: Node,
      next: Node,
      nextSibling: Node,
      nodeType: Double,
      parent: ParentNode,
      parentNode: ParentNode,
      prev: Node,
      previousSibling: Node,
      `type`: String
    ): ParentNode = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParentNode]
    }
    
    extension [Self <: ParentNode](x: Self) {
      
      inline def setChildNodes(value: js.Array[Node]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: Node*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
      
      inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setFirstChild(value: Node): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      inline def setLastChild(value: Node): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter TextNode interface.
    */
  trait TextNode
    extends StObject
       with Node {
    
    /**
      * Text content.
      */
    var data: String
    
    /**
      * The name of the node.
      */
    var name: text
    
    /**
      * Same as {@link data}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var nodeValue: String
    
    /**
      * Comment source code location info. Available if location info is enabled via ParserOptions.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.undefined
  }
  object TextNode {
    
    inline def apply(
      data: String,
      next: Node,
      nextSibling: Node,
      nodeType: Double,
      nodeValue: String,
      parent: ParentNode,
      parentNode: ParentNode,
      prev: Node,
      previousSibling: Node,
      `type`: String
    ): TextNode = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = "text", next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextNode]
    }
    
    extension [Self <: TextNode](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: text): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    }
  }
  
  type _To = TreeAdapter
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TreeAdapter = ^
}
