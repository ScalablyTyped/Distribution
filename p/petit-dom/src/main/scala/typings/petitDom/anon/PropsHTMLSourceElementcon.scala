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

/* Inlined petit-dom.petit-dom.PetitDom.Props<std.HTMLSourceElement> & {  content :petit-dom.petit-dom.PetitDom.Content | std.ReadonlyArray<petit-dom.petit-dom.PetitDom.Content> | undefined} */
@js.native
trait PropsHTMLSourceElementcon extends js.Object {
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
  var accessKey: js.UndefOr[String] = js.native
  var accessKeyLabel: js.UndefOr[String] = js.native
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
  var autocapitalize: js.UndefOr[String] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var baseURI: js.UndefOr[String] = js.native
  var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  var blur: js.UndefOr[js.Function0[Unit]] = js.native
  var childElementCount: js.UndefOr[Double] = js.native
  var childNodes: js.UndefOr[NodeListOf[ChildNode]] = js.native
  var children: js.UndefOr[HTMLCollection] = js.native
  var classList: js.UndefOr[DOMTokenList] = js.native
  var className: js.UndefOr[String] = js.native
  var click: js.UndefOr[js.Function0[Unit]] = js.native
  var clientHeight: js.UndefOr[Double] = js.native
  var clientLeft: js.UndefOr[Double] = js.native
  var clientTop: js.UndefOr[Double] = js.native
  var clientWidth: js.UndefOr[Double] = js.native
  var cloneNode: js.UndefOr[js.Function0[Node]] = js.native
  var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.native
  var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.native
  var contains: js.UndefOr[js.Function0[Boolean]] = js.native
  var content: js.UndefOr[Content | js.Array[Content]] = js.native
  var contentEditable: js.UndefOr[String] = js.native
  var dataset: js.UndefOr[DOMStringMap] = js.native
  var dir: js.UndefOr[String] = js.native
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var firstChild: js.UndefOr[ChildNode | Null] = js.native
  var firstElementChild: js.UndefOr[Element | Null] = js.native
  var focus: js.UndefOr[js.Function0[Unit]] = js.native
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
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var innerHTML: js.UndefOr[String] = js.native
  var innerText: js.UndefOr[String] = js.native
  var inputMode: js.UndefOr[String] = js.native
  var insertAdjacentElement: js.UndefOr[
    js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  ] = js.native
  var insertAdjacentHTML: js.UndefOr[js.Function2[/* where */ InsertPosition, /* html */ String, Unit]] = js.native
  var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* text */ String, Unit]] = js.native
  var insertBefore: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.native
  var isConnected: js.UndefOr[Boolean] = js.native
  var isContentEditable: js.UndefOr[Boolean] = js.native
  var isDefaultNamespace: js.UndefOr[js.Function0[Boolean]] = js.native
  var isEqualNode: js.UndefOr[js.Function0[Boolean]] = js.native
  var isSameNode: js.UndefOr[js.Function0[Boolean]] = js.native
  var key: js.UndefOr[Key] = js.native
  var lang: js.UndefOr[String] = js.native
  var lastChild: js.UndefOr[ChildNode | Null] = js.native
  var lastElementChild: js.UndefOr[Element | Null] = js.native
  var localName: js.UndefOr[String] = js.native
  var lookupNamespaceURI: js.UndefOr[js.Function0[String | Null]] = js.native
  var lookupPrefix: js.UndefOr[js.Function0[String | Null]] = js.native
  var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.native
  var media: js.UndefOr[String] = js.native
  var msGetRegionContent: js.UndefOr[js.Function0[_]] = js.native
  var namespaceURI: js.UndefOr[String | Null] = js.native
  var nextElementSibling: js.UndefOr[Element | Null] = js.native
  var nextSibling: js.UndefOr[ChildNode | Null] = js.native
  var nodeName: js.UndefOr[String] = js.native
  var nodeType: js.UndefOr[Double] = js.native
  var nodeValue: js.UndefOr[String | Null] = js.native
  var nonce: js.UndefOr[String] = js.native
  var normalize: js.UndefOr[js.Function0[Unit]] = js.native
  var offsetHeight: js.UndefOr[Double] = js.native
  var offsetLeft: js.UndefOr[Double] = js.native
  var offsetParent: js.UndefOr[Element | Null] = js.native
  var offsetTop: js.UndefOr[Double] = js.native
  var offsetWidth: js.UndefOr[Double] = js.native
  var onabort: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null] = js.native
  var onanimationcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  var onanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  var onanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  var onanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  var onauxclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onblur: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null] = js.native
  var oncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var oncanplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var oncanplaythrough: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onclose: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var oncontextmenu: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var oncopy: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null] = js.native
  var oncuechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var oncut: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null] = js.native
  var ondblclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var ondrag: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondragend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondragenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondragexit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var ondragleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondragover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondragstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondrop: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondurationchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onemptied: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onended: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onerror: js.UndefOr[OnErrorEventHandler] = js.native
  var onfocus: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null] = js.native
  var onfullscreenchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onfullscreenerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var ongotpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var oninput: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var oninvalid: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onkeydown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null] = js.native
  var onkeypress: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null] = js.native
  var onkeyup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null] = js.native
  var onload: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onloadeddata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onloadedmetadata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onloadstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onlostpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onmousedown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmouseenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmouseleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmousemove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmouseout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmouseover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmouseup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onpaste: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null] = js.native
  var onpause: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onplaying: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onpointercancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerdown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointermove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onprogress: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], _]) | Null
  ] = js.native
  var onratechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onreset: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onresize: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null] = js.native
  var onscroll: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onsecuritypolicyviolation: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]) | Null
  ] = js.native
  var onseeked: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onseeking: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onselect: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onselectionchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onselectstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onstalled: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onsubmit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onsuspend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var ontimeupdate: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var ontoggle: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontransitioncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  var ontransitionend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  var ontransitionrun: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  var ontransitionstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  var onvolumechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onwaiting: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onwheel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]) | Null] = js.native
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
  var sizes: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellcheck: js.UndefOr[Boolean] = js.native
  var src: js.UndefOr[String] = js.native
  var srcset: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSStyleDeclaration] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tagName: js.UndefOr[String] = js.native
  var textContent: js.UndefOr[String | Null] = js.native
  var title: js.UndefOr[String] = js.native
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.native
  var translate: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.native
}

object PropsHTMLSourceElementcon {
  @scala.inline
  def apply(): PropsHTMLSourceElementcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsHTMLSourceElementcon]
  }
  @scala.inline
  implicit class PropsHTMLSourceElementconOps[Self <: PropsHTMLSourceElementcon] (val x: Self) extends AnyVal {
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
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAccessKeyLabel(value: String): Self = this.set("accessKeyLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKeyLabel: Self = this.set("accessKeyLabel", js.undefined)
    @scala.inline
    def setAddEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]) => Unit
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
    def setAutocapitalize(value: String): Self = this.set("autocapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocapitalize: Self = this.set("autocapitalize", js.undefined)
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    @scala.inline
    def setBaseURI(value: String): Self = this.set("baseURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseURI: Self = this.set("baseURI", js.undefined)
    @scala.inline
    def setBefore(value: /* repeated */ Node | String => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setBlur(value: () => Unit): Self = this.set("blur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
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
    def setClick(value: () => Unit): Self = this.set("click", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
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
    def setContentEditable(value: String): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    @scala.inline
    def setDataset(value: DOMStringMap): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDispatchEvent(value: /* event */ Event => Boolean): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDispatchEvent: Self = this.set("dispatchEvent", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
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
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
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
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInnerHTML(value: String): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerHTML: Self = this.set("innerHTML", js.undefined)
    @scala.inline
    def setInnerText(value: String): Self = this.set("innerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerText: Self = this.set("innerText", js.undefined)
    @scala.inline
    def setInputMode(value: String): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
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
    def setIsContentEditable(value: Boolean): Self = this.set("isContentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsContentEditable: Self = this.set("isContentEditable", js.undefined)
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
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
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
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
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
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setNormalize(value: () => Unit): Self = this.set("normalize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    @scala.inline
    def setOffsetHeight(value: Double): Self = this.set("offsetHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetHeight: Self = this.set("offsetHeight", js.undefined)
    @scala.inline
    def setOffsetLeft(value: Double): Self = this.set("offsetLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetLeft: Self = this.set("offsetLeft", js.undefined)
    @scala.inline
    def setOffsetParent(value: Element): Self = this.set("offsetParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetParent: Self = this.set("offsetParent", js.undefined)
    @scala.inline
    def setOffsetParentNull: Self = this.set("offsetParent", null)
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTop: Self = this.set("offsetTop", js.undefined)
    @scala.inline
    def setOffsetWidth(value: Double): Self = this.set("offsetWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetWidth: Self = this.set("offsetWidth", js.undefined)
    @scala.inline
    def setOnabort(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ UIEvent, _]): Self = this.set("onabort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnabort: Self = this.set("onabort", js.undefined)
    @scala.inline
    def setOnabortNull: Self = this.set("onabort", null)
    @scala.inline
    def setOnanimationcancel(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ AnimationEvent, _]): Self = this.set("onanimationcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationcancel: Self = this.set("onanimationcancel", js.undefined)
    @scala.inline
    def setOnanimationcancelNull: Self = this.set("onanimationcancel", null)
    @scala.inline
    def setOnanimationend(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ AnimationEvent, _]): Self = this.set("onanimationend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationend: Self = this.set("onanimationend", js.undefined)
    @scala.inline
    def setOnanimationendNull: Self = this.set("onanimationend", null)
    @scala.inline
    def setOnanimationiteration(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ AnimationEvent, _]): Self = this.set("onanimationiteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationiteration: Self = this.set("onanimationiteration", js.undefined)
    @scala.inline
    def setOnanimationiterationNull: Self = this.set("onanimationiteration", null)
    @scala.inline
    def setOnanimationstart(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ AnimationEvent, _]): Self = this.set("onanimationstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationstart: Self = this.set("onanimationstart", js.undefined)
    @scala.inline
    def setOnanimationstartNull: Self = this.set("onanimationstart", null)
    @scala.inline
    def setOnauxclick(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ MouseEvent, _]): Self = this.set("onauxclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnauxclick: Self = this.set("onauxclick", js.undefined)
    @scala.inline
    def setOnauxclickNull: Self = this.set("onauxclick", null)
    @scala.inline
    def setOnblur(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ FocusEvent, _]): Self = this.set("onblur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnblur: Self = this.set("onblur", js.undefined)
    @scala.inline
    def setOnblurNull: Self = this.set("onblur", null)
    @scala.inline
    def setOncancel(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("oncancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncancel: Self = this.set("oncancel", js.undefined)
    @scala.inline
    def setOncancelNull: Self = this.set("oncancel", null)
    @scala.inline
    def setOncanplay(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("oncanplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncanplay: Self = this.set("oncanplay", js.undefined)
    @scala.inline
    def setOncanplayNull: Self = this.set("oncanplay", null)
    @scala.inline
    def setOncanplaythrough(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("oncanplaythrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncanplaythrough: Self = this.set("oncanplaythrough", js.undefined)
    @scala.inline
    def setOncanplaythroughNull: Self = this.set("oncanplaythrough", null)
    @scala.inline
    def setOnchange(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnchange: Self = this.set("onchange", js.undefined)
    @scala.inline
    def setOnchangeNull: Self = this.set("onchange", null)
    @scala.inline
    def setOnclick(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ MouseEvent, _]): Self = this.set("onclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    @scala.inline
    def setOnclickNull: Self = this.set("onclick", null)
    @scala.inline
    def setOnclose(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onclose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    @scala.inline
    def setOncloseNull: Self = this.set("onclose", null)
    @scala.inline
    def setOncontextmenu(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ MouseEvent, _]): Self = this.set("oncontextmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncontextmenu: Self = this.set("oncontextmenu", js.undefined)
    @scala.inline
    def setOncontextmenuNull: Self = this.set("oncontextmenu", null)
    @scala.inline
    def setOncopy(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ ClipboardEvent, _]): Self = this.set("oncopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncopy: Self = this.set("oncopy", js.undefined)
    @scala.inline
    def setOncopyNull: Self = this.set("oncopy", null)
    @scala.inline
    def setOncuechange(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("oncuechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncuechange: Self = this.set("oncuechange", js.undefined)
    @scala.inline
    def setOncuechangeNull: Self = this.set("oncuechange", null)
    @scala.inline
    def setOncut(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ ClipboardEvent, _]): Self = this.set("oncut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncut: Self = this.set("oncut", js.undefined)
    @scala.inline
    def setOncutNull: Self = this.set("oncut", null)
    @scala.inline
    def setOndblclick(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ MouseEvent, _]): Self = this.set("ondblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndblclick: Self = this.set("ondblclick", js.undefined)
    @scala.inline
    def setOndblclickNull: Self = this.set("ondblclick", null)
    @scala.inline
    def setOndrag(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ DragEvent, _]): Self = this.set("ondrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndrag: Self = this.set("ondrag", js.undefined)
    @scala.inline
    def setOndragNull: Self = this.set("ondrag", null)
    @scala.inline
    def setOndragend(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ DragEvent, _]): Self = this.set("ondragend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragend: Self = this.set("ondragend", js.undefined)
    @scala.inline
    def setOndragendNull: Self = this.set("ondragend", null)
    @scala.inline
    def setOndragenter(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ DragEvent, _]): Self = this.set("ondragenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragenter: Self = this.set("ondragenter", js.undefined)
    @scala.inline
    def setOndragenterNull: Self = this.set("ondragenter", null)
    @scala.inline
    def setOndragexit(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("ondragexit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragexit: Self = this.set("ondragexit", js.undefined)
    @scala.inline
    def setOndragexitNull: Self = this.set("ondragexit", null)
    @scala.inline
    def setOndragleave(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ DragEvent, _]): Self = this.set("ondragleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragleave: Self = this.set("ondragleave", js.undefined)
    @scala.inline
    def setOndragleaveNull: Self = this.set("ondragleave", null)
    @scala.inline
    def setOndragover(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ DragEvent, _]): Self = this.set("ondragover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragover: Self = this.set("ondragover", js.undefined)
    @scala.inline
    def setOndragoverNull: Self = this.set("ondragover", null)
    @scala.inline
    def setOndragstart(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ DragEvent, _]): Self = this.set("ondragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragstart: Self = this.set("ondragstart", js.undefined)
    @scala.inline
    def setOndragstartNull: Self = this.set("ondragstart", null)
    @scala.inline
    def setOndrop(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ DragEvent, _]): Self = this.set("ondrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndrop: Self = this.set("ondrop", js.undefined)
    @scala.inline
    def setOndropNull: Self = this.set("ondrop", null)
    @scala.inline
    def setOndurationchange(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("ondurationchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndurationchange: Self = this.set("ondurationchange", js.undefined)
    @scala.inline
    def setOndurationchangeNull: Self = this.set("ondurationchange", null)
    @scala.inline
    def setOnemptied(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onemptied", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnemptied: Self = this.set("onemptied", js.undefined)
    @scala.inline
    def setOnemptiedNull: Self = this.set("onemptied", null)
    @scala.inline
    def setOnended(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnended: Self = this.set("onended", js.undefined)
    @scala.inline
    def setOnendedNull: Self = this.set("onended", null)
    @scala.inline
    def setOnerror(
      value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any
    ): Self = this.set("onerror", js.Any.fromFunction5(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setOnerrorNull: Self = this.set("onerror", null)
    @scala.inline
    def setOnfocus(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ FocusEvent, _]): Self = this.set("onfocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnfocus: Self = this.set("onfocus", js.undefined)
    @scala.inline
    def setOnfocusNull: Self = this.set("onfocus", null)
    @scala.inline
    def setOnfullscreenchange(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onfullscreenchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnfullscreenchange: Self = this.set("onfullscreenchange", js.undefined)
    @scala.inline
    def setOnfullscreenchangeNull: Self = this.set("onfullscreenchange", null)
    @scala.inline
    def setOnfullscreenerror(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onfullscreenerror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnfullscreenerror: Self = this.set("onfullscreenerror", js.undefined)
    @scala.inline
    def setOnfullscreenerrorNull: Self = this.set("onfullscreenerror", null)
    @scala.inline
    def setOngotpointercapture(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ PointerEvent, _]): Self = this.set("ongotpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOngotpointercapture: Self = this.set("ongotpointercapture", js.undefined)
    @scala.inline
    def setOngotpointercaptureNull: Self = this.set("ongotpointercapture", null)
    @scala.inline
    def setOninput(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("oninput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOninput: Self = this.set("oninput", js.undefined)
    @scala.inline
    def setOninputNull: Self = this.set("oninput", null)
    @scala.inline
    def setOninvalid(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("oninvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOninvalid: Self = this.set("oninvalid", js.undefined)
    @scala.inline
    def setOninvalidNull: Self = this.set("oninvalid", null)
    @scala.inline
    def setOnkeydown(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ KeyboardEvent, _]): Self = this.set("onkeydown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeydown: Self = this.set("onkeydown", js.undefined)
    @scala.inline
    def setOnkeydownNull: Self = this.set("onkeydown", null)
    @scala.inline
    def setOnkeypress(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ KeyboardEvent, _]): Self = this.set("onkeypress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeypress: Self = this.set("onkeypress", js.undefined)
    @scala.inline
    def setOnkeypressNull: Self = this.set("onkeypress", null)
    @scala.inline
    def setOnkeyup(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ KeyboardEvent, _]): Self = this.set("onkeyup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeyup: Self = this.set("onkeyup", js.undefined)
    @scala.inline
    def setOnkeyupNull: Self = this.set("onkeyup", null)
    @scala.inline
    def setOnload(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setOnloadNull: Self = this.set("onload", null)
    @scala.inline
    def setOnloadeddata(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onloadeddata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadeddata: Self = this.set("onloadeddata", js.undefined)
    @scala.inline
    def setOnloadeddataNull: Self = this.set("onloadeddata", null)
    @scala.inline
    def setOnloadedmetadata(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onloadedmetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadedmetadata: Self = this.set("onloadedmetadata", js.undefined)
    @scala.inline
    def setOnloadedmetadataNull: Self = this.set("onloadedmetadata", null)
    @scala.inline
    def setOnloadstart(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onloadstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadstart: Self = this.set("onloadstart", js.undefined)
    @scala.inline
    def setOnloadstartNull: Self = this.set("onloadstart", null)
    @scala.inline
    def setOnlostpointercapture(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ PointerEvent, _]): Self = this.set("onlostpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlostpointercapture: Self = this.set("onlostpointercapture", js.undefined)
    @scala.inline
    def setOnlostpointercaptureNull: Self = this.set("onlostpointercapture", null)
    @scala.inline
    def setOnmousedown(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ MouseEvent, _]): Self = this.set("onmousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmousedown: Self = this.set("onmousedown", js.undefined)
    @scala.inline
    def setOnmousedownNull: Self = this.set("onmousedown", null)
    @scala.inline
    def setOnmouseenter(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ MouseEvent, _]): Self = this.set("onmouseenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseenter: Self = this.set("onmouseenter", js.undefined)
    @scala.inline
    def setOnmouseenterNull: Self = this.set("onmouseenter", null)
    @scala.inline
    def setOnmouseleave(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ MouseEvent, _]): Self = this.set("onmouseleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseleave: Self = this.set("onmouseleave", js.undefined)
    @scala.inline
    def setOnmouseleaveNull: Self = this.set("onmouseleave", null)
    @scala.inline
    def setOnmousemove(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ MouseEvent, _]): Self = this.set("onmousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmousemove: Self = this.set("onmousemove", js.undefined)
    @scala.inline
    def setOnmousemoveNull: Self = this.set("onmousemove", null)
    @scala.inline
    def setOnmouseout(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ MouseEvent, _]): Self = this.set("onmouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    @scala.inline
    def setOnmouseoutNull: Self = this.set("onmouseout", null)
    @scala.inline
    def setOnmouseover(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ MouseEvent, _]): Self = this.set("onmouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    @scala.inline
    def setOnmouseoverNull: Self = this.set("onmouseover", null)
    @scala.inline
    def setOnmouseup(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ MouseEvent, _]): Self = this.set("onmouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseup: Self = this.set("onmouseup", js.undefined)
    @scala.inline
    def setOnmouseupNull: Self = this.set("onmouseup", null)
    @scala.inline
    def setOnpaste(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ ClipboardEvent, _]): Self = this.set("onpaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpaste: Self = this.set("onpaste", js.undefined)
    @scala.inline
    def setOnpasteNull: Self = this.set("onpaste", null)
    @scala.inline
    def setOnpause(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onpause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpause: Self = this.set("onpause", js.undefined)
    @scala.inline
    def setOnpauseNull: Self = this.set("onpause", null)
    @scala.inline
    def setOnplay(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnplay: Self = this.set("onplay", js.undefined)
    @scala.inline
    def setOnplayNull: Self = this.set("onplay", null)
    @scala.inline
    def setOnplaying(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onplaying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnplaying: Self = this.set("onplaying", js.undefined)
    @scala.inline
    def setOnplayingNull: Self = this.set("onplaying", null)
    @scala.inline
    def setOnpointercancel(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ PointerEvent, _]): Self = this.set("onpointercancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointercancel: Self = this.set("onpointercancel", js.undefined)
    @scala.inline
    def setOnpointercancelNull: Self = this.set("onpointercancel", null)
    @scala.inline
    def setOnpointerdown(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ PointerEvent, _]): Self = this.set("onpointerdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerdown: Self = this.set("onpointerdown", js.undefined)
    @scala.inline
    def setOnpointerdownNull: Self = this.set("onpointerdown", null)
    @scala.inline
    def setOnpointerenter(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ PointerEvent, _]): Self = this.set("onpointerenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerenter: Self = this.set("onpointerenter", js.undefined)
    @scala.inline
    def setOnpointerenterNull: Self = this.set("onpointerenter", null)
    @scala.inline
    def setOnpointerleave(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ PointerEvent, _]): Self = this.set("onpointerleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerleave: Self = this.set("onpointerleave", js.undefined)
    @scala.inline
    def setOnpointerleaveNull: Self = this.set("onpointerleave", null)
    @scala.inline
    def setOnpointermove(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ PointerEvent, _]): Self = this.set("onpointermove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointermove: Self = this.set("onpointermove", js.undefined)
    @scala.inline
    def setOnpointermoveNull: Self = this.set("onpointermove", null)
    @scala.inline
    def setOnpointerout(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ PointerEvent, _]): Self = this.set("onpointerout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerout: Self = this.set("onpointerout", js.undefined)
    @scala.inline
    def setOnpointeroutNull: Self = this.set("onpointerout", null)
    @scala.inline
    def setOnpointerover(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ PointerEvent, _]): Self = this.set("onpointerover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerover: Self = this.set("onpointerover", js.undefined)
    @scala.inline
    def setOnpointeroverNull: Self = this.set("onpointerover", null)
    @scala.inline
    def setOnpointerup(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ PointerEvent, _]): Self = this.set("onpointerup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerup: Self = this.set("onpointerup", js.undefined)
    @scala.inline
    def setOnpointerupNull: Self = this.set("onpointerup", null)
    @scala.inline
    def setOnprogress(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ ProgressEvent[EventTarget], _]): Self = this.set("onprogress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
    @scala.inline
    def setOnprogressNull: Self = this.set("onprogress", null)
    @scala.inline
    def setOnratechange(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onratechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnratechange: Self = this.set("onratechange", js.undefined)
    @scala.inline
    def setOnratechangeNull: Self = this.set("onratechange", null)
    @scala.inline
    def setOnreset(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnreset: Self = this.set("onreset", js.undefined)
    @scala.inline
    def setOnresetNull: Self = this.set("onreset", null)
    @scala.inline
    def setOnresize(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ UIEvent, _]): Self = this.set("onresize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnresize: Self = this.set("onresize", js.undefined)
    @scala.inline
    def setOnresizeNull: Self = this.set("onresize", null)
    @scala.inline
    def setOnscroll(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onscroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnscroll: Self = this.set("onscroll", js.undefined)
    @scala.inline
    def setOnscrollNull: Self = this.set("onscroll", null)
    @scala.inline
    def setOnsecuritypolicyviolation(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ SecurityPolicyViolationEvent, _]): Self = this.set("onsecuritypolicyviolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsecuritypolicyviolation: Self = this.set("onsecuritypolicyviolation", js.undefined)
    @scala.inline
    def setOnsecuritypolicyviolationNull: Self = this.set("onsecuritypolicyviolation", null)
    @scala.inline
    def setOnseeked(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onseeked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnseeked: Self = this.set("onseeked", js.undefined)
    @scala.inline
    def setOnseekedNull: Self = this.set("onseeked", null)
    @scala.inline
    def setOnseeking(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onseeking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnseeking: Self = this.set("onseeking", js.undefined)
    @scala.inline
    def setOnseekingNull: Self = this.set("onseeking", null)
    @scala.inline
    def setOnselect(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnselect: Self = this.set("onselect", js.undefined)
    @scala.inline
    def setOnselectNull: Self = this.set("onselect", null)
    @scala.inline
    def setOnselectionchange(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onselectionchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnselectionchange: Self = this.set("onselectionchange", js.undefined)
    @scala.inline
    def setOnselectionchangeNull: Self = this.set("onselectionchange", null)
    @scala.inline
    def setOnselectstart(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onselectstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnselectstart: Self = this.set("onselectstart", js.undefined)
    @scala.inline
    def setOnselectstartNull: Self = this.set("onselectstart", null)
    @scala.inline
    def setOnstalled(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onstalled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnstalled: Self = this.set("onstalled", js.undefined)
    @scala.inline
    def setOnstalledNull: Self = this.set("onstalled", null)
    @scala.inline
    def setOnsubmit(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onsubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsubmit: Self = this.set("onsubmit", js.undefined)
    @scala.inline
    def setOnsubmitNull: Self = this.set("onsubmit", null)
    @scala.inline
    def setOnsuspend(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onsuspend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsuspend: Self = this.set("onsuspend", js.undefined)
    @scala.inline
    def setOnsuspendNull: Self = this.set("onsuspend", null)
    @scala.inline
    def setOntimeupdate(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("ontimeupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntimeupdate: Self = this.set("ontimeupdate", js.undefined)
    @scala.inline
    def setOntimeupdateNull: Self = this.set("ontimeupdate", null)
    @scala.inline
    def setOntoggle(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("ontoggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntoggle: Self = this.set("ontoggle", js.undefined)
    @scala.inline
    def setOntoggleNull: Self = this.set("ontoggle", null)
    @scala.inline
    def setOntouchcancel(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ TouchEvent, _]): Self = this.set("ontouchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchcancel: Self = this.set("ontouchcancel", js.undefined)
    @scala.inline
    def setOntouchcancelNull: Self = this.set("ontouchcancel", null)
    @scala.inline
    def setOntouchend(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ TouchEvent, _]): Self = this.set("ontouchend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchend: Self = this.set("ontouchend", js.undefined)
    @scala.inline
    def setOntouchendNull: Self = this.set("ontouchend", null)
    @scala.inline
    def setOntouchmove(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ TouchEvent, _]): Self = this.set("ontouchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchmove: Self = this.set("ontouchmove", js.undefined)
    @scala.inline
    def setOntouchmoveNull: Self = this.set("ontouchmove", null)
    @scala.inline
    def setOntouchstart(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ TouchEvent, _]): Self = this.set("ontouchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchstart: Self = this.set("ontouchstart", js.undefined)
    @scala.inline
    def setOntouchstartNull: Self = this.set("ontouchstart", null)
    @scala.inline
    def setOntransitioncancel(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ TransitionEvent, _]): Self = this.set("ontransitioncancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitioncancel: Self = this.set("ontransitioncancel", js.undefined)
    @scala.inline
    def setOntransitioncancelNull: Self = this.set("ontransitioncancel", null)
    @scala.inline
    def setOntransitionend(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitionend: Self = this.set("ontransitionend", js.undefined)
    @scala.inline
    def setOntransitionendNull: Self = this.set("ontransitionend", null)
    @scala.inline
    def setOntransitionrun(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionrun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitionrun: Self = this.set("ontransitionrun", js.undefined)
    @scala.inline
    def setOntransitionrunNull: Self = this.set("ontransitionrun", null)
    @scala.inline
    def setOntransitionstart(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitionstart: Self = this.set("ontransitionstart", js.undefined)
    @scala.inline
    def setOntransitionstartNull: Self = this.set("ontransitionstart", null)
    @scala.inline
    def setOnvolumechange(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onvolumechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnvolumechange: Self = this.set("onvolumechange", js.undefined)
    @scala.inline
    def setOnvolumechangeNull: Self = this.set("onvolumechange", null)
    @scala.inline
    def setOnwaiting(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]): Self = this.set("onwaiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnwaiting: Self = this.set("onwaiting", js.undefined)
    @scala.inline
    def setOnwaitingNull: Self = this.set("onwaiting", null)
    @scala.inline
    def setOnwheel(value: js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ WheelEvent, _]): Self = this.set("onwheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnwheel: Self = this.set("onwheel", js.undefined)
    @scala.inline
    def setOnwheelNull: Self = this.set("onwheel", null)
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
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsHTMLSourceElementcon, /* ev */ Event, _]) => Unit
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
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setSrcset(value: String): Self = this.set("srcset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcset: Self = this.set("srcset", js.undefined)
    @scala.inline
    def setStyle(value: CSSStyleDeclaration): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = this.set("toggleAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggleAttribute: Self = this.set("toggleAttribute", js.undefined)
    @scala.inline
    def setTranslate(value: Boolean): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = this.set("webkitMatchesSelector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWebkitMatchesSelector: Self = this.set("webkitMatchesSelector", js.undefined)
  }
  
}

