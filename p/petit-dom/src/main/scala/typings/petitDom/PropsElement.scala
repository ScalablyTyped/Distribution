package typings.petitDom

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
import typings.std.Document_
import typings.std.Element
import typings.std.Event_
import typings.std.HTMLAnchorElement
import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.InsertPosition
import typings.std.Keyframe
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
trait PropsElement extends js.Object {
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
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
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
  var contains: js.UndefOr[js.Function1[/* other */ Node, Boolean]] = js.undefined
  var content: js.UndefOr[Content | js.Array[Content]] = js.undefined
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event_, Boolean]] = js.undefined
  var firstChild: js.UndefOr[ChildNode] = js.undefined
  var firstElementChild: js.UndefOr[Element] = js.undefined
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
  var id: js.UndefOr[String] = js.undefined
  var innerHTML: js.UndefOr[String] = js.undefined
  var insertAdjacentElement: js.UndefOr[
    js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  ] = js.undefined
  var insertAdjacentHTML: js.UndefOr[js.Function2[/* where */ InsertPosition, /* html */ String, Unit]] = js.undefined
  var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* text */ String, Unit]] = js.undefined
  var insertBefore: js.UndefOr[js.Function2[/* newChild */ Node, /* refChild */ Node, Node]] = js.undefined
  var isConnected: js.UndefOr[Boolean] = js.undefined
  var isDefaultNamespace: js.UndefOr[js.Function1[/* namespace */ String, Boolean]] = js.undefined
  var isEqualNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var isSameNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
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
  var normalize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onfullscreenchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onfullscreenerror: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var outerHTML: js.UndefOr[String] = js.undefined
  var ownerDocument: js.UndefOr[Document_] = js.undefined
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
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
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
  var tagName: js.UndefOr[String] = js.undefined
  var textContent: js.UndefOr[String] = js.undefined
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
}

object PropsElement {
  @scala.inline
  def apply(
    ATTRIBUTE_NODE: Int | Double = null,
    CDATA_SECTION_NODE: Int | Double = null,
    COMMENT_NODE: Int | Double = null,
    DOCUMENT_FRAGMENT_NODE: Int | Double = null,
    DOCUMENT_NODE: Int | Double = null,
    DOCUMENT_POSITION_CONTAINED_BY: Int | Double = null,
    DOCUMENT_POSITION_CONTAINS: Int | Double = null,
    DOCUMENT_POSITION_DISCONNECTED: Int | Double = null,
    DOCUMENT_POSITION_FOLLOWING: Int | Double = null,
    DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Int | Double = null,
    DOCUMENT_POSITION_PRECEDING: Int | Double = null,
    DOCUMENT_TYPE_NODE: Int | Double = null,
    ELEMENT_NODE: Int | Double = null,
    ENTITY_NODE: Int | Double = null,
    ENTITY_REFERENCE_NODE: Int | Double = null,
    NOTATION_NODE: Int | Double = null,
    PROCESSING_INSTRUCTION_NODE: Int | Double = null,
    TEXT_NODE: Int | Double = null,
    addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[PropsElement, /* ev */ Event_, _]) => Unit = null,
    after: /* repeated */ Node | String => Unit = null,
    animate: /* keyframes */ js.Array[Keyframe] => Animation = null,
    append: /* repeated */ Node | String => Unit = null,
    appendChild: /* newChild */ Node => Node = null,
    assignedSlot: HTMLSlotElement = null,
    attachShadow: /* init */ ShadowRootInit => ShadowRoot = null,
    attributes: NamedNodeMap = null,
    baseURI: String = null,
    before: /* repeated */ Node | String => Unit = null,
    childElementCount: Int | Double = null,
    childNodes: NodeListOf[ChildNode] = null,
    children: HTMLCollection = null,
    classList: DOMTokenList = null,
    className: String = null,
    clientHeight: Int | Double = null,
    clientLeft: Int | Double = null,
    clientTop: Int | Double = null,
    clientWidth: Int | Double = null,
    cloneNode: () => Node = null,
    closest: a => HTMLAnchorElement | Null = null,
    compareDocumentPosition: /* other */ Node => Double = null,
    contains: /* other */ Node => Boolean = null,
    content: Content | js.Array[Content] = null,
    dispatchEvent: /* event */ Event_ => Boolean = null,
    firstChild: ChildNode = null,
    firstElementChild: Element = null,
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
    id: String = null,
    innerHTML: String = null,
    insertAdjacentElement: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null = null,
    insertAdjacentHTML: (/* where */ InsertPosition, /* html */ String) => Unit = null,
    insertAdjacentText: (/* where */ InsertPosition, /* text */ String) => Unit = null,
    insertBefore: (/* newChild */ Node, /* refChild */ Node) => Node = null,
    isConnected: js.UndefOr[Boolean] = js.undefined,
    isDefaultNamespace: /* namespace */ String => Boolean = null,
    isEqualNode: /* otherNode */ Node => Boolean = null,
    isSameNode: /* otherNode */ Node => Boolean = null,
    key: Key = null,
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
    nodeType: Int | Double = null,
    nodeValue: String = null,
    normalize: () => Unit = null,
    onfullscreenchange: js.ThisFunction1[PropsElement, /* ev */ Event_, _] = null,
    onfullscreenerror: js.ThisFunction1[PropsElement, /* ev */ Event_, _] = null,
    outerHTML: String = null,
    ownerDocument: Document_ = null,
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
    removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[PropsElement, /* ev */ Event_, _]) => Unit = null,
    replaceChild: (/* newChild */ Node, /* oldChild */ Node) => Node = null,
    replaceWith: /* repeated */ Node | String => Unit = null,
    requestFullscreen: () => js.Promise[Unit] = null,
    requestPointerLock: () => Unit = null,
    scroll: () => Unit = null,
    scrollBy: () => Unit = null,
    scrollHeight: Int | Double = null,
    scrollIntoView: () => Unit = null,
    scrollLeft: Int | Double = null,
    scrollTo: () => Unit = null,
    scrollTop: Int | Double = null,
    scrollWidth: Int | Double = null,
    setAttribute: (/* qualifiedName */ String, /* value */ String) => Unit = null,
    setAttributeNS: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit = null,
    setAttributeNode: /* attr */ Attr => Attr | Null = null,
    setAttributeNodeNS: /* attr */ Attr => Attr | Null = null,
    setPointerCapture: /* pointerId */ Double => Unit = null,
    shadowRoot: ShadowRoot = null,
    slot: String = null,
    tagName: String = null,
    textContent: String = null,
    toggleAttribute: /* qualifiedName */ String => Boolean = null,
    webkitMatchesSelector: /* selectors */ String => Boolean = null
  ): PropsElement = {
    val __obj = js.Dynamic.literal()
    if (ATTRIBUTE_NODE != null) __obj.updateDynamic("ATTRIBUTE_NODE")(ATTRIBUTE_NODE.asInstanceOf[js.Any])
    if (CDATA_SECTION_NODE != null) __obj.updateDynamic("CDATA_SECTION_NODE")(CDATA_SECTION_NODE.asInstanceOf[js.Any])
    if (COMMENT_NODE != null) __obj.updateDynamic("COMMENT_NODE")(COMMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_FRAGMENT_NODE != null) __obj.updateDynamic("DOCUMENT_FRAGMENT_NODE")(DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_NODE != null) __obj.updateDynamic("DOCUMENT_NODE")(DOCUMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_CONTAINED_BY != null) __obj.updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(DOCUMENT_POSITION_CONTAINED_BY.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_CONTAINS != null) __obj.updateDynamic("DOCUMENT_POSITION_CONTAINS")(DOCUMENT_POSITION_CONTAINS.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_DISCONNECTED != null) __obj.updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(DOCUMENT_POSITION_DISCONNECTED.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_FOLLOWING != null) __obj.updateDynamic("DOCUMENT_POSITION_FOLLOWING")(DOCUMENT_POSITION_FOLLOWING.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC != null) __obj.updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_PRECEDING != null) __obj.updateDynamic("DOCUMENT_POSITION_PRECEDING")(DOCUMENT_POSITION_PRECEDING.asInstanceOf[js.Any])
    if (DOCUMENT_TYPE_NODE != null) __obj.updateDynamic("DOCUMENT_TYPE_NODE")(DOCUMENT_TYPE_NODE.asInstanceOf[js.Any])
    if (ELEMENT_NODE != null) __obj.updateDynamic("ELEMENT_NODE")(ELEMENT_NODE.asInstanceOf[js.Any])
    if (ENTITY_NODE != null) __obj.updateDynamic("ENTITY_NODE")(ENTITY_NODE.asInstanceOf[js.Any])
    if (ENTITY_REFERENCE_NODE != null) __obj.updateDynamic("ENTITY_REFERENCE_NODE")(ENTITY_REFERENCE_NODE.asInstanceOf[js.Any])
    if (NOTATION_NODE != null) __obj.updateDynamic("NOTATION_NODE")(NOTATION_NODE.asInstanceOf[js.Any])
    if (PROCESSING_INSTRUCTION_NODE != null) __obj.updateDynamic("PROCESSING_INSTRUCTION_NODE")(PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any])
    if (TEXT_NODE != null) __obj.updateDynamic("TEXT_NODE")(TEXT_NODE.asInstanceOf[js.Any])
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2(addEventListener))
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction1(animate))
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction1(append))
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1(appendChild))
    if (assignedSlot != null) __obj.updateDynamic("assignedSlot")(assignedSlot.asInstanceOf[js.Any])
    if (attachShadow != null) __obj.updateDynamic("attachShadow")(js.Any.fromFunction1(attachShadow))
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (baseURI != null) __obj.updateDynamic("baseURI")(baseURI.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (childElementCount != null) __obj.updateDynamic("childElementCount")(childElementCount.asInstanceOf[js.Any])
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classList != null) __obj.updateDynamic("classList")(classList.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clientHeight != null) __obj.updateDynamic("clientHeight")(clientHeight.asInstanceOf[js.Any])
    if (clientLeft != null) __obj.updateDynamic("clientLeft")(clientLeft.asInstanceOf[js.Any])
    if (clientTop != null) __obj.updateDynamic("clientTop")(clientTop.asInstanceOf[js.Any])
    if (clientWidth != null) __obj.updateDynamic("clientWidth")(clientWidth.asInstanceOf[js.Any])
    if (cloneNode != null) __obj.updateDynamic("cloneNode")(js.Any.fromFunction0(cloneNode))
    if (closest != null) __obj.updateDynamic("closest")(js.Any.fromFunction1(closest))
    if (compareDocumentPosition != null) __obj.updateDynamic("compareDocumentPosition")(js.Any.fromFunction1(compareDocumentPosition))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (dispatchEvent != null) __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1(dispatchEvent))
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (firstElementChild != null) __obj.updateDynamic("firstElementChild")(firstElementChild.asInstanceOf[js.Any])
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
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    if (insertAdjacentElement != null) __obj.updateDynamic("insertAdjacentElement")(js.Any.fromFunction2(insertAdjacentElement))
    if (insertAdjacentHTML != null) __obj.updateDynamic("insertAdjacentHTML")(js.Any.fromFunction2(insertAdjacentHTML))
    if (insertAdjacentText != null) __obj.updateDynamic("insertAdjacentText")(js.Any.fromFunction2(insertAdjacentText))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction2(insertBefore))
    if (!js.isUndefined(isConnected)) __obj.updateDynamic("isConnected")(isConnected.asInstanceOf[js.Any])
    if (isDefaultNamespace != null) __obj.updateDynamic("isDefaultNamespace")(js.Any.fromFunction1(isDefaultNamespace))
    if (isEqualNode != null) __obj.updateDynamic("isEqualNode")(js.Any.fromFunction1(isEqualNode))
    if (isSameNode != null) __obj.updateDynamic("isSameNode")(js.Any.fromFunction1(isSameNode))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
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
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction0(normalize))
    if (onfullscreenchange != null) __obj.updateDynamic("onfullscreenchange")(onfullscreenchange.asInstanceOf[js.Any])
    if (onfullscreenerror != null) __obj.updateDynamic("onfullscreenerror")(onfullscreenerror.asInstanceOf[js.Any])
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
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (scrollIntoView != null) __obj.updateDynamic("scrollIntoView")(js.Any.fromFunction0(scrollIntoView))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction0(scrollTo))
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollWidth != null) __obj.updateDynamic("scrollWidth")(scrollWidth.asInstanceOf[js.Any])
    if (setAttribute != null) __obj.updateDynamic("setAttribute")(js.Any.fromFunction2(setAttribute))
    if (setAttributeNS != null) __obj.updateDynamic("setAttributeNS")(js.Any.fromFunction3(setAttributeNS))
    if (setAttributeNode != null) __obj.updateDynamic("setAttributeNode")(js.Any.fromFunction1(setAttributeNode))
    if (setAttributeNodeNS != null) __obj.updateDynamic("setAttributeNodeNS")(js.Any.fromFunction1(setAttributeNodeNS))
    if (setPointerCapture != null) __obj.updateDynamic("setPointerCapture")(js.Any.fromFunction1(setPointerCapture))
    if (shadowRoot != null) __obj.updateDynamic("shadowRoot")(shadowRoot.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    if (toggleAttribute != null) __obj.updateDynamic("toggleAttribute")(js.Any.fromFunction1(toggleAttribute))
    if (webkitMatchesSelector != null) __obj.updateDynamic("webkitMatchesSelector")(js.Any.fromFunction1(webkitMatchesSelector))
    __obj.asInstanceOf[PropsElement]
  }
}

