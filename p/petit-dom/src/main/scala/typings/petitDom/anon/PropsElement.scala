package typings.petitDom.anon

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.Key
import typings.petitDom.petitDomStrings.a
import typings.petitDom.petitDomStrings.fullscreenchange
import typings.petitDom.petitDomStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typings.std.Animation
import typings.std.Attr
import typings.std.ChildNode
import typings.std.DOMRect
import typings.std.DOMRectList
import typings.std.DOMTokenList
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLAnchorElement
import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.InsertPosition
import typings.std.NamedNodeMap
import typings.std.Node
import typings.std.NodeListOf
import typings.std.ParentNode
import typings.std.ShadowRoot
import typings.std.ShadowRootInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined petit-dom.petit-dom.PetitDom.Props<std.Element> */
trait PropsElement extends StObject {
  
  var ATTRIBUTE_NODE: js.UndefOr[Double] = js.undefined
  
  var CDATA_SECTION_NODE: js.UndefOr[Double] = js.undefined
  
  var COMMENT_NODE: js.UndefOr[Double] = js.undefined
  
  var DOCUMENT_FRAGMENT_NODE: js.UndefOr[Double] = js.undefined
  
  var DOCUMENT_NODE: js.UndefOr[Double] = js.undefined
  
  var DOCUMENT_POSITION_CONTAINED_BY: js.UndefOr[Double] = js.undefined
  
  var DOCUMENT_POSITION_CONTAINS: js.UndefOr[Double] = js.undefined
  
  var DOCUMENT_POSITION_DISCONNECTED: js.UndefOr[Double] = js.undefined
  
  var DOCUMENT_POSITION_FOLLOWING: js.UndefOr[Double] = js.undefined
  
  var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.UndefOr[Double] = js.undefined
  
  var DOCUMENT_POSITION_PRECEDING: js.UndefOr[Double] = js.undefined
  
  var DOCUMENT_TYPE_NODE: js.UndefOr[Double] = js.undefined
  
  var ELEMENT_NODE: js.UndefOr[Double] = js.undefined
  
  var ENTITY_NODE: js.UndefOr[Double] = js.undefined
  
  var ENTITY_REFERENCE_NODE: js.UndefOr[Double] = js.undefined
  
  var NOTATION_NODE: js.UndefOr[Double] = js.undefined
  
  var PROCESSING_INSTRUCTION_NODE: js.UndefOr[Double] = js.undefined
  
  var TEXT_NODE: js.UndefOr[Double] = js.undefined
  
  var addEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any], 
      Unit
    ]
  ] = js.undefined
  
  var after: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  
  var animate: js.UndefOr[js.Function0[Animation]] = js.undefined
  
  var append: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  
  var appendChild: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.undefined
  
  var assignedSlot: js.UndefOr[HTMLSlotElement | Null] = js.undefined
  
  var attachShadow: js.UndefOr[js.Function1[/* init */ ShadowRootInit, ShadowRoot]] = js.undefined
  
  var attributes: js.UndefOr[NamedNodeMap] = js.undefined
  
  var baseURI: js.UndefOr[String] = js.undefined
  
  var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  
  var childElementCount: js.UndefOr[Double] = js.undefined
  
  var childNodes: js.UndefOr[NodeListOf[ChildNode]] = js.undefined
  
  var children: js.UndefOr[HTMLCollection] = js.undefined
  
  var classList: js.UndefOr[DOMTokenList] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var clientHeight: js.UndefOr[Double] = js.undefined
  
  var clientLeft: js.UndefOr[Double] = js.undefined
  
  var clientTop: js.UndefOr[Double] = js.undefined
  
  var clientWidth: js.UndefOr[Double] = js.undefined
  
  var cloneNode: js.UndefOr[js.Function0[Node]] = js.undefined
  
  var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  
  var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.undefined
  
  var contains: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var content: js.UndefOr[Content | js.Array[Content]] = js.undefined
  
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.undefined
  
  var firstChild: js.UndefOr[ChildNode | Null] = js.undefined
  
  var firstElementChild: js.UndefOr[Element | Null] = js.undefined
  
  var getAnimations: js.UndefOr[js.Function0[js.Array[Animation]]] = js.undefined
  
  var getAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, String | Null]] = js.undefined
  
  var getAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, String | Null]] = js.undefined
  
  var getAttributeNames: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
  
  var getAttributeNode: js.UndefOr[js.Function1[/* qualifiedName */ String, Attr | Null]] = js.undefined
  
  var getAttributeNodeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Attr | Null]] = js.undefined
  
  var getBoundingClientRect: js.UndefOr[js.Function0[DOMRect]] = js.undefined
  
  var getClientRects: js.UndefOr[js.Function0[DOMRectList]] = js.undefined
  
  var getElementsByClassName: js.UndefOr[js.Function1[/* classNames */ String, HTMLCollectionOf[Element]]] = js.undefined
  
  var getElementsByTagName: js.UndefOr[js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]]] = js.undefined
  
  var getElementsByTagNameNS: js.UndefOr[
    js.Function2[
      httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
      /* localName */ String, 
      HTMLCollectionOf[HTMLElement]
    ]
  ] = js.undefined
  
  var getRootNode: js.UndefOr[js.Function0[Node]] = js.undefined
  
  var hasAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  
  var hasAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Boolean]] = js.undefined
  
  var hasAttributes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var hasPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Boolean]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var innerHTML: js.UndefOr[String] = js.undefined
  
  var insertAdjacentElement: js.UndefOr[
    js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  ] = js.undefined
  
  var insertAdjacentHTML: js.UndefOr[js.Function2[/* where */ InsertPosition, /* html */ String, Unit]] = js.undefined
  
  var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* text */ String, Unit]] = js.undefined
  
  var insertBefore: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.undefined
  
  var isConnected: js.UndefOr[Boolean] = js.undefined
  
  var isDefaultNamespace: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var isEqualNode: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var isSameNode: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
  
  var lastChild: js.UndefOr[ChildNode | Null] = js.undefined
  
  var lastElementChild: js.UndefOr[Element | Null] = js.undefined
  
  var localName: js.UndefOr[String] = js.undefined
  
  var lookupNamespaceURI: js.UndefOr[js.Function0[String | Null]] = js.undefined
  
  var lookupPrefix: js.UndefOr[js.Function0[String | Null]] = js.undefined
  
  var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
  
  var msGetRegionContent: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var namespaceURI: js.UndefOr[String | Null] = js.undefined
  
  var nextElementSibling: js.UndefOr[Element | Null] = js.undefined
  
  var nextSibling: js.UndefOr[ChildNode | Null] = js.undefined
  
  var nodeName: js.UndefOr[String] = js.undefined
  
  var nodeType: js.UndefOr[Double] = js.undefined
  
  var nodeValue: js.UndefOr[String | Null] = js.undefined
  
  var normalize: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onfullscreenchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onfullscreenerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var outerHTML: js.UndefOr[String] = js.undefined
  
  var ownerDocument: js.UndefOr[Document] = js.undefined
  
  var parentElement: js.UndefOr[HTMLElement | Null] = js.undefined
  
  var parentNode: js.UndefOr[(Node & ParentNode) | Null] = js.undefined
  
  var prefix: js.UndefOr[String | Null] = js.undefined
  
  var prepend: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  
  var previousElementSibling: js.UndefOr[Element | Null] = js.undefined
  
  var previousSibling: js.UndefOr[ChildNode | Null] = js.undefined
  
  var querySelector: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  
  var querySelectorAll: js.UndefOr[js.Function1[a, NodeListOf[HTMLAnchorElement]]] = js.undefined
  
  var releasePointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
  
  var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var removeAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Unit]] = js.undefined
  
  var removeAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Unit]] = js.undefined
  
  var removeAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr]] = js.undefined
  
  var removeChild: js.UndefOr[js.Function1[/* oldChild */ Node, Node]] = js.undefined
  
  var removeEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any], 
      Unit
    ]
  ] = js.undefined
  
  var replaceChild: js.UndefOr[js.Function2[/* newChild */ Node, /* oldChild */ Node, Node]] = js.undefined
  
  var replaceWith: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  
  var requestFullscreen: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  var requestPointerLock: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var scroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var scrollBy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var scrollHeight: js.UndefOr[Double] = js.undefined
  
  var scrollIntoView: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var scrollLeft: js.UndefOr[Double] = js.undefined
  
  var scrollTo: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var scrollTop: js.UndefOr[Double] = js.undefined
  
  var scrollWidth: js.UndefOr[Double] = js.undefined
  
  var setAttribute: js.UndefOr[js.Function2[/* qualifiedName */ String, /* value */ String, Unit]] = js.undefined
  
  var setAttributeNS: js.UndefOr[
    js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
  ] = js.undefined
  
  var setAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  
  var setAttributeNodeNS: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  
  var setPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
  
  var shadowRoot: js.UndefOr[ShadowRoot | Null] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
  
  var tagName: js.UndefOr[String] = js.undefined
  
  var textContent: js.UndefOr[String | Null] = js.undefined
  
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
}
object PropsElement {
  
  inline def apply(): PropsElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsElement]
  }
  
  extension [Self <: PropsElement](x: Self) {
    
    inline def setATTRIBUTE_NODE(value: Double): Self = StObject.set(x, "ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
    
    inline def setATTRIBUTE_NODEUndefined: Self = StObject.set(x, "ATTRIBUTE_NODE", js.undefined)
    
    inline def setAddEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsElement, /* ev */ Event, js.Any]) => Unit
    ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setAddEventListenerUndefined: Self = StObject.set(x, "addEventListener", js.undefined)
    
    inline def setAfter(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAnimate(value: () => Animation): Self = StObject.set(x, "animate", js.Any.fromFunction0(value))
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAppend(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setAppendChild(value: /* newChild */ Node => Node): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setAppendChildUndefined: Self = StObject.set(x, "appendChild", js.undefined)
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setAssignedSlot(value: HTMLSlotElement): Self = StObject.set(x, "assignedSlot", value.asInstanceOf[js.Any])
    
    inline def setAssignedSlotNull: Self = StObject.set(x, "assignedSlot", null)
    
    inline def setAssignedSlotUndefined: Self = StObject.set(x, "assignedSlot", js.undefined)
    
    inline def setAttachShadow(value: /* init */ ShadowRootInit => ShadowRoot): Self = StObject.set(x, "attachShadow", js.Any.fromFunction1(value))
    
    inline def setAttachShadowUndefined: Self = StObject.set(x, "attachShadow", js.undefined)
    
    inline def setAttributes(value: NamedNodeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setBaseURI(value: String): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
    
    inline def setBaseURIUndefined: Self = StObject.set(x, "baseURI", js.undefined)
    
    inline def setBefore(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setCDATA_SECTION_NODE(value: Double): Self = StObject.set(x, "CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
    
    inline def setCDATA_SECTION_NODEUndefined: Self = StObject.set(x, "CDATA_SECTION_NODE", js.undefined)
    
    inline def setCOMMENT_NODE(value: Double): Self = StObject.set(x, "COMMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def setCOMMENT_NODEUndefined: Self = StObject.set(x, "COMMENT_NODE", js.undefined)
    
    inline def setChildElementCount(value: Double): Self = StObject.set(x, "childElementCount", value.asInstanceOf[js.Any])
    
    inline def setChildElementCountUndefined: Self = StObject.set(x, "childElementCount", js.undefined)
    
    inline def setChildNodes(value: NodeListOf[ChildNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setChildNodesUndefined: Self = StObject.set(x, "childNodes", js.undefined)
    
    inline def setChildren(value: HTMLCollection): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassList(value: DOMTokenList): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
    
    inline def setClassListUndefined: Self = StObject.set(x, "classList", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    inline def setClientHeightUndefined: Self = StObject.set(x, "clientHeight", js.undefined)
    
    inline def setClientLeft(value: Double): Self = StObject.set(x, "clientLeft", value.asInstanceOf[js.Any])
    
    inline def setClientLeftUndefined: Self = StObject.set(x, "clientLeft", js.undefined)
    
    inline def setClientTop(value: Double): Self = StObject.set(x, "clientTop", value.asInstanceOf[js.Any])
    
    inline def setClientTopUndefined: Self = StObject.set(x, "clientTop", js.undefined)
    
    inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    inline def setClientWidthUndefined: Self = StObject.set(x, "clientWidth", js.undefined)
    
    inline def setCloneNode(value: () => Node): Self = StObject.set(x, "cloneNode", js.Any.fromFunction0(value))
    
    inline def setCloneNodeUndefined: Self = StObject.set(x, "cloneNode", js.undefined)
    
    inline def setClosest(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
    
    inline def setClosestUndefined: Self = StObject.set(x, "closest", js.undefined)
    
    inline def setCompareDocumentPosition(value: /* other */ Node => Double): Self = StObject.set(x, "compareDocumentPosition", js.Any.fromFunction1(value))
    
    inline def setCompareDocumentPositionUndefined: Self = StObject.set(x, "compareDocumentPosition", js.undefined)
    
    inline def setContains(value: () => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction0(value))
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setContent(value: Content | js.Array[Content]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: Content*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    inline def setDOCUMENT_FRAGMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_FRAGMENT_NODEUndefined: Self = StObject.set(x, "DOCUMENT_FRAGMENT_NODE", js.undefined)
    
    inline def setDOCUMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_NODEUndefined: Self = StObject.set(x, "DOCUMENT_NODE", js.undefined)
    
    inline def setDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_CONTAINED_BYUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINED_BY", js.undefined)
    
    inline def setDOCUMENT_POSITION_CONTAINS(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_CONTAINSUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINS", js.undefined)
    
    inline def setDOCUMENT_POSITION_DISCONNECTED(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_DISCONNECTEDUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_DISCONNECTED", js.undefined)
    
    inline def setDOCUMENT_POSITION_FOLLOWING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_FOLLOWINGUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_FOLLOWING", js.undefined)
    
    inline def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFICUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", js.undefined)
    
    inline def setDOCUMENT_POSITION_PRECEDING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_PRECEDINGUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_PRECEDING", js.undefined)
    
    inline def setDOCUMENT_TYPE_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_TYPE_NODEUndefined: Self = StObject.set(x, "DOCUMENT_TYPE_NODE", js.undefined)
    
    inline def setDispatchEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setDispatchEventUndefined: Self = StObject.set(x, "dispatchEvent", js.undefined)
    
    inline def setELEMENT_NODE(value: Double): Self = StObject.set(x, "ELEMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def setELEMENT_NODEUndefined: Self = StObject.set(x, "ELEMENT_NODE", js.undefined)
    
    inline def setENTITY_NODE(value: Double): Self = StObject.set(x, "ENTITY_NODE", value.asInstanceOf[js.Any])
    
    inline def setENTITY_NODEUndefined: Self = StObject.set(x, "ENTITY_NODE", js.undefined)
    
    inline def setENTITY_REFERENCE_NODE(value: Double): Self = StObject.set(x, "ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
    
    inline def setENTITY_REFERENCE_NODEUndefined: Self = StObject.set(x, "ENTITY_REFERENCE_NODE", js.undefined)
    
    inline def setFirstChild(value: ChildNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    inline def setFirstChildNull: Self = StObject.set(x, "firstChild", null)
    
    inline def setFirstChildUndefined: Self = StObject.set(x, "firstChild", js.undefined)
    
    inline def setFirstElementChild(value: Element): Self = StObject.set(x, "firstElementChild", value.asInstanceOf[js.Any])
    
    inline def setFirstElementChildNull: Self = StObject.set(x, "firstElementChild", null)
    
    inline def setFirstElementChildUndefined: Self = StObject.set(x, "firstElementChild", js.undefined)
    
    inline def setGetAnimations(value: () => js.Array[Animation]): Self = StObject.set(x, "getAnimations", js.Any.fromFunction0(value))
    
    inline def setGetAnimationsUndefined: Self = StObject.set(x, "getAnimations", js.undefined)
    
    inline def setGetAttribute(value: /* qualifiedName */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self = StObject.set(x, "getAttributeNS", js.Any.fromFunction2(value))
    
    inline def setGetAttributeNSUndefined: Self = StObject.set(x, "getAttributeNS", js.undefined)
    
    inline def setGetAttributeNames(value: () => js.Array[String]): Self = StObject.set(x, "getAttributeNames", js.Any.fromFunction0(value))
    
    inline def setGetAttributeNamesUndefined: Self = StObject.set(x, "getAttributeNames", js.undefined)
    
    inline def setGetAttributeNode(value: /* qualifiedName */ String => Attr | Null): Self = StObject.set(x, "getAttributeNode", js.Any.fromFunction1(value))
    
    inline def setGetAttributeNodeNS(value: (/* namespace */ String, /* localName */ String) => Attr | Null): Self = StObject.set(x, "getAttributeNodeNS", js.Any.fromFunction2(value))
    
    inline def setGetAttributeNodeNSUndefined: Self = StObject.set(x, "getAttributeNodeNS", js.undefined)
    
    inline def setGetAttributeNodeUndefined: Self = StObject.set(x, "getAttributeNode", js.undefined)
    
    inline def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
    
    inline def setGetBoundingClientRect(value: () => DOMRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
    
    inline def setGetBoundingClientRectUndefined: Self = StObject.set(x, "getBoundingClientRect", js.undefined)
    
    inline def setGetClientRects(value: () => DOMRectList): Self = StObject.set(x, "getClientRects", js.Any.fromFunction0(value))
    
    inline def setGetClientRectsUndefined: Self = StObject.set(x, "getClientRects", js.undefined)
    
    inline def setGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[Element]): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
    
    inline def setGetElementsByClassNameUndefined: Self = StObject.set(x, "getElementsByClassName", js.undefined)
    
    inline def setGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
    
    inline def setGetElementsByTagNameNS(
      value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
    ): Self = StObject.set(x, "getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    inline def setGetElementsByTagNameNSUndefined: Self = StObject.set(x, "getElementsByTagNameNS", js.undefined)
    
    inline def setGetElementsByTagNameUndefined: Self = StObject.set(x, "getElementsByTagName", js.undefined)
    
    inline def setGetRootNode(value: () => Node): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
    
    inline def setGetRootNodeUndefined: Self = StObject.set(x, "getRootNode", js.undefined)
    
    inline def setHasAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
    
    inline def setHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self = StObject.set(x, "hasAttributeNS", js.Any.fromFunction2(value))
    
    inline def setHasAttributeNSUndefined: Self = StObject.set(x, "hasAttributeNS", js.undefined)
    
    inline def setHasAttributeUndefined: Self = StObject.set(x, "hasAttribute", js.undefined)
    
    inline def setHasAttributes(value: () => Boolean): Self = StObject.set(x, "hasAttributes", js.Any.fromFunction0(value))
    
    inline def setHasAttributesUndefined: Self = StObject.set(x, "hasAttributes", js.undefined)
    
    inline def setHasChildNodes(value: () => Boolean): Self = StObject.set(x, "hasChildNodes", js.Any.fromFunction0(value))
    
    inline def setHasChildNodesUndefined: Self = StObject.set(x, "hasChildNodes", js.undefined)
    
    inline def setHasPointerCapture(value: /* pointerId */ Double => Boolean): Self = StObject.set(x, "hasPointerCapture", js.Any.fromFunction1(value))
    
    inline def setHasPointerCaptureUndefined: Self = StObject.set(x, "hasPointerCapture", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
    
    inline def setInnerHTMLUndefined: Self = StObject.set(x, "innerHTML", js.undefined)
    
    inline def setInsertAdjacentElement(value: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null): Self = StObject.set(x, "insertAdjacentElement", js.Any.fromFunction2(value))
    
    inline def setInsertAdjacentElementUndefined: Self = StObject.set(x, "insertAdjacentElement", js.undefined)
    
    inline def setInsertAdjacentHTML(value: (/* where */ InsertPosition, /* html */ String) => Unit): Self = StObject.set(x, "insertAdjacentHTML", js.Any.fromFunction2(value))
    
    inline def setInsertAdjacentHTMLUndefined: Self = StObject.set(x, "insertAdjacentHTML", js.undefined)
    
    inline def setInsertAdjacentText(value: (/* where */ InsertPosition, /* text */ String) => Unit): Self = StObject.set(x, "insertAdjacentText", js.Any.fromFunction2(value))
    
    inline def setInsertAdjacentTextUndefined: Self = StObject.set(x, "insertAdjacentText", js.undefined)
    
    inline def setInsertBefore(value: /* newChild */ Node => Node): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
    
    inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
    
    inline def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    inline def setIsConnectedUndefined: Self = StObject.set(x, "isConnected", js.undefined)
    
    inline def setIsDefaultNamespace(value: () => Boolean): Self = StObject.set(x, "isDefaultNamespace", js.Any.fromFunction0(value))
    
    inline def setIsDefaultNamespaceUndefined: Self = StObject.set(x, "isDefaultNamespace", js.undefined)
    
    inline def setIsEqualNode(value: () => Boolean): Self = StObject.set(x, "isEqualNode", js.Any.fromFunction0(value))
    
    inline def setIsEqualNodeUndefined: Self = StObject.set(x, "isEqualNode", js.undefined)
    
    inline def setIsSameNode(value: () => Boolean): Self = StObject.set(x, "isSameNode", js.Any.fromFunction0(value))
    
    inline def setIsSameNodeUndefined: Self = StObject.set(x, "isSameNode", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLastChild(value: ChildNode): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    inline def setLastChildNull: Self = StObject.set(x, "lastChild", null)
    
    inline def setLastChildUndefined: Self = StObject.set(x, "lastChild", js.undefined)
    
    inline def setLastElementChild(value: Element): Self = StObject.set(x, "lastElementChild", value.asInstanceOf[js.Any])
    
    inline def setLastElementChildNull: Self = StObject.set(x, "lastElementChild", null)
    
    inline def setLastElementChildUndefined: Self = StObject.set(x, "lastElementChild", js.undefined)
    
    inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    inline def setLocalNameUndefined: Self = StObject.set(x, "localName", js.undefined)
    
    inline def setLookupNamespaceURI(value: () => String | Null): Self = StObject.set(x, "lookupNamespaceURI", js.Any.fromFunction0(value))
    
    inline def setLookupNamespaceURIUndefined: Self = StObject.set(x, "lookupNamespaceURI", js.undefined)
    
    inline def setLookupPrefix(value: () => String | Null): Self = StObject.set(x, "lookupPrefix", js.Any.fromFunction0(value))
    
    inline def setLookupPrefixUndefined: Self = StObject.set(x, "lookupPrefix", js.undefined)
    
    inline def setMatches(value: /* selectors */ String => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMsGetRegionContent(value: () => js.Any): Self = StObject.set(x, "msGetRegionContent", js.Any.fromFunction0(value))
    
    inline def setMsGetRegionContentUndefined: Self = StObject.set(x, "msGetRegionContent", js.undefined)
    
    inline def setNOTATION_NODE(value: Double): Self = StObject.set(x, "NOTATION_NODE", value.asInstanceOf[js.Any])
    
    inline def setNOTATION_NODEUndefined: Self = StObject.set(x, "NOTATION_NODE", js.undefined)
    
    inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    inline def setNamespaceURINull: Self = StObject.set(x, "namespaceURI", null)
    
    inline def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
    
    inline def setNextElementSibling(value: Element): Self = StObject.set(x, "nextElementSibling", value.asInstanceOf[js.Any])
    
    inline def setNextElementSiblingNull: Self = StObject.set(x, "nextElementSibling", null)
    
    inline def setNextElementSiblingUndefined: Self = StObject.set(x, "nextElementSibling", js.undefined)
    
    inline def setNextSibling(value: ChildNode): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    inline def setNextSiblingNull: Self = StObject.set(x, "nextSibling", null)
    
    inline def setNextSiblingUndefined: Self = StObject.set(x, "nextSibling", js.undefined)
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
    
    inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
    
    inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    inline def setNodeValueNull: Self = StObject.set(x, "nodeValue", null)
    
    inline def setNodeValueUndefined: Self = StObject.set(x, "nodeValue", js.undefined)
    
    inline def setNormalize(value: () => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    inline def setOnfullscreenchange(value: js.ThisFunction1[PropsElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onfullscreenchange", value.asInstanceOf[js.Any])
    
    inline def setOnfullscreenchangeNull: Self = StObject.set(x, "onfullscreenchange", null)
    
    inline def setOnfullscreenchangeUndefined: Self = StObject.set(x, "onfullscreenchange", js.undefined)
    
    inline def setOnfullscreenerror(value: js.ThisFunction1[PropsElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onfullscreenerror", value.asInstanceOf[js.Any])
    
    inline def setOnfullscreenerrorNull: Self = StObject.set(x, "onfullscreenerror", null)
    
    inline def setOnfullscreenerrorUndefined: Self = StObject.set(x, "onfullscreenerror", js.undefined)
    
    inline def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
    
    inline def setOuterHTMLUndefined: Self = StObject.set(x, "outerHTML", js.undefined)
    
    inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
    
    inline def setPROCESSING_INSTRUCTION_NODE(value: Double): Self = StObject.set(x, "PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
    
    inline def setPROCESSING_INSTRUCTION_NODEUndefined: Self = StObject.set(x, "PROCESSING_INSTRUCTION_NODE", js.undefined)
    
    inline def setParentElement(value: HTMLElement): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    
    inline def setParentElementNull: Self = StObject.set(x, "parentElement", null)
    
    inline def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
    
    inline def setParentNode(value: Node & ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
    
    inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPrepend(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "prepend", js.Any.fromFunction1(value))
    
    inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    
    inline def setPreviousElementSibling(value: Element): Self = StObject.set(x, "previousElementSibling", value.asInstanceOf[js.Any])
    
    inline def setPreviousElementSiblingNull: Self = StObject.set(x, "previousElementSibling", null)
    
    inline def setPreviousElementSiblingUndefined: Self = StObject.set(x, "previousElementSibling", js.undefined)
    
    inline def setPreviousSibling(value: ChildNode): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    inline def setPreviousSiblingNull: Self = StObject.set(x, "previousSibling", null)
    
    inline def setPreviousSiblingUndefined: Self = StObject.set(x, "previousSibling", js.undefined)
    
    inline def setQuerySelector(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
    
    inline def setQuerySelectorAll(value: a => NodeListOf[HTMLAnchorElement]): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
    
    inline def setQuerySelectorAllUndefined: Self = StObject.set(x, "querySelectorAll", js.undefined)
    
    inline def setQuerySelectorUndefined: Self = StObject.set(x, "querySelector", js.undefined)
    
    inline def setReleasePointerCapture(value: /* pointerId */ Double => Unit): Self = StObject.set(x, "releasePointerCapture", js.Any.fromFunction1(value))
    
    inline def setReleasePointerCaptureUndefined: Self = StObject.set(x, "releasePointerCapture", js.undefined)
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setRemoveAttribute(value: /* qualifiedName */ String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
    
    inline def setRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Unit): Self = StObject.set(x, "removeAttributeNS", js.Any.fromFunction2(value))
    
    inline def setRemoveAttributeNSUndefined: Self = StObject.set(x, "removeAttributeNS", js.undefined)
    
    inline def setRemoveAttributeNode(value: /* attr */ Attr => Attr): Self = StObject.set(x, "removeAttributeNode", js.Any.fromFunction1(value))
    
    inline def setRemoveAttributeNodeUndefined: Self = StObject.set(x, "removeAttributeNode", js.undefined)
    
    inline def setRemoveAttributeUndefined: Self = StObject.set(x, "removeAttribute", js.undefined)
    
    inline def setRemoveChild(value: /* oldChild */ Node => Node): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    inline def setRemoveChildUndefined: Self = StObject.set(x, "removeChild", js.undefined)
    
    inline def setRemoveEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsElement, /* ev */ Event, js.Any]) => Unit
    ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    inline def setRemoveEventListenerUndefined: Self = StObject.set(x, "removeEventListener", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setReplaceChild(value: (/* newChild */ Node, /* oldChild */ Node) => Node): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
    
    inline def setReplaceChildUndefined: Self = StObject.set(x, "replaceChild", js.undefined)
    
    inline def setReplaceWith(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
    
    inline def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
    
    inline def setRequestFullscreen(value: () => js.Promise[Unit]): Self = StObject.set(x, "requestFullscreen", js.Any.fromFunction0(value))
    
    inline def setRequestFullscreenUndefined: Self = StObject.set(x, "requestFullscreen", js.undefined)
    
    inline def setRequestPointerLock(value: () => Unit): Self = StObject.set(x, "requestPointerLock", js.Any.fromFunction0(value))
    
    inline def setRequestPointerLockUndefined: Self = StObject.set(x, "requestPointerLock", js.undefined)
    
    inline def setScroll(value: () => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction0(value))
    
    inline def setScrollBy(value: () => Unit): Self = StObject.set(x, "scrollBy", js.Any.fromFunction0(value))
    
    inline def setScrollByUndefined: Self = StObject.set(x, "scrollBy", js.undefined)
    
    inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
    
    inline def setScrollIntoView(value: () => Unit): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction0(value))
    
    inline def setScrollIntoViewUndefined: Self = StObject.set(x, "scrollIntoView", js.undefined)
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    inline def setScrollTo(value: () => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction0(value))
    
    inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    
    inline def setScrollWidthUndefined: Self = StObject.set(x, "scrollWidth", js.undefined)
    
    inline def setSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
    
    inline def setSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttributeNS", js.Any.fromFunction3(value))
    
    inline def setSetAttributeNSUndefined: Self = StObject.set(x, "setAttributeNS", js.undefined)
    
    inline def setSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNode", js.Any.fromFunction1(value))
    
    inline def setSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNodeNS", js.Any.fromFunction1(value))
    
    inline def setSetAttributeNodeNSUndefined: Self = StObject.set(x, "setAttributeNodeNS", js.undefined)
    
    inline def setSetAttributeNodeUndefined: Self = StObject.set(x, "setAttributeNode", js.undefined)
    
    inline def setSetAttributeUndefined: Self = StObject.set(x, "setAttribute", js.undefined)
    
    inline def setSetPointerCapture(value: /* pointerId */ Double => Unit): Self = StObject.set(x, "setPointerCapture", js.Any.fromFunction1(value))
    
    inline def setSetPointerCaptureUndefined: Self = StObject.set(x, "setPointerCapture", js.undefined)
    
    inline def setShadowRoot(value: ShadowRoot): Self = StObject.set(x, "shadowRoot", value.asInstanceOf[js.Any])
    
    inline def setShadowRootNull: Self = StObject.set(x, "shadowRoot", null)
    
    inline def setShadowRootUndefined: Self = StObject.set(x, "shadowRoot", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setTEXT_NODE(value: Double): Self = StObject.set(x, "TEXT_NODE", value.asInstanceOf[js.Any])
    
    inline def setTEXT_NODEUndefined: Self = StObject.set(x, "TEXT_NODE", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    inline def setTextContentNull: Self = StObject.set(x, "textContent", null)
    
    inline def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
    
    inline def setToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "toggleAttribute", js.Any.fromFunction1(value))
    
    inline def setToggleAttributeUndefined: Self = StObject.set(x, "toggleAttribute", js.undefined)
    
    inline def setWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = StObject.set(x, "webkitMatchesSelector", js.Any.fromFunction1(value))
    
    inline def setWebkitMatchesSelectorUndefined: Self = StObject.set(x, "webkitMatchesSelector", js.undefined)
  }
}
