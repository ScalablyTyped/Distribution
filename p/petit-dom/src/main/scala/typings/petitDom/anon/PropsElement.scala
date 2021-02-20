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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined petit-dom.petit-dom.PetitDom.Props<std.Element> */
@js.native
trait PropsElement extends StObject {
  
  var ATTRIBUTE_NODE: js.UndefOr[Double] = js.native
  
  var CDATA_SECTION_NODE: js.UndefOr[Double] = js.native
  
  var COMMENT_NODE: js.UndefOr[Double] = js.native
  
  var DOCUMENT_FRAGMENT_NODE: js.UndefOr[Double] = js.native
  
  var DOCUMENT_NODE: js.UndefOr[Double] = js.native
  
  var DOCUMENT_POSITION_CONTAINED_BY: js.UndefOr[Double] = js.native
  
  var DOCUMENT_POSITION_CONTAINS: js.UndefOr[Double] = js.native
  
  var DOCUMENT_POSITION_DISCONNECTED: js.UndefOr[Double] = js.native
  
  var DOCUMENT_POSITION_FOLLOWING: js.UndefOr[Double] = js.native
  
  var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.UndefOr[Double] = js.native
  
  var DOCUMENT_POSITION_PRECEDING: js.UndefOr[Double] = js.native
  
  var DOCUMENT_TYPE_NODE: js.UndefOr[Double] = js.native
  
  var ELEMENT_NODE: js.UndefOr[Double] = js.native
  
  var ENTITY_NODE: js.UndefOr[Double] = js.native
  
  var ENTITY_REFERENCE_NODE: js.UndefOr[Double] = js.native
  
  var NOTATION_NODE: js.UndefOr[Double] = js.native
  
  var PROCESSING_INSTRUCTION_NODE: js.UndefOr[Double] = js.native
  
  var TEXT_NODE: js.UndefOr[Double] = js.native
  
  var addEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], 
      Unit
    ]
  ] = js.native
  
  var after: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  
  var animate: js.UndefOr[js.Function0[Animation]] = js.native
  
  var append: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  
  var appendChild: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.native
  
  var assignedSlot: js.UndefOr[HTMLSlotElement | Null] = js.native
  
  var attachShadow: js.UndefOr[js.Function1[/* init */ ShadowRootInit, ShadowRoot]] = js.native
  
  var attributes: js.UndefOr[NamedNodeMap] = js.native
  
  var baseURI: js.UndefOr[String] = js.native
  
  var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  
  var childElementCount: js.UndefOr[Double] = js.native
  
  var childNodes: js.UndefOr[NodeListOf[ChildNode]] = js.native
  
  var children: js.UndefOr[HTMLCollection] = js.native
  
  var classList: js.UndefOr[DOMTokenList] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var clientHeight: js.UndefOr[Double] = js.native
  
  var clientLeft: js.UndefOr[Double] = js.native
  
  var clientTop: js.UndefOr[Double] = js.native
  
  var clientWidth: js.UndefOr[Double] = js.native
  
  var cloneNode: js.UndefOr[js.Function0[Node]] = js.native
  
  var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.native
  
  var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.native
  
  var contains: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var content: js.UndefOr[Content | js.Array[Content]] = js.native
  
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.native
  
  var firstChild: js.UndefOr[ChildNode | Null] = js.native
  
  var firstElementChild: js.UndefOr[Element | Null] = js.native
  
  var getAnimations: js.UndefOr[js.Function0[js.Array[Animation]]] = js.native
  
  var getAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, String | Null]] = js.native
  
  var getAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, String | Null]] = js.native
  
  var getAttributeNames: js.UndefOr[js.Function0[js.Array[String]]] = js.native
  
  var getAttributeNode: js.UndefOr[js.Function1[/* qualifiedName */ String, Attr | Null]] = js.native
  
  var getAttributeNodeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Attr | Null]] = js.native
  
  var getBoundingClientRect: js.UndefOr[js.Function0[DOMRect]] = js.native
  
  var getClientRects: js.UndefOr[js.Function0[DOMRectList]] = js.native
  
  var getElementsByClassName: js.UndefOr[js.Function1[/* classNames */ String, HTMLCollectionOf[Element]]] = js.native
  
  var getElementsByTagName: js.UndefOr[js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]]] = js.native
  
  var getElementsByTagNameNS: js.UndefOr[
    js.Function2[
      httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
      /* localName */ String, 
      HTMLCollectionOf[HTMLElement]
    ]
  ] = js.native
  
  var getRootNode: js.UndefOr[js.Function0[Node]] = js.native
  
  var hasAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.native
  
  var hasAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Boolean]] = js.native
  
  var hasAttributes: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var hasPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Boolean]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var innerHTML: js.UndefOr[String] = js.native
  
  var insertAdjacentElement: js.UndefOr[
    js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  ] = js.native
  
  var insertAdjacentHTML: js.UndefOr[js.Function2[/* where */ InsertPosition, /* html */ String, Unit]] = js.native
  
  var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* text */ String, Unit]] = js.native
  
  var insertBefore: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.native
  
  var isConnected: js.UndefOr[Boolean] = js.native
  
  var isDefaultNamespace: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isEqualNode: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isSameNode: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var lastChild: js.UndefOr[ChildNode | Null] = js.native
  
  var lastElementChild: js.UndefOr[Element | Null] = js.native
  
  var localName: js.UndefOr[String] = js.native
  
  var lookupNamespaceURI: js.UndefOr[js.Function0[String | Null]] = js.native
  
  var lookupPrefix: js.UndefOr[js.Function0[String | Null]] = js.native
  
  var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.native
  
  var msGetRegionContent: js.UndefOr[js.Function0[_]] = js.native
  
  var namespaceURI: js.UndefOr[String | Null] = js.native
  
  var nextElementSibling: js.UndefOr[Element | Null] = js.native
  
  var nextSibling: js.UndefOr[ChildNode | Null] = js.native
  
  var nodeName: js.UndefOr[String] = js.native
  
  var nodeType: js.UndefOr[Double] = js.native
  
  var nodeValue: js.UndefOr[String | Null] = js.native
  
  var normalize: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onfullscreenchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  var onfullscreenerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  var outerHTML: js.UndefOr[String] = js.native
  
  var ownerDocument: js.UndefOr[Document] = js.native
  
  var parentElement: js.UndefOr[HTMLElement | Null] = js.native
  
  var parentNode: js.UndefOr[(Node with ParentNode) | Null] = js.native
  
  var prefix: js.UndefOr[String | Null] = js.native
  
  var prepend: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  
  var previousElementSibling: js.UndefOr[Element | Null] = js.native
  
  var previousSibling: js.UndefOr[ChildNode | Null] = js.native
  
  var querySelector: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.native
  
  var querySelectorAll: js.UndefOr[js.Function1[a, NodeListOf[HTMLAnchorElement]]] = js.native
  
  var releasePointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.native
  
  var remove: js.UndefOr[js.Function0[Unit]] = js.native
  
  var removeAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Unit]] = js.native
  
  var removeAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Unit]] = js.native
  
  var removeAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr]] = js.native
  
  var removeChild: js.UndefOr[js.Function1[/* oldChild */ Node, Node]] = js.native
  
  var removeEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], 
      Unit
    ]
  ] = js.native
  
  var replaceChild: js.UndefOr[js.Function2[/* newChild */ Node, /* oldChild */ Node, Node]] = js.native
  
  var replaceWith: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  
  var requestFullscreen: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  
  var requestPointerLock: js.UndefOr[js.Function0[Unit]] = js.native
  
  var scroll: js.UndefOr[js.Function0[Unit]] = js.native
  
  var scrollBy: js.UndefOr[js.Function0[Unit]] = js.native
  
  var scrollHeight: js.UndefOr[Double] = js.native
  
  var scrollIntoView: js.UndefOr[js.Function0[Unit]] = js.native
  
  var scrollLeft: js.UndefOr[Double] = js.native
  
  var scrollTo: js.UndefOr[js.Function0[Unit]] = js.native
  
  var scrollTop: js.UndefOr[Double] = js.native
  
  var scrollWidth: js.UndefOr[Double] = js.native
  
  var setAttribute: js.UndefOr[js.Function2[/* qualifiedName */ String, /* value */ String, Unit]] = js.native
  
  var setAttributeNS: js.UndefOr[
    js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
  ] = js.native
  
  var setAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.native
  
  var setAttributeNodeNS: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.native
  
  var setPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.native
  
  var shadowRoot: js.UndefOr[ShadowRoot | Null] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var tagName: js.UndefOr[String] = js.native
  
  var textContent: js.UndefOr[String | Null] = js.native
  
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.native
  
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.native
}
object PropsElement {
  
  @scala.inline
  def apply(): PropsElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsElement]
  }
  
  @scala.inline
  implicit class PropsElementMutableBuilder[Self <: PropsElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setATTRIBUTE_NODE(value: Double): Self = StObject.set(x, "ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setATTRIBUTE_NODEUndefined: Self = StObject.set(x, "ATTRIBUTE_NODE", js.undefined)
    
    @scala.inline
    def setAddEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsElement, /* ev */ Event, _]) => Unit
    ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddEventListenerUndefined: Self = StObject.set(x, "addEventListener", js.undefined)
    
    @scala.inline
    def setAfter(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setAnimate(value: () => Animation): Self = StObject.set(x, "animate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAppend(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendChild(value: /* newChild */ Node => Node): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendChildUndefined: Self = StObject.set(x, "appendChild", js.undefined)
    
    @scala.inline
    def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    @scala.inline
    def setAssignedSlot(value: HTMLSlotElement): Self = StObject.set(x, "assignedSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedSlotNull: Self = StObject.set(x, "assignedSlot", null)
    
    @scala.inline
    def setAssignedSlotUndefined: Self = StObject.set(x, "assignedSlot", js.undefined)
    
    @scala.inline
    def setAttachShadow(value: /* init */ ShadowRootInit => ShadowRoot): Self = StObject.set(x, "attachShadow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttachShadowUndefined: Self = StObject.set(x, "attachShadow", js.undefined)
    
    @scala.inline
    def setAttributes(value: NamedNodeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setBaseURI(value: String): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURIUndefined: Self = StObject.set(x, "baseURI", js.undefined)
    
    @scala.inline
    def setBefore(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setCDATA_SECTION_NODE(value: Double): Self = StObject.set(x, "CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCDATA_SECTION_NODEUndefined: Self = StObject.set(x, "CDATA_SECTION_NODE", js.undefined)
    
    @scala.inline
    def setCOMMENT_NODE(value: Double): Self = StObject.set(x, "COMMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMMENT_NODEUndefined: Self = StObject.set(x, "COMMENT_NODE", js.undefined)
    
    @scala.inline
    def setChildElementCount(value: Double): Self = StObject.set(x, "childElementCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildElementCountUndefined: Self = StObject.set(x, "childElementCount", js.undefined)
    
    @scala.inline
    def setChildNodes(value: NodeListOf[ChildNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodesUndefined: Self = StObject.set(x, "childNodes", js.undefined)
    
    @scala.inline
    def setChildren(value: HTMLCollection): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassList(value: DOMTokenList): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassListUndefined: Self = StObject.set(x, "classList", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientHeightUndefined: Self = StObject.set(x, "clientHeight", js.undefined)
    
    @scala.inline
    def setClientLeft(value: Double): Self = StObject.set(x, "clientLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLeftUndefined: Self = StObject.set(x, "clientLeft", js.undefined)
    
    @scala.inline
    def setClientTop(value: Double): Self = StObject.set(x, "clientTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTopUndefined: Self = StObject.set(x, "clientTop", js.undefined)
    
    @scala.inline
    def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientWidthUndefined: Self = StObject.set(x, "clientWidth", js.undefined)
    
    @scala.inline
    def setCloneNode(value: () => Node): Self = StObject.set(x, "cloneNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneNodeUndefined: Self = StObject.set(x, "cloneNode", js.undefined)
    
    @scala.inline
    def setClosest(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClosestUndefined: Self = StObject.set(x, "closest", js.undefined)
    
    @scala.inline
    def setCompareDocumentPosition(value: /* other */ Node => Double): Self = StObject.set(x, "compareDocumentPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompareDocumentPositionUndefined: Self = StObject.set(x, "compareDocumentPosition", js.undefined)
    
    @scala.inline
    def setContains(value: () => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setContent(value: Content | js.Array[Content]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: Content*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setDOCUMENT_FRAGMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_FRAGMENT_NODEUndefined: Self = StObject.set(x, "DOCUMENT_FRAGMENT_NODE", js.undefined)
    
    @scala.inline
    def setDOCUMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_NODEUndefined: Self = StObject.set(x, "DOCUMENT_NODE", js.undefined)
    
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINED_BYUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINED_BY", js.undefined)
    
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINS(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINSUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINS", js.undefined)
    
    @scala.inline
    def setDOCUMENT_POSITION_DISCONNECTED(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_DISCONNECTEDUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_DISCONNECTED", js.undefined)
    
    @scala.inline
    def setDOCUMENT_POSITION_FOLLOWING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_FOLLOWINGUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_FOLLOWING", js.undefined)
    
    @scala.inline
    def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFICUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", js.undefined)
    
    @scala.inline
    def setDOCUMENT_POSITION_PRECEDING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_PRECEDINGUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_PRECEDING", js.undefined)
    
    @scala.inline
    def setDOCUMENT_TYPE_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_TYPE_NODEUndefined: Self = StObject.set(x, "DOCUMENT_TYPE_NODE", js.undefined)
    
    @scala.inline
    def setDispatchEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDispatchEventUndefined: Self = StObject.set(x, "dispatchEvent", js.undefined)
    
    @scala.inline
    def setELEMENT_NODE(value: Double): Self = StObject.set(x, "ELEMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setELEMENT_NODEUndefined: Self = StObject.set(x, "ELEMENT_NODE", js.undefined)
    
    @scala.inline
    def setENTITY_NODE(value: Double): Self = StObject.set(x, "ENTITY_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENTITY_NODEUndefined: Self = StObject.set(x, "ENTITY_NODE", js.undefined)
    
    @scala.inline
    def setENTITY_REFERENCE_NODE(value: Double): Self = StObject.set(x, "ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENTITY_REFERENCE_NODEUndefined: Self = StObject.set(x, "ENTITY_REFERENCE_NODE", js.undefined)
    
    @scala.inline
    def setFirstChild(value: ChildNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstChildNull: Self = StObject.set(x, "firstChild", null)
    
    @scala.inline
    def setFirstChildUndefined: Self = StObject.set(x, "firstChild", js.undefined)
    
    @scala.inline
    def setFirstElementChild(value: Element): Self = StObject.set(x, "firstElementChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstElementChildNull: Self = StObject.set(x, "firstElementChild", null)
    
    @scala.inline
    def setFirstElementChildUndefined: Self = StObject.set(x, "firstElementChild", js.undefined)
    
    @scala.inline
    def setGetAnimations(value: () => js.Array[Animation]): Self = StObject.set(x, "getAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAnimationsUndefined: Self = StObject.set(x, "getAnimations", js.undefined)
    
    @scala.inline
    def setGetAttribute(value: /* qualifiedName */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self = StObject.set(x, "getAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAttributeNSUndefined: Self = StObject.set(x, "getAttributeNS", js.undefined)
    
    @scala.inline
    def setGetAttributeNames(value: () => js.Array[String]): Self = StObject.set(x, "getAttributeNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttributeNamesUndefined: Self = StObject.set(x, "getAttributeNames", js.undefined)
    
    @scala.inline
    def setGetAttributeNode(value: /* qualifiedName */ String => Attr | Null): Self = StObject.set(x, "getAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeNodeNS(value: (/* namespace */ String, /* localName */ String) => Attr | Null): Self = StObject.set(x, "getAttributeNodeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAttributeNodeNSUndefined: Self = StObject.set(x, "getAttributeNodeNS", js.undefined)
    
    @scala.inline
    def setGetAttributeNodeUndefined: Self = StObject.set(x, "getAttributeNode", js.undefined)
    
    @scala.inline
    def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
    
    @scala.inline
    def setGetBoundingClientRect(value: () => DOMRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBoundingClientRectUndefined: Self = StObject.set(x, "getBoundingClientRect", js.undefined)
    
    @scala.inline
    def setGetClientRects(value: () => DOMRectList): Self = StObject.set(x, "getClientRects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClientRectsUndefined: Self = StObject.set(x, "getClientRects", js.undefined)
    
    @scala.inline
    def setGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[Element]): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByClassNameUndefined: Self = StObject.set(x, "getElementsByClassName", js.undefined)
    
    @scala.inline
    def setGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagNameNS(
      value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
    ): Self = StObject.set(x, "getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetElementsByTagNameNSUndefined: Self = StObject.set(x, "getElementsByTagNameNS", js.undefined)
    
    @scala.inline
    def setGetElementsByTagNameUndefined: Self = StObject.set(x, "getElementsByTagName", js.undefined)
    
    @scala.inline
    def setGetRootNode(value: () => Node): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootNodeUndefined: Self = StObject.set(x, "getRootNode", js.undefined)
    
    @scala.inline
    def setHasAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self = StObject.set(x, "hasAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasAttributeNSUndefined: Self = StObject.set(x, "hasAttributeNS", js.undefined)
    
    @scala.inline
    def setHasAttributeUndefined: Self = StObject.set(x, "hasAttribute", js.undefined)
    
    @scala.inline
    def setHasAttributes(value: () => Boolean): Self = StObject.set(x, "hasAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasAttributesUndefined: Self = StObject.set(x, "hasAttributes", js.undefined)
    
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = StObject.set(x, "hasChildNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasChildNodesUndefined: Self = StObject.set(x, "hasChildNodes", js.undefined)
    
    @scala.inline
    def setHasPointerCapture(value: /* pointerId */ Double => Boolean): Self = StObject.set(x, "hasPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPointerCaptureUndefined: Self = StObject.set(x, "hasPointerCapture", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerHTMLUndefined: Self = StObject.set(x, "innerHTML", js.undefined)
    
    @scala.inline
    def setInsertAdjacentElement(value: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null): Self = StObject.set(x, "insertAdjacentElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertAdjacentElementUndefined: Self = StObject.set(x, "insertAdjacentElement", js.undefined)
    
    @scala.inline
    def setInsertAdjacentHTML(value: (/* where */ InsertPosition, /* html */ String) => Unit): Self = StObject.set(x, "insertAdjacentHTML", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertAdjacentHTMLUndefined: Self = StObject.set(x, "insertAdjacentHTML", js.undefined)
    
    @scala.inline
    def setInsertAdjacentText(value: (/* where */ InsertPosition, /* text */ String) => Unit): Self = StObject.set(x, "insertAdjacentText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertAdjacentTextUndefined: Self = StObject.set(x, "insertAdjacentText", js.undefined)
    
    @scala.inline
    def setInsertBefore(value: /* newChild */ Node => Node): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
    
    @scala.inline
    def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConnectedUndefined: Self = StObject.set(x, "isConnected", js.undefined)
    
    @scala.inline
    def setIsDefaultNamespace(value: () => Boolean): Self = StObject.set(x, "isDefaultNamespace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDefaultNamespaceUndefined: Self = StObject.set(x, "isDefaultNamespace", js.undefined)
    
    @scala.inline
    def setIsEqualNode(value: () => Boolean): Self = StObject.set(x, "isEqualNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEqualNodeUndefined: Self = StObject.set(x, "isEqualNode", js.undefined)
    
    @scala.inline
    def setIsSameNode(value: () => Boolean): Self = StObject.set(x, "isSameNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSameNodeUndefined: Self = StObject.set(x, "isSameNode", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLastChild(value: ChildNode): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChildNull: Self = StObject.set(x, "lastChild", null)
    
    @scala.inline
    def setLastChildUndefined: Self = StObject.set(x, "lastChild", js.undefined)
    
    @scala.inline
    def setLastElementChild(value: Element): Self = StObject.set(x, "lastElementChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastElementChildNull: Self = StObject.set(x, "lastElementChild", null)
    
    @scala.inline
    def setLastElementChildUndefined: Self = StObject.set(x, "lastElementChild", js.undefined)
    
    @scala.inline
    def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalNameUndefined: Self = StObject.set(x, "localName", js.undefined)
    
    @scala.inline
    def setLookupNamespaceURI(value: () => String | Null): Self = StObject.set(x, "lookupNamespaceURI", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLookupNamespaceURIUndefined: Self = StObject.set(x, "lookupNamespaceURI", js.undefined)
    
    @scala.inline
    def setLookupPrefix(value: () => String | Null): Self = StObject.set(x, "lookupPrefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLookupPrefixUndefined: Self = StObject.set(x, "lookupPrefix", js.undefined)
    
    @scala.inline
    def setMatches(value: /* selectors */ String => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setMsGetRegionContent(value: () => _): Self = StObject.set(x, "msGetRegionContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMsGetRegionContentUndefined: Self = StObject.set(x, "msGetRegionContent", js.undefined)
    
    @scala.inline
    def setNOTATION_NODE(value: Double): Self = StObject.set(x, "NOTATION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOTATION_NODEUndefined: Self = StObject.set(x, "NOTATION_NODE", js.undefined)
    
    @scala.inline
    def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURINull: Self = StObject.set(x, "namespaceURI", null)
    
    @scala.inline
    def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
    
    @scala.inline
    def setNextElementSibling(value: Element): Self = StObject.set(x, "nextElementSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextElementSiblingNull: Self = StObject.set(x, "nextElementSibling", null)
    
    @scala.inline
    def setNextElementSiblingUndefined: Self = StObject.set(x, "nextElementSibling", js.undefined)
    
    @scala.inline
    def setNextSibling(value: ChildNode): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSiblingNull: Self = StObject.set(x, "nextSibling", null)
    
    @scala.inline
    def setNextSiblingUndefined: Self = StObject.set(x, "nextSibling", js.undefined)
    
    @scala.inline
    def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
    
    @scala.inline
    def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
    
    @scala.inline
    def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValueNull: Self = StObject.set(x, "nodeValue", null)
    
    @scala.inline
    def setNodeValueUndefined: Self = StObject.set(x, "nodeValue", js.undefined)
    
    @scala.inline
    def setNormalize(value: () => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    @scala.inline
    def setOnfullscreenchange(value: js.ThisFunction1[PropsElement, /* ev */ Event, _]): Self = StObject.set(x, "onfullscreenchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfullscreenchangeNull: Self = StObject.set(x, "onfullscreenchange", null)
    
    @scala.inline
    def setOnfullscreenchangeUndefined: Self = StObject.set(x, "onfullscreenchange", js.undefined)
    
    @scala.inline
    def setOnfullscreenerror(value: js.ThisFunction1[PropsElement, /* ev */ Event, _]): Self = StObject.set(x, "onfullscreenerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfullscreenerrorNull: Self = StObject.set(x, "onfullscreenerror", null)
    
    @scala.inline
    def setOnfullscreenerrorUndefined: Self = StObject.set(x, "onfullscreenerror", js.undefined)
    
    @scala.inline
    def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterHTMLUndefined: Self = StObject.set(x, "outerHTML", js.undefined)
    
    @scala.inline
    def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
    
    @scala.inline
    def setPROCESSING_INSTRUCTION_NODE(value: Double): Self = StObject.set(x, "PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPROCESSING_INSTRUCTION_NODEUndefined: Self = StObject.set(x, "PROCESSING_INSTRUCTION_NODE", js.undefined)
    
    @scala.inline
    def setParentElement(value: HTMLElement): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElementNull: Self = StObject.set(x, "parentElement", null)
    
    @scala.inline
    def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
    
    @scala.inline
    def setParentNode(value: Node with ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
    
    @scala.inline
    def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setPrepend(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "prepend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    
    @scala.inline
    def setPreviousElementSibling(value: Element): Self = StObject.set(x, "previousElementSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousElementSiblingNull: Self = StObject.set(x, "previousElementSibling", null)
    
    @scala.inline
    def setPreviousElementSiblingUndefined: Self = StObject.set(x, "previousElementSibling", js.undefined)
    
    @scala.inline
    def setPreviousSibling(value: ChildNode): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSiblingNull: Self = StObject.set(x, "previousSibling", null)
    
    @scala.inline
    def setPreviousSiblingUndefined: Self = StObject.set(x, "previousSibling", js.undefined)
    
    @scala.inline
    def setQuerySelector(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuerySelectorAll(value: a => NodeListOf[HTMLAnchorElement]): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuerySelectorAllUndefined: Self = StObject.set(x, "querySelectorAll", js.undefined)
    
    @scala.inline
    def setQuerySelectorUndefined: Self = StObject.set(x, "querySelector", js.undefined)
    
    @scala.inline
    def setReleasePointerCapture(value: /* pointerId */ Double => Unit): Self = StObject.set(x, "releasePointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReleasePointerCaptureUndefined: Self = StObject.set(x, "releasePointerCapture", js.undefined)
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAttribute(value: /* qualifiedName */ String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Unit): Self = StObject.set(x, "removeAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveAttributeNSUndefined: Self = StObject.set(x, "removeAttributeNS", js.undefined)
    
    @scala.inline
    def setRemoveAttributeNode(value: /* attr */ Attr => Attr): Self = StObject.set(x, "removeAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAttributeNodeUndefined: Self = StObject.set(x, "removeAttributeNode", js.undefined)
    
    @scala.inline
    def setRemoveAttributeUndefined: Self = StObject.set(x, "removeAttribute", js.undefined)
    
    @scala.inline
    def setRemoveChild(value: /* oldChild */ Node => Node): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveChildUndefined: Self = StObject.set(x, "removeChild", js.undefined)
    
    @scala.inline
    def setRemoveEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsElement, /* ev */ Event, _]) => Unit
    ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveEventListenerUndefined: Self = StObject.set(x, "removeEventListener", js.undefined)
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setReplaceChild(value: (/* newChild */ Node, /* oldChild */ Node) => Node): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceChildUndefined: Self = StObject.set(x, "replaceChild", js.undefined)
    
    @scala.inline
    def setReplaceWith(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
    
    @scala.inline
    def setRequestFullscreen(value: () => js.Promise[Unit]): Self = StObject.set(x, "requestFullscreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestFullscreenUndefined: Self = StObject.set(x, "requestFullscreen", js.undefined)
    
    @scala.inline
    def setRequestPointerLock(value: () => Unit): Self = StObject.set(x, "requestPointerLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestPointerLockUndefined: Self = StObject.set(x, "requestPointerLock", js.undefined)
    
    @scala.inline
    def setScroll(value: () => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollBy(value: () => Unit): Self = StObject.set(x, "scrollBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollByUndefined: Self = StObject.set(x, "scrollBy", js.undefined)
    
    @scala.inline
    def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
    
    @scala.inline
    def setScrollIntoView(value: () => Unit): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollIntoViewUndefined: Self = StObject.set(x, "scrollIntoView", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollTo(value: () => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    @scala.inline
    def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWidthUndefined: Self = StObject.set(x, "scrollWidth", js.undefined)
    
    @scala.inline
    def setSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttributeNS", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetAttributeNSUndefined: Self = StObject.set(x, "setAttributeNS", js.undefined)
    
    @scala.inline
    def setSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNodeNS", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttributeNodeNSUndefined: Self = StObject.set(x, "setAttributeNodeNS", js.undefined)
    
    @scala.inline
    def setSetAttributeNodeUndefined: Self = StObject.set(x, "setAttributeNode", js.undefined)
    
    @scala.inline
    def setSetAttributeUndefined: Self = StObject.set(x, "setAttribute", js.undefined)
    
    @scala.inline
    def setSetPointerCapture(value: /* pointerId */ Double => Unit): Self = StObject.set(x, "setPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPointerCaptureUndefined: Self = StObject.set(x, "setPointerCapture", js.undefined)
    
    @scala.inline
    def setShadowRoot(value: ShadowRoot): Self = StObject.set(x, "shadowRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRootNull: Self = StObject.set(x, "shadowRoot", null)
    
    @scala.inline
    def setShadowRootUndefined: Self = StObject.set(x, "shadowRoot", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    @scala.inline
    def setTEXT_NODE(value: Double): Self = StObject.set(x, "TEXT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXT_NODEUndefined: Self = StObject.set(x, "TEXT_NODE", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    @scala.inline
    def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentNull: Self = StObject.set(x, "textContent", null)
    
    @scala.inline
    def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
    
    @scala.inline
    def setToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "toggleAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleAttributeUndefined: Self = StObject.set(x, "toggleAttribute", js.undefined)
    
    @scala.inline
    def setWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = StObject.set(x, "webkitMatchesSelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWebkitMatchesSelectorUndefined: Self = StObject.set(x, "webkitMatchesSelector", js.undefined)
  }
}
