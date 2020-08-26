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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined petit-dom.petit-dom.PetitDom.Props<std.Element> */
@js.native
trait PropsElement extends js.Object {
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
  var getAttributeNode: js.UndefOr[js.Function1[/* name */ String, Attr | Null]] = js.native
  var getAttributeNodeNS: js.UndefOr[js.Function2[/* namespaceURI */ String, /* localName */ String, Attr | Null]] = js.native
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
  implicit class PropsElementOps[Self <: PropsElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setATTRIBUTE_NODE(value: Double): Self = this.set("ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteATTRIBUTE_NODE: Self = this.set("ATTRIBUTE_NODE", js.undefined)
    @scala.inline
    def setCDATA_SECTION_NODE(value: Double): Self = this.set("CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCDATA_SECTION_NODE: Self = this.set("CDATA_SECTION_NODE", js.undefined)
    @scala.inline
    def setCOMMENT_NODE(value: Double): Self = this.set("COMMENT_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCOMMENT_NODE: Self = this.set("COMMENT_NODE", js.undefined)
    @scala.inline
    def setDOCUMENT_FRAGMENT_NODE(value: Double): Self = this.set("DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_FRAGMENT_NODE: Self = this.set("DOCUMENT_FRAGMENT_NODE", js.undefined)
    @scala.inline
    def setDOCUMENT_NODE(value: Double): Self = this.set("DOCUMENT_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_NODE: Self = this.set("DOCUMENT_NODE", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self = this.set("DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_CONTAINED_BY: Self = this.set("DOCUMENT_POSITION_CONTAINED_BY", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINS(value: Double): Self = this.set("DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_CONTAINS: Self = this.set("DOCUMENT_POSITION_CONTAINS", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_DISCONNECTED(value: Double): Self = this.set("DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_DISCONNECTED: Self = this.set("DOCUMENT_POSITION_DISCONNECTED", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_FOLLOWING(value: Double): Self = this.set("DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_FOLLOWING: Self = this.set("DOCUMENT_POSITION_FOLLOWING", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self = this.set("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Self = this.set("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_PRECEDING(value: Double): Self = this.set("DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_PRECEDING: Self = this.set("DOCUMENT_POSITION_PRECEDING", js.undefined)
    @scala.inline
    def setDOCUMENT_TYPE_NODE(value: Double): Self = this.set("DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_TYPE_NODE: Self = this.set("DOCUMENT_TYPE_NODE", js.undefined)
    @scala.inline
    def setELEMENT_NODE(value: Double): Self = this.set("ELEMENT_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteELEMENT_NODE: Self = this.set("ELEMENT_NODE", js.undefined)
    @scala.inline
    def setENTITY_NODE(value: Double): Self = this.set("ENTITY_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteENTITY_NODE: Self = this.set("ENTITY_NODE", js.undefined)
    @scala.inline
    def setENTITY_REFERENCE_NODE(value: Double): Self = this.set("ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteENTITY_REFERENCE_NODE: Self = this.set("ENTITY_REFERENCE_NODE", js.undefined)
    @scala.inline
    def setNOTATION_NODE(value: Double): Self = this.set("NOTATION_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNOTATION_NODE: Self = this.set("NOTATION_NODE", js.undefined)
    @scala.inline
    def setPROCESSING_INSTRUCTION_NODE(value: Double): Self = this.set("PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePROCESSING_INSTRUCTION_NODE: Self = this.set("PROCESSING_INSTRUCTION_NODE", js.undefined)
    @scala.inline
    def setTEXT_NODE(value: Double): Self = this.set("TEXT_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTEXT_NODE: Self = this.set("TEXT_NODE", js.undefined)
    @scala.inline
    def setAddEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsElement, /* ev */ Event, _]) => Unit
    ): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddEventListener: Self = this.set("addEventListener", js.undefined)
    @scala.inline
    def setAfter(value: /* repeated */ Node | String => Unit): Self = this.set("after", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setAnimate(value: () => Animation): Self = this.set("animate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAppend(value: /* repeated */ Node | String => Unit): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setAppendChild(value: /* newChild */ Node => Node): Self = this.set("appendChild", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppendChild: Self = this.set("appendChild", js.undefined)
    @scala.inline
    def setAssignedSlot(value: HTMLSlotElement): Self = this.set("assignedSlot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedSlot: Self = this.set("assignedSlot", js.undefined)
    @scala.inline
    def setAssignedSlotNull: Self = this.set("assignedSlot", null)
    @scala.inline
    def setAttachShadow(value: /* init */ ShadowRootInit => ShadowRoot): Self = this.set("attachShadow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAttachShadow: Self = this.set("attachShadow", js.undefined)
    @scala.inline
    def setAttributes(value: NamedNodeMap): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setBaseURI(value: String): Self = this.set("baseURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseURI: Self = this.set("baseURI", js.undefined)
    @scala.inline
    def setBefore(value: /* repeated */ Node | String => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setChildElementCount(value: Double): Self = this.set("childElementCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildElementCount: Self = this.set("childElementCount", js.undefined)
    @scala.inline
    def setChildNodes(value: NodeListOf[ChildNode]): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildNodes: Self = this.set("childNodes", js.undefined)
    @scala.inline
    def setChildren(value: HTMLCollection): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassList(value: DOMTokenList): Self = this.set("classList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassList: Self = this.set("classList", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClientHeight(value: Double): Self = this.set("clientHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientHeight: Self = this.set("clientHeight", js.undefined)
    @scala.inline
    def setClientLeft(value: Double): Self = this.set("clientLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientLeft: Self = this.set("clientLeft", js.undefined)
    @scala.inline
    def setClientTop(value: Double): Self = this.set("clientTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientTop: Self = this.set("clientTop", js.undefined)
    @scala.inline
    def setClientWidth(value: Double): Self = this.set("clientWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientWidth: Self = this.set("clientWidth", js.undefined)
    @scala.inline
    def setCloneNode(value: () => Node): Self = this.set("cloneNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCloneNode: Self = this.set("cloneNode", js.undefined)
    @scala.inline
    def setClosest(value: a => HTMLAnchorElement | Null): Self = this.set("closest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClosest: Self = this.set("closest", js.undefined)
    @scala.inline
    def setCompareDocumentPosition(value: /* other */ Node => Double): Self = this.set("compareDocumentPosition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCompareDocumentPosition: Self = this.set("compareDocumentPosition", js.undefined)
    @scala.inline
    def setContains(value: () => Boolean): Self = this.set("contains", js.Any.fromFunction0(value))
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setContentVarargs(value: Content*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: Content | js.Array[Content]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDispatchEvent(value: /* event */ Event => Boolean): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDispatchEvent: Self = this.set("dispatchEvent", js.undefined)
    @scala.inline
    def setFirstChild(value: ChildNode): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstChild: Self = this.set("firstChild", js.undefined)
    @scala.inline
    def setFirstChildNull: Self = this.set("firstChild", null)
    @scala.inline
    def setFirstElementChild(value: Element): Self = this.set("firstElementChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstElementChild: Self = this.set("firstElementChild", js.undefined)
    @scala.inline
    def setFirstElementChildNull: Self = this.set("firstElementChild", null)
    @scala.inline
    def setGetAnimations(value: () => js.Array[Animation]): Self = this.set("getAnimations", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAnimations: Self = this.set("getAnimations", js.undefined)
    @scala.inline
    def setGetAttribute(value: /* qualifiedName */ String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAttribute: Self = this.set("getAttribute", js.undefined)
    @scala.inline
    def setGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self = this.set("getAttributeNS", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetAttributeNS: Self = this.set("getAttributeNS", js.undefined)
    @scala.inline
    def setGetAttributeNames(value: () => js.Array[String]): Self = this.set("getAttributeNames", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAttributeNames: Self = this.set("getAttributeNames", js.undefined)
    @scala.inline
    def setGetAttributeNode(value: /* name */ String => Attr | Null): Self = this.set("getAttributeNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAttributeNode: Self = this.set("getAttributeNode", js.undefined)
    @scala.inline
    def setGetAttributeNodeNS(value: (/* namespaceURI */ String, /* localName */ String) => Attr | Null): Self = this.set("getAttributeNodeNS", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetAttributeNodeNS: Self = this.set("getAttributeNodeNS", js.undefined)
    @scala.inline
    def setGetBoundingClientRect(value: () => DOMRect): Self = this.set("getBoundingClientRect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBoundingClientRect: Self = this.set("getBoundingClientRect", js.undefined)
    @scala.inline
    def setGetClientRects(value: () => DOMRectList): Self = this.set("getClientRects", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetClientRects: Self = this.set("getClientRects", js.undefined)
    @scala.inline
    def setGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[Element]): Self = this.set("getElementsByClassName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetElementsByClassName: Self = this.set("getElementsByClassName", js.undefined)
    @scala.inline
    def setGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self = this.set("getElementsByTagName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetElementsByTagName: Self = this.set("getElementsByTagName", js.undefined)
    @scala.inline
    def setGetElementsByTagNameNS(
      value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
    ): Self = this.set("getElementsByTagNameNS", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetElementsByTagNameNS: Self = this.set("getElementsByTagNameNS", js.undefined)
    @scala.inline
    def setGetRootNode(value: () => Node): Self = this.set("getRootNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRootNode: Self = this.set("getRootNode", js.undefined)
    @scala.inline
    def setHasAttribute(value: /* qualifiedName */ String => Boolean): Self = this.set("hasAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasAttribute: Self = this.set("hasAttribute", js.undefined)
    @scala.inline
    def setHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self = this.set("hasAttributeNS", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHasAttributeNS: Self = this.set("hasAttributeNS", js.undefined)
    @scala.inline
    def setHasAttributes(value: () => Boolean): Self = this.set("hasAttributes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasAttributes: Self = this.set("hasAttributes", js.undefined)
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = this.set("hasChildNodes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasChildNodes: Self = this.set("hasChildNodes", js.undefined)
    @scala.inline
    def setHasPointerCapture(value: /* pointerId */ Double => Boolean): Self = this.set("hasPointerCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasPointerCapture: Self = this.set("hasPointerCapture", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInnerHTML(value: String): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerHTML: Self = this.set("innerHTML", js.undefined)
    @scala.inline
    def setInsertAdjacentElement(value: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null): Self = this.set("insertAdjacentElement", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertAdjacentElement: Self = this.set("insertAdjacentElement", js.undefined)
    @scala.inline
    def setInsertAdjacentHTML(value: (/* where */ InsertPosition, /* html */ String) => Unit): Self = this.set("insertAdjacentHTML", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertAdjacentHTML: Self = this.set("insertAdjacentHTML", js.undefined)
    @scala.inline
    def setInsertAdjacentText(value: (/* where */ InsertPosition, /* text */ String) => Unit): Self = this.set("insertAdjacentText", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertAdjacentText: Self = this.set("insertAdjacentText", js.undefined)
    @scala.inline
    def setInsertBefore(value: /* newChild */ Node => Node): Self = this.set("insertBefore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInsertBefore: Self = this.set("insertBefore", js.undefined)
    @scala.inline
    def setIsConnected(value: Boolean): Self = this.set("isConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsConnected: Self = this.set("isConnected", js.undefined)
    @scala.inline
    def setIsDefaultNamespace(value: () => Boolean): Self = this.set("isDefaultNamespace", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDefaultNamespace: Self = this.set("isDefaultNamespace", js.undefined)
    @scala.inline
    def setIsEqualNode(value: () => Boolean): Self = this.set("isEqualNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsEqualNode: Self = this.set("isEqualNode", js.undefined)
    @scala.inline
    def setIsSameNode(value: () => Boolean): Self = this.set("isSameNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsSameNode: Self = this.set("isSameNode", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLastChild(value: ChildNode): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastChild: Self = this.set("lastChild", js.undefined)
    @scala.inline
    def setLastChildNull: Self = this.set("lastChild", null)
    @scala.inline
    def setLastElementChild(value: Element): Self = this.set("lastElementChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastElementChild: Self = this.set("lastElementChild", js.undefined)
    @scala.inline
    def setLastElementChildNull: Self = this.set("lastElementChild", null)
    @scala.inline
    def setLocalName(value: String): Self = this.set("localName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalName: Self = this.set("localName", js.undefined)
    @scala.inline
    def setLookupNamespaceURI(value: () => String | Null): Self = this.set("lookupNamespaceURI", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLookupNamespaceURI: Self = this.set("lookupNamespaceURI", js.undefined)
    @scala.inline
    def setLookupPrefix(value: () => String | Null): Self = this.set("lookupPrefix", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLookupPrefix: Self = this.set("lookupPrefix", js.undefined)
    @scala.inline
    def setMatches(value: /* selectors */ String => Boolean): Self = this.set("matches", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
    @scala.inline
    def setMsGetRegionContent(value: () => _): Self = this.set("msGetRegionContent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMsGetRegionContent: Self = this.set("msGetRegionContent", js.undefined)
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("namespaceURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceURI: Self = this.set("namespaceURI", js.undefined)
    @scala.inline
    def setNamespaceURINull: Self = this.set("namespaceURI", null)
    @scala.inline
    def setNextElementSibling(value: Element): Self = this.set("nextElementSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextElementSibling: Self = this.set("nextElementSibling", js.undefined)
    @scala.inline
    def setNextElementSiblingNull: Self = this.set("nextElementSibling", null)
    @scala.inline
    def setNextSibling(value: ChildNode): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextSibling: Self = this.set("nextSibling", js.undefined)
    @scala.inline
    def setNextSiblingNull: Self = this.set("nextSibling", null)
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeName: Self = this.set("nodeName", js.undefined)
    @scala.inline
    def setNodeType(value: Double): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeValue: Self = this.set("nodeValue", js.undefined)
    @scala.inline
    def setNodeValueNull: Self = this.set("nodeValue", null)
    @scala.inline
    def setNormalize(value: () => Unit): Self = this.set("normalize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    @scala.inline
    def setOnfullscreenchange(value: js.ThisFunction1[PropsElement, /* ev */ Event, _]): Self = this.set("onfullscreenchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnfullscreenchange: Self = this.set("onfullscreenchange", js.undefined)
    @scala.inline
    def setOnfullscreenchangeNull: Self = this.set("onfullscreenchange", null)
    @scala.inline
    def setOnfullscreenerror(value: js.ThisFunction1[PropsElement, /* ev */ Event, _]): Self = this.set("onfullscreenerror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnfullscreenerror: Self = this.set("onfullscreenerror", js.undefined)
    @scala.inline
    def setOnfullscreenerrorNull: Self = this.set("onfullscreenerror", null)
    @scala.inline
    def setOuterHTML(value: String): Self = this.set("outerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterHTML: Self = this.set("outerHTML", js.undefined)
    @scala.inline
    def setOwnerDocument(value: Document): Self = this.set("ownerDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerDocument: Self = this.set("ownerDocument", js.undefined)
    @scala.inline
    def setParentElement(value: HTMLElement): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentElement: Self = this.set("parentElement", js.undefined)
    @scala.inline
    def setParentElementNull: Self = this.set("parentElement", null)
    @scala.inline
    def setParentNode(value: Node with ParentNode): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentNode: Self = this.set("parentNode", js.undefined)
    @scala.inline
    def setParentNodeNull: Self = this.set("parentNode", null)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPrefixNull: Self = this.set("prefix", null)
    @scala.inline
    def setPrepend(value: /* repeated */ Node | String => Unit): Self = this.set("prepend", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
    @scala.inline
    def setPreviousElementSibling(value: Element): Self = this.set("previousElementSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousElementSibling: Self = this.set("previousElementSibling", js.undefined)
    @scala.inline
    def setPreviousElementSiblingNull: Self = this.set("previousElementSibling", null)
    @scala.inline
    def setPreviousSibling(value: ChildNode): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousSibling: Self = this.set("previousSibling", js.undefined)
    @scala.inline
    def setPreviousSiblingNull: Self = this.set("previousSibling", null)
    @scala.inline
    def setQuerySelector(value: a => HTMLAnchorElement | Null): Self = this.set("querySelector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQuerySelector: Self = this.set("querySelector", js.undefined)
    @scala.inline
    def setQuerySelectorAll(value: a => NodeListOf[HTMLAnchorElement]): Self = this.set("querySelectorAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQuerySelectorAll: Self = this.set("querySelectorAll", js.undefined)
    @scala.inline
    def setReleasePointerCapture(value: /* pointerId */ Double => Unit): Self = this.set("releasePointerCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReleasePointerCapture: Self = this.set("releasePointerCapture", js.undefined)
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRemoveAttribute(value: /* qualifiedName */ String => Unit): Self = this.set("removeAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAttribute: Self = this.set("removeAttribute", js.undefined)
    @scala.inline
    def setRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Unit): Self = this.set("removeAttributeNS", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveAttributeNS: Self = this.set("removeAttributeNS", js.undefined)
    @scala.inline
    def setRemoveAttributeNode(value: /* attr */ Attr => Attr): Self = this.set("removeAttributeNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAttributeNode: Self = this.set("removeAttributeNode", js.undefined)
    @scala.inline
    def setRemoveChild(value: /* oldChild */ Node => Node): Self = this.set("removeChild", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveChild: Self = this.set("removeChild", js.undefined)
    @scala.inline
    def setRemoveEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsElement, /* ev */ Event, _]) => Unit
    ): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveEventListener: Self = this.set("removeEventListener", js.undefined)
    @scala.inline
    def setReplaceChild(value: (/* newChild */ Node, /* oldChild */ Node) => Node): Self = this.set("replaceChild", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReplaceChild: Self = this.set("replaceChild", js.undefined)
    @scala.inline
    def setReplaceWith(value: /* repeated */ Node | String => Unit): Self = this.set("replaceWith", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReplaceWith: Self = this.set("replaceWith", js.undefined)
    @scala.inline
    def setRequestFullscreen(value: () => js.Promise[Unit]): Self = this.set("requestFullscreen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRequestFullscreen: Self = this.set("requestFullscreen", js.undefined)
    @scala.inline
    def setRequestPointerLock(value: () => Unit): Self = this.set("requestPointerLock", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRequestPointerLock: Self = this.set("requestPointerLock", js.undefined)
    @scala.inline
    def setScroll(value: () => Unit): Self = this.set("scroll", js.Any.fromFunction0(value))
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setScrollBy(value: () => Unit): Self = this.set("scrollBy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteScrollBy: Self = this.set("scrollBy", js.undefined)
    @scala.inline
    def setScrollHeight(value: Double): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollHeight: Self = this.set("scrollHeight", js.undefined)
    @scala.inline
    def setScrollIntoView(value: () => Unit): Self = this.set("scrollIntoView", js.Any.fromFunction0(value))
    @scala.inline
    def deleteScrollIntoView: Self = this.set("scrollIntoView", js.undefined)
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollLeft: Self = this.set("scrollLeft", js.undefined)
    @scala.inline
    def setScrollTo(value: () => Unit): Self = this.set("scrollTo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    @scala.inline
    def setScrollWidth(value: Double): Self = this.set("scrollWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollWidth: Self = this.set("scrollWidth", js.undefined)
    @scala.inline
    def setSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetAttribute: Self = this.set("setAttribute", js.undefined)
    @scala.inline
    def setSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit): Self = this.set("setAttributeNS", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetAttributeNS: Self = this.set("setAttributeNS", js.undefined)
    @scala.inline
    def setSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self = this.set("setAttributeNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAttributeNode: Self = this.set("setAttributeNode", js.undefined)
    @scala.inline
    def setSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self = this.set("setAttributeNodeNS", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAttributeNodeNS: Self = this.set("setAttributeNodeNS", js.undefined)
    @scala.inline
    def setSetPointerCapture(value: /* pointerId */ Double => Unit): Self = this.set("setPointerCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPointerCapture: Self = this.set("setPointerCapture", js.undefined)
    @scala.inline
    def setShadowRoot(value: ShadowRoot): Self = this.set("shadowRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowRoot: Self = this.set("shadowRoot", js.undefined)
    @scala.inline
    def setShadowRootNull: Self = this.set("shadowRoot", null)
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    @scala.inline
    def setTextContent(value: String): Self = this.set("textContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextContent: Self = this.set("textContent", js.undefined)
    @scala.inline
    def setTextContentNull: Self = this.set("textContent", null)
    @scala.inline
    def setToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = this.set("toggleAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggleAttribute: Self = this.set("toggleAttribute", js.undefined)
    @scala.inline
    def setWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = this.set("webkitMatchesSelector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWebkitMatchesSelector: Self = this.set("webkitMatchesSelector", js.undefined)
  }
  
}

