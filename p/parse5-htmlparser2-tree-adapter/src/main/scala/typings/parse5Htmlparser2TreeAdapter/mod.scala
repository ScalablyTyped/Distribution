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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("parse5-htmlparser2-tree-adapter", JSImport.Namespace)
  @js.native
  val ^ : TreeAdapter = js.native
  
  /**
    * htmlparser2 tree adapter CommentNode interface.
    */
  @js.native
  trait CommentNode extends Node {
    
    /**
      * Comment text.
      */
    var data: String = js.native
    
    /**
      * The name of the node.
      */
    var name: comment = js.native
    
    /**
      * Same as {@link data}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var nodeValue: String = js.native
    
    /**
      * Comment source code location info. Available if location info is enabled via ParserOptions.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.native
  }
  object CommentNode {
    
    @scala.inline
    def apply(
      data: String,
      name: comment,
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
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentNode]
    }
    
    @scala.inline
    implicit class CommentNodeMutableBuilder[Self <: CommentNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: comment): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    }
  }
  
  /**
    * htmlparser2 tree adapter Document interface.
    */
  @js.native
  trait Document extends ParentNode {
    
    /**
      * The name of the node.
      */
    var name: root = js.native
    
    /**
      * The type of the node.
      */
    @JSName("type")
    var type_Document: root = js.native
    
    /**
      * [Document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
      */
    var `x-mode`: DocumentMode = js.native
  }
  object Document {
    
    @scala.inline
    def apply(
      childNodes: js.Array[Node],
      children: js.Array[Node],
      firstChild: Node,
      lastChild: Node,
      name: root,
      next: Node,
      nextSibling: Node,
      nodeType: Double,
      parent: ParentNode,
      parentNode: ParentNode,
      prev: Node,
      previousSibling: Node,
      `type`: root,
      `x-mode`: DocumentMode
    ): Document = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-mode")(`x-mode`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: root): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-mode`(value: DocumentMode): Self = StObject.set(x, "x-mode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter DocumentFragment interface.
    */
  @js.native
  trait DocumentFragment extends ParentNode {
    
    /**
      * The name of the node.
      */
    var name: root = js.native
    
    /**
      * The type of the node.
      */
    @JSName("type")
    var type_DocumentFragment: root = js.native
  }
  object DocumentFragment {
    
    @scala.inline
    def apply(
      childNodes: js.Array[Node],
      children: js.Array[Node],
      firstChild: Node,
      lastChild: Node,
      name: root,
      next: Node,
      nextSibling: Node,
      nodeType: Double,
      parent: ParentNode,
      parentNode: ParentNode,
      prev: Node,
      previousSibling: Node,
      `type`: root
    ): DocumentFragment = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentFragment]
    }
    
    @scala.inline
    implicit class DocumentFragmentMutableBuilder[Self <: DocumentFragment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: root): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter DocumentType interface.
    */
  @js.native
  trait DocumentType extends Node {
    
    /**
      * Serialized doctype {@link name}, {@link publicId} and {@link systemId}.
      */
    var data: String = js.native
    
    /**
      * Node name.
      */
    var name: Exclamationmarkdoctype = js.native
    
    /**
      * The type of the node.
      */
    @JSName("type")
    var type_DocumentType: directive = js.native
    
    /**
      * Document type name.
      */
    var `x-name`: String = js.native
    
    /**
      * Document type public identifier.
      */
    var `x-publicId`: String = js.native
    
    /**
      * Document type system identifier.
      */
    var `x-systemId`: String = js.native
  }
  object DocumentType {
    
    @scala.inline
    def apply(
      data: String,
      name: Exclamationmarkdoctype,
      next: Node,
      nextSibling: Node,
      nodeType: Double,
      parent: ParentNode,
      parentNode: ParentNode,
      prev: Node,
      previousSibling: Node,
      `type`: directive,
      `x-name`: String,
      `x-publicId`: String,
      `x-systemId`: String
    ): DocumentType = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-name")(`x-name`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-publicId")(`x-publicId`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-systemId")(`x-systemId`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentType]
    }
    
    @scala.inline
    implicit class DocumentTypeMutableBuilder[Self <: DocumentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Exclamationmarkdoctype): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: directive): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-name`(value: String): Self = StObject.set(x, "x-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-publicId`(value: String): Self = StObject.set(x, "x-publicId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-systemId`(value: String): Self = StObject.set(x, "x-systemId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter Element interface.
    */
  @js.native
  trait Element extends ParentNode {
    
    /**
      * Element attributes.
      */
    var attribs: StringDictionary[String] = js.native
    
    /**
      * The name of the node. Equals to element {@link tagName}.
      */
    var name: String = js.native
    
    /**
      * Element namespace.
      */
    var namespace: String = js.native
    
    /**
      * Element source code location info. Available if location info is enabled via ParserOptions.
      */
    var sourceCodeLocation: js.UndefOr[ElementLocation] = js.native
    
    /**
      * Element tag name.
      */
    var tagName: String = js.native
    
    /**
      * Element attribute namespaces.
      */
    var `x-attribsNamespace`: StringDictionary[String] = js.native
    
    /**
      * Element attribute namespace-related prefixes.
      */
    var `x-attribsPrefix`: StringDictionary[String] = js.native
  }
  object Element {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribs(value: StringDictionary[String]): Self = StObject.set(x, "attribs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocation(value: ElementLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-attribsNamespace`(value: StringDictionary[String]): Self = StObject.set(x, "x-attribsNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-attribsPrefix`(value: StringDictionary[String]): Self = StObject.set(x, "x-attribsPrefix", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter Node interface.
    */
  @js.native
  trait Node extends StObject {
    
    /**
      * Next sibling.
      */
    var next: Node = js.native
    
    /**
      * Same as {@link next}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var nextSibling: Node = js.native
    
    /**
      * [DOM spec](https://dom.spec.whatwg.org/#dom-node-nodetype)-compatible node {@link type}.
      */
    var nodeType: Double = js.native
    
    /**
      * Parent node.
      */
    var parent: ParentNode = js.native
    
    /**
      * Same as {@link parent}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var parentNode: ParentNode = js.native
    
    /**
      * Previous sibling.
      */
    var prev: Node = js.native
    
    /**
      * Same as {@link prev}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var previousSibling: Node = js.native
    
    /**
      * The type of the node. E.g. {@link Document} will have `type` equal to 'root'`.
      */
    var `type`: String = js.native
  }
  object Node {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: Node): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextSibling(value: Node): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: ParentNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNode(value: ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev(value: Node): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousSibling(value: Node): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter ParentNode interface.
    */
  @js.native
  trait ParentNode extends Node {
    
    /**
      * Same as {@link children}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var childNodes: js.Array[Node] = js.native
    
    /**
      * Child nodes.
      */
    var children: js.Array[Node] = js.native
    
    /**
      * First child of the node.
      */
    var firstChild: Node = js.native
    
    /**
      * Last child of the node.
      */
    var lastChild: Node = js.native
  }
  object ParentNode {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ParentNodeMutableBuilder[Self <: ParentNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildNodes(value: js.Array[Node]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildNodesVarargs(value: Node*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setFirstChild(value: Node): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastChild(value: Node): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * htmlparser2 tree adapter TextNode interface.
    */
  @js.native
  trait TextNode extends Node {
    
    /**
      * Text content.
      */
    var data: String = js.native
    
    /**
      * The name of the node.
      */
    var name: text = js.native
    
    /**
      * Same as {@link data}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    var nodeValue: String = js.native
    
    /**
      * Comment source code location info. Available if location info is enabled via ParserOptions.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.native
  }
  object TextNode {
    
    @scala.inline
    def apply(
      data: String,
      name: text,
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
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextNode]
    }
    
    @scala.inline
    implicit class TextNodeMutableBuilder[Self <: TextNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: text): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    }
  }
  
  type _To = TreeAdapter
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TreeAdapter = ^
}
