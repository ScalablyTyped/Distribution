package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeAdapter extends js.Object {
  /**
    * Copies attributes to the given element. Only attributes that are not yet present in the element are copied.
    *
    * @param recipient - Element to copy attributes into.
    * @param attrs - Attributes to copy.
    */
  def adoptAttributes(recipient: Element, attrs: js.Array[Attribute]): scala.Unit
  /**
    * Appends a child node to the given parent node.
    *
    * @param parentNode - Parent node.
    * @param newNode -  Child node.
    */
  def appendChild(parentNode: ParentNode, newNode: Node): scala.Unit
  /**
    * Creates a comment node.
    *
    * @param data - Comment text.
    */
  def createCommentNode(data: java.lang.String): CommentNode
  /**
    * Creates a document node.
    */
  def createDocument(): Document
  /**
    * Creates a document fragment node.
    */
  def createDocumentFragment(): DocumentFragment
  /**
    * Creates an element node.
    *
    * @param tagName - Tag name of the element.
    * @param namespaceURI - Namespace of the element.
    * @param attrs - Attribute name-value pair array. Foreign attributes may contain `namespace` and `prefix` fields as well.
    */
  def createElement(tagName: java.lang.String, namespaceURI: java.lang.String, attrs: js.Array[Attribute]): Element
  /**
    * Removes a node from its parent.
    *
    * @param node - Node to remove.
    */
  def detachNode(node: Node): scala.Unit
  /**
    * Returns the given element's attributes in an array, in the form of name-value pairs.
    * Foreign attributes may contain `namespace` and `prefix` fields as well.
    *
    * @param element - Element.
    */
  def getAttrList(element: Element): js.Array[Attribute]
  /**
    * Returns the given node's children in an array.
    *
    * @param node - Node.
    */
  def getChildNodes(node: ParentNode): js.Array[Node]
  /**
    * Returns the given comment node's content.
    *
    * @param commentNode - Comment node.
    */
  def getCommentNodeContent(commentNode: CommentNode): java.lang.String
  /**
    * Returns [document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    *
    * @param document - Document node.
    */
  def getDocumentMode(document: Document): DocumentMode
  /**
    * Returns the given document type node's name.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodeName(doctypeNode: DocumentType): java.lang.String
  /**
    * Returns the given document type node's public identifier.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodePublicId(doctypeNode: DocumentType): java.lang.String
  /**
    * Returns the given document type node's system identifier.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodeSystemId(doctypeNode: DocumentType): java.lang.String
  /**
    * Returns the first child of the given node.
    *
    * @param node - Node.
    */
  def getFirstChild(node: ParentNode): Node
  /**
    * Returns the given element's namespace.
    *
    * @param element - Element.
    */
  def getNamespaceURI(element: Element): java.lang.String
  /**
    * Returns the given node's parent.
    *
    * @param node - Node.
    */
  def getParentNode(node: Node): ParentNode
  /**
    * Returns the given element's tag name.
    *
    * @param element - Element.
    */
  def getTagName(element: Element): java.lang.String
  /**
    * Returns the `<template>` element content element.
    *
    * @param templateElement - `<template>` element.
    */
  def getTemplateContent(templateElement: Element): DocumentFragment
  /**
    * Returns the given text node's content.
    *
    * @param textNode - Text node.
    */
  def getTextNodeContent(textNode: TextNode): java.lang.String
  /**
    * Inserts a child node to the given parent node before the given reference node.
    *
    * @param parentNode - Parent node.
    * @param newNode -  Child node.
    * @param referenceNode -  Reference node.
    */
  def insertBefore(parentNode: ParentNode, newNode: Node, referenceNode: Node): scala.Unit
  /**
    * Inserts text into a node. If the last child of the node is a text node, the provided text will be appended to the
    * text node content. Otherwise, inserts a new text node with the given text.
    *
    * @param parentNode - Node to insert text into.
    * @param text - Text to insert.
    */
  def insertText(parentNode: ParentNode, text: java.lang.String): scala.Unit
  /**
    * Inserts text into a sibling node that goes before the reference node. If this sibling node is the text node,
    * the provided text will be appended to the text node content. Otherwise, inserts a new sibling text node with
    * the given text before the reference node.
    *
    * @param parentNode - Node to insert text into.
    * @param text - Text to insert.
    * @param referenceNode - Node to insert text before.
    */
  def insertTextBefore(parentNode: ParentNode, text: java.lang.String, referenceNode: Node): scala.Unit
  /**
    * Determines if the given node is a comment node.
    *
    * @param node - Node.
    */
  def isCommentNode(node: Node): scala.Boolean
  /**
    * Determines if the given node is a document type node.
    *
    * @param node - Node.
    */
  def isDocumentTypeNode(node: Node): scala.Boolean
  /**
    * Determines if the given node is an element.
    *
    * @param node - Node.
    */
  def isElementNode(node: Node): scala.Boolean
  /**
    * Determines if the given node is a text node.
    *
    * @param node - Node.
    */
  def isTextNode(node: Node): scala.Boolean
  /**
    * Sets the [document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    *
    * @param document - Document node.
    * @param mode - Document mode.
    */
  def setDocumentMode(document: Document, mode: DocumentMode): scala.Unit
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
  def setDocumentType(document: Document, name: java.lang.String, publicId: java.lang.String, systemId: java.lang.String): scala.Unit
  /**
    * Sets the `<template>` element content element.
    *
    * @param templateElement - `<template>` element.
    * @param contentElement -  Content element.
    */
  def setTemplateContent(templateElement: Element, contentElement: DocumentFragment): scala.Unit
}

object TreeAdapter {
  @scala.inline
  def apply(
    adoptAttributes: (Element, js.Array[Attribute]) => scala.Unit,
    appendChild: (ParentNode, Node) => scala.Unit,
    createCommentNode: java.lang.String => CommentNode,
    createDocument: () => Document,
    createDocumentFragment: () => DocumentFragment,
    createElement: (java.lang.String, java.lang.String, js.Array[Attribute]) => Element,
    detachNode: Node => scala.Unit,
    getAttrList: Element => js.Array[Attribute],
    getChildNodes: ParentNode => js.Array[Node],
    getCommentNodeContent: CommentNode => java.lang.String,
    getDocumentMode: Document => DocumentMode,
    getDocumentTypeNodeName: DocumentType => java.lang.String,
    getDocumentTypeNodePublicId: DocumentType => java.lang.String,
    getDocumentTypeNodeSystemId: DocumentType => java.lang.String,
    getFirstChild: ParentNode => Node,
    getNamespaceURI: Element => java.lang.String,
    getParentNode: Node => ParentNode,
    getTagName: Element => java.lang.String,
    getTemplateContent: Element => DocumentFragment,
    getTextNodeContent: TextNode => java.lang.String,
    insertBefore: (ParentNode, Node, Node) => scala.Unit,
    insertText: (ParentNode, java.lang.String) => scala.Unit,
    insertTextBefore: (ParentNode, java.lang.String, Node) => scala.Unit,
    isCommentNode: Node => scala.Boolean,
    isDocumentTypeNode: Node => scala.Boolean,
    isElementNode: Node => scala.Boolean,
    isTextNode: Node => scala.Boolean,
    setDocumentMode: (Document, DocumentMode) => scala.Unit,
    setDocumentType: (Document, java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    setTemplateContent: (Element, DocumentFragment) => scala.Unit
  ): TreeAdapter = {
    val __obj = js.Dynamic.literal(adoptAttributes = js.Any.fromFunction2(adoptAttributes), appendChild = js.Any.fromFunction2(appendChild), createCommentNode = js.Any.fromFunction1(createCommentNode), createDocument = js.Any.fromFunction0(createDocument), createDocumentFragment = js.Any.fromFunction0(createDocumentFragment), createElement = js.Any.fromFunction3(createElement), detachNode = js.Any.fromFunction1(detachNode), getAttrList = js.Any.fromFunction1(getAttrList), getChildNodes = js.Any.fromFunction1(getChildNodes), getCommentNodeContent = js.Any.fromFunction1(getCommentNodeContent), getDocumentMode = js.Any.fromFunction1(getDocumentMode), getDocumentTypeNodeName = js.Any.fromFunction1(getDocumentTypeNodeName), getDocumentTypeNodePublicId = js.Any.fromFunction1(getDocumentTypeNodePublicId), getDocumentTypeNodeSystemId = js.Any.fromFunction1(getDocumentTypeNodeSystemId), getFirstChild = js.Any.fromFunction1(getFirstChild), getNamespaceURI = js.Any.fromFunction1(getNamespaceURI), getParentNode = js.Any.fromFunction1(getParentNode), getTagName = js.Any.fromFunction1(getTagName), getTemplateContent = js.Any.fromFunction1(getTemplateContent), getTextNodeContent = js.Any.fromFunction1(getTextNodeContent), insertBefore = js.Any.fromFunction3(insertBefore), insertText = js.Any.fromFunction2(insertText), insertTextBefore = js.Any.fromFunction3(insertTextBefore), isCommentNode = js.Any.fromFunction1(isCommentNode), isDocumentTypeNode = js.Any.fromFunction1(isDocumentTypeNode), isElementNode = js.Any.fromFunction1(isElementNode), isTextNode = js.Any.fromFunction1(isTextNode), setDocumentMode = js.Any.fromFunction2(setDocumentMode), setDocumentType = js.Any.fromFunction4(setDocumentType), setTemplateContent = js.Any.fromFunction2(setTemplateContent))
  
    __obj.asInstanceOf[TreeAdapter]
  }
}

