package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document
  extends Node
     with NonElementParentNode
     with DocumentOrShadowRoot
     with ParentNode
     with GlobalEventHandlers
     with DocumentAndElementEventHandlers {
  /**
    * Sets or gets the URL for the current document.
    */
  val URL: java.lang.String = js.native
  /**
    * Sets or gets the color of all active links in the document.
    */
  /** @deprecated */
  var alinkColor: java.lang.String = js.native
  /**
    * Returns a reference to the collection of elements contained by the object.
    */
  /** @deprecated */
  val all: HTMLAllCollection = js.native
  /**
    * Retrieves a collection of all a objects that have a name and/or id property. Objects in this collection are in HTML source order.
    */
  /** @deprecated */
  val anchors: HTMLCollectionOf[HTMLAnchorElement] = js.native
  /**
    * Retrieves a collection of all applet objects in the document.
    */
  /** @deprecated */
  val applets: HTMLCollectionOf[HTMLAppletElement] = js.native
  /**
    * Deprecated. Sets or retrieves a value that indicates the background color behind the object.
    */
  /** @deprecated */
  var bgColor: java.lang.String = js.native
  /**
    * Specifies the beginning and end of the document body.
    */
  var body: HTMLElement = js.native
  /**
    * Returns document's encoding.
    */
  val characterSet: java.lang.String = js.native
  /**
    * Gets or sets the character set used to encode the object.
    */
  val charset: java.lang.String = js.native
  /**
    * Gets a value that indicates whether standards-compliant mode is switched on for the object.
    */
  val compatMode: java.lang.String = js.native
  /**
    * Returns document's content type.
    */
  val contentType: java.lang.String = js.native
  /**
    * Returns the HTTP cookies that apply to the Document. If there are no cookies or
    * cookies can't be applied to this resource, the empty string will be returned.
    * Can be set, to add a new cookie to the element's set of HTTP cookies.
    * If the contents are sandboxed into a
    * unique origin (e.g. in an iframe with the sandbox attribute), a
    * "SecurityError" DOMException will be thrown on getting
    * and setting.
    */
  var cookie: java.lang.String = js.native
  /**
    * Returns the script element, or the SVG script element,
    * that is currently executing, as long as the element represents a classic script.
    * In the case of reentrant script execution, returns the one that most recently started executing
    * amongst those that have not yet finished executing.
    * Returns null if the Document is not currently executing a script
    * or SVG script element (e.g., because the running script is an event
    * handler, or a timeout), or if the currently executing script or SVG
    * script element represents a module script.
    */
  val currentScript: HTMLOrSVGScriptElement | scala.Null = js.native
  val defaultView: WindowProxy | scala.Null = js.native
  /**
    * Sets or gets a value that indicates whether the document can be edited.
    */
  var designMode: java.lang.String = js.native
  /**
    * Sets or retrieves a value that indicates the reading order of the object.
    */
  var dir: java.lang.String = js.native
  /**
    * Gets an object representing the document type declaration associated with the current document.
    */
  val doctype: DocumentType | scala.Null = js.native
  /**
    * Gets a reference to the root node of the document.
    */
  val documentElement: HTMLElement = js.native
  /**
    * Returns document's URL.
    */
  val documentURI: java.lang.String = js.native
  /**
    * Sets or gets the security domain of the document.
    */
  var domain: java.lang.String = js.native
  /**
    * Retrieves a collection of all embed objects in the document.
    */
  val embeds: HTMLCollectionOf[HTMLEmbedElement] = js.native
  /**
    * Sets or gets the foreground (text) color of the document.
    */
  /** @deprecated */
  var fgColor: java.lang.String = js.native
  /**
    * Retrieves a collection, in source order, of all form objects in the document.
    */
  val forms: HTMLCollectionOf[HTMLFormElement] = js.native
  /** @deprecated */
  val fullscreen: scala.Boolean = js.native
  /**
    * Returns true if document has the ability to display elements fullscreen
    * and fullscreen is supported, or false otherwise.
    */
  val fullscreenEnabled: scala.Boolean = js.native
  /**
    * Returns the head element.
    */
  val head: HTMLHeadElement = js.native
  val hidden: scala.Boolean = js.native
  /**
    * Retrieves a collection, in source order, of img objects in the document.
    */
  val images: HTMLCollectionOf[HTMLImageElement] = js.native
  /**
    * Gets the implementation object of the current document.
    */
  val implementation: DOMImplementation = js.native
  /**
    * Returns the character encoding used to create the webpage that is loaded into the document object.
    */
  val inputEncoding: java.lang.String = js.native
  /**
    * Gets the date that the page was last modified, if the page supplies one.
    */
  val lastModified: java.lang.String = js.native
  /**
    * Sets or gets the color of the document links.
    */
  /** @deprecated */
  var linkColor: java.lang.String = js.native
  /**
    * Retrieves a collection of all a objects that specify the href property and all area objects in the document.
    */
  val links: HTMLCollectionOf[HTMLAnchorElement | HTMLAreaElement] = js.native
  /**
    * Contains information about the current URL.
    */
  var location: Location = js.native
  var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the state of the object has changed.
    * @param ev The event
    */
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  var onvisibilitychange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Returns document's origin.
    */
  val origin: java.lang.String = js.native
  /**
    * Return an HTMLCollection of the embed elements in the Document.
    */
  val plugins: HTMLCollectionOf[HTMLEmbedElement] = js.native
  /**
    * Retrieves a value that indicates the current state of the object.
    */
  val readyState: DocumentReadyState = js.native
  /**
    * Gets the URL of the location that referred the user to the current page.
    */
  val referrer: java.lang.String = js.native
  /**
    * Retrieves a collection of all script objects in the document.
    */
  val scripts: HTMLCollectionOf[HTMLScriptElement] = js.native
  val scrollingElement: Element | scala.Null = js.native
  val timeline: DocumentTimeline = js.native
  /**
    * Contains the title of the document.
    */
  var title: java.lang.String = js.native
  val visibilityState: VisibilityState = js.native
  /**
    * Sets or gets the color of the links that the user has visited.
    */
  /** @deprecated */
  var vlinkColor: java.lang.String = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * The options argument sets listener-specific options. For compatibility this can be a
    * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
    * be removed.
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /**
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Moves node from another document and returns it.
    * If node is a document, throws a "NotSupportedError" DOMException or, if node is a shadow root, throws a
    * "HierarchyRequestError" DOMException.
    */
  def adoptNode[T /* <: Node */](source: T): T = js.native
  /** @deprecated */
  def captureEvents(): scala.Unit = js.native
  /** @deprecated */
  def clear(): scala.Unit = js.native
  /**
    * Closes an output stream and forces the sent data to display.
    */
  def close(): scala.Unit = js.native
  /**
    * Creates an attribute object with a specified name.
    * @param name String that sets the attribute object's name.
    */
  def createAttribute(localName: java.lang.String): Attr = js.native
  def createAttributeNS(namespace: java.lang.String, qualifiedName: java.lang.String): Attr = js.native
  def createAttributeNS(namespace: scala.Null, qualifiedName: java.lang.String): Attr = js.native
  /**
    * Returns a CDATASection node whose data is data.
    */
  def createCDATASection(data: java.lang.String): CDATASection = js.native
  /**
    * Creates a comment object with the specified data.
    * @param data Sets the comment object's data.
    */
  def createComment(data: java.lang.String): Comment = js.native
  /**
    * Creates a new document.
    */
  def createDocumentFragment(): DocumentFragment = js.native
  def createElement(tagName: java.lang.String): HTMLElement = js.native
  def createElement(tagName: java.lang.String, options: ElementCreationOptions): HTMLElement = js.native
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String): Element = js.native
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String, options: ElementCreationOptions): Element = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.a
  ): SVGAElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.circle
  ): SVGCircleElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.clipPath
  ): SVGClipPathElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.componentTransferFunction
  ): SVGComponentTransferFunctionElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.cursor
  ): SVGCursorElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.defs
  ): SVGDefsElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.desc
  ): SVGDescElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ellipse
  ): SVGEllipseElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feBlend
  ): SVGFEBlendElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feColorMatrix
  ): SVGFEColorMatrixElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComponentTransfer
  ): SVGFEComponentTransferElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComposite
  ): SVGFECompositeElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feConvolveMatrix
  ): SVGFEConvolveMatrixElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDiffuseLighting
  ): SVGFEDiffuseLightingElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDisplacementMap
  ): SVGFEDisplacementMapElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDistantLight
  ): SVGFEDistantLightElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFlood
  ): SVGFEFloodElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncA
  ): SVGFEFuncAElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncB
  ): SVGFEFuncBElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncG
  ): SVGFEFuncGElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncR
  ): SVGFEFuncRElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feGaussianBlur
  ): SVGFEGaussianBlurElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feImage
  ): SVGFEImageElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMerge
  ): SVGFEMergeElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMergeNode
  ): SVGFEMergeNodeElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMorphology
  ): SVGFEMorphologyElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feOffset
  ): SVGFEOffsetElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.fePointLight
  ): SVGFEPointLightElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpecularLighting
  ): SVGFESpecularLightingElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpotLight
  ): SVGFESpotLightElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTile
  ): SVGFETileElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTurbulence
  ): SVGFETurbulenceElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.filter
  ): SVGFilterElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.foreignObject
  ): SVGForeignObjectElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.g
  ): SVGGElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.gradient
  ): SVGGradientElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.image
  ): SVGImageElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.line
  ): SVGLineElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.linearGradient
  ): SVGLinearGradientElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.marker
  ): SVGMarkerElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.mask
  ): SVGMaskElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.metadata
  ): SVGMetadataElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.path
  ): SVGPathElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.pattern
  ): SVGPatternElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.polygon
  ): SVGPolygonElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.polyline
  ): SVGPolylineElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.radialGradient
  ): SVGRadialGradientElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.rect
  ): SVGRectElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.script
  ): SVGScriptElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.stop
  ): SVGStopElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.style
  ): SVGStyleElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.svg
  ): SVGSVGElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.switch
  ): SVGSwitchElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.symbol
  ): SVGSymbolElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.text
  ): SVGTextElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.textContent
  ): SVGTextContentElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.textPath
  ): SVGTextPathElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.textPositioning
  ): SVGTextPositioningElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.title
  ): SVGTitleElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tspan
  ): SVGTSpanElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.use
  ): SVGUseElement = js.native
  def createElementNS(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.view
  ): SVGViewElement = js.native
  def createElementNS(namespaceURI: scala.Null, qualifiedName: java.lang.String): Element = js.native
  def createElementNS(namespaceURI: scala.Null, qualifiedName: java.lang.String, options: ElementCreationOptions): Element = js.native
  def createElementNS(namespace: java.lang.String, qualifiedName: java.lang.String, options: java.lang.String): Element = js.native
  def createElementNS(namespace: scala.Null, qualifiedName: java.lang.String, options: java.lang.String): Element = js.native
  /**
    * Returns an element with namespace namespace. Its namespace prefix will be everything before ":" (U+003E) in qualifiedName or null. Its local name will be everything after
    * ":" (U+003E) in qualifiedName or qualifiedName.
    * If localName does not match the Name production an
    * "InvalidCharacterError" DOMException will be thrown.
    * If one of the following conditions is true a "NamespaceError" DOMException will be thrown:
    * localName does not match the QName production.
    * Namespace prefix is not null and namespace is the empty string.
    * Namespace prefix is "xml" and namespace is not the XML namespace.
    * qualifiedName or namespace prefix is "xmlns" and namespace is not the XMLNS namespace.
    * namespace is the XMLNS namespace and
    * neither qualifiedName nor namespace prefix is "xmlns".
    * When supplied, options's is can be used to create a customized built-in element.
    */
  @JSName("createElementNS")
  def `createElementNS_http://wwww3org/1999/xhtml`(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/1999/xhtml`,
    qualifiedName: java.lang.String
  ): HTMLElement = js.native
  @JSName("createElementNS")
  def `createElementNS_http://wwww3org/2000/svg`(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: java.lang.String
  ): SVGElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_a(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.a): HTMLAnchorElement = js.native
  @JSName("createElement")
  def createElement_a(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.a, options: ElementCreationOptions): HTMLAnchorElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_abbr(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.abbr): HTMLElement = js.native
  @JSName("createElement")
  def createElement_abbr(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.abbr, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_address(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.address): HTMLElement = js.native
  @JSName("createElement")
  def createElement_address(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.address, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_applet(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.applet): HTMLAppletElement = js.native
  @JSName("createElement")
  def createElement_applet(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.applet, options: ElementCreationOptions): HTMLAppletElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_area(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.area): HTMLAreaElement = js.native
  @JSName("createElement")
  def createElement_area(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.area, options: ElementCreationOptions): HTMLAreaElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_article(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.article): HTMLElement = js.native
  @JSName("createElement")
  def createElement_article(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.article, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_aside(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.aside): HTMLElement = js.native
  @JSName("createElement")
  def createElement_aside(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.aside, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_audio(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.audio): HTMLAudioElement = js.native
  @JSName("createElement")
  def createElement_audio(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.audio, options: ElementCreationOptions): HTMLAudioElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_b(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.b): HTMLElement = js.native
  @JSName("createElement")
  def createElement_b(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.b, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_base(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.base): HTMLBaseElement = js.native
  @JSName("createElement")
  def createElement_base(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.base, options: ElementCreationOptions): HTMLBaseElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_basefont(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.basefont): HTMLBaseFontElement = js.native
  @JSName("createElement")
  def createElement_basefont(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.basefont, options: ElementCreationOptions): HTMLBaseFontElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_bdo(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.bdo): HTMLElement = js.native
  @JSName("createElement")
  def createElement_bdo(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.bdo, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_blockquote(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.blockquote): HTMLQuoteElement = js.native
  @JSName("createElement")
  def createElement_blockquote(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.blockquote, options: ElementCreationOptions): HTMLQuoteElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_body(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.body): HTMLBodyElement = js.native
  @JSName("createElement")
  def createElement_body(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.body, options: ElementCreationOptions): HTMLBodyElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_br(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.br): HTMLBRElement = js.native
  @JSName("createElement")
  def createElement_br(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.br, options: ElementCreationOptions): HTMLBRElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_button(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.button): HTMLButtonElement = js.native
  @JSName("createElement")
  def createElement_button(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.button, options: ElementCreationOptions): HTMLButtonElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_canvas(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.canvas): HTMLCanvasElement = js.native
  @JSName("createElement")
  def createElement_canvas(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.canvas, options: ElementCreationOptions): HTMLCanvasElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_caption(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.caption): HTMLTableCaptionElement = js.native
  @JSName("createElement")
  def createElement_caption(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.caption, options: ElementCreationOptions): HTMLTableCaptionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_cite(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.cite): HTMLElement = js.native
  @JSName("createElement")
  def createElement_cite(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.cite, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_code(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.code): HTMLElement = js.native
  @JSName("createElement")
  def createElement_code(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.code, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_col(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.col): HTMLTableColElement = js.native
  @JSName("createElement")
  def createElement_col(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.col, options: ElementCreationOptions): HTMLTableColElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_colgroup(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.colgroup): HTMLTableColElement = js.native
  @JSName("createElement")
  def createElement_colgroup(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.colgroup, options: ElementCreationOptions): HTMLTableColElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_data(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.data): HTMLDataElement = js.native
  @JSName("createElement")
  def createElement_data(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.data, options: ElementCreationOptions): HTMLDataElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_datalist(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.datalist): HTMLDataListElement = js.native
  @JSName("createElement")
  def createElement_datalist(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.datalist, options: ElementCreationOptions): HTMLDataListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dd(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dd): HTMLElement = js.native
  @JSName("createElement")
  def createElement_dd(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dd, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_del(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.del): HTMLModElement = js.native
  @JSName("createElement")
  def createElement_del(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.del, options: ElementCreationOptions): HTMLModElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_details(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.details): HTMLDetailsElement = js.native
  @JSName("createElement")
  def createElement_details(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.details, options: ElementCreationOptions): HTMLDetailsElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dfn(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dfn): HTMLElement = js.native
  @JSName("createElement")
  def createElement_dfn(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dfn, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dialog(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dialog): HTMLDialogElement = js.native
  @JSName("createElement")
  def createElement_dialog(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dialog, options: ElementCreationOptions): HTMLDialogElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dir(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dir): HTMLDirectoryElement = js.native
  @JSName("createElement")
  def createElement_dir(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dir, options: ElementCreationOptions): HTMLDirectoryElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_div(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.div): HTMLDivElement = js.native
  @JSName("createElement")
  def createElement_div(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.div, options: ElementCreationOptions): HTMLDivElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dl(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dl): HTMLDListElement = js.native
  @JSName("createElement")
  def createElement_dl(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dl, options: ElementCreationOptions): HTMLDListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dt(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dt): HTMLElement = js.native
  @JSName("createElement")
  def createElement_dt(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dt, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_em(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.em): HTMLElement = js.native
  @JSName("createElement")
  def createElement_em(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.em, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_embed(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.embed): HTMLEmbedElement = js.native
  @JSName("createElement")
  def createElement_embed(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.embed, options: ElementCreationOptions): HTMLEmbedElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_fieldset(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.fieldset): HTMLFieldSetElement = js.native
  @JSName("createElement")
  def createElement_fieldset(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.fieldset, options: ElementCreationOptions): HTMLFieldSetElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_figcaption(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.figcaption): HTMLElement = js.native
  @JSName("createElement")
  def createElement_figcaption(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.figcaption, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_figure(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.figure): HTMLElement = js.native
  @JSName("createElement")
  def createElement_figure(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.figure, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_font(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.font): HTMLFontElement = js.native
  @JSName("createElement")
  def createElement_font(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.font, options: ElementCreationOptions): HTMLFontElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_footer(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.footer): HTMLElement = js.native
  @JSName("createElement")
  def createElement_footer(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.footer, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_form(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.form): HTMLFormElement = js.native
  @JSName("createElement")
  def createElement_form(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.form, options: ElementCreationOptions): HTMLFormElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_frame(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.frame): HTMLFrameElement = js.native
  @JSName("createElement")
  def createElement_frame(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.frame, options: ElementCreationOptions): HTMLFrameElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_frameset(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.frameset): HTMLFrameSetElement = js.native
  @JSName("createElement")
  def createElement_frameset(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.frameset, options: ElementCreationOptions): HTMLFrameSetElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h1(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h1): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h1(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h1, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h2(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h2): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h2(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h2, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h3(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h3): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h3(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h3, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h4(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h4): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h4(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h4, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h5(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h5): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h5(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h5, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h6(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h6): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h6(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h6, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_head(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.head): HTMLHeadElement = js.native
  @JSName("createElement")
  def createElement_head(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.head, options: ElementCreationOptions): HTMLHeadElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_header(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.header): HTMLElement = js.native
  @JSName("createElement")
  def createElement_header(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.header, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_hgroup(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.hgroup): HTMLElement = js.native
  @JSName("createElement")
  def createElement_hgroup(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.hgroup, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_hr(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.hr): HTMLHRElement = js.native
  @JSName("createElement")
  def createElement_hr(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.hr, options: ElementCreationOptions): HTMLHRElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_html(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.html): HTMLHtmlElement = js.native
  @JSName("createElement")
  def createElement_html(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.html, options: ElementCreationOptions): HTMLHtmlElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_i(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.i): HTMLElement = js.native
  @JSName("createElement")
  def createElement_i(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.i, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_iframe(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.iframe): HTMLIFrameElement = js.native
  @JSName("createElement")
  def createElement_iframe(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.iframe, options: ElementCreationOptions): HTMLIFrameElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_img(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.img): HTMLImageElement = js.native
  @JSName("createElement")
  def createElement_img(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.img, options: ElementCreationOptions): HTMLImageElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_input(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.input): HTMLInputElement = js.native
  @JSName("createElement")
  def createElement_input(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.input, options: ElementCreationOptions): HTMLInputElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ins(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ins): HTMLModElement = js.native
  @JSName("createElement")
  def createElement_ins(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ins, options: ElementCreationOptions): HTMLModElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_kbd(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.kbd): HTMLElement = js.native
  @JSName("createElement")
  def createElement_kbd(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.kbd, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_label(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.label): HTMLLabelElement = js.native
  @JSName("createElement")
  def createElement_label(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.label, options: ElementCreationOptions): HTMLLabelElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_legend(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.legend): HTMLLegendElement = js.native
  @JSName("createElement")
  def createElement_legend(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.legend, options: ElementCreationOptions): HTMLLegendElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_li(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.li): HTMLLIElement = js.native
  @JSName("createElement")
  def createElement_li(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.li, options: ElementCreationOptions): HTMLLIElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_link(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.link): HTMLLinkElement = js.native
  @JSName("createElement")
  def createElement_link(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.link, options: ElementCreationOptions): HTMLLinkElement = js.native
  /** @deprecated */
  @JSName("createElement")
  def createElement_listing(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.listing): HTMLPreElement = js.native
  @JSName("createElement")
  def createElement_listing(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.listing, options: ElementCreationOptions): HTMLPreElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_map(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.map): HTMLMapElement = js.native
  @JSName("createElement")
  def createElement_map(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.map, options: ElementCreationOptions): HTMLMapElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_mark(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark): HTMLElement = js.native
  @JSName("createElement")
  def createElement_mark(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_marquee(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.marquee): HTMLMarqueeElement = js.native
  @JSName("createElement")
  def createElement_marquee(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.marquee, options: ElementCreationOptions): HTMLMarqueeElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_menu(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.menu): HTMLMenuElement = js.native
  @JSName("createElement")
  def createElement_menu(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.menu, options: ElementCreationOptions): HTMLMenuElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_meta(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.meta): HTMLMetaElement = js.native
  @JSName("createElement")
  def createElement_meta(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.meta, options: ElementCreationOptions): HTMLMetaElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_meter(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.meter): HTMLMeterElement = js.native
  @JSName("createElement")
  def createElement_meter(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.meter, options: ElementCreationOptions): HTMLMeterElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_nav(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.nav): HTMLElement = js.native
  @JSName("createElement")
  def createElement_nav(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.nav, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_noscript(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.noscript): HTMLElement = js.native
  @JSName("createElement")
  def createElement_noscript(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.noscript, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_object(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.`object`): HTMLObjectElement = js.native
  @JSName("createElement")
  def createElement_object(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.`object`, options: ElementCreationOptions): HTMLObjectElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ol(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ol): HTMLOListElement = js.native
  @JSName("createElement")
  def createElement_ol(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ol, options: ElementCreationOptions): HTMLOListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_optgroup(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.optgroup): HTMLOptGroupElement = js.native
  @JSName("createElement")
  def createElement_optgroup(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.optgroup, options: ElementCreationOptions): HTMLOptGroupElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_option(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.option): HTMLOptionElement = js.native
  @JSName("createElement")
  def createElement_option(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.option, options: ElementCreationOptions): HTMLOptionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_output(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.output): HTMLOutputElement = js.native
  @JSName("createElement")
  def createElement_output(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.output, options: ElementCreationOptions): HTMLOutputElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_p(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.p): HTMLParagraphElement = js.native
  @JSName("createElement")
  def createElement_p(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.p, options: ElementCreationOptions): HTMLParagraphElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_param(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.param): HTMLParamElement = js.native
  @JSName("createElement")
  def createElement_param(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.param, options: ElementCreationOptions): HTMLParamElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_picture(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.picture): HTMLPictureElement = js.native
  @JSName("createElement")
  def createElement_picture(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.picture, options: ElementCreationOptions): HTMLPictureElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_pre(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.pre): HTMLPreElement = js.native
  @JSName("createElement")
  def createElement_pre(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.pre, options: ElementCreationOptions): HTMLPreElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_progress(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress): HTMLProgressElement = js.native
  @JSName("createElement")
  def createElement_progress(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress, options: ElementCreationOptions): HTMLProgressElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_q(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.q): HTMLQuoteElement = js.native
  @JSName("createElement")
  def createElement_q(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.q, options: ElementCreationOptions): HTMLQuoteElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_rt(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.rt): HTMLElement = js.native
  @JSName("createElement")
  def createElement_rt(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.rt, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ruby(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ruby): HTMLElement = js.native
  @JSName("createElement")
  def createElement_ruby(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ruby, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_s(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.s): HTMLElement = js.native
  @JSName("createElement")
  def createElement_s(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.s, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_samp(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.samp): HTMLElement = js.native
  @JSName("createElement")
  def createElement_samp(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.samp, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_script(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.script): HTMLScriptElement = js.native
  @JSName("createElement")
  def createElement_script(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.script, options: ElementCreationOptions): HTMLScriptElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_section(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.section): HTMLElement = js.native
  @JSName("createElement")
  def createElement_section(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.section, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_select(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.select): HTMLSelectElement = js.native
  @JSName("createElement")
  def createElement_select(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.select, options: ElementCreationOptions): HTMLSelectElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_slot(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.slot): HTMLSlotElement = js.native
  @JSName("createElement")
  def createElement_slot(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.slot, options: ElementCreationOptions): HTMLSlotElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_small(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.small): HTMLElement = js.native
  @JSName("createElement")
  def createElement_small(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.small, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_source(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.source): HTMLSourceElement = js.native
  @JSName("createElement")
  def createElement_source(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.source, options: ElementCreationOptions): HTMLSourceElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_span(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.span): HTMLSpanElement = js.native
  @JSName("createElement")
  def createElement_span(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.span, options: ElementCreationOptions): HTMLSpanElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_strong(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.strong): HTMLElement = js.native
  @JSName("createElement")
  def createElement_strong(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.strong, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_style(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.style): HTMLStyleElement = js.native
  @JSName("createElement")
  def createElement_style(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.style, options: ElementCreationOptions): HTMLStyleElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_sub(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.sub): HTMLElement = js.native
  @JSName("createElement")
  def createElement_sub(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.sub, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_sup(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.sup): HTMLElement = js.native
  @JSName("createElement")
  def createElement_sup(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.sup, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_table(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.table): HTMLTableElement = js.native
  @JSName("createElement")
  def createElement_table(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.table, options: ElementCreationOptions): HTMLTableElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_tbody(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tbody): HTMLTableSectionElement = js.native
  @JSName("createElement")
  def createElement_tbody(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tbody, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_td(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.td): HTMLTableDataCellElement = js.native
  @JSName("createElement")
  def createElement_td(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.td, options: ElementCreationOptions): HTMLTableDataCellElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_template(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.template): HTMLTemplateElement = js.native
  @JSName("createElement")
  def createElement_template(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.template, options: ElementCreationOptions): HTMLTemplateElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_textarea(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.textarea): HTMLTextAreaElement = js.native
  @JSName("createElement")
  def createElement_textarea(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.textarea, options: ElementCreationOptions): HTMLTextAreaElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_tfoot(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tfoot): HTMLTableSectionElement = js.native
  @JSName("createElement")
  def createElement_tfoot(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tfoot, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_th(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.th): HTMLTableHeaderCellElement = js.native
  @JSName("createElement")
  def createElement_th(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.th, options: ElementCreationOptions): HTMLTableHeaderCellElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_thead(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.thead): HTMLTableSectionElement = js.native
  @JSName("createElement")
  def createElement_thead(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.thead, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_time(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.time): HTMLTimeElement = js.native
  @JSName("createElement")
  def createElement_time(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.time, options: ElementCreationOptions): HTMLTimeElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_title(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.title): HTMLTitleElement = js.native
  @JSName("createElement")
  def createElement_title(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.title, options: ElementCreationOptions): HTMLTitleElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_tr(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tr): HTMLTableRowElement = js.native
  @JSName("createElement")
  def createElement_tr(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tr, options: ElementCreationOptions): HTMLTableRowElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_track(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.track): HTMLTrackElement = js.native
  @JSName("createElement")
  def createElement_track(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.track, options: ElementCreationOptions): HTMLTrackElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_u(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.u): HTMLElement = js.native
  @JSName("createElement")
  def createElement_u(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.u, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ul(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ul): HTMLUListElement = js.native
  @JSName("createElement")
  def createElement_ul(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ul, options: ElementCreationOptions): HTMLUListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_var(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.`var`): HTMLElement = js.native
  @JSName("createElement")
  def createElement_var(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.`var`, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_video(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.video): HTMLVideoElement = js.native
  @JSName("createElement")
  def createElement_video(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.video, options: ElementCreationOptions): HTMLVideoElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_wbr(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.wbr): HTMLElement = js.native
  @JSName("createElement")
  def createElement_wbr(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.wbr, options: ElementCreationOptions): HTMLElement = js.native
  /** @deprecated */
  @JSName("createElement")
  def createElement_xmp(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.xmp): HTMLPreElement = js.native
  @JSName("createElement")
  def createElement_xmp(tagName: pdfjsDashDistLib.pdfjsDashDistLibStrings.xmp, options: ElementCreationOptions): HTMLPreElement = js.native
  def createEvent(eventInterface: java.lang.String): Event = js.native
  @JSName("createEvent")
  def createEvent_AnimationEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.AnimationEvent): AnimationEvent = js.native
  @JSName("createEvent")
  def createEvent_AnimationPlaybackEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.AnimationPlaybackEvent): AnimationPlaybackEvent = js.native
  @JSName("createEvent")
  def createEvent_AudioProcessingEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.AudioProcessingEvent): AudioProcessingEvent = js.native
  @JSName("createEvent")
  def createEvent_BeforeUnloadEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.BeforeUnloadEvent): BeforeUnloadEvent = js.native
  @JSName("createEvent")
  def createEvent_ClipboardEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.ClipboardEvent): ClipboardEvent = js.native
  @JSName("createEvent")
  def createEvent_CloseEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.CloseEvent): CloseEvent = js.native
  @JSName("createEvent")
  def createEvent_CompositionEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.CompositionEvent): CompositionEvent = js.native
  @JSName("createEvent")
  def createEvent_CustomEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.CustomEvent): CustomEvent[_] = js.native
  @JSName("createEvent")
  def createEvent_DeviceLightEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.DeviceLightEvent): DeviceLightEvent = js.native
  @JSName("createEvent")
  def createEvent_DeviceMotionEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.DeviceMotionEvent): DeviceMotionEvent = js.native
  @JSName("createEvent")
  def createEvent_DeviceOrientationEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.DeviceOrientationEvent): DeviceOrientationEvent = js.native
  @JSName("createEvent")
  def createEvent_DragEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.DragEvent): DragEvent = js.native
  @JSName("createEvent")
  def createEvent_ErrorEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.ErrorEvent): ErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_Event(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.Event): Event = js.native
  @JSName("createEvent")
  def createEvent_Events(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.Events): Event = js.native
  @JSName("createEvent")
  def createEvent_FocusEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.FocusEvent): FocusEvent = js.native
  @JSName("createEvent")
  def createEvent_FocusNavigationEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.FocusNavigationEvent): FocusNavigationEvent = js.native
  @JSName("createEvent")
  def createEvent_GamepadEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.GamepadEvent): GamepadEvent = js.native
  @JSName("createEvent")
  def createEvent_HashChangeEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.HashChangeEvent): HashChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_IDBVersionChangeEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.IDBVersionChangeEvent): IDBVersionChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_KeyboardEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.KeyboardEvent): KeyboardEvent = js.native
  @JSName("createEvent")
  def createEvent_ListeningStateChangedEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.ListeningStateChangedEvent): ListeningStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_MSGestureEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureEvent): MSGestureEvent = js.native
  @JSName("createEvent")
  def createEvent_MSMediaKeyMessageEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSMediaKeyMessageEvent): MSMediaKeyMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MSMediaKeyNeededEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSMediaKeyNeededEvent): MSMediaKeyNeededEvent = js.native
  @JSName("createEvent")
  def createEvent_MSPointerEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerEvent): MSPointerEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaEncryptedEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MediaEncryptedEvent): MediaEncryptedEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaKeyMessageEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MediaKeyMessageEvent): MediaKeyMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaQueryListEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MediaQueryListEvent): MediaQueryListEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamErrorEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MediaStreamErrorEvent): MediaStreamErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MediaStreamEvent): MediaStreamEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamTrackEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MediaStreamTrackEvent): MediaStreamTrackEvent = js.native
  @JSName("createEvent")
  def createEvent_MessageEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MessageEvent): MessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MouseEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MouseEvent): MouseEvent = js.native
  @JSName("createEvent")
  def createEvent_MouseEvents(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MouseEvents): MouseEvent = js.native
  @JSName("createEvent")
  def createEvent_MutationEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MutationEvent): MutationEvent = js.native
  @JSName("createEvent")
  def createEvent_MutationEvents(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.MutationEvents): MutationEvent = js.native
  @JSName("createEvent")
  def createEvent_OfflineAudioCompletionEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.OfflineAudioCompletionEvent): OfflineAudioCompletionEvent = js.native
  @JSName("createEvent")
  def createEvent_OverflowEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.OverflowEvent): OverflowEvent = js.native
  @JSName("createEvent")
  def createEvent_PageTransitionEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.PageTransitionEvent): PageTransitionEvent = js.native
  @JSName("createEvent")
  def createEvent_PaymentRequestUpdateEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.PaymentRequestUpdateEvent): PaymentRequestUpdateEvent = js.native
  @JSName("createEvent")
  def createEvent_PermissionRequestedEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.PermissionRequestedEvent): PermissionRequestedEvent = js.native
  @JSName("createEvent")
  def createEvent_PointerEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.PointerEvent): PointerEvent = js.native
  @JSName("createEvent")
  def createEvent_PopStateEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.PopStateEvent): PopStateEvent = js.native
  @JSName("createEvent")
  def createEvent_ProgressEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.ProgressEvent): ProgressEvent = js.native
  @JSName("createEvent")
  def createEvent_PromiseRejectionEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.PromiseRejectionEvent): PromiseRejectionEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDTMFToneChangeEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCDTMFToneChangeEvent): RTCDTMFToneChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDataChannelEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCDataChannelEvent): RTCDataChannelEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDtlsTransportStateChangedEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCDtlsTransportStateChangedEvent): RTCDtlsTransportStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCErrorEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCErrorEvent): RTCErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceCandidatePairChangedEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCIceCandidatePairChangedEvent): RTCIceCandidatePairChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceGathererEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCIceGathererEvent): RTCIceGathererEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceTransportStateChangedEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCIceTransportStateChangedEvent): RTCIceTransportStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCPeerConnectionIceErrorEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCPeerConnectionIceErrorEvent): RTCPeerConnectionIceErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCPeerConnectionIceEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCPeerConnectionIceEvent): RTCPeerConnectionIceEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCSsrcConflictEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCSsrcConflictEvent): RTCSsrcConflictEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCStatsEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCStatsEvent): RTCStatsEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCTrackEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.RTCTrackEvent): RTCTrackEvent = js.native
  @JSName("createEvent")
  def createEvent_SVGZoomEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.SVGZoomEvent): SVGZoomEvent = js.native
  @JSName("createEvent")
  def createEvent_SVGZoomEvents(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.SVGZoomEvents): SVGZoomEvent = js.native
  @JSName("createEvent")
  def createEvent_SecurityPolicyViolationEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.SecurityPolicyViolationEvent): SecurityPolicyViolationEvent = js.native
  @JSName("createEvent")
  def createEvent_ServiceWorkerMessageEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.ServiceWorkerMessageEvent): ServiceWorkerMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechRecognitionError(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.SpeechRecognitionError): SpeechRecognitionError = js.native
  @JSName("createEvent")
  def createEvent_SpeechRecognitionEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.SpeechRecognitionEvent): SpeechRecognitionEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechSynthesisErrorEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.SpeechSynthesisErrorEvent): SpeechSynthesisErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechSynthesisEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.SpeechSynthesisEvent): SpeechSynthesisEvent = js.native
  @JSName("createEvent")
  def createEvent_StorageEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.StorageEvent): StorageEvent = js.native
  @JSName("createEvent")
  def createEvent_TextEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.TextEvent): TextEvent = js.native
  @JSName("createEvent")
  def createEvent_TouchEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.TouchEvent): TouchEvent = js.native
  @JSName("createEvent")
  def createEvent_TrackEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.TrackEvent): TrackEvent = js.native
  @JSName("createEvent")
  def createEvent_TransitionEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.TransitionEvent): TransitionEvent = js.native
  @JSName("createEvent")
  def createEvent_UIEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.UIEvent): UIEvent = js.native
  @JSName("createEvent")
  def createEvent_UIEvents(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.UIEvents): UIEvent = js.native
  @JSName("createEvent")
  def createEvent_VRDisplayEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.VRDisplayEvent): VRDisplayEvent = js.native
  @JSName("createEvent")
  def `createEvent_VRDisplayEvent `(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.`VRDisplayEvent `): VRDisplayEvent = js.native
  @JSName("createEvent")
  def createEvent_WebGLContextEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.WebGLContextEvent): WebGLContextEvent = js.native
  @JSName("createEvent")
  def createEvent_WheelEvent(eventInterface: pdfjsDashDistLib.pdfjsDashDistLibStrings.WheelEvent): WheelEvent = js.native
  /**
    * Creates a NodeIterator object that you can use to traverse filtered lists of nodes or elements in a document.
    * @param root The root element or node to start traversing on.
    * @param whatToShow The type of nodes or elements to appear in the node list
    * @param filter A custom NodeFilter function to use. For more information, see filter. Use null for no filter.
    * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
    */
  def createNodeIterator(root: Node): NodeIterator = js.native
  def createNodeIterator(root: Node, whatToShow: scala.Double): NodeIterator = js.native
  def createNodeIterator(root: Node, whatToShow: scala.Double, filter: NodeFilter): NodeIterator = js.native
  /**
    * Returns a ProcessingInstruction node whose target is target and data is data.
    * If target does not match the Name production an
    * "InvalidCharacterError" DOMException will be thrown.
    * If data contains "?>" an
    * "InvalidCharacterError" DOMException will be thrown.
    */
  def createProcessingInstruction(target: java.lang.String, data: java.lang.String): ProcessingInstruction = js.native
  /**
    *  Returns an empty range object that has both of its boundary points positioned at the beginning of the document.
    */
  def createRange(): Range = js.native
  /**
    * Creates a text string from the specified value.
    * @param data String that specifies the nodeValue property of the text node.
    */
  def createTextNode(data: java.lang.String): Text = js.native
  def createTouch(
    view: WindowProxy,
    target: EventTarget,
    identifier: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    screenX: scala.Double,
    screenY: scala.Double
  ): Touch = js.native
  def createTouchList(touches: Touch*): TouchList = js.native
  /**
    * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
    * @param root The root element or node to start traversing on.
    * @param whatToShow The type of nodes or elements to appear in the node list. For more information, see whatToShow.
    * @param filter A custom NodeFilter function to use.
    * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
    */
  def createTreeWalker(root: Node): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: NodeFilter): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: NodeFilter, entityReferenceExpansion: scala.Boolean): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: scala.Null, entityReferenceExpansion: scala.Boolean): TreeWalker = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: js.Function1[/* prefix */ java.lang.String, java.lang.String | scala.Null],
    `type`: scala.Double
  ): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: js.Function1[/* prefix */ java.lang.String, java.lang.String | scala.Null],
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: XPathNSResolver, `type`: scala.Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: scala.Null, `type`: scala.Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: scala.Null,
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  /**
    * Executes a command on the current document, current selection, or the given range.
    * @param commandId String that specifies the command to execute. This command can be any of the command identifiers that can be executed in script.
    * @param showUI Display the user interface, defaults to false.
    * @param value Value to assign.
    */
  def execCommand(commandId: java.lang.String): scala.Boolean = js.native
  def execCommand(commandId: java.lang.String, showUI: scala.Boolean): scala.Boolean = js.native
  def execCommand(commandId: java.lang.String, showUI: scala.Boolean, value: java.lang.String): scala.Boolean = js.native
  /**
    * Stops document's fullscreen element from being displayed fullscreen and
    * resolves promise when done.
    */
  def exitFullscreen(): js.Promise[scala.Unit] = js.native
  def getAnimations(): js.Array[Animation] = js.native
  /**
    * collection = element . getElementsByClassName(classNames)
    */
  def getElementsByClassName(classNames: java.lang.String): HTMLCollectionOf[Element] = js.native
  /**
    * Gets a collection of objects based on the value of the NAME or ID attribute.
    * @param elementName Gets a collection of objects based on the value of the NAME or ID attribute.
    */
  def getElementsByName(elementName: java.lang.String): NodeListOf[HTMLElement] = js.native
  def getElementsByTagName(qualifiedName: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): HTMLCollectionOf[Element] = js.native
  /**
    * If namespace and localName are
    * "*" returns a HTMLCollection of all descendant elements.
    * If only namespace is "*" returns a HTMLCollection of all descendant elements whose local name is localName.
    * If only localName is "*" returns a HTMLCollection of all descendant elements whose namespace is namespace.
    * Otherwise, returns a HTMLCollection of all descendant elements whose namespace is namespace and local name is localName.
    */
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/1999/xhtml`(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/1999/xhtml`,
    localName: java.lang.String
  ): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/2000/svg`(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    localName: java.lang.String
  ): HTMLCollectionOf[SVGElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_a(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.a): HTMLCollectionOf[HTMLAnchorElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_abbr(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.abbr): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_address(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.address): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_applet(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.applet): HTMLCollectionOf[HTMLAppletElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_area(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.area): HTMLCollectionOf[HTMLAreaElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_article(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.article): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_aside(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.aside): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_audio(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.audio): HTMLCollectionOf[HTMLAudioElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_b(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.b): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_base(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.base): HTMLCollectionOf[HTMLBaseElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_basefont(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.basefont): HTMLCollectionOf[HTMLBaseFontElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_bdo(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.bdo): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_blockquote(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_body(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.body): HTMLCollectionOf[HTMLBodyElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_br(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.br): HTMLCollectionOf[HTMLBRElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_button(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.button): HTMLCollectionOf[HTMLButtonElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_canvas(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_caption(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_circle(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.circle): HTMLCollectionOf[SVGCircleElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_cite(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.cite): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_clipPath(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_code(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.code): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_col(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.col): HTMLCollectionOf[HTMLTableColElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_colgroup(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_data(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.data): HTMLCollectionOf[HTMLDataElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_datalist(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dd(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_defs(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.defs): HTMLCollectionOf[SVGDefsElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_del(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.del): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_desc(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.desc): HTMLCollectionOf[SVGDescElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_details(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.details): HTMLCollectionOf[HTMLDetailsElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dfn(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dfn): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dialog(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dir(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dir): HTMLCollectionOf[HTMLDirectoryElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_div(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.div): HTMLCollectionOf[HTMLDivElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dl(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dl): HTMLCollectionOf[HTMLDListElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dt(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ellipse(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_em(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.em): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_embed(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.embed): HTMLCollectionOf[HTMLEmbedElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feBlend(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feBlend): HTMLCollectionOf[SVGFEBlendElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feColorMatrix(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feColorMatrix): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComponentTransfer(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComponentTransfer): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComposite(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComposite): HTMLCollectionOf[SVGFECompositeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feConvolveMatrix(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feConvolveMatrix): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDiffuseLighting(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDiffuseLighting): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDisplacementMap(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDisplacementMap): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDistantLight(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDistantLight): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFlood(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFlood): HTMLCollectionOf[SVGFEFloodElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncA(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncA): HTMLCollectionOf[SVGFEFuncAElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncB(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncB): HTMLCollectionOf[SVGFEFuncBElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncG(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncG): HTMLCollectionOf[SVGFEFuncGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncR(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncR): HTMLCollectionOf[SVGFEFuncRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feGaussianBlur(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feGaussianBlur): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feImage(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feImage): HTMLCollectionOf[SVGFEImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMerge(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMerge): HTMLCollectionOf[SVGFEMergeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMergeNode(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMergeNode): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMorphology(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMorphology): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feOffset(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feOffset): HTMLCollectionOf[SVGFEOffsetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_fePointLight(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.fePointLight): HTMLCollectionOf[SVGFEPointLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpecularLighting(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpecularLighting): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpotLight(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpotLight): HTMLCollectionOf[SVGFESpotLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTile(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTile): HTMLCollectionOf[SVGFETileElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTurbulence(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTurbulence): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_fieldset(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_figcaption(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.figcaption): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_figure(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.figure): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_filter(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.filter): HTMLCollectionOf[SVGFilterElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_font(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.font): HTMLCollectionOf[HTMLFontElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_footer(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.footer): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_foreignObject(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_form(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.form): HTMLCollectionOf[HTMLFormElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_frame(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.frame): HTMLCollectionOf[HTMLFrameElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_frameset(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.frameset): HTMLCollectionOf[HTMLFrameSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_g(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.g): HTMLCollectionOf[SVGGElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h1(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h2(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h3(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h4(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h5(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h6(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_head(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.head): HTMLCollectionOf[HTMLHeadElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_header(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.header): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_hgroup(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.hgroup): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_hr(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.hr): HTMLCollectionOf[HTMLHRElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_html(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.html): HTMLCollectionOf[HTMLHtmlElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_i(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.i): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_iframe(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_image(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.image): HTMLCollectionOf[SVGImageElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_img(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.img): HTMLCollectionOf[HTMLImageElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_input(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.input): HTMLCollectionOf[HTMLInputElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ins(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ins): HTMLCollectionOf[HTMLModElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_kbd(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.kbd): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_label(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.label): HTMLCollectionOf[HTMLLabelElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_legend(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.legend): HTMLCollectionOf[HTMLLegendElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_li(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.li): HTMLCollectionOf[HTMLLIElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_line(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.line): HTMLCollectionOf[SVGLineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_linearGradient(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_link(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.link): HTMLCollectionOf[HTMLLinkElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_map(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.map): HTMLCollectionOf[HTMLMapElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_mark(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marker(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.marker): HTMLCollectionOf[SVGMarkerElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_marquee(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.marquee): HTMLCollectionOf[HTMLMarqueeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mask(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.mask): HTMLCollectionOf[SVGMaskElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_menu(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.menu): HTMLCollectionOf[HTMLMenuElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_meta(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.meta): HTMLCollectionOf[HTMLMetaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_metadata(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_meter(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.meter): HTMLCollectionOf[HTMLMeterElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_nav(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.nav): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_noscript(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.noscript): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_object(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.`object`): HTMLCollectionOf[HTMLObjectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ol(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ol): HTMLCollectionOf[HTMLOListElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_optgroup(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_option(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.option): HTMLCollectionOf[HTMLOptionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_output(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.output): HTMLCollectionOf[HTMLOutputElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_p(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.p): HTMLCollectionOf[HTMLParagraphElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_param(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.param): HTMLCollectionOf[HTMLParamElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_path(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.path): HTMLCollectionOf[SVGPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pattern(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.pattern): HTMLCollectionOf[SVGPatternElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_picture(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.picture): HTMLCollectionOf[HTMLPictureElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polygon(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polyline(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_pre(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.pre): HTMLCollectionOf[HTMLPreElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_progress(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress): HTMLCollectionOf[HTMLProgressElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_q(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.q): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_radialGradient(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rect(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.rect): HTMLCollectionOf[SVGRectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_rt(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.rt): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ruby(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ruby): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_s(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.s): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_samp(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.samp): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_script(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.script): HTMLCollectionOf[HTMLScriptElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_section(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.section): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_select(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.select): HTMLCollectionOf[HTMLSelectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_slot(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.slot): HTMLCollectionOf[HTMLSlotElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_small(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.small): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_source(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.source): HTMLCollectionOf[HTMLSourceElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_span(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.span): HTMLCollectionOf[HTMLSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_stop(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.stop): HTMLCollectionOf[SVGStopElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_strong(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.strong): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_style(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.style): HTMLCollectionOf[HTMLStyleElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_sub(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.sub): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_sup(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.sup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_svg(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.svg): HTMLCollectionOf[SVGSVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_switch(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.switch): HTMLCollectionOf[SVGSwitchElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_symbol(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_table(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.table): HTMLCollectionOf[HTMLTableElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tbody(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_td(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.td): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_template(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.template): HTMLCollectionOf[HTMLTemplateElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_text(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.text): HTMLCollectionOf[SVGTextElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textPath(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_textarea(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tfoot(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_th(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.th): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_thead(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_time(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.time): HTMLCollectionOf[HTMLTimeElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_title(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.title): HTMLCollectionOf[HTMLTitleElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tr(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_track(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.track): HTMLCollectionOf[HTMLTrackElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tspan(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_u(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.u): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ul(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ul): HTMLCollectionOf[HTMLUListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_use(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.use): HTMLCollectionOf[SVGUseElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_var(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.`var`): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_video(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.video): HTMLCollectionOf[HTMLVideoElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_view(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.view): HTMLCollectionOf[SVGViewElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_wbr(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.wbr): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Gets a value indicating whether the object currently has focus.
    */
  def hasFocus(): scala.Boolean = js.native
  def importNode[T /* <: Node */](importedNode: T, deep: scala.Boolean): T = js.native
  /**
    * Opens a new window and loads a document specified by a given URL. Also, opens a new window that uses the url parameter and the name parameter to collect the output of the write method and the writeln method.
    * @param url Specifies a MIME type for the document.
    * @param name Specifies the name of the window. This name is used as the value for the TARGET attribute on a form or an anchor element.
    * @param features Contains a list of items separated by commas. Each item consists of an option and a value, separated by an equals sign (for example, "fullscreen=yes, toolbar=yes"). The following values are supported.
    * @param replace Specifies whether the existing entry for the document is replaced in the history list.
    */
  def open(): Document = js.native
  def open(url: java.lang.String): Document = js.native
  def open(url: java.lang.String, name: java.lang.String): Document = js.native
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String): Document = js.native
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String, replace: scala.Boolean): Document = js.native
  /**
    * Returns a Boolean value that indicates whether a specified command can be successfully executed using execCommand, given the current state of the document.
    * @param commandId Specifies a command identifier.
    */
  def queryCommandEnabled(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether the specified command is in the indeterminate state.
    * @param commandId String that specifies a command identifier.
    */
  def queryCommandIndeterm(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates the current state of the command.
    * @param commandId String that specifies a command identifier.
    */
  def queryCommandState(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether the current command is supported on the current range.
    * @param commandId Specifies a command identifier.
    */
  def queryCommandSupported(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the current value of the document, range, or current selection for the given command.
    * @param commandId String that specifies a command identifier.
    */
  def queryCommandValue(commandId: java.lang.String): java.lang.String = js.native
  /** @deprecated */
  def releaseEvents(): scala.Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Writes one or more HTML expressions to a document in the specified window.
    * @param content Specifies the text and HTML tags to write.
    */
  def write(text: java.lang.String*): scala.Unit = js.native
  /**
    * Writes one or more HTML expressions, followed by a carriage return, to a document in the specified window.
    * @param content The text and HTML tags to write.
    */
  def writeln(text: java.lang.String*): scala.Unit = js.native
}

@JSGlobal("Document")
@js.native
object Document
  extends org.scalablytyped.runtime.Instantiable0[Document]

