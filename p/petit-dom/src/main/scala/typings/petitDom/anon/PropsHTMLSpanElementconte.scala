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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined petit-dom.petit-dom.PetitDom.Props<std.HTMLSpanElement> & {  content :petit-dom.petit-dom.PetitDom.Content | std.ReadonlyArray<petit-dom.petit-dom.PetitDom.Content> | undefined} */
trait PropsHTMLSpanElementconte extends StObject {
  
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
  
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var clientHeight: js.UndefOr[Double] = js.undefined
  
  var clientLeft: js.UndefOr[Double] = js.undefined
  
  var clientTop: js.UndefOr[Double] = js.undefined
  
  var clientWidth: js.UndefOr[Double] = js.undefined
  
  var cloneNode: js.UndefOr[js.Function0[Node]] = js.undefined
  
  var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  
  var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.undefined
  
  var contains: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var content: js.UndefOr[Content | js.Array[Content]] = js.undefined
  
  var contentEditable: js.UndefOr[String] = js.undefined
  
  var dataset: js.UndefOr[DOMStringMap] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var enterKeyHint: js.UndefOr[String] = js.undefined
  
  var firstChild: js.UndefOr[ChildNode | Null] = js.undefined
  
  var firstElementChild: js.UndefOr[Element | Null] = js.undefined
  
  var focus: js.UndefOr[js.Function0[Unit]] = js.undefined
  
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
  
  var insertBefore: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.undefined
  
  var isConnected: js.UndefOr[Boolean] = js.undefined
  
  var isContentEditable: js.UndefOr[Boolean] = js.undefined
  
  var isDefaultNamespace: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var isEqualNode: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var isSameNode: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
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
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var normalize: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var offsetHeight: js.UndefOr[Double] = js.undefined
  
  var offsetLeft: js.UndefOr[Double] = js.undefined
  
  var offsetParent: js.UndefOr[Element | Null] = js.undefined
  
  var offsetTop: js.UndefOr[Double] = js.undefined
  
  var offsetWidth: js.UndefOr[Double] = js.undefined
  
  var onabort: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, js.Any]) | Null] = js.undefined
  
  var onanimationcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
  
  var onanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
  
  var onanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
  
  var onanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
  
  var onauxclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  var onblur: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, js.Any]) | Null] = js.undefined
  
  var oncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var oncanplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var oncanplaythrough: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  var onclose: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var oncontextmenu: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  var oncopy: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, js.Any]) | Null] = js.undefined
  
  var oncuechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var oncut: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, js.Any]) | Null] = js.undefined
  
  var ondblclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  var ondrag: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  var ondragend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  var ondragenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  var ondragexit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var ondragleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  var ondragover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  var ondragstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  var ondrop: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  var ondurationchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onemptied: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onended: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onerror: js.UndefOr[OnErrorEventHandler] = js.undefined
  
  var onfocus: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, js.Any]) | Null] = js.undefined
  
  var onfullscreenchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onfullscreenerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var ongotpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  var oninput: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var oninvalid: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onkeydown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, js.Any]) | Null] = js.undefined
  
  var onkeypress: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, js.Any]) | Null] = js.undefined
  
  var onkeyup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, js.Any]) | Null] = js.undefined
  
  var onload: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onloadeddata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onloadedmetadata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onloadstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onlostpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  var onmousedown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  var onmouseenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  var onmouseleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  var onmousemove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  var onmouseout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  var onmouseover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  var onmouseup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  var onpaste: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, js.Any]) | Null] = js.undefined
  
  var onpause: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onplaying: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onpointercancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  var onpointerdown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  var onpointerenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  var onpointerleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  var onpointermove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  var onpointerout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  var onpointerover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  var onpointerup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  var onprogress: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], js.Any]) | Null
  ] = js.undefined
  
  var onratechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onreset: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onresize: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, js.Any]) | Null] = js.undefined
  
  var onscroll: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onsecuritypolicyviolation: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, js.Any]) | Null
  ] = js.undefined
  
  var onseeked: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onseeking: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onselect: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onselectionchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onselectstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onstalled: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onsubmit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onsuspend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var ontimeupdate: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var ontoggle: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
  
  var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
  
  var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
  
  var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
  
  var ontransitioncancel: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
  ] = js.undefined
  
  var ontransitionend: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
  ] = js.undefined
  
  var ontransitionrun: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
  ] = js.undefined
  
  var ontransitionstart: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
  ] = js.undefined
  
  var onvolumechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onwaiting: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  var onwheel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, js.Any]) | Null] = js.undefined
  
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
  
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSStyleDeclaration] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var tagName: js.UndefOr[String] = js.undefined
  
  var textContent: js.UndefOr[String | Null] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  
  var translate: js.UndefOr[Boolean] = js.undefined
  
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
}
object PropsHTMLSpanElementconte {
  
  @scala.inline
  def apply(): PropsHTMLSpanElementconte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsHTMLSpanElementconte]
  }
  
  @scala.inline
  implicit class PropsHTMLSpanElementconteMutableBuilder[Self <: PropsHTMLSpanElementconte] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setATTRIBUTE_NODE(value: Double): Self = StObject.set(x, "ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setATTRIBUTE_NODEUndefined: Self = StObject.set(x, "ATTRIBUTE_NODE", js.undefined)
    
    @scala.inline
    def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyLabel(value: String): Self = StObject.set(x, "accessKeyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyLabelUndefined: Self = StObject.set(x, "accessKeyLabel", js.undefined)
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    @scala.inline
    def setAddEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]) => Unit
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
    def setAutocapitalize(value: String): Self = StObject.set(x, "autocapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocapitalizeUndefined: Self = StObject.set(x, "autocapitalize", js.undefined)
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    @scala.inline
    def setBaseURI(value: String): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURIUndefined: Self = StObject.set(x, "baseURI", js.undefined)
    
    @scala.inline
    def setBefore(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
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
    def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
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
    def setContentEditable(value: String): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
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
    def setDataset(value: DOMStringMap): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDispatchEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDispatchEventUndefined: Self = StObject.set(x, "dispatchEvent", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
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
    def setEnterKeyHint(value: String): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
    
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
    def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
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
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerHTMLUndefined: Self = StObject.set(x, "innerHTML", js.undefined)
    
    @scala.inline
    def setInnerText(value: String): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerTextUndefined: Self = StObject.set(x, "innerText", js.undefined)
    
    @scala.inline
    def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
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
    def setIsContentEditable(value: Boolean): Self = StObject.set(x, "isContentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsContentEditableUndefined: Self = StObject.set(x, "isContentEditable", js.undefined)
    
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
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
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
    def setMsGetRegionContent(value: () => js.Any): Self = StObject.set(x, "msGetRegionContent", js.Any.fromFunction0(value))
    
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
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setNormalize(value: () => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    @scala.inline
    def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetHeightUndefined: Self = StObject.set(x, "offsetHeight", js.undefined)
    
    @scala.inline
    def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
    
    @scala.inline
    def setOffsetParent(value: Element): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetParentNull: Self = StObject.set(x, "offsetParent", null)
    
    @scala.inline
    def setOffsetParentUndefined: Self = StObject.set(x, "offsetParent", js.undefined)
    
    @scala.inline
    def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
    
    @scala.inline
    def setOffsetWidth(value: Double): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetWidthUndefined: Self = StObject.set(x, "offsetWidth", js.undefined)
    
    @scala.inline
    def setOnabort(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnabortNull: Self = StObject.set(x, "onabort", null)
    
    @scala.inline
    def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
    
    @scala.inline
    def setOnanimationcancel(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnanimationcancelNull: Self = StObject.set(x, "onanimationcancel", null)
    
    @scala.inline
    def setOnanimationcancelUndefined: Self = StObject.set(x, "onanimationcancel", js.undefined)
    
    @scala.inline
    def setOnanimationend(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnanimationendNull: Self = StObject.set(x, "onanimationend", null)
    
    @scala.inline
    def setOnanimationendUndefined: Self = StObject.set(x, "onanimationend", js.undefined)
    
    @scala.inline
    def setOnanimationiteration(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationiteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnanimationiterationNull: Self = StObject.set(x, "onanimationiteration", null)
    
    @scala.inline
    def setOnanimationiterationUndefined: Self = StObject.set(x, "onanimationiteration", js.undefined)
    
    @scala.inline
    def setOnanimationstart(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnanimationstartNull: Self = StObject.set(x, "onanimationstart", null)
    
    @scala.inline
    def setOnanimationstartUndefined: Self = StObject.set(x, "onanimationstart", js.undefined)
    
    @scala.inline
    def setOnauxclick(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnauxclickNull: Self = StObject.set(x, "onauxclick", null)
    
    @scala.inline
    def setOnauxclickUndefined: Self = StObject.set(x, "onauxclick", js.undefined)
    
    @scala.inline
    def setOnblur(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ FocusEvent, js.Any]): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnblurNull: Self = StObject.set(x, "onblur", null)
    
    @scala.inline
    def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
    
    @scala.inline
    def setOncancel(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncancelNull: Self = StObject.set(x, "oncancel", null)
    
    @scala.inline
    def setOncancelUndefined: Self = StObject.set(x, "oncancel", js.undefined)
    
    @scala.inline
    def setOncanplay(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncanplayNull: Self = StObject.set(x, "oncanplay", null)
    
    @scala.inline
    def setOncanplayUndefined: Self = StObject.set(x, "oncanplay", js.undefined)
    
    @scala.inline
    def setOncanplaythrough(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncanplaythroughNull: Self = StObject.set(x, "oncanplaythrough", null)
    
    @scala.inline
    def setOncanplaythroughUndefined: Self = StObject.set(x, "oncanplaythrough", js.undefined)
    
    @scala.inline
    def setOnchange(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnchangeNull: Self = StObject.set(x, "onchange", null)
    
    @scala.inline
    def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
    
    @scala.inline
    def setOnclick(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnclickNull: Self = StObject.set(x, "onclick", null)
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setOnclose(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncloseNull: Self = StObject.set(x, "onclose", null)
    
    @scala.inline
    def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
    
    @scala.inline
    def setOncontextmenu(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncontextmenuNull: Self = StObject.set(x, "oncontextmenu", null)
    
    @scala.inline
    def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
    
    @scala.inline
    def setOncopy(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ ClipboardEvent, js.Any]): Self = StObject.set(x, "oncopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncopyNull: Self = StObject.set(x, "oncopy", null)
    
    @scala.inline
    def setOncopyUndefined: Self = StObject.set(x, "oncopy", js.undefined)
    
    @scala.inline
    def setOncuechange(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncuechangeNull: Self = StObject.set(x, "oncuechange", null)
    
    @scala.inline
    def setOncuechangeUndefined: Self = StObject.set(x, "oncuechange", js.undefined)
    
    @scala.inline
    def setOncut(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ ClipboardEvent, js.Any]): Self = StObject.set(x, "oncut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncutNull: Self = StObject.set(x, "oncut", null)
    
    @scala.inline
    def setOncutUndefined: Self = StObject.set(x, "oncut", js.undefined)
    
    @scala.inline
    def setOndblclick(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndblclickNull: Self = StObject.set(x, "ondblclick", null)
    
    @scala.inline
    def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
    
    @scala.inline
    def setOndrag(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragNull: Self = StObject.set(x, "ondrag", null)
    
    @scala.inline
    def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
    
    @scala.inline
    def setOndragend(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragendNull: Self = StObject.set(x, "ondragend", null)
    
    @scala.inline
    def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
    
    @scala.inline
    def setOndragenter(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragenterNull: Self = StObject.set(x, "ondragenter", null)
    
    @scala.inline
    def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
    
    @scala.inline
    def setOndragexit(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "ondragexit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragexitNull: Self = StObject.set(x, "ondragexit", null)
    
    @scala.inline
    def setOndragexitUndefined: Self = StObject.set(x, "ondragexit", js.undefined)
    
    @scala.inline
    def setOndragleave(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragleaveNull: Self = StObject.set(x, "ondragleave", null)
    
    @scala.inline
    def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
    
    @scala.inline
    def setOndragover(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragoverNull: Self = StObject.set(x, "ondragover", null)
    
    @scala.inline
    def setOndragoverUndefined: Self = StObject.set(x, "ondragover", js.undefined)
    
    @scala.inline
    def setOndragstart(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragstartNull: Self = StObject.set(x, "ondragstart", null)
    
    @scala.inline
    def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
    
    @scala.inline
    def setOndrop(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndropNull: Self = StObject.set(x, "ondrop", null)
    
    @scala.inline
    def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
    
    @scala.inline
    def setOndurationchange(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndurationchangeNull: Self = StObject.set(x, "ondurationchange", null)
    
    @scala.inline
    def setOndurationchangeUndefined: Self = StObject.set(x, "ondurationchange", js.undefined)
    
    @scala.inline
    def setOnemptied(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnemptiedNull: Self = StObject.set(x, "onemptied", null)
    
    @scala.inline
    def setOnemptiedUndefined: Self = StObject.set(x, "onemptied", js.undefined)
    
    @scala.inline
    def setOnended(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnendedNull: Self = StObject.set(x, "onended", null)
    
    @scala.inline
    def setOnendedUndefined: Self = StObject.set(x, "onended", js.undefined)
    
    @scala.inline
    def setOnerror(
      value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any
    ): Self = StObject.set(x, "onerror", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOnerrorNull: Self = StObject.set(x, "onerror", null)
    
    @scala.inline
    def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    @scala.inline
    def setOnfocus(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ FocusEvent, js.Any]): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfocusNull: Self = StObject.set(x, "onfocus", null)
    
    @scala.inline
    def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
    
    @scala.inline
    def setOnfullscreenchange(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onfullscreenchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfullscreenchangeNull: Self = StObject.set(x, "onfullscreenchange", null)
    
    @scala.inline
    def setOnfullscreenchangeUndefined: Self = StObject.set(x, "onfullscreenchange", js.undefined)
    
    @scala.inline
    def setOnfullscreenerror(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onfullscreenerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfullscreenerrorNull: Self = StObject.set(x, "onfullscreenerror", null)
    
    @scala.inline
    def setOnfullscreenerrorUndefined: Self = StObject.set(x, "onfullscreenerror", js.undefined)
    
    @scala.inline
    def setOngotpointercapture(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "ongotpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOngotpointercaptureNull: Self = StObject.set(x, "ongotpointercapture", null)
    
    @scala.inline
    def setOngotpointercaptureUndefined: Self = StObject.set(x, "ongotpointercapture", js.undefined)
    
    @scala.inline
    def setOninput(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOninputNull: Self = StObject.set(x, "oninput", null)
    
    @scala.inline
    def setOninputUndefined: Self = StObject.set(x, "oninput", js.undefined)
    
    @scala.inline
    def setOninvalid(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOninvalidNull: Self = StObject.set(x, "oninvalid", null)
    
    @scala.inline
    def setOninvalidUndefined: Self = StObject.set(x, "oninvalid", js.undefined)
    
    @scala.inline
    def setOnkeydown(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnkeydownNull: Self = StObject.set(x, "onkeydown", null)
    
    @scala.inline
    def setOnkeydownUndefined: Self = StObject.set(x, "onkeydown", js.undefined)
    
    @scala.inline
    def setOnkeypress(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnkeypressNull: Self = StObject.set(x, "onkeypress", null)
    
    @scala.inline
    def setOnkeypressUndefined: Self = StObject.set(x, "onkeypress", js.undefined)
    
    @scala.inline
    def setOnkeyup(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnkeyupNull: Self = StObject.set(x, "onkeyup", null)
    
    @scala.inline
    def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
    
    @scala.inline
    def setOnload(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadNull: Self = StObject.set(x, "onload", null)
    
    @scala.inline
    def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    @scala.inline
    def setOnloadeddata(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadeddataNull: Self = StObject.set(x, "onloadeddata", null)
    
    @scala.inline
    def setOnloadeddataUndefined: Self = StObject.set(x, "onloadeddata", js.undefined)
    
    @scala.inline
    def setOnloadedmetadata(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadedmetadataNull: Self = StObject.set(x, "onloadedmetadata", null)
    
    @scala.inline
    def setOnloadedmetadataUndefined: Self = StObject.set(x, "onloadedmetadata", js.undefined)
    
    @scala.inline
    def setOnloadstart(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadstartNull: Self = StObject.set(x, "onloadstart", null)
    
    @scala.inline
    def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
    
    @scala.inline
    def setOnlostpointercapture(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onlostpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlostpointercaptureNull: Self = StObject.set(x, "onlostpointercapture", null)
    
    @scala.inline
    def setOnlostpointercaptureUndefined: Self = StObject.set(x, "onlostpointercapture", js.undefined)
    
    @scala.inline
    def setOnmousedown(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmousedownNull: Self = StObject.set(x, "onmousedown", null)
    
    @scala.inline
    def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
    
    @scala.inline
    def setOnmouseenter(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseenterNull: Self = StObject.set(x, "onmouseenter", null)
    
    @scala.inline
    def setOnmouseenterUndefined: Self = StObject.set(x, "onmouseenter", js.undefined)
    
    @scala.inline
    def setOnmouseleave(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseleaveNull: Self = StObject.set(x, "onmouseleave", null)
    
    @scala.inline
    def setOnmouseleaveUndefined: Self = StObject.set(x, "onmouseleave", js.undefined)
    
    @scala.inline
    def setOnmousemove(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmousemoveNull: Self = StObject.set(x, "onmousemove", null)
    
    @scala.inline
    def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
    
    @scala.inline
    def setOnmouseout(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseoutNull: Self = StObject.set(x, "onmouseout", null)
    
    @scala.inline
    def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseover(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseoverNull: Self = StObject.set(x, "onmouseover", null)
    
    @scala.inline
    def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
    
    @scala.inline
    def setOnmouseup(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseupNull: Self = StObject.set(x, "onmouseup", null)
    
    @scala.inline
    def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
    
    @scala.inline
    def setOnpaste(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ ClipboardEvent, js.Any]): Self = StObject.set(x, "onpaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpasteNull: Self = StObject.set(x, "onpaste", null)
    
    @scala.inline
    def setOnpasteUndefined: Self = StObject.set(x, "onpaste", js.undefined)
    
    @scala.inline
    def setOnpause(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpauseNull: Self = StObject.set(x, "onpause", null)
    
    @scala.inline
    def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
    
    @scala.inline
    def setOnplay(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnplayNull: Self = StObject.set(x, "onplay", null)
    
    @scala.inline
    def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
    
    @scala.inline
    def setOnplaying(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnplayingNull: Self = StObject.set(x, "onplaying", null)
    
    @scala.inline
    def setOnplayingUndefined: Self = StObject.set(x, "onplaying", js.undefined)
    
    @scala.inline
    def setOnpointercancel(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointercancelNull: Self = StObject.set(x, "onpointercancel", null)
    
    @scala.inline
    def setOnpointercancelUndefined: Self = StObject.set(x, "onpointercancel", js.undefined)
    
    @scala.inline
    def setOnpointerdown(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerdownNull: Self = StObject.set(x, "onpointerdown", null)
    
    @scala.inline
    def setOnpointerdownUndefined: Self = StObject.set(x, "onpointerdown", js.undefined)
    
    @scala.inline
    def setOnpointerenter(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerenterNull: Self = StObject.set(x, "onpointerenter", null)
    
    @scala.inline
    def setOnpointerenterUndefined: Self = StObject.set(x, "onpointerenter", js.undefined)
    
    @scala.inline
    def setOnpointerleave(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerleaveNull: Self = StObject.set(x, "onpointerleave", null)
    
    @scala.inline
    def setOnpointerleaveUndefined: Self = StObject.set(x, "onpointerleave", js.undefined)
    
    @scala.inline
    def setOnpointermove(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointermoveNull: Self = StObject.set(x, "onpointermove", null)
    
    @scala.inline
    def setOnpointermoveUndefined: Self = StObject.set(x, "onpointermove", js.undefined)
    
    @scala.inline
    def setOnpointerout(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointeroutNull: Self = StObject.set(x, "onpointerout", null)
    
    @scala.inline
    def setOnpointeroutUndefined: Self = StObject.set(x, "onpointerout", js.undefined)
    
    @scala.inline
    def setOnpointerover(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointeroverNull: Self = StObject.set(x, "onpointerover", null)
    
    @scala.inline
    def setOnpointeroverUndefined: Self = StObject.set(x, "onpointerover", js.undefined)
    
    @scala.inline
    def setOnpointerup(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerupNull: Self = StObject.set(x, "onpointerup", null)
    
    @scala.inline
    def setOnpointerupUndefined: Self = StObject.set(x, "onpointerup", js.undefined)
    
    @scala.inline
    def setOnprogress(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ ProgressEvent[EventTarget], js.Any]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnprogressNull: Self = StObject.set(x, "onprogress", null)
    
    @scala.inline
    def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
    
    @scala.inline
    def setOnratechange(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnratechangeNull: Self = StObject.set(x, "onratechange", null)
    
    @scala.inline
    def setOnratechangeUndefined: Self = StObject.set(x, "onratechange", js.undefined)
    
    @scala.inline
    def setOnreset(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnresetNull: Self = StObject.set(x, "onreset", null)
    
    @scala.inline
    def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
    
    @scala.inline
    def setOnresize(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnresizeNull: Self = StObject.set(x, "onresize", null)
    
    @scala.inline
    def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
    
    @scala.inline
    def setOnscroll(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnscrollNull: Self = StObject.set(x, "onscroll", null)
    
    @scala.inline
    def setOnscrollUndefined: Self = StObject.set(x, "onscroll", js.undefined)
    
    @scala.inline
    def setOnsecuritypolicyviolation(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ SecurityPolicyViolationEvent, js.Any]): Self = StObject.set(x, "onsecuritypolicyviolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsecuritypolicyviolationNull: Self = StObject.set(x, "onsecuritypolicyviolation", null)
    
    @scala.inline
    def setOnsecuritypolicyviolationUndefined: Self = StObject.set(x, "onsecuritypolicyviolation", js.undefined)
    
    @scala.inline
    def setOnseeked(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnseekedNull: Self = StObject.set(x, "onseeked", null)
    
    @scala.inline
    def setOnseekedUndefined: Self = StObject.set(x, "onseeked", js.undefined)
    
    @scala.inline
    def setOnseeking(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnseekingNull: Self = StObject.set(x, "onseeking", null)
    
    @scala.inline
    def setOnseekingUndefined: Self = StObject.set(x, "onseeking", js.undefined)
    
    @scala.inline
    def setOnselect(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnselectNull: Self = StObject.set(x, "onselect", null)
    
    @scala.inline
    def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
    
    @scala.inline
    def setOnselectionchange(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onselectionchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnselectionchangeNull: Self = StObject.set(x, "onselectionchange", null)
    
    @scala.inline
    def setOnselectionchangeUndefined: Self = StObject.set(x, "onselectionchange", js.undefined)
    
    @scala.inline
    def setOnselectstart(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnselectstartNull: Self = StObject.set(x, "onselectstart", null)
    
    @scala.inline
    def setOnselectstartUndefined: Self = StObject.set(x, "onselectstart", js.undefined)
    
    @scala.inline
    def setOnstalled(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstalledNull: Self = StObject.set(x, "onstalled", null)
    
    @scala.inline
    def setOnstalledUndefined: Self = StObject.set(x, "onstalled", js.undefined)
    
    @scala.inline
    def setOnsubmit(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsubmitNull: Self = StObject.set(x, "onsubmit", null)
    
    @scala.inline
    def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
    
    @scala.inline
    def setOnsuspend(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsuspendNull: Self = StObject.set(x, "onsuspend", null)
    
    @scala.inline
    def setOnsuspendUndefined: Self = StObject.set(x, "onsuspend", js.undefined)
    
    @scala.inline
    def setOntimeupdate(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntimeupdateNull: Self = StObject.set(x, "ontimeupdate", null)
    
    @scala.inline
    def setOntimeupdateUndefined: Self = StObject.set(x, "ontimeupdate", js.undefined)
    
    @scala.inline
    def setOntoggle(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "ontoggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntoggleNull: Self = StObject.set(x, "ontoggle", null)
    
    @scala.inline
    def setOntoggleUndefined: Self = StObject.set(x, "ontoggle", js.undefined)
    
    @scala.inline
    def setOntouchcancel(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntouchcancelNull: Self = StObject.set(x, "ontouchcancel", null)
    
    @scala.inline
    def setOntouchcancelUndefined: Self = StObject.set(x, "ontouchcancel", js.undefined)
    
    @scala.inline
    def setOntouchend(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntouchendNull: Self = StObject.set(x, "ontouchend", null)
    
    @scala.inline
    def setOntouchendUndefined: Self = StObject.set(x, "ontouchend", js.undefined)
    
    @scala.inline
    def setOntouchmove(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntouchmoveNull: Self = StObject.set(x, "ontouchmove", null)
    
    @scala.inline
    def setOntouchmoveUndefined: Self = StObject.set(x, "ontouchmove", js.undefined)
    
    @scala.inline
    def setOntouchstart(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntouchstartNull: Self = StObject.set(x, "ontouchstart", null)
    
    @scala.inline
    def setOntouchstartUndefined: Self = StObject.set(x, "ontouchstart", js.undefined)
    
    @scala.inline
    def setOntransitioncancel(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitioncancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntransitioncancelNull: Self = StObject.set(x, "ontransitioncancel", null)
    
    @scala.inline
    def setOntransitioncancelUndefined: Self = StObject.set(x, "ontransitioncancel", js.undefined)
    
    @scala.inline
    def setOntransitionend(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitionend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntransitionendNull: Self = StObject.set(x, "ontransitionend", null)
    
    @scala.inline
    def setOntransitionendUndefined: Self = StObject.set(x, "ontransitionend", js.undefined)
    
    @scala.inline
    def setOntransitionrun(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitionrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntransitionrunNull: Self = StObject.set(x, "ontransitionrun", null)
    
    @scala.inline
    def setOntransitionrunUndefined: Self = StObject.set(x, "ontransitionrun", js.undefined)
    
    @scala.inline
    def setOntransitionstart(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitionstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntransitionstartNull: Self = StObject.set(x, "ontransitionstart", null)
    
    @scala.inline
    def setOntransitionstartUndefined: Self = StObject.set(x, "ontransitionstart", js.undefined)
    
    @scala.inline
    def setOnvolumechange(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnvolumechangeNull: Self = StObject.set(x, "onvolumechange", null)
    
    @scala.inline
    def setOnvolumechangeUndefined: Self = StObject.set(x, "onvolumechange", js.undefined)
    
    @scala.inline
    def setOnwaiting(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnwaitingNull: Self = StObject.set(x, "onwaiting", null)
    
    @scala.inline
    def setOnwaitingUndefined: Self = StObject.set(x, "onwaiting", js.undefined)
    
    @scala.inline
    def setOnwheel(value: js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ WheelEvent, js.Any]): Self = StObject.set(x, "onwheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnwheelNull: Self = StObject.set(x, "onwheel", null)
    
    @scala.inline
    def setOnwheelUndefined: Self = StObject.set(x, "onwheel", js.undefined)
    
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
    def setParentNode(value: Node & ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
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
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsHTMLSpanElementconte, /* ev */ Event, js.Any]) => Unit
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
    def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTEXT_NODE(value: Double): Self = StObject.set(x, "TEXT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXT_NODEUndefined: Self = StObject.set(x, "TEXT_NODE", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
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
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "toggleAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleAttributeUndefined: Self = StObject.set(x, "toggleAttribute", js.undefined)
    
    @scala.inline
    def setTranslate(value: Boolean): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = StObject.set(x, "webkitMatchesSelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWebkitMatchesSelectorUndefined: Self = StObject.set(x, "webkitMatchesSelector", js.undefined)
  }
}
