package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var CSS: pdfjsDashDistLib.CSS = js.native
  var ServiceUIFrameContext: pdfjsDashDistLib.ServiceUIFrameContext = js.native
  var applicationCache: ApplicationCache = js.native
  var caches: CacheStorage = js.native
  var clientInformation: Navigator = js.native
  var closed: scala.Boolean = js.native
  var console: Console = js.native
  var crypto: Crypto = js.native
  var customElements: CustomElementRegistry = js.native
  var defaultStatus: java.lang.String = js.native
  var devicePixelRatio: scala.Double = js.native
  var doNotTrack: java.lang.String = js.native
  var document: Document = js.native
  var event: js.UndefOr[Event] = js.native
  /** @deprecated */
  var external: External = js.native
  var frameElement: Element = js.native
  var frames: Window = js.native
  var history: History = js.native
  var indexedDB: IDBFactory = js.native
  var innerHeight: scala.Double = js.native
  var innerWidth: scala.Double = js.native
  var isSecureContext: scala.Boolean = js.native
  var length: scala.Double = js.native
  var localStorage: Storage = js.native
  var location: Location = js.native
  var locationbar: BarProp = js.native
  var menubar: BarProp = js.native
  var msContentScript: ExtensionScriptApis = js.native
  val name: scala.Nothing = js.native
  var navigator: Navigator = js.native
  var offscreenBuffering: java.lang.String | scala.Boolean = js.native
  /**
    * Fires when the user aborts the download.
    * @param ev The event.
    */
  var onabort: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  var onafterprint: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onanimationcancel: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onanimationend: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onanimationiteration: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onanimationstart: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onauxclick: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onbeforeprint: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onbeforeunload: (js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the object loses the input focus.
    * @param ev The focus event.
    */
  var onblur: (js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, js.Any]) | scala.Null = js.native
  var oncancel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when playback is possible, but would require further buffering.
    * @param ev The event.
    */
  var oncanplay: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var oncanplaythrough: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the contents of the object or selection have changed.
    * @param ev The event.
    */
  var onchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user clicks the left mouse button on the object
    * @param ev The mouse event.
    */
  var onclick: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onclose: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var oncompassneedscalibration: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user clicks the right mouse button in the client area, opening the context menu.
    * @param ev The mouse event.
    */
  var oncontextmenu: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var oncuechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user double-clicks the object.
    * @param ev The mouse event.
    */
  var ondblclick: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var ondevicelight: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, js.Any]) | scala.Null = js.native
  var ondevicemotion: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, js.Any]) | scala.Null = js.native
  var ondeviceorientation: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the source object continuously during a drag operation.
    * @param ev The event.
    */
  var ondrag: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the source object when the user releases the mouse at the close of a drag operation.
    * @param ev The event.
    */
  var ondragend: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the target element when the user drags the object to a valid drop target.
    * @param ev The drag event.
    */
  var ondragenter: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  var ondragexit: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
    * @param ev The drag event.
    */
  var ondragleave: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the target element continuously while the user drags the object over a valid drop target.
    * @param ev The event.
    */
  var ondragover: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the source object when the user starts to drag a text selection or selected object.
    * @param ev The event.
    */
  var ondragstart: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  var ondrop: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the duration attribute is updated.
    * @param ev The event.
    */
  var ondurationchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the media element is reset to its initial state.
    * @param ev The event.
    */
  var onemptied: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the end of playback is reached.
    * @param ev The event
    */
  var onended: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when an error occurs during object loading.
    * @param ev The event.
    */
  var onerror: ErrorEventHandler = js.native
  /**
    * Fires when the object receives focus.
    * @param ev The event.
    */
  var onfocus: (js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, js.Any]) | scala.Null = js.native
  var ongotpointercapture: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onhashchange: (js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, js.Any]) | scala.Null = js.native
  var oninput: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var oninvalid: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user presses a key.
    * @param ev The keyboard event
    */
  var onkeydown: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user presses an alphanumeric key.
    * @param ev The event.
    */
  var onkeypress: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user releases a key.
    * @param ev The keyboard event
    */
  var onkeyup: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | scala.Null = js.native
  var onlanguagechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires immediately after the browser loads the object.
    * @param ev The event.
    */
  var onload: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when media data is loaded at the current playback position.
    * @param ev The event.
    */
  var onloadeddata: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the duration and dimensions of the media have been determined.
    * @param ev The event.
    */
  var onloadedmetadata: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onloadend: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when Internet Explorer begins looking for media data.
    * @param ev The event.
    */
  var onloadstart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onlostpointercapture: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, js.Any]) | scala.Null = js.native
  var onmessageerror: (js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user clicks the object with either mouse button.
    * @param ev The mouse event.
    */
  var onmousedown: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onmouseenter: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onmouseleave: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse over the object.
    * @param ev The mouse event.
    */
  var onmousemove: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse pointer outside the boundaries of the object.
    * @param ev The mouse event.
    */
  var onmouseout: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse pointer into the object.
    * @param ev The mouse event.
    */
  var onmouseover: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user releases a mouse button while the mouse is over the object.
    * @param ev The mouse event.
    */
  var onmouseup: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onmousewheel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturedoubletap: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgestureend: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturehold: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturestart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturetap: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsinertiastart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointercancel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerdown: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerenter: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerleave: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointermove: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerout: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerover: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerup: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onoffline: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var ononline: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /** @deprecated */
  var onorientationchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onpagehide: (js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, js.Any]) | scala.Null = js.native
  var onpageshow: (js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when playback is paused.
    * @param ev The event.
    */
  var onpause: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the play method is requested.
    * @param ev The event.
    */
  var onplay: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the audio or video has started playing.
    * @param ev The event.
    */
  var onplaying: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onpointercancel: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerdown: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerenter: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerleave: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointermove: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerout: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerover: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerup: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpopstate: (js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs to indicate progress while downloading media data.
    * @param ev The event.
    */
  var onprogress: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the playback rate is increased or decreased.
    * @param ev The event.
    */
  var onratechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onreadystatechange: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, js.Any]) | scala.Null = js.native
  var onrejectionhandled: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user resets a form.
    * @param ev The event.
    */
  var onreset: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onresize: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user repositions the scroll box in the scroll bar on the object.
    * @param ev The event.
    */
  var onscroll: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the seek operation ends.
    * @param ev The event.
    */
  var onseeked: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the current playback position is moved.
    * @param ev The event.
    */
  var onseeking: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the current selection changes.
    * @param ev The event.
    */
  var onselect: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the download has stopped.
    * @param ev The event.
    */
  var onstalled: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onstorage: (js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, js.Any]) | scala.Null = js.native
  var onsubmit: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs if the load operation has been intentionally halted.
    * @param ev The event.
    */
  var onsuspend: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs to indicate the current playback position.
    * @param ev The event.
    */
  var ontimeupdate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var ontoggle: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var ontouchcancel: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontouchend: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontouchmove: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontouchstart: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontransitioncancel: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var ontransitionend: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var ontransitionrun: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var ontransitionstart: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var onunhandledrejection: (js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, js.Any]) | scala.Null = js.native
  var onunload: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the volume is changed, or playback is muted or unmuted.
    * @param ev The event.
    */
  var onvolumechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayactivate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayblur: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayconnect: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayfocus: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaypointerrestricted: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaypointerunrestricted: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when playback stops because the next frame of a video resource is not available.
    * @param ev The event.
    */
  var onwaiting: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onwheel: (js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, js.Any]) | scala.Null = js.native
  var opener: js.Any = js.native
  /** @deprecated */
  var orientation: java.lang.String | scala.Double = js.native
  var origin: java.lang.String = js.native
  var outerHeight: scala.Double = js.native
  var outerWidth: scala.Double = js.native
  var pageXOffset: scala.Double = js.native
  var pageYOffset: scala.Double = js.native
  var parent: Window = js.native
  var performance: Performance = js.native
  var personalbar: BarProp = js.native
  var screen: Screen = js.native
  var screenLeft: scala.Double = js.native
  var screenTop: scala.Double = js.native
  var screenX: scala.Double = js.native
  var screenY: scala.Double = js.native
  var scrollX: scala.Double = js.native
  var scrollY: scala.Double = js.native
  var scrollbars: BarProp = js.native
  var self: Window = js.native
  var sessionStorage: Storage = js.native
  var speechSynthesis: SpeechSynthesis = js.native
  var status: java.lang.String = js.native
  var statusbar: BarProp = js.native
  var styleMedia: StyleMedia = js.native
  var toolbar: BarProp = js.native
  var top: Window = js.native
  var window: Window = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def alert(): scala.Unit = js.native
  def alert(message: js.Any): scala.Unit = js.native
  def atob(encodedString: java.lang.String): java.lang.String = js.native
  def blur(): scala.Unit = js.native
  def btoa(rawString: java.lang.String): java.lang.String = js.native
  def cancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  /** @deprecated */
  def captureEvents(): scala.Unit = js.native
  def clearInterval(): scala.Unit = js.native
  def clearInterval(handle: scala.Double): scala.Unit = js.native
  def clearTimeout(): scala.Unit = js.native
  def clearTimeout(handle: scala.Double): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, sx: scala.Double, sy: scala.Double, sw: scala.Double, sh: scala.Double): js.Promise[ImageBitmap] = js.native
  def departFocus(navigationReason: NavigationReason, origin: FocusNavigationOrigin): scala.Unit = js.native
  /**
    * Dispatches a synthetic event event to target and returns true
    * if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
    */
  def dispatchEvent(event: Event): scala.Boolean = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def focus(): scala.Unit = js.native
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: java.lang.String): CSSStyleDeclaration = js.native
  def getMatchedCSSRules(elt: Element): CSSRuleList = js.native
  def getMatchedCSSRules(elt: Element, pseudoElt: java.lang.String): CSSRuleList = js.native
  def getSelection(): Selection = js.native
  def matchMedia(query: java.lang.String): MediaQueryList = js.native
  def moveBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def msWriteProfilerMark(profilerMarkName: java.lang.String): scala.Unit = js.native
  def open(): Window | scala.Null = js.native
  def open(url: java.lang.String): Window | scala.Null = js.native
  def open(url: java.lang.String, target: java.lang.String): Window | scala.Null = js.native
  def open(url: java.lang.String, target: java.lang.String, features: java.lang.String): Window | scala.Null = js.native
  def open(
    url: java.lang.String,
    target: java.lang.String,
    features: java.lang.String,
    replace: scala.Boolean
  ): Window | scala.Null = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String): scala.Unit = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String, transfer: js.Array[Transferable]): scala.Unit = js.native
  def print(): scala.Unit = js.native
  def prompt(): java.lang.String | scala.Null = js.native
  def prompt(message: java.lang.String): java.lang.String | scala.Null = js.native
  def prompt(message: java.lang.String, _default: java.lang.String): java.lang.String | scala.Null = js.native
  def queueMicrotask(callback: js.Function): scala.Unit = js.native
  /** @deprecated */
  def releaseEvents(): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def requestAnimationFrame(callback: FrameRequestCallback): scala.Double = js.native
  def resizeBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def resizeTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scroll(): scala.Unit = js.native
  def scroll(options: ScrollToOptions): scala.Unit = js.native
  def scroll(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollBy(): scala.Unit = js.native
  def scrollBy(options: ScrollToOptions): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollTo(): scala.Unit = js.native
  def scrollTo(options: ScrollToOptions): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setInterval(handler: TimerHandler): scala.Double = js.native
  def setInterval(handler: TimerHandler, timeout: scala.Double, arguments: js.Any*): scala.Double = js.native
  def setTimeout(handler: TimerHandler): scala.Double = js.native
  def setTimeout(handler: TimerHandler, timeout: scala.Double, arguments: js.Any*): scala.Double = js.native
  def stop(): scala.Unit = js.native
  def webkitCancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  def webkitConvertPointFromNodeToPage(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitConvertPointFromPageToNode(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitRequestAnimationFrame(callback: FrameRequestCallback): scala.Double = js.native
}

