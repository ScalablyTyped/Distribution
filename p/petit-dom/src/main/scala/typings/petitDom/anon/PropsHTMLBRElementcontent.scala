package typings.petitDom.anon

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.Key
import typings.petitDom.petitDomStrings.a
import typings.petitDom.petitDomStrings.fullscreenchange
import typings.petitDom.petitDomStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typings.std.Animation
import typings.std.AnimationEvent
import typings.std.Attr
import typings.std.CSSStyleDeclaration
import typings.std.ChildNode
import typings.std.ClipboardEvent
import typings.std.DOMRect
import typings.std.DOMRectList
import typings.std.DOMStringMap
import typings.std.DOMTokenList
import typings.std.Document
import typings.std.DragEvent
import typings.std.Element
import typings.std.Error
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.InsertPosition
import typings.std.KeyboardEvent
import typings.std.Keyframe
import typings.std.MouseEvent
import typings.std.NamedNodeMap
import typings.std.Node
import typings.std.NodeListOf
import typings.std.OnErrorEventHandler
import typings.std.ParentNode
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.ShadowRoot
import typings.std.ShadowRootInit
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined petit-dom.petit-dom.PetitDom.Props<std.HTMLBRElement> & {  content ? :petit-dom.petit-dom.PetitDom.Content | std.ReadonlyArray<petit-dom.petit-dom.PetitDom.Content>} */
trait PropsHTMLBRElementcontent extends js.Object {
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
  var accessKey: js.UndefOr[String] = js.undefined
  var accessKeyLabel: js.UndefOr[String] = js.undefined
  var addEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], 
      Unit
    ]
  ] = js.undefined
  var after: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var animate: js.UndefOr[js.Function1[/* keyframes */ js.Array[Keyframe], Animation]] = js.undefined
  var append: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var appendChild: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.undefined
  var assignedSlot: js.UndefOr[HTMLSlotElement] = js.undefined
  var attachShadow: js.UndefOr[js.Function1[/* init */ ShadowRootInit, ShadowRoot]] = js.undefined
  var attributes: js.UndefOr[NamedNodeMap] = js.undefined
  var autocapitalize: js.UndefOr[String] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var baseURI: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var blur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var childElementCount: js.UndefOr[Double] = js.undefined
  var childNodes: js.UndefOr[NodeListOf[ChildNode]] = js.undefined
  var children: js.UndefOr[HTMLCollection] = js.undefined
  var classList: js.UndefOr[DOMTokenList] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clear: js.UndefOr[String] = js.undefined
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  var clientHeight: js.UndefOr[Double] = js.undefined
  var clientLeft: js.UndefOr[Double] = js.undefined
  var clientTop: js.UndefOr[Double] = js.undefined
  var clientWidth: js.UndefOr[Double] = js.undefined
  var cloneNode: js.UndefOr[js.Function0[Node]] = js.undefined
  var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.undefined
  var contains: js.UndefOr[js.Function1[/* other */ Node, Boolean]] = js.undefined
  var content: js.UndefOr[Content | js.Array[Content]] = js.undefined
  var contentEditable: js.UndefOr[String] = js.undefined
  var dataset: js.UndefOr[DOMStringMap] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var firstChild: js.UndefOr[ChildNode] = js.undefined
  var firstElementChild: js.UndefOr[Element] = js.undefined
  var focus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getAnimations: js.UndefOr[js.Function0[js.Array[Animation]]] = js.undefined
  var getAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, String | Null]] = js.undefined
  var getAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, String | Null]] = js.undefined
  var getAttributeNames: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
  var getAttributeNode: js.UndefOr[js.Function1[/* name */ String, Attr | Null]] = js.undefined
  var getAttributeNodeNS: js.UndefOr[js.Function2[/* namespaceURI */ String, /* localName */ String, Attr | Null]] = js.undefined
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
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var innerHTML: js.UndefOr[String] = js.undefined
  var innerText: js.UndefOr[String] = js.undefined
  var inputMode: js.UndefOr[String] = js.undefined
  var insertAdjacentElement: js.UndefOr[
    js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  ] = js.undefined
  var insertAdjacentHTML: js.UndefOr[js.Function2[/* where */ InsertPosition, /* html */ String, Unit]] = js.undefined
  var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* text */ String, Unit]] = js.undefined
  var insertBefore: js.UndefOr[js.Function2[/* newChild */ Node, /* refChild */ Node, Node]] = js.undefined
  var isConnected: js.UndefOr[Boolean] = js.undefined
  var isContentEditable: js.UndefOr[Boolean] = js.undefined
  var isDefaultNamespace: js.UndefOr[js.Function1[/* namespace */ String, Boolean]] = js.undefined
  var isEqualNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var isSameNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var lastChild: js.UndefOr[ChildNode] = js.undefined
  var lastElementChild: js.UndefOr[Element] = js.undefined
  var localName: js.UndefOr[String] = js.undefined
  var lookupNamespaceURI: js.UndefOr[js.Function1[/* prefix */ String, String | Null]] = js.undefined
  var lookupPrefix: js.UndefOr[js.Function1[/* namespace */ String, String | Null]] = js.undefined
  var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
  var msGetRegionContent: js.UndefOr[js.Function0[_]] = js.undefined
  var namespaceURI: js.UndefOr[String] = js.undefined
  var nextElementSibling: js.UndefOr[Element] = js.undefined
  var nextSibling: js.UndefOr[ChildNode] = js.undefined
  var nodeName: js.UndefOr[String] = js.undefined
  var nodeType: js.UndefOr[Double] = js.undefined
  var nodeValue: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var normalize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var offsetHeight: js.UndefOr[Double] = js.undefined
  var offsetLeft: js.UndefOr[Double] = js.undefined
  var offsetParent: js.UndefOr[Element] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  var offsetWidth: js.UndefOr[Double] = js.undefined
  var onabort: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  var onanimationcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationiteration: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onauxclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onblur: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  var oncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oncanplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onclose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var oncopy: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var oncuechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oncut: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var ondblclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var ondrag: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragexit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ondragleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondrop: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onemptied: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onended: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onerror: js.UndefOr[OnErrorEventHandler] = js.undefined
  var onfocus: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  var onfullscreenchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onfullscreenerror: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ongotpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var oninput: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oninvalid: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onkeydown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onkeypress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onkeyup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onload: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onloadstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onlostpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onmousedown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmousemove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onpaste: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var onpause: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onplaying: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointermove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onprogress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], _]] = js.undefined
  var onratechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onreset: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onresize: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  var onscroll: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onsecuritypolicyviolation: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]] = js.undefined
  var onseeked: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onseeking: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onselect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onselectionchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onselectstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onstalled: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onsubmit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onsuspend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ontoggle: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ontouchcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchmove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontransitioncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionrun: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onwaiting: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onwheel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]] = js.undefined
  var outerHTML: js.UndefOr[String] = js.undefined
  var ownerDocument: js.UndefOr[Document] = js.undefined
  var parentElement: js.UndefOr[HTMLElement] = js.undefined
  var parentNode: js.UndefOr[Node with ParentNode] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var prepend: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var previousElementSibling: js.UndefOr[Element] = js.undefined
  var previousSibling: js.UndefOr[ChildNode] = js.undefined
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
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], 
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
  var shadowRoot: js.UndefOr[ShadowRoot] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSStyleDeclaration] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var textContent: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  var translate: js.UndefOr[Boolean] = js.undefined
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
}

object PropsHTMLBRElementcontent {
  @scala.inline
  def apply(
    ATTRIBUTE_NODE: js.UndefOr[Double] = js.undefined,
    CDATA_SECTION_NODE: js.UndefOr[Double] = js.undefined,
    COMMENT_NODE: js.UndefOr[Double] = js.undefined,
    DOCUMENT_FRAGMENT_NODE: js.UndefOr[Double] = js.undefined,
    DOCUMENT_NODE: js.UndefOr[Double] = js.undefined,
    DOCUMENT_POSITION_CONTAINED_BY: js.UndefOr[Double] = js.undefined,
    DOCUMENT_POSITION_CONTAINS: js.UndefOr[Double] = js.undefined,
    DOCUMENT_POSITION_DISCONNECTED: js.UndefOr[Double] = js.undefined,
    DOCUMENT_POSITION_FOLLOWING: js.UndefOr[Double] = js.undefined,
    DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.UndefOr[Double] = js.undefined,
    DOCUMENT_POSITION_PRECEDING: js.UndefOr[Double] = js.undefined,
    DOCUMENT_TYPE_NODE: js.UndefOr[Double] = js.undefined,
    ELEMENT_NODE: js.UndefOr[Double] = js.undefined,
    ENTITY_NODE: js.UndefOr[Double] = js.undefined,
    ENTITY_REFERENCE_NODE: js.UndefOr[Double] = js.undefined,
    NOTATION_NODE: js.UndefOr[Double] = js.undefined,
    PROCESSING_INSTRUCTION_NODE: js.UndefOr[Double] = js.undefined,
    TEXT_NODE: js.UndefOr[Double] = js.undefined,
    accessKey: String = null,
    accessKeyLabel: String = null,
    addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _]) => Unit = null,
    after: /* repeated */ Node | String => Unit = null,
    animate: /* keyframes */ js.Array[Keyframe] => Animation = null,
    append: /* repeated */ Node | String => Unit = null,
    appendChild: /* newChild */ Node => Node = null,
    assignedSlot: HTMLSlotElement = null,
    attachShadow: /* init */ ShadowRootInit => ShadowRoot = null,
    attributes: NamedNodeMap = null,
    autocapitalize: String = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    baseURI: String = null,
    before: /* repeated */ Node | String => Unit = null,
    blur: () => Unit = null,
    childElementCount: js.UndefOr[Double] = js.undefined,
    childNodes: NodeListOf[ChildNode] = null,
    children: HTMLCollection = null,
    classList: DOMTokenList = null,
    className: String = null,
    clear: String = null,
    click: () => Unit = null,
    clientHeight: js.UndefOr[Double] = js.undefined,
    clientLeft: js.UndefOr[Double] = js.undefined,
    clientTop: js.UndefOr[Double] = js.undefined,
    clientWidth: js.UndefOr[Double] = js.undefined,
    cloneNode: () => Node = null,
    closest: a => HTMLAnchorElement | Null = null,
    compareDocumentPosition: /* other */ Node => Double = null,
    contains: /* other */ Node => Boolean = null,
    content: Content | js.Array[Content] = null,
    contentEditable: String = null,
    dataset: DOMStringMap = null,
    dir: String = null,
    dispatchEvent: /* event */ Event => Boolean = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    firstChild: ChildNode = null,
    firstElementChild: Element = null,
    focus: () => Unit = null,
    getAnimations: () => js.Array[Animation] = null,
    getAttribute: /* qualifiedName */ String => String | Null = null,
    getAttributeNS: (/* namespace */ String, /* localName */ String) => String | Null = null,
    getAttributeNames: () => js.Array[String] = null,
    getAttributeNode: /* name */ String => Attr | Null = null,
    getAttributeNodeNS: (/* namespaceURI */ String, /* localName */ String) => Attr | Null = null,
    getBoundingClientRect: () => DOMRect = null,
    getClientRects: () => DOMRectList = null,
    getElementsByClassName: /* classNames */ String => HTMLCollectionOf[Element] = null,
    getElementsByTagName: a => HTMLCollectionOf[HTMLAnchorElement] = null,
    getElementsByTagNameNS: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement] = null,
    getRootNode: () => Node = null,
    hasAttribute: /* qualifiedName */ String => Boolean = null,
    hasAttributeNS: (/* namespace */ String, /* localName */ String) => Boolean = null,
    hasAttributes: () => Boolean = null,
    hasChildNodes: () => Boolean = null,
    hasPointerCapture: /* pointerId */ Double => Boolean = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    innerHTML: String = null,
    innerText: String = null,
    inputMode: String = null,
    insertAdjacentElement: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null = null,
    insertAdjacentHTML: (/* where */ InsertPosition, /* html */ String) => Unit = null,
    insertAdjacentText: (/* where */ InsertPosition, /* text */ String) => Unit = null,
    insertBefore: (/* newChild */ Node, /* refChild */ Node) => Node = null,
    isConnected: js.UndefOr[Boolean] = js.undefined,
    isContentEditable: js.UndefOr[Boolean] = js.undefined,
    isDefaultNamespace: /* namespace */ String => Boolean = null,
    isEqualNode: /* otherNode */ Node => Boolean = null,
    isSameNode: /* otherNode */ Node => Boolean = null,
    key: Key = null,
    lang: String = null,
    lastChild: ChildNode = null,
    lastElementChild: Element = null,
    localName: String = null,
    lookupNamespaceURI: /* prefix */ String => String | Null = null,
    lookupPrefix: /* namespace */ String => String | Null = null,
    matches: /* selectors */ String => Boolean = null,
    msGetRegionContent: () => _ = null,
    namespaceURI: String = null,
    nextElementSibling: Element = null,
    nextSibling: ChildNode = null,
    nodeName: String = null,
    nodeType: js.UndefOr[Double] = js.undefined,
    nodeValue: String = null,
    nonce: String = null,
    normalize: () => Unit = null,
    offsetHeight: js.UndefOr[Double] = js.undefined,
    offsetLeft: js.UndefOr[Double] = js.undefined,
    offsetParent: Element = null,
    offsetTop: js.UndefOr[Double] = js.undefined,
    offsetWidth: js.UndefOr[Double] = js.undefined,
    onabort: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ UIEvent, _] = null,
    onanimationcancel: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ AnimationEvent, _] = null,
    onanimationend: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ AnimationEvent, _] = null,
    onanimationiteration: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ AnimationEvent, _] = null,
    onanimationstart: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ AnimationEvent, _] = null,
    onauxclick: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ MouseEvent, _] = null,
    onblur: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ FocusEvent, _] = null,
    oncancel: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    oncanplay: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    oncanplaythrough: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onchange: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onclick: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ MouseEvent, _] = null,
    onclose: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    oncontextmenu: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ MouseEvent, _] = null,
    oncopy: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ ClipboardEvent, _] = null,
    oncuechange: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    oncut: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ ClipboardEvent, _] = null,
    ondblclick: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ MouseEvent, _] = null,
    ondrag: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ DragEvent, _] = null,
    ondragend: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ DragEvent, _] = null,
    ondragenter: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ DragEvent, _] = null,
    ondragexit: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    ondragleave: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ DragEvent, _] = null,
    ondragover: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ DragEvent, _] = null,
    ondragstart: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ DragEvent, _] = null,
    ondrop: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ DragEvent, _] = null,
    ondurationchange: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onemptied: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onended: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onerror: js.UndefOr[
      Null | ((/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any)
    ] = js.undefined,
    onfocus: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ FocusEvent, _] = null,
    onfullscreenchange: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onfullscreenerror: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    ongotpointercapture: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ PointerEvent, _] = null,
    oninput: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    oninvalid: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onkeydown: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ KeyboardEvent, _] = null,
    onkeypress: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ KeyboardEvent, _] = null,
    onkeyup: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ KeyboardEvent, _] = null,
    onload: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onloadeddata: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onloadedmetadata: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onloadstart: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onlostpointercapture: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ PointerEvent, _] = null,
    onmousedown: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ MouseEvent, _] = null,
    onmouseenter: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ MouseEvent, _] = null,
    onmouseleave: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ MouseEvent, _] = null,
    onmousemove: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ MouseEvent, _] = null,
    onmouseout: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ MouseEvent, _] = null,
    onmouseover: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ MouseEvent, _] = null,
    onmouseup: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ MouseEvent, _] = null,
    onpaste: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ ClipboardEvent, _] = null,
    onpause: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onplay: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onplaying: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onpointercancel: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ PointerEvent, _] = null,
    onpointerdown: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ PointerEvent, _] = null,
    onpointerenter: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ PointerEvent, _] = null,
    onpointerleave: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ PointerEvent, _] = null,
    onpointermove: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ PointerEvent, _] = null,
    onpointerout: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ PointerEvent, _] = null,
    onpointerover: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ PointerEvent, _] = null,
    onpointerup: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ PointerEvent, _] = null,
    onprogress: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ ProgressEvent[EventTarget], _] = null,
    onratechange: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onreset: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onresize: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ UIEvent, _] = null,
    onscroll: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onsecuritypolicyviolation: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ SecurityPolicyViolationEvent, _] = null,
    onseeked: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onseeking: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onselect: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onselectionchange: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onselectstart: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onstalled: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onsubmit: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onsuspend: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    ontimeupdate: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    ontoggle: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    ontouchcancel: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ TouchEvent, _] = null,
    ontouchend: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ TouchEvent, _] = null,
    ontouchmove: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ TouchEvent, _] = null,
    ontouchstart: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ TouchEvent, _] = null,
    ontransitioncancel: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ TransitionEvent, _] = null,
    ontransitionend: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ TransitionEvent, _] = null,
    ontransitionrun: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ TransitionEvent, _] = null,
    ontransitionstart: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ TransitionEvent, _] = null,
    onvolumechange: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onwaiting: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _] = null,
    onwheel: js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ WheelEvent, _] = null,
    outerHTML: String = null,
    ownerDocument: Document = null,
    parentElement: HTMLElement = null,
    parentNode: Node with ParentNode = null,
    prefix: String = null,
    prepend: /* repeated */ Node | String => Unit = null,
    previousElementSibling: Element = null,
    previousSibling: ChildNode = null,
    querySelector: a => HTMLAnchorElement | Null = null,
    querySelectorAll: a => NodeListOf[HTMLAnchorElement] = null,
    releasePointerCapture: /* pointerId */ Double => Unit = null,
    remove: () => Unit = null,
    removeAttribute: /* qualifiedName */ String => Unit = null,
    removeAttributeNS: (/* namespace */ String, /* localName */ String) => Unit = null,
    removeAttributeNode: /* attr */ Attr => Attr = null,
    removeChild: /* oldChild */ Node => Node = null,
    removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[PropsHTMLBRElementcontent, /* ev */ Event, _]) => Unit = null,
    replaceChild: (/* newChild */ Node, /* oldChild */ Node) => Node = null,
    replaceWith: /* repeated */ Node | String => Unit = null,
    requestFullscreen: () => js.Promise[Unit] = null,
    requestPointerLock: () => Unit = null,
    scroll: () => Unit = null,
    scrollBy: () => Unit = null,
    scrollHeight: js.UndefOr[Double] = js.undefined,
    scrollIntoView: () => Unit = null,
    scrollLeft: js.UndefOr[Double] = js.undefined,
    scrollTo: () => Unit = null,
    scrollTop: js.UndefOr[Double] = js.undefined,
    scrollWidth: js.UndefOr[Double] = js.undefined,
    setAttribute: (/* qualifiedName */ String, /* value */ String) => Unit = null,
    setAttributeNS: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit = null,
    setAttributeNode: /* attr */ Attr => Attr | Null = null,
    setAttributeNodeNS: /* attr */ Attr => Attr | Null = null,
    setPointerCapture: /* pointerId */ Double => Unit = null,
    shadowRoot: ShadowRoot = null,
    slot: String = null,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSStyleDeclaration = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    tagName: String = null,
    textContent: String = null,
    title: String = null,
    toggleAttribute: /* qualifiedName */ String => Boolean = null,
    translate: js.UndefOr[Boolean] = js.undefined,
    webkitMatchesSelector: /* selectors */ String => Boolean = null
  ): PropsHTMLBRElementcontent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ATTRIBUTE_NODE)) __obj.updateDynamic("ATTRIBUTE_NODE")(ATTRIBUTE_NODE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CDATA_SECTION_NODE)) __obj.updateDynamic("CDATA_SECTION_NODE")(CDATA_SECTION_NODE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(COMMENT_NODE)) __obj.updateDynamic("COMMENT_NODE")(COMMENT_NODE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DOCUMENT_FRAGMENT_NODE)) __obj.updateDynamic("DOCUMENT_FRAGMENT_NODE")(DOCUMENT_FRAGMENT_NODE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DOCUMENT_NODE)) __obj.updateDynamic("DOCUMENT_NODE")(DOCUMENT_NODE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DOCUMENT_POSITION_CONTAINED_BY)) __obj.updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(DOCUMENT_POSITION_CONTAINED_BY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DOCUMENT_POSITION_CONTAINS)) __obj.updateDynamic("DOCUMENT_POSITION_CONTAINS")(DOCUMENT_POSITION_CONTAINS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DOCUMENT_POSITION_DISCONNECTED)) __obj.updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(DOCUMENT_POSITION_DISCONNECTED.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DOCUMENT_POSITION_FOLLOWING)) __obj.updateDynamic("DOCUMENT_POSITION_FOLLOWING")(DOCUMENT_POSITION_FOLLOWING.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC)) __obj.updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DOCUMENT_POSITION_PRECEDING)) __obj.updateDynamic("DOCUMENT_POSITION_PRECEDING")(DOCUMENT_POSITION_PRECEDING.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DOCUMENT_TYPE_NODE)) __obj.updateDynamic("DOCUMENT_TYPE_NODE")(DOCUMENT_TYPE_NODE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ELEMENT_NODE)) __obj.updateDynamic("ELEMENT_NODE")(ELEMENT_NODE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ENTITY_NODE)) __obj.updateDynamic("ENTITY_NODE")(ENTITY_NODE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ENTITY_REFERENCE_NODE)) __obj.updateDynamic("ENTITY_REFERENCE_NODE")(ENTITY_REFERENCE_NODE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NOTATION_NODE)) __obj.updateDynamic("NOTATION_NODE")(NOTATION_NODE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PROCESSING_INSTRUCTION_NODE)) __obj.updateDynamic("PROCESSING_INSTRUCTION_NODE")(PROCESSING_INSTRUCTION_NODE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TEXT_NODE)) __obj.updateDynamic("TEXT_NODE")(TEXT_NODE.get.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (accessKeyLabel != null) __obj.updateDynamic("accessKeyLabel")(accessKeyLabel.asInstanceOf[js.Any])
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2(addEventListener))
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction1(animate))
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction1(append))
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1(appendChild))
    if (assignedSlot != null) __obj.updateDynamic("assignedSlot")(assignedSlot.asInstanceOf[js.Any])
    if (attachShadow != null) __obj.updateDynamic("attachShadow")(js.Any.fromFunction1(attachShadow))
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (autocapitalize != null) __obj.updateDynamic("autocapitalize")(autocapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.get.asInstanceOf[js.Any])
    if (baseURI != null) __obj.updateDynamic("baseURI")(baseURI.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction0(blur))
    if (!js.isUndefined(childElementCount)) __obj.updateDynamic("childElementCount")(childElementCount.get.asInstanceOf[js.Any])
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classList != null) __obj.updateDynamic("classList")(classList.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction0(click))
    if (!js.isUndefined(clientHeight)) __obj.updateDynamic("clientHeight")(clientHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientLeft)) __obj.updateDynamic("clientLeft")(clientLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientTop)) __obj.updateDynamic("clientTop")(clientTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientWidth)) __obj.updateDynamic("clientWidth")(clientWidth.get.asInstanceOf[js.Any])
    if (cloneNode != null) __obj.updateDynamic("cloneNode")(js.Any.fromFunction0(cloneNode))
    if (closest != null) __obj.updateDynamic("closest")(js.Any.fromFunction1(closest))
    if (compareDocumentPosition != null) __obj.updateDynamic("compareDocumentPosition")(js.Any.fromFunction1(compareDocumentPosition))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (dispatchEvent != null) __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1(dispatchEvent))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (firstElementChild != null) __obj.updateDynamic("firstElementChild")(firstElementChild.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction0(focus))
    if (getAnimations != null) __obj.updateDynamic("getAnimations")(js.Any.fromFunction0(getAnimations))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction1(getAttribute))
    if (getAttributeNS != null) __obj.updateDynamic("getAttributeNS")(js.Any.fromFunction2(getAttributeNS))
    if (getAttributeNames != null) __obj.updateDynamic("getAttributeNames")(js.Any.fromFunction0(getAttributeNames))
    if (getAttributeNode != null) __obj.updateDynamic("getAttributeNode")(js.Any.fromFunction1(getAttributeNode))
    if (getAttributeNodeNS != null) __obj.updateDynamic("getAttributeNodeNS")(js.Any.fromFunction2(getAttributeNodeNS))
    if (getBoundingClientRect != null) __obj.updateDynamic("getBoundingClientRect")(js.Any.fromFunction0(getBoundingClientRect))
    if (getClientRects != null) __obj.updateDynamic("getClientRects")(js.Any.fromFunction0(getClientRects))
    if (getElementsByClassName != null) __obj.updateDynamic("getElementsByClassName")(js.Any.fromFunction1(getElementsByClassName))
    if (getElementsByTagName != null) __obj.updateDynamic("getElementsByTagName")(js.Any.fromFunction1(getElementsByTagName))
    if (getElementsByTagNameNS != null) __obj.updateDynamic("getElementsByTagNameNS")(js.Any.fromFunction2(getElementsByTagNameNS))
    if (getRootNode != null) __obj.updateDynamic("getRootNode")(js.Any.fromFunction0(getRootNode))
    if (hasAttribute != null) __obj.updateDynamic("hasAttribute")(js.Any.fromFunction1(hasAttribute))
    if (hasAttributeNS != null) __obj.updateDynamic("hasAttributeNS")(js.Any.fromFunction2(hasAttributeNS))
    if (hasAttributes != null) __obj.updateDynamic("hasAttributes")(js.Any.fromFunction0(hasAttributes))
    if (hasChildNodes != null) __obj.updateDynamic("hasChildNodes")(js.Any.fromFunction0(hasChildNodes))
    if (hasPointerCapture != null) __obj.updateDynamic("hasPointerCapture")(js.Any.fromFunction1(hasPointerCapture))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    if (innerText != null) __obj.updateDynamic("innerText")(innerText.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (insertAdjacentElement != null) __obj.updateDynamic("insertAdjacentElement")(js.Any.fromFunction2(insertAdjacentElement))
    if (insertAdjacentHTML != null) __obj.updateDynamic("insertAdjacentHTML")(js.Any.fromFunction2(insertAdjacentHTML))
    if (insertAdjacentText != null) __obj.updateDynamic("insertAdjacentText")(js.Any.fromFunction2(insertAdjacentText))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction2(insertBefore))
    if (!js.isUndefined(isConnected)) __obj.updateDynamic("isConnected")(isConnected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isContentEditable)) __obj.updateDynamic("isContentEditable")(isContentEditable.get.asInstanceOf[js.Any])
    if (isDefaultNamespace != null) __obj.updateDynamic("isDefaultNamespace")(js.Any.fromFunction1(isDefaultNamespace))
    if (isEqualNode != null) __obj.updateDynamic("isEqualNode")(js.Any.fromFunction1(isEqualNode))
    if (isSameNode != null) __obj.updateDynamic("isSameNode")(js.Any.fromFunction1(isSameNode))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (lastElementChild != null) __obj.updateDynamic("lastElementChild")(lastElementChild.asInstanceOf[js.Any])
    if (localName != null) __obj.updateDynamic("localName")(localName.asInstanceOf[js.Any])
    if (lookupNamespaceURI != null) __obj.updateDynamic("lookupNamespaceURI")(js.Any.fromFunction1(lookupNamespaceURI))
    if (lookupPrefix != null) __obj.updateDynamic("lookupPrefix")(js.Any.fromFunction1(lookupPrefix))
    if (matches != null) __obj.updateDynamic("matches")(js.Any.fromFunction1(matches))
    if (msGetRegionContent != null) __obj.updateDynamic("msGetRegionContent")(js.Any.fromFunction0(msGetRegionContent))
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (nextElementSibling != null) __obj.updateDynamic("nextElementSibling")(nextElementSibling.asInstanceOf[js.Any])
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(nextSibling.asInstanceOf[js.Any])
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeType)) __obj.updateDynamic("nodeType")(nodeType.get.asInstanceOf[js.Any])
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction0(normalize))
    if (!js.isUndefined(offsetHeight)) __obj.updateDynamic("offsetHeight")(offsetHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetLeft)) __obj.updateDynamic("offsetLeft")(offsetLeft.get.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetTop)) __obj.updateDynamic("offsetTop")(offsetTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetWidth)) __obj.updateDynamic("offsetWidth")(offsetWidth.get.asInstanceOf[js.Any])
    if (onabort != null) __obj.updateDynamic("onabort")(onabort.asInstanceOf[js.Any])
    if (onanimationcancel != null) __obj.updateDynamic("onanimationcancel")(onanimationcancel.asInstanceOf[js.Any])
    if (onanimationend != null) __obj.updateDynamic("onanimationend")(onanimationend.asInstanceOf[js.Any])
    if (onanimationiteration != null) __obj.updateDynamic("onanimationiteration")(onanimationiteration.asInstanceOf[js.Any])
    if (onanimationstart != null) __obj.updateDynamic("onanimationstart")(onanimationstart.asInstanceOf[js.Any])
    if (onauxclick != null) __obj.updateDynamic("onauxclick")(onauxclick.asInstanceOf[js.Any])
    if (onblur != null) __obj.updateDynamic("onblur")(onblur.asInstanceOf[js.Any])
    if (oncancel != null) __obj.updateDynamic("oncancel")(oncancel.asInstanceOf[js.Any])
    if (oncanplay != null) __obj.updateDynamic("oncanplay")(oncanplay.asInstanceOf[js.Any])
    if (oncanplaythrough != null) __obj.updateDynamic("oncanplaythrough")(oncanplaythrough.asInstanceOf[js.Any])
    if (onchange != null) __obj.updateDynamic("onchange")(onchange.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (onclose != null) __obj.updateDynamic("onclose")(onclose.asInstanceOf[js.Any])
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu.asInstanceOf[js.Any])
    if (oncopy != null) __obj.updateDynamic("oncopy")(oncopy.asInstanceOf[js.Any])
    if (oncuechange != null) __obj.updateDynamic("oncuechange")(oncuechange.asInstanceOf[js.Any])
    if (oncut != null) __obj.updateDynamic("oncut")(oncut.asInstanceOf[js.Any])
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick.asInstanceOf[js.Any])
    if (ondrag != null) __obj.updateDynamic("ondrag")(ondrag.asInstanceOf[js.Any])
    if (ondragend != null) __obj.updateDynamic("ondragend")(ondragend.asInstanceOf[js.Any])
    if (ondragenter != null) __obj.updateDynamic("ondragenter")(ondragenter.asInstanceOf[js.Any])
    if (ondragexit != null) __obj.updateDynamic("ondragexit")(ondragexit.asInstanceOf[js.Any])
    if (ondragleave != null) __obj.updateDynamic("ondragleave")(ondragleave.asInstanceOf[js.Any])
    if (ondragover != null) __obj.updateDynamic("ondragover")(ondragover.asInstanceOf[js.Any])
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(ondragstart.asInstanceOf[js.Any])
    if (ondrop != null) __obj.updateDynamic("ondrop")(ondrop.asInstanceOf[js.Any])
    if (ondurationchange != null) __obj.updateDynamic("ondurationchange")(ondurationchange.asInstanceOf[js.Any])
    if (onemptied != null) __obj.updateDynamic("onemptied")(onemptied.asInstanceOf[js.Any])
    if (onended != null) __obj.updateDynamic("onended")(onended.asInstanceOf[js.Any])
    if (!js.isUndefined(onerror)) __obj.updateDynamic("onerror")(if (onerror != null) js.Any.fromFunction5(onerror.asInstanceOf[(/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any]) else null)
    if (onfocus != null) __obj.updateDynamic("onfocus")(onfocus.asInstanceOf[js.Any])
    if (onfullscreenchange != null) __obj.updateDynamic("onfullscreenchange")(onfullscreenchange.asInstanceOf[js.Any])
    if (onfullscreenerror != null) __obj.updateDynamic("onfullscreenerror")(onfullscreenerror.asInstanceOf[js.Any])
    if (ongotpointercapture != null) __obj.updateDynamic("ongotpointercapture")(ongotpointercapture.asInstanceOf[js.Any])
    if (oninput != null) __obj.updateDynamic("oninput")(oninput.asInstanceOf[js.Any])
    if (oninvalid != null) __obj.updateDynamic("oninvalid")(oninvalid.asInstanceOf[js.Any])
    if (onkeydown != null) __obj.updateDynamic("onkeydown")(onkeydown.asInstanceOf[js.Any])
    if (onkeypress != null) __obj.updateDynamic("onkeypress")(onkeypress.asInstanceOf[js.Any])
    if (onkeyup != null) __obj.updateDynamic("onkeyup")(onkeyup.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(onload.asInstanceOf[js.Any])
    if (onloadeddata != null) __obj.updateDynamic("onloadeddata")(onloadeddata.asInstanceOf[js.Any])
    if (onloadedmetadata != null) __obj.updateDynamic("onloadedmetadata")(onloadedmetadata.asInstanceOf[js.Any])
    if (onloadstart != null) __obj.updateDynamic("onloadstart")(onloadstart.asInstanceOf[js.Any])
    if (onlostpointercapture != null) __obj.updateDynamic("onlostpointercapture")(onlostpointercapture.asInstanceOf[js.Any])
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown.asInstanceOf[js.Any])
    if (onmouseenter != null) __obj.updateDynamic("onmouseenter")(onmouseenter.asInstanceOf[js.Any])
    if (onmouseleave != null) __obj.updateDynamic("onmouseleave")(onmouseleave.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(onmousemove.asInstanceOf[js.Any])
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout.asInstanceOf[js.Any])
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover.asInstanceOf[js.Any])
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(onmouseup.asInstanceOf[js.Any])
    if (onpaste != null) __obj.updateDynamic("onpaste")(onpaste.asInstanceOf[js.Any])
    if (onpause != null) __obj.updateDynamic("onpause")(onpause.asInstanceOf[js.Any])
    if (onplay != null) __obj.updateDynamic("onplay")(onplay.asInstanceOf[js.Any])
    if (onplaying != null) __obj.updateDynamic("onplaying")(onplaying.asInstanceOf[js.Any])
    if (onpointercancel != null) __obj.updateDynamic("onpointercancel")(onpointercancel.asInstanceOf[js.Any])
    if (onpointerdown != null) __obj.updateDynamic("onpointerdown")(onpointerdown.asInstanceOf[js.Any])
    if (onpointerenter != null) __obj.updateDynamic("onpointerenter")(onpointerenter.asInstanceOf[js.Any])
    if (onpointerleave != null) __obj.updateDynamic("onpointerleave")(onpointerleave.asInstanceOf[js.Any])
    if (onpointermove != null) __obj.updateDynamic("onpointermove")(onpointermove.asInstanceOf[js.Any])
    if (onpointerout != null) __obj.updateDynamic("onpointerout")(onpointerout.asInstanceOf[js.Any])
    if (onpointerover != null) __obj.updateDynamic("onpointerover")(onpointerover.asInstanceOf[js.Any])
    if (onpointerup != null) __obj.updateDynamic("onpointerup")(onpointerup.asInstanceOf[js.Any])
    if (onprogress != null) __obj.updateDynamic("onprogress")(onprogress.asInstanceOf[js.Any])
    if (onratechange != null) __obj.updateDynamic("onratechange")(onratechange.asInstanceOf[js.Any])
    if (onreset != null) __obj.updateDynamic("onreset")(onreset.asInstanceOf[js.Any])
    if (onresize != null) __obj.updateDynamic("onresize")(onresize.asInstanceOf[js.Any])
    if (onscroll != null) __obj.updateDynamic("onscroll")(onscroll.asInstanceOf[js.Any])
    if (onsecuritypolicyviolation != null) __obj.updateDynamic("onsecuritypolicyviolation")(onsecuritypolicyviolation.asInstanceOf[js.Any])
    if (onseeked != null) __obj.updateDynamic("onseeked")(onseeked.asInstanceOf[js.Any])
    if (onseeking != null) __obj.updateDynamic("onseeking")(onseeking.asInstanceOf[js.Any])
    if (onselect != null) __obj.updateDynamic("onselect")(onselect.asInstanceOf[js.Any])
    if (onselectionchange != null) __obj.updateDynamic("onselectionchange")(onselectionchange.asInstanceOf[js.Any])
    if (onselectstart != null) __obj.updateDynamic("onselectstart")(onselectstart.asInstanceOf[js.Any])
    if (onstalled != null) __obj.updateDynamic("onstalled")(onstalled.asInstanceOf[js.Any])
    if (onsubmit != null) __obj.updateDynamic("onsubmit")(onsubmit.asInstanceOf[js.Any])
    if (onsuspend != null) __obj.updateDynamic("onsuspend")(onsuspend.asInstanceOf[js.Any])
    if (ontimeupdate != null) __obj.updateDynamic("ontimeupdate")(ontimeupdate.asInstanceOf[js.Any])
    if (ontoggle != null) __obj.updateDynamic("ontoggle")(ontoggle.asInstanceOf[js.Any])
    if (ontouchcancel != null) __obj.updateDynamic("ontouchcancel")(ontouchcancel.asInstanceOf[js.Any])
    if (ontouchend != null) __obj.updateDynamic("ontouchend")(ontouchend.asInstanceOf[js.Any])
    if (ontouchmove != null) __obj.updateDynamic("ontouchmove")(ontouchmove.asInstanceOf[js.Any])
    if (ontouchstart != null) __obj.updateDynamic("ontouchstart")(ontouchstart.asInstanceOf[js.Any])
    if (ontransitioncancel != null) __obj.updateDynamic("ontransitioncancel")(ontransitioncancel.asInstanceOf[js.Any])
    if (ontransitionend != null) __obj.updateDynamic("ontransitionend")(ontransitionend.asInstanceOf[js.Any])
    if (ontransitionrun != null) __obj.updateDynamic("ontransitionrun")(ontransitionrun.asInstanceOf[js.Any])
    if (ontransitionstart != null) __obj.updateDynamic("ontransitionstart")(ontransitionstart.asInstanceOf[js.Any])
    if (onvolumechange != null) __obj.updateDynamic("onvolumechange")(onvolumechange.asInstanceOf[js.Any])
    if (onwaiting != null) __obj.updateDynamic("onwaiting")(onwaiting.asInstanceOf[js.Any])
    if (onwheel != null) __obj.updateDynamic("onwheel")(onwheel.asInstanceOf[js.Any])
    if (outerHTML != null) __obj.updateDynamic("outerHTML")(outerHTML.asInstanceOf[js.Any])
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument.asInstanceOf[js.Any])
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prepend != null) __obj.updateDynamic("prepend")(js.Any.fromFunction1(prepend))
    if (previousElementSibling != null) __obj.updateDynamic("previousElementSibling")(previousElementSibling.asInstanceOf[js.Any])
    if (previousSibling != null) __obj.updateDynamic("previousSibling")(previousSibling.asInstanceOf[js.Any])
    if (querySelector != null) __obj.updateDynamic("querySelector")(js.Any.fromFunction1(querySelector))
    if (querySelectorAll != null) __obj.updateDynamic("querySelectorAll")(js.Any.fromFunction1(querySelectorAll))
    if (releasePointerCapture != null) __obj.updateDynamic("releasePointerCapture")(js.Any.fromFunction1(releasePointerCapture))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction0(remove))
    if (removeAttribute != null) __obj.updateDynamic("removeAttribute")(js.Any.fromFunction1(removeAttribute))
    if (removeAttributeNS != null) __obj.updateDynamic("removeAttributeNS")(js.Any.fromFunction2(removeAttributeNS))
    if (removeAttributeNode != null) __obj.updateDynamic("removeAttributeNode")(js.Any.fromFunction1(removeAttributeNode))
    if (removeChild != null) __obj.updateDynamic("removeChild")(js.Any.fromFunction1(removeChild))
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2(removeEventListener))
    if (replaceChild != null) __obj.updateDynamic("replaceChild")(js.Any.fromFunction2(replaceChild))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1(replaceWith))
    if (requestFullscreen != null) __obj.updateDynamic("requestFullscreen")(js.Any.fromFunction0(requestFullscreen))
    if (requestPointerLock != null) __obj.updateDynamic("requestPointerLock")(js.Any.fromFunction0(requestPointerLock))
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction0(scroll))
    if (scrollBy != null) __obj.updateDynamic("scrollBy")(js.Any.fromFunction0(scrollBy))
    if (!js.isUndefined(scrollHeight)) __obj.updateDynamic("scrollHeight")(scrollHeight.get.asInstanceOf[js.Any])
    if (scrollIntoView != null) __obj.updateDynamic("scrollIntoView")(js.Any.fromFunction0(scrollIntoView))
    if (!js.isUndefined(scrollLeft)) __obj.updateDynamic("scrollLeft")(scrollLeft.get.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction0(scrollTo))
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollWidth)) __obj.updateDynamic("scrollWidth")(scrollWidth.get.asInstanceOf[js.Any])
    if (setAttribute != null) __obj.updateDynamic("setAttribute")(js.Any.fromFunction2(setAttribute))
    if (setAttributeNS != null) __obj.updateDynamic("setAttributeNS")(js.Any.fromFunction3(setAttributeNS))
    if (setAttributeNode != null) __obj.updateDynamic("setAttributeNode")(js.Any.fromFunction1(setAttributeNode))
    if (setAttributeNodeNS != null) __obj.updateDynamic("setAttributeNodeNS")(js.Any.fromFunction1(setAttributeNodeNS))
    if (setPointerCapture != null) __obj.updateDynamic("setPointerCapture")(js.Any.fromFunction1(setPointerCapture))
    if (shadowRoot != null) __obj.updateDynamic("shadowRoot")(shadowRoot.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toggleAttribute != null) __obj.updateDynamic("toggleAttribute")(js.Any.fromFunction1(toggleAttribute))
    if (!js.isUndefined(translate)) __obj.updateDynamic("translate")(translate.get.asInstanceOf[js.Any])
    if (webkitMatchesSelector != null) __obj.updateDynamic("webkitMatchesSelector")(js.Any.fromFunction1(webkitMatchesSelector))
    __obj.asInstanceOf[PropsHTMLBRElementcontent]
  }
}

