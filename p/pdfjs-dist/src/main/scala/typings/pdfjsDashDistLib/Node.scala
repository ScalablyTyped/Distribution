package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends EventTarget {
  val ATTRIBUTE_NODE: scala.Double = js.native
  val CDATA_SECTION_NODE: scala.Double = js.native
  val COMMENT_NODE: scala.Double = js.native
  val DOCUMENT_FRAGMENT_NODE: scala.Double = js.native
  val DOCUMENT_NODE: scala.Double = js.native
  val DOCUMENT_POSITION_CONTAINED_BY: scala.Double = js.native
  val DOCUMENT_POSITION_CONTAINS: scala.Double = js.native
  val DOCUMENT_POSITION_DISCONNECTED: scala.Double = js.native
  val DOCUMENT_POSITION_FOLLOWING: scala.Double = js.native
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: scala.Double = js.native
  val DOCUMENT_POSITION_PRECEDING: scala.Double = js.native
  val DOCUMENT_TYPE_NODE: scala.Double = js.native
  val ELEMENT_NODE: scala.Double = js.native
  val ENTITY_NODE: scala.Double = js.native
  val ENTITY_REFERENCE_NODE: scala.Double = js.native
  val NOTATION_NODE: scala.Double = js.native
  val PROCESSING_INSTRUCTION_NODE: scala.Double = js.native
  val TEXT_NODE: scala.Double = js.native
  /**
    * Returns node's node document's document base URL.
    */
  val baseURI: java.lang.String = js.native
  /**
    * Returns the children.
    */
  val childNodes: NodeListOf[ChildNode] = js.native
  /**
    * Returns the first child.
    */
  val firstChild: ChildNode | scala.Null = js.native
  /**
    * Returns true if node is connected and false otherwise.
    */
  val isConnected: scala.Boolean = js.native
  /**
    * Returns the last child.
    */
  val lastChild: ChildNode | scala.Null = js.native
  /** @deprecated */
  val namespaceURI: java.lang.String | scala.Null = js.native
  /**
    * Returns the next sibling.
    */
  val nextSibling: Node | scala.Null = js.native
  /**
    * Returns a string appropriate for the type of node, as
    * follows:
    * Element
    * Its HTML-uppercased qualified name.
    * Attr
    * Its qualified name.
    * Text
    * "#text".
    * CDATASection
    * "#cdata-section".
    * ProcessingInstruction
    * Its target.
    * Comment
    * "#comment".
    * Document
    * "#document".
    * DocumentType
    * Its name.
    * DocumentFragment
    * "#document-fragment".
    */
  val nodeName: java.lang.String = js.native
  val nodeType: scala.Double = js.native
  var nodeValue: java.lang.String | scala.Null = js.native
  /**
    * Returns the node document.
    * Returns null for documents.
    */
  val ownerDocument: Document | scala.Null = js.native
  /**
    * Returns the parent element.
    */
  val parentElement: HTMLElement | scala.Null = js.native
  /**
    * Returns the parent.
    */
  val parentNode: Node with (ParentNode | scala.Null) = js.native
  /**
    * Returns the previous sibling.
    */
  val previousSibling: Node | scala.Null = js.native
  var textContent: java.lang.String | scala.Null = js.native
  def appendChild[T /* <: Node */](newChild: T): T = js.native
  /**
    * Returns a copy of node. If deep is true, the copy also includes the node's descendants.
    */
  def cloneNode(): Node = js.native
  def cloneNode(deep: scala.Boolean): Node = js.native
  def compareDocumentPosition(other: Node): scala.Double = js.native
  def contains(): scala.Boolean = js.native
  /**
    * Returns true if other is an inclusive descendant of node, and false otherwise.
    */
  def contains(other: Node): scala.Boolean = js.native
  /**
    * Returns node's shadow-including root.
    */
  def getRootNode(): Node = js.native
  def getRootNode(options: GetRootNodeOptions): Node = js.native
  /**
    * Returns whether node has children.
    */
  def hasChildNodes(): scala.Boolean = js.native
  def insertBefore[T /* <: Node */](newChild: T): T = js.native
  def insertBefore[T /* <: Node */](newChild: T, refChild: Node): T = js.native
  def isDefaultNamespace(): scala.Boolean = js.native
  def isDefaultNamespace(namespace: java.lang.String): scala.Boolean = js.native
  def isEqualNode(): scala.Boolean = js.native
  /**
    * Returns whether node and otherNode have the same properties.
    */
  def isEqualNode(otherNode: Node): scala.Boolean = js.native
  def isSameNode(): scala.Boolean = js.native
  def isSameNode(otherNode: Node): scala.Boolean = js.native
  def lookupNamespaceURI(): java.lang.String | scala.Null = js.native
  def lookupNamespaceURI(prefix: java.lang.String): java.lang.String | scala.Null = js.native
  def lookupPrefix(): java.lang.String | scala.Null = js.native
  def lookupPrefix(namespace: java.lang.String): java.lang.String | scala.Null = js.native
  /**
    * Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes.
    */
  def normalize(): scala.Unit = js.native
  def removeChild[T /* <: Node */](oldChild: T): T = js.native
  def replaceChild[T /* <: Node */](newChild: Node, oldChild: T): T = js.native
}

@JSGlobal("Node")
@js.native
object Node
  extends org.scalablytyped.runtime.Instantiable0[Node] {
  val ATTRIBUTE_NODE: scala.Double = js.native
  val CDATA_SECTION_NODE: scala.Double = js.native
  val COMMENT_NODE: scala.Double = js.native
  val DOCUMENT_FRAGMENT_NODE: scala.Double = js.native
  val DOCUMENT_NODE: scala.Double = js.native
  val DOCUMENT_POSITION_CONTAINED_BY: scala.Double = js.native
  val DOCUMENT_POSITION_CONTAINS: scala.Double = js.native
  val DOCUMENT_POSITION_DISCONNECTED: scala.Double = js.native
  val DOCUMENT_POSITION_FOLLOWING: scala.Double = js.native
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: scala.Double = js.native
  val DOCUMENT_POSITION_PRECEDING: scala.Double = js.native
  val DOCUMENT_TYPE_NODE: scala.Double = js.native
  val ELEMENT_NODE: scala.Double = js.native
  val ENTITY_NODE: scala.Double = js.native
  val ENTITY_REFERENCE_NODE: scala.Double = js.native
  val NOTATION_NODE: scala.Double = js.native
  val PROCESSING_INSTRUCTION_NODE: scala.Double = js.native
  val TEXT_NODE: scala.Double = js.native
}

