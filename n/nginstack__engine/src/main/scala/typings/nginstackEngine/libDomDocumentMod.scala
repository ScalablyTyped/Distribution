package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomDocumentMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/Document", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Document {
    
    /* CompleteClass */
    override def createAttribute(name: String): Attr = js.native
    
    /* CompleteClass */
    override def createCDATASection(data: String): CDATASection = js.native
    
    /* CompleteClass */
    override def createComment(data: String): Comment = js.native
    
    /* CompleteClass */
    override def createDocumentFragment(): DocumentFragment = js.native
    
    /* CompleteClass */
    override def createElement(tagName: String): Element = js.native
    
    /* CompleteClass */
    override def createEntityReference(name: String): EntityReference = js.native
    
    /* CompleteClass */
    override def createProcessingInstruction(target: String, data: String): ProcessingInstruction = js.native
    
    /* CompleteClass */
    override def createTextNode(data: String): Text = js.native
    
    /* CompleteClass */
    override val doctype: DocumentType = js.native
    
    /* CompleteClass */
    var documentElement: Element = js.native
    
    /* CompleteClass */
    override def getElementById(elementId: String): Element = js.native
    
    /* CompleteClass */
    override def getElementsByTagName(tagName: String): NodeList = js.native
    
    /* CompleteClass */
    override def load(path: String): Boolean = js.native
    
    /* CompleteClass */
    override def loadXML(xml: String): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/Document", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Attr = typings.nginstackEngine.libDomAttrMod.^
  
  type CDATASection = typings.nginstackEngine.libDomCdatasectionMod.^
  
  type Comment = typings.nginstackEngine.libDomCommentMod.^
  
  trait Document extends StObject {
    
    def createAttribute(name: String): Attr
    
    def createCDATASection(data: String): CDATASection
    
    def createComment(data: String): Comment
    
    def createDocumentFragment(): DocumentFragment
    
    def createElement(tagName: String): Element
    
    def createEntityReference(name: String): EntityReference
    
    def createProcessingInstruction(target: String, data: String): ProcessingInstruction
    
    def createTextNode(data: String): Text
    
    val doctype: DocumentType
    
    var documentElement: Element
    
    def getElementById(elementId: String): Element
    
    def getElementsByTagName(tagName: String): NodeList
    
    def load(path: String): Boolean
    
    def loadXML(xml: String): Unit
  }
  object Document {
    
    inline def apply(
      createAttribute: String => Attr,
      createCDATASection: String => CDATASection,
      createComment: String => Comment,
      createDocumentFragment: () => DocumentFragment,
      createElement: String => Element,
      createEntityReference: String => EntityReference,
      createProcessingInstruction: (String, String) => ProcessingInstruction,
      createTextNode: String => Text,
      doctype: DocumentType,
      documentElement: Element,
      getElementById: String => Element,
      getElementsByTagName: String => NodeList,
      load: String => Boolean,
      loadXML: String => Unit
    ): Document = {
      val __obj = js.Dynamic.literal(createAttribute = js.Any.fromFunction1(createAttribute), createCDATASection = js.Any.fromFunction1(createCDATASection), createComment = js.Any.fromFunction1(createComment), createDocumentFragment = js.Any.fromFunction0(createDocumentFragment), createElement = js.Any.fromFunction1(createElement), createEntityReference = js.Any.fromFunction1(createEntityReference), createProcessingInstruction = js.Any.fromFunction2(createProcessingInstruction), createTextNode = js.Any.fromFunction1(createTextNode), doctype = doctype.asInstanceOf[js.Any], documentElement = documentElement.asInstanceOf[js.Any], getElementById = js.Any.fromFunction1(getElementById), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), load = js.Any.fromFunction1(load), loadXML = js.Any.fromFunction1(loadXML))
      __obj.asInstanceOf[Document]
    }
    
    extension [Self <: Document](x: Self) {
      
      inline def setCreateAttribute(value: String => Attr): Self = StObject.set(x, "createAttribute", js.Any.fromFunction1(value))
      
      inline def setCreateCDATASection(value: String => CDATASection): Self = StObject.set(x, "createCDATASection", js.Any.fromFunction1(value))
      
      inline def setCreateComment(value: String => Comment): Self = StObject.set(x, "createComment", js.Any.fromFunction1(value))
      
      inline def setCreateDocumentFragment(value: () => DocumentFragment): Self = StObject.set(x, "createDocumentFragment", js.Any.fromFunction0(value))
      
      inline def setCreateElement(value: String => Element): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
      
      inline def setCreateEntityReference(value: String => EntityReference): Self = StObject.set(x, "createEntityReference", js.Any.fromFunction1(value))
      
      inline def setCreateProcessingInstruction(value: (String, String) => ProcessingInstruction): Self = StObject.set(x, "createProcessingInstruction", js.Any.fromFunction2(value))
      
      inline def setCreateTextNode(value: String => Text): Self = StObject.set(x, "createTextNode", js.Any.fromFunction1(value))
      
      inline def setDoctype(value: DocumentType): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      inline def setDocumentElement(value: Element): Self = StObject.set(x, "documentElement", value.asInstanceOf[js.Any])
      
      inline def setGetElementById(value: String => Element): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
      
      inline def setGetElementsByTagName(value: String => NodeList): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
      
      inline def setLoad(value: String => Boolean): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadXML(value: String => Unit): Self = StObject.set(x, "loadXML", js.Any.fromFunction1(value))
    }
  }
  
  type DocumentFragment = typings.nginstackEngine.libDomDocumentFragmentMod.^
  
  type DocumentType = typings.nginstackEngine.libDomDocumentTypeMod.^
  
  type Element = typings.nginstackEngine.libDomElementMod.^
  
  type EntityReference = typings.nginstackEngine.libDomEntityReferenceMod.^
  
  type NodeList = typings.nginstackEngine.libDomNodeListMod.^
  
  type ProcessingInstruction = typings.nginstackEngine.libDomProcessingInstructionMod.^
  
  type Text = typings.nginstackEngine.libDomTextMod.^
}
