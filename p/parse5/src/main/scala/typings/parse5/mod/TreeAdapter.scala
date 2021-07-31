package typings.parse5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeAdapter extends StObject {
  
  /**
    * Copies attributes to the given element. Only attributes that are not yet present in the element are copied.
    *
    * @param recipient - Element to copy attributes into.
    * @param attrs - Attributes to copy.
    */
  def adoptAttributes(recipient: Element, attrs: js.Array[Attribute]): Unit = js.native
  
  /**
    * Appends a child node to the given parent node.
    *
    * @param parentNode - Parent node.
    * @param newNode -  Child node.
    */
  def appendChild(parentNode: ParentNode, newNode: Node): Unit = js.native
  
  /**
    * Creates a comment node.
    *
    * @param data - Comment text.
    */
  def createCommentNode(data: String): CommentNode = js.native
  
  /**
    * Creates a document node.
    */
  def createDocument(): Document = js.native
  
  /**
    * Creates a document fragment node.
    */
  def createDocumentFragment(): DocumentFragment = js.native
  
  /**
    * Creates an element node.
    *
    * @param tagName - Tag name of the element.
    * @param namespaceURI - Namespace of the element.
    * @param attrs - Attribute name-value pair array. Foreign attributes may contain `namespace` and `prefix` fields as well.
    */
  def createElement(tagName: String, namespaceURI: String, attrs: js.Array[Attribute]): Element = js.native
  
  /**
    * Removes a node from its parent.
    *
    * @param node - Node to remove.
    */
  def detachNode(node: Node): Unit = js.native
  
  /**
    * Returns the given element's attributes in an array, in the form of name-value pairs.
    * Foreign attributes may contain `namespace` and `prefix` fields as well.
    *
    * @param element - Element.
    */
  def getAttrList(element: Element): js.Array[Attribute] = js.native
  
  /**
    * Returns the given node's children in an array.
    *
    * @param node - Node.
    */
  def getChildNodes(node: ParentNode): js.Array[Node] = js.native
  
  /**
    * Returns the given comment node's content.
    *
    * @param commentNode - Comment node.
    */
  def getCommentNodeContent(commentNode: CommentNode): String = js.native
  
  /**
    * Returns [document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    *
    * @param document - Document node.
    */
  def getDocumentMode(document: Document): DocumentMode = js.native
  
  /**
    * Returns the given document type node's name.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodeName(doctypeNode: DocumentType): String = js.native
  
  /**
    * Returns the given document type node's public identifier.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodePublicId(doctypeNode: DocumentType): String = js.native
  
  /**
    * Returns the given document type node's system identifier.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodeSystemId(doctypeNode: DocumentType): String = js.native
  
  /**
    * Returns the first child of the given node.
    *
    * @param node - Node.
    */
  def getFirstChild(node: ParentNode): Node = js.native
  
  /**
    * Returns the given element's namespace.
    *
    * @param element - Element.
    */
  def getNamespaceURI(element: Element): String = js.native
  
  /**
    * Returns the given node's source code location information.
    *
    * @param node - Node.
    */
  def getNodeSourceCodeLocation(node: Node): Location | StartTagLocation | ElementLocation = js.native
  
  /**
    * Returns the given node's parent.
    *
    * @param node - Node.
    */
  def getParentNode(node: ChildNode): ParentNode = js.native
  
  /**
    * Returns the given element's tag name.
    *
    * @param element - Element.
    */
  def getTagName(element: Element): String = js.native
  
  /**
    * Returns the `<template>` element content element.
    *
    * @param templateElement - `<template>` element.
    */
  def getTemplateContent(templateElement: Element): DocumentFragment = js.native
  
  /**
    * Returns the given text node's content.
    *
    * @param textNode - Text node.
    */
  def getTextNodeContent(textNode: TextNode): String = js.native
  
  /**
    * Inserts a child node to the given parent node before the given reference node.
    *
    * @param parentNode - Parent node.
    * @param newNode -  Child node.
    * @param referenceNode -  Reference node.
    */
  def insertBefore(parentNode: ParentNode, newNode: Node, referenceNode: Node): Unit = js.native
  
  /**
    * Inserts text into a node. If the last child of the node is a text node, the provided text will be appended to the
    * text node content. Otherwise, inserts a new text node with the given text.
    *
    * @param parentNode - Node to insert text into.
    * @param text - Text to insert.
    */
  def insertText(parentNode: ParentNode, text: String): Unit = js.native
  
  /**
    * Inserts text into a sibling node that goes before the reference node. If this sibling node is the text node,
    * the provided text will be appended to the text node content. Otherwise, inserts a new sibling text node with
    * the given text before the reference node.
    *
    * @param parentNode - Node to insert text into.
    * @param text - Text to insert.
    * @param referenceNode - Node to insert text before.
    */
  def insertTextBefore(parentNode: ParentNode, text: String, referenceNode: Node): Unit = js.native
  
  /**
    * Determines if the given node is a comment node.
    *
    * @param node - Node.
    */
  def isCommentNode(node: Node): Boolean = js.native
  
  /**
    * Determines if the given node is a document type node.
    *
    * @param node - Node.
    */
  def isDocumentTypeNode(node: Node): Boolean = js.native
  
  /**
    * Determines if the given node is an element.
    *
    * @param node - Node.
    */
  def isElementNode(node: Node): Boolean = js.native
  
  /**
    * Determines if the given node is a text node.
    *
    * @param node - Node.
    */
  def isTextNode(node: Node): Boolean = js.native
  
  /**
    * Sets the [document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    *
    * @param document - Document node.
    * @param mode - Document mode.
    */
  def setDocumentMode(document: Document, mode: DocumentMode): Unit = js.native
  
  /**
    * Sets the document type. If the `document` already contains a document type node, the `name`, `publicId` and `systemId`
    * properties of this node will be updated with the provided values. Otherwise, creates a new document type node
    * with the given properties and inserts it into the `document`.
    *
    * @param document - Document node.
    * @param name -  Document type name.
    * @param publicId - Document type public identifier.
    * @param systemId - Document type system identifier.
    */
  def setDocumentType(document: Document, name: String, publicId: String, systemId: String): Unit = js.native
  
  def setNodeSourceCodeLocation(node: Node, location: ElementLocation): Unit = js.native
  /**
    * Attaches source code location information to the node.
    *
    * @param node - Node.
    */
  def setNodeSourceCodeLocation(node: Node, location: Location): Unit = js.native
  def setNodeSourceCodeLocation(node: Node, location: StartTagLocation): Unit = js.native
  
  /**
    * Sets the `<template>` element content element.
    *
    * @param templateElement - `<template>` element.
    * @param contentElement -  Content element.
    */
  def setTemplateContent(templateElement: Element, contentElement: DocumentFragment): Unit = js.native
}
