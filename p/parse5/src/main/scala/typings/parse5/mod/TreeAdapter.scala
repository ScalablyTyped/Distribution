package typings.parse5.mod

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
  def adoptAttributes(recipient: Element, attrs: js.Array[Attribute]): Unit
  /**
    * Appends a child node to the given parent node.
    *
    * @param parentNode - Parent node.
    * @param newNode -  Child node.
    */
  def appendChild(parentNode: ParentNode, newNode: Node): Unit
  /**
    * Creates a comment node.
    *
    * @param data - Comment text.
    */
  def createCommentNode(data: String): CommentNode
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
  def createElement(tagName: String, namespaceURI: String, attrs: js.Array[Attribute]): Element
  /**
    * Removes a node from its parent.
    *
    * @param node - Node to remove.
    */
  def detachNode(node: Node): Unit
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
  def getCommentNodeContent(commentNode: CommentNode): String
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
  def getDocumentTypeNodeName(doctypeNode: DocumentType): String
  /**
    * Returns the given document type node's public identifier.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodePublicId(doctypeNode: DocumentType): String
  /**
    * Returns the given document type node's system identifier.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodeSystemId(doctypeNode: DocumentType): String
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
  def getNamespaceURI(element: Element): String
  /**
    * Returns the given node's parent.
    *
    * @param node - Node.
    */
  def getParentNode(node: ChildNode): ParentNode
  /**
    * Returns the given element's tag name.
    *
    * @param element - Element.
    */
  def getTagName(element: Element): String
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
  def getTextNodeContent(textNode: TextNode): String
  /**
    * Inserts a child node to the given parent node before the given reference node.
    *
    * @param parentNode - Parent node.
    * @param newNode -  Child node.
    * @param referenceNode -  Reference node.
    */
  def insertBefore(parentNode: ParentNode, newNode: Node, referenceNode: Node): Unit
  /**
    * Inserts text into a node. If the last child of the node is a text node, the provided text will be appended to the
    * text node content. Otherwise, inserts a new text node with the given text.
    *
    * @param parentNode - Node to insert text into.
    * @param text - Text to insert.
    */
  def insertText(parentNode: ParentNode, text: String): Unit
  /**
    * Inserts text into a sibling node that goes before the reference node. If this sibling node is the text node,
    * the provided text will be appended to the text node content. Otherwise, inserts a new sibling text node with
    * the given text before the reference node.
    *
    * @param parentNode - Node to insert text into.
    * @param text - Text to insert.
    * @param referenceNode - Node to insert text before.
    */
  def insertTextBefore(parentNode: ParentNode, text: String, referenceNode: Node): Unit
  /**
    * Determines if the given node is a comment node.
    *
    * @param node - Node.
    */
  def isCommentNode(node: Node): Boolean
  /**
    * Determines if the given node is a document type node.
    *
    * @param node - Node.
    */
  def isDocumentTypeNode(node: Node): Boolean
  /**
    * Determines if the given node is an element.
    *
    * @param node - Node.
    */
  def isElementNode(node: Node): Boolean
  /**
    * Determines if the given node is a text node.
    *
    * @param node - Node.
    */
  def isTextNode(node: Node): Boolean
  /**
    * Sets the [document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    *
    * @param document - Document node.
    * @param mode - Document mode.
    */
  def setDocumentMode(document: Document, mode: DocumentMode): Unit
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
  def setDocumentType(document: Document, name: String, publicId: String, systemId: String): Unit
  /**
    * Sets the `<template>` element content element.
    *
    * @param templateElement - `<template>` element.
    * @param contentElement -  Content element.
    */
  def setTemplateContent(templateElement: Element, contentElement: DocumentFragment): Unit
}

object TreeAdapter {
  @scala.inline
  def apply(
    adoptAttributes: (Element, js.Array[Attribute]) => Unit,
    appendChild: (ParentNode, Node) => Unit,
    createCommentNode: String => CommentNode,
    createDocument: () => Document,
    createDocumentFragment: () => DocumentFragment,
    createElement: (String, String, js.Array[Attribute]) => Element,
    detachNode: Node => Unit,
    getAttrList: Element => js.Array[Attribute],
    getChildNodes: ParentNode => js.Array[Node],
    getCommentNodeContent: CommentNode => String,
    getDocumentMode: Document => DocumentMode,
    getDocumentTypeNodeName: DocumentType => String,
    getDocumentTypeNodePublicId: DocumentType => String,
    getDocumentTypeNodeSystemId: DocumentType => String,
    getFirstChild: ParentNode => Node,
    getNamespaceURI: Element => String,
    getParentNode: ChildNode => ParentNode,
    getTagName: Element => String,
    getTemplateContent: Element => DocumentFragment,
    getTextNodeContent: TextNode => String,
    insertBefore: (ParentNode, Node, Node) => Unit,
    insertText: (ParentNode, String) => Unit,
    insertTextBefore: (ParentNode, String, Node) => Unit,
    isCommentNode: Node => Boolean,
    isDocumentTypeNode: Node => Boolean,
    isElementNode: Node => Boolean,
    isTextNode: Node => Boolean,
    setDocumentMode: (Document, DocumentMode) => Unit,
    setDocumentType: (Document, String, String, String) => Unit,
    setTemplateContent: (Element, DocumentFragment) => Unit
  ): TreeAdapter = {
    val __obj = js.Dynamic.literal(adoptAttributes = js.Any.fromFunction2(adoptAttributes), appendChild = js.Any.fromFunction2(appendChild), createCommentNode = js.Any.fromFunction1(createCommentNode), createDocument = js.Any.fromFunction0(createDocument), createDocumentFragment = js.Any.fromFunction0(createDocumentFragment), createElement = js.Any.fromFunction3(createElement), detachNode = js.Any.fromFunction1(detachNode), getAttrList = js.Any.fromFunction1(getAttrList), getChildNodes = js.Any.fromFunction1(getChildNodes), getCommentNodeContent = js.Any.fromFunction1(getCommentNodeContent), getDocumentMode = js.Any.fromFunction1(getDocumentMode), getDocumentTypeNodeName = js.Any.fromFunction1(getDocumentTypeNodeName), getDocumentTypeNodePublicId = js.Any.fromFunction1(getDocumentTypeNodePublicId), getDocumentTypeNodeSystemId = js.Any.fromFunction1(getDocumentTypeNodeSystemId), getFirstChild = js.Any.fromFunction1(getFirstChild), getNamespaceURI = js.Any.fromFunction1(getNamespaceURI), getParentNode = js.Any.fromFunction1(getParentNode), getTagName = js.Any.fromFunction1(getTagName), getTemplateContent = js.Any.fromFunction1(getTemplateContent), getTextNodeContent = js.Any.fromFunction1(getTextNodeContent), insertBefore = js.Any.fromFunction3(insertBefore), insertText = js.Any.fromFunction2(insertText), insertTextBefore = js.Any.fromFunction3(insertTextBefore), isCommentNode = js.Any.fromFunction1(isCommentNode), isDocumentTypeNode = js.Any.fromFunction1(isDocumentTypeNode), isElementNode = js.Any.fromFunction1(isElementNode), isTextNode = js.Any.fromFunction1(isTextNode), setDocumentMode = js.Any.fromFunction2(setDocumentMode), setDocumentType = js.Any.fromFunction4(setDocumentType), setTemplateContent = js.Any.fromFunction2(setTemplateContent))
  
    __obj.asInstanceOf[TreeAdapter]
  }
}

