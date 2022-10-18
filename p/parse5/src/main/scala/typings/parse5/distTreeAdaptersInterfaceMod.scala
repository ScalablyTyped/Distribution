package typings.parse5

import typings.parse5.anon.PartialElementLocationAttrs
import typings.parse5.distCommonHtmlMod.DOCUMENT_MODE
import typings.parse5.distCommonHtmlMod.NS
import typings.parse5.distCommonTokenMod.Attribute
import typings.parse5.distCommonTokenMod.ElementLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTreeAdaptersInterfaceMod {
  
  @js.native
  trait TreeAdapter[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] extends StObject {
    
    /**
      * Copies attributes to the given element. Only attributes that are not yet present in the element are copied.
      *
      * @param recipient - Element to copy attributes into.
      * @param attrs - Attributes to copy.
      */
    @JSName("adoptAttributes")
    def adoptAttributes_element(
      recipient: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      attrs: js.Array[Attribute]
    ): Unit = js.native
    
    /**
      * Appends a child node to the given parent node.
      *
      * @param parentNode - Parent node.
      * @param newNode -  Child node.
      */
    def appendChild(
      parentNode: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      newNode: /* import warning: importer.ImportType#apply Failed type conversion: T['childNode'] */ js.Any
    ): Unit = js.native
    
    /**
      * Creates a comment node.
      *
      * @param data - Comment text.
      */
    def createCommentNode(data: String): /* import warning: importer.ImportType#apply Failed type conversion: T['commentNode'] */ js.Any = js.native
    
    /**
      * Creates a document node.
      */
    def createDocument(): /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = js.native
    
    /**
      * Creates a document fragment node.
      */
    def createDocumentFragment(): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = js.native
    
    /**
      * Creates an element node.
      *
      * @param tagName - Tag name of the element.
      * @param namespaceURI - Namespace of the element.
      * @param attrs - Attribute name-value pair array. Foreign attributes may contain `namespace` and `prefix` fields as well.
      */
    def createElement(tagName: String, namespaceURI: NS, attrs: js.Array[Attribute]): /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any = js.native
    
    /**
      * Removes a node from its parent.
      *
      * @param node - Node to remove.
      */
    @JSName("detachNode")
    def detachNode_childNode(
      node: /* import warning: importer.ImportType#apply Failed type conversion: T['childNode'] */ js.Any
    ): Unit = js.native
    
    /**
      * Returns the given element's attributes in an array, in the form of name-value pairs.
      * Foreign attributes may contain `namespace` and `prefix` fields as well.
      *
      * @param element - Element.
      */
    @JSName("getAttrList")
    def getAttrList_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): js.Array[Attribute] = js.native
    
    /**
      * Returns the given node's children in an array.
      *
      * @param node - Node.
      */
    @JSName("getChildNodes")
    def getChildNodes_parentNode(
      node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
    ): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T['childNode'] */ js.Any
      ] = js.native
    
    /**
      * Returns the given comment node's content.
      *
      * @param commentNode - Comment node.
      */
    @JSName("getCommentNodeContent")
    def getCommentNodeContent_commentNode(
      commentNode: /* import warning: importer.ImportType#apply Failed type conversion: T['commentNode'] */ js.Any
    ): String = js.native
    
    /**
      * Returns [document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
      *
      * @param document - Document node.
      */
    @JSName("getDocumentMode")
    def getDocumentMode_document(
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any
    ): DOCUMENT_MODE = js.native
    
    /**
      * Returns the given document type node's name.
      *
      * @param doctypeNode - Document type node.
      */
    @JSName("getDocumentTypeNodeName")
    def getDocumentTypeNodeName_documentType(
      doctypeNode: /* import warning: importer.ImportType#apply Failed type conversion: T['documentType'] */ js.Any
    ): String = js.native
    
    /**
      * Returns the given document type node's public identifier.
      *
      * @param doctypeNode - Document type node.
      */
    @JSName("getDocumentTypeNodePublicId")
    def getDocumentTypeNodePublicId_documentType(
      doctypeNode: /* import warning: importer.ImportType#apply Failed type conversion: T['documentType'] */ js.Any
    ): String = js.native
    
    /**
      * Returns the given document type node's system identifier.
      *
      * @param doctypeNode - Document type node.
      */
    @JSName("getDocumentTypeNodeSystemId")
    def getDocumentTypeNodeSystemId_documentType(
      doctypeNode: /* import warning: importer.ImportType#apply Failed type conversion: T['documentType'] */ js.Any
    ): String = js.native
    
    /**
      * Returns the first child of the given node.
      *
      * @param node - Node.
      */
    @JSName("getFirstChild")
    def getFirstChild_parentNode(
      node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
    ): (/* import warning: importer.ImportType#apply Failed type conversion: T['childNode'] */ js.Any) | Null = js.native
    
    /**
      * Returns the given element's namespace.
      *
      * @param element - Element.
      */
    @JSName("getNamespaceURI")
    def getNamespaceURI_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): NS = js.native
    
    /**
      * Returns the given node's source code location information.
      *
      * @param node - Node.
      */
    @JSName("getNodeSourceCodeLocation")
    def getNodeSourceCodeLocation_node(node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any): js.UndefOr[ElementLocation | Null] = js.native
    
    /**
      * Returns the given node's parent.
      *
      * @param node - Node.
      */
    @JSName("getParentNode")
    def getParentNode_node(node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any): (/* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any) | Null = js.native
    
    /**
      * Returns the given element's tag name.
      *
      * @param element - Element.
      */
    @JSName("getTagName")
    def getTagName_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): String = js.native
    
    /**
      * Returns the `<template>` element content element.
      *
      * @param templateElement - `<template>` element.
      */
    @JSName("getTemplateContent")
    def getTemplateContent_template(
      templateElement: /* import warning: importer.ImportType#apply Failed type conversion: T['template'] */ js.Any
    ): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = js.native
    
    /**
      * Returns the given text node's content.
      *
      * @param textNode - Text node.
      */
    @JSName("getTextNodeContent")
    def getTextNodeContent_textNode(
      textNode: /* import warning: importer.ImportType#apply Failed type conversion: T['textNode'] */ js.Any
    ): String = js.native
    
    /**
      * Inserts a child node to the given parent node before the given reference node.
      *
      * @param parentNode - Parent node.
      * @param newNode -  Child node.
      * @param referenceNode -  Reference node.
      */
    def insertBefore(
      parentNode: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      newNode: /* import warning: importer.ImportType#apply Failed type conversion: T['childNode'] */ js.Any,
      referenceNode: /* import warning: importer.ImportType#apply Failed type conversion: T['childNode'] */ js.Any
    ): Unit = js.native
    
    /**
      * Inserts text into a sibling node that goes before the reference node. If this sibling node is the text node,
      * the provided text will be appended to the text node content. Otherwise, inserts a new sibling text node with
      * the given text before the reference node.
      *
      * @param parentNode - Node to insert text into.
      * @param text - Text to insert.
      * @param referenceNode - Node to insert text before.
      */
    def insertTextBefore(
      parentNode: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      text: String,
      referenceNode: /* import warning: importer.ImportType#apply Failed type conversion: T['childNode'] */ js.Any
    ): Unit = js.native
    
    /**
      * Inserts text into a node. If the last child of the node is a text node, the provided text will be appended to the
      * text node content. Otherwise, inserts a new text node with the given text.
      *
      * @param parentNode - Node to insert text into.
      * @param text - Text to insert.
      */
    @JSName("insertText")
    def insertText_parentNode(
      parentNode: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      text: String
    ): Unit = js.native
    
    /**
      * Determines if the given node is a comment node.
      *
      * @param node - Node.
      */
    @JSName("isCommentNode")
    def isCommentNode_node(node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any): Boolean = js.native
    
    /**
      * Determines if the given node is a document type node.
      *
      * @param node - Node.
      */
    @JSName("isDocumentTypeNode")
    def isDocumentTypeNode_node(node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any): Boolean = js.native
    
    /**
      * Determines if the given node is an element.
      *
      * @param node - Node.
      */
    @JSName("isElementNode")
    def isElementNode_node(node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any): Boolean = js.native
    
    /**
      * Determines if the given node is a text node.
      *
      * @param node - Node.
      */
    @JSName("isTextNode")
    def isTextNode_node(node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any): Boolean = js.native
    
    /**
      * Optional callback for elements being popped from the stack of open elements.
      *
      * @param item The element being popped.
      */
    var onItemPop: js.UndefOr[
        js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* item */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ /* newTop */ js.Any, 
          Unit
        ]
      ] = js.native
    
    /**
      * Optional callback for elements being pushed to the stack of open elements.
      *
      * @param element The element being pushed to the stack of open elements.
      */
    var onItemPush: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* item */ js.Any, 
          Unit
        ]
      ] = js.native
    
    /**
      * Sets the [document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
      *
      * @param document - Document node.
      * @param mode - Document mode.
      */
    @JSName("setDocumentMode")
    def setDocumentMode_document(
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      mode: DOCUMENT_MODE
    ): Unit = js.native
    
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
    @JSName("setDocumentType")
    def setDocumentType_document(
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      name: String,
      publicId: String,
      systemId: String
    ): Unit = js.native
    
    /**
      * Attaches source code location information to the node.
      *
      * @param node - Node.
      */
    @JSName("setNodeSourceCodeLocation")
    def setNodeSourceCodeLocation_node(node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any): Unit = js.native
    @JSName("setNodeSourceCodeLocation")
    def setNodeSourceCodeLocation_node(
      node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any,
      location: ElementLocation
    ): Unit = js.native
    
    /**
      * Sets the `<template>` element content element.
      *
      * @param templateElement - `<template>` element.
      * @param contentElement -  Content element.
      */
    def setTemplateContent(
      templateElement: /* import warning: importer.ImportType#apply Failed type conversion: T['template'] */ js.Any,
      contentElement: /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any
    ): Unit = js.native
    
    /**
      * Updates the source code location information of the node.
      *
      * @param node - Node.
      */
    @JSName("updateNodeSourceCodeLocation")
    def updateNodeSourceCodeLocation_node(
      node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any,
      location: PartialElementLocationAttrs
    ): Unit = js.native
  }
  
  trait TreeAdapterTypeMap[Node, ParentNode, ChildNode, Document, DocumentFragment, Element, CommentNode, TextNode, Template, DocumentType] extends StObject {
    
    var childNode: ChildNode
    
    var commentNode: CommentNode
    
    var document: Document
    
    var documentFragment: DocumentFragment
    
    var documentType: DocumentType
    
    var element: Element
    
    var node: Node
    
    var parentNode: ParentNode
    
    var template: Template
    
    var textNode: TextNode
  }
  object TreeAdapterTypeMap {
    
    inline def apply[Node, ParentNode, ChildNode, Document, DocumentFragment, Element, CommentNode, TextNode, Template, DocumentType](
      childNode: ChildNode,
      commentNode: CommentNode,
      document: Document,
      documentFragment: DocumentFragment,
      documentType: DocumentType,
      element: Element,
      node: Node,
      parentNode: ParentNode,
      template: Template,
      textNode: TextNode
    ): TreeAdapterTypeMap[
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
      ] = {
      val __obj = js.Dynamic.literal(childNode = childNode.asInstanceOf[js.Any], commentNode = commentNode.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], documentFragment = documentFragment.asInstanceOf[js.Any], documentType = documentType.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], textNode = textNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeAdapterTypeMap[
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
      ]]
    }
    
    extension [Self <: TreeAdapterTypeMap[?, ?, ?, ?, ?, ?, ?, ?, ?, ?], Node, ParentNode, ChildNode, Document, DocumentFragment, Element, CommentNode, TextNode, Template, DocumentType](x: Self & (TreeAdapterTypeMap[
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
          ])) {
      
      inline def setChildNode(value: ChildNode): Self = StObject.set(x, "childNode", value.asInstanceOf[js.Any])
      
      inline def setCommentNode(value: CommentNode): Self = StObject.set(x, "commentNode", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentFragment(value: DocumentFragment): Self = StObject.set(x, "documentFragment", value.asInstanceOf[js.Any])
      
      inline def setDocumentType(value: DocumentType): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParentNode(value: ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTextNode(value: TextNode): Self = StObject.set(x, "textNode", value.asInstanceOf[js.Any])
    }
  }
}
