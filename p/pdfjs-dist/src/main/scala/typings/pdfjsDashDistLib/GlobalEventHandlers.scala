package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalEventHandlers extends js.Object {
  /**
    * Fires when the user aborts the download.
    * @param ev The event.
    */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | scala.Null = js.native
  var onanimationcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | scala.Null = js.native
  var onanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | scala.Null = js.native
  var onanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | scala.Null = js.native
  var onanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | scala.Null = js.native
  var onauxclick: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the object loses the input focus.
    * @param ev The focus event.
    */
  var onblur: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | scala.Null = js.native
  var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when playback is possible, but would require further buffering.
    * @param ev The event.
    */
  var oncanplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var oncanplaythrough: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the contents of the object or selection have changed.
    * @param ev The event.
    */
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the user clicks the left mouse button on the object
    * @param ev The mouse event.
    */
  var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the user clicks the right mouse button in the client area, opening the context menu.
    * @param ev The mouse event.
    */
  var oncontextmenu: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the user double-clicks the object.
    * @param ev The mouse event.
    */
  var ondblclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Fires on the source object continuously during a drag operation.
    * @param ev The event.
    */
  var ondrag: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  /**
    * Fires on the source object when the user releases the mouse at the close of a drag operation.
    * @param ev The event.
    */
  var ondragend: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  /**
    * Fires on the target element when the user drags the object to a valid drop target.
    * @param ev The drag event.
    */
  var ondragenter: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  var ondragexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
    * @param ev The drag event.
    */
  var ondragleave: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  /**
    * Fires on the target element continuously while the user drags the object over a valid drop target.
    * @param ev The event.
    */
  var ondragover: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  /**
    * Fires on the source object when the user starts to drag a text selection or selected object.
    * @param ev The event.
    */
  var ondragstart: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  var ondrop: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  /**
    * Occurs when the duration attribute is updated.
    * @param ev The event.
    */
  var ondurationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the media element is reset to its initial state.
    * @param ev The event.
    */
  var onemptied: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the end of playback is reached.
    * @param ev The event
    */
  var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when an error occurs during object loading.
    * @param ev The event.
    */
  @JSName("onerror")
  var onerror_Original: ErrorEventHandler = js.native
  /**
    * Fires when the object receives focus.
    * @param ev The event.
    */
  var onfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | scala.Null = js.native
  var ongotpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var oninput: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var oninvalid: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the user presses a key.
    * @param ev The keyboard event
    */
  var onkeydown: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user presses an alphanumeric key.
    * @param ev The event.
    */
  var onkeypress: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user releases a key.
    * @param ev The keyboard event
    */
  var onkeyup: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | scala.Null = js.native
  /**
    * Fires immediately after the browser loads the object.
    * @param ev The event.
    */
  var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when media data is loaded at the current playback position.
    * @param ev The event.
    */
  var onloadeddata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the duration and dimensions of the media have been determined.
    * @param ev The event.
    */
  var onloadedmetadata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onloadend: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  /**
    * Occurs when Internet Explorer begins looking for media data.
    * @param ev The event.
    */
  var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onlostpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user clicks the object with either mouse button.
    * @param ev The mouse event.
    */
  var onmousedown: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  var onmouseenter: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  var onmouseleave: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse over the object.
    * @param ev The mouse event.
    */
  var onmousemove: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse pointer outside the boundaries of the object.
    * @param ev The mouse event.
    */
  var onmouseout: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse pointer into the object.
    * @param ev The mouse event.
    */
  var onmouseover: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user releases a mouse button while the mouse is over the object.
    * @param ev The mouse event.
    */
  var onmouseup: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Occurs when playback is paused.
    * @param ev The event.
    */
  var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the play method is requested.
    * @param ev The event.
    */
  var onplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the audio or video has started playing.
    * @param ev The event.
    */
  var onplaying: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onpointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  /**
    * Occurs to indicate progress while downloading media data.
    * @param ev The event.
    */
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  /**
    * Occurs when the playback rate is increased or decreased.
    * @param ev The event.
    */
  var onratechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the user resets a form.
    * @param ev The event.
    */
  var onreset: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user repositions the scroll box in the scroll bar on the object.
    * @param ev The event.
    */
  var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | scala.Null = js.native
  var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]) | scala.Null = js.native
  /**
    * Occurs when the seek operation ends.
    * @param ev The event.
    */
  var onseeked: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the current playback position is moved.
    * @param ev The event.
    */
  var onseeking: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the current selection changes.
    * @param ev The event.
    */
  var onselect: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | scala.Null = js.native
  /**
    * Occurs when the download has stopped.
    * @param ev The event.
    */
  var onstalled: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onsubmit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs if the load operation has been intentionally halted.
    * @param ev The event.
    */
  var onsuspend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs to indicate the current playback position.
    * @param ev The event.
    */
  var ontimeupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var ontoggle: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var ontouchcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | scala.Null = js.native
  var ontouchend: (js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | scala.Null = js.native
  var ontouchmove: (js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | scala.Null = js.native
  var ontouchstart: (js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | scala.Null = js.native
  var ontransitioncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | scala.Null = js.native
  var ontransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | scala.Null = js.native
  var ontransitionrun: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | scala.Null = js.native
  var ontransitionstart: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | scala.Null = js.native
  /**
    * Occurs when the volume is changed, or playback is muted or unmuted.
    * @param ev The event.
    */
  var onvolumechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when playback stops because the next frame of a video resource is not available.
    * @param ev The event.
    */
  var onwaiting: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onwheel: (js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]) | scala.Null = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def onerror(event: java.lang.String): scala.Unit = js.native
  def onerror(event: java.lang.String, source: java.lang.String): scala.Unit = js.native
  def onerror(event: java.lang.String, source: java.lang.String, fileno: scala.Double): scala.Unit = js.native
  def onerror(
    event: java.lang.String,
    source: java.lang.String,
    fileno: scala.Double,
    columnNumber: scala.Double
  ): scala.Unit = js.native
  def onerror(
    event: java.lang.String,
    source: java.lang.String,
    fileno: scala.Double,
    columnNumber: scala.Double,
    error: stdLib.Error
  ): scala.Unit = js.native
  /**
    * Fires when an error occurs during object loading.
    * @param ev The event.
    */
  def onerror(event: Event): scala.Unit = js.native
  def onerror(event: Event, source: java.lang.String): scala.Unit = js.native
  def onerror(event: Event, source: java.lang.String, fileno: scala.Double): scala.Unit = js.native
  def onerror(event: Event, source: java.lang.String, fileno: scala.Double, columnNumber: scala.Double): scala.Unit = js.native
  def onerror(
    event: Event,
    source: java.lang.String,
    fileno: scala.Double,
    columnNumber: scala.Double,
    error: stdLib.Error
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

