package typings
package atPhosphorWidgetsLib.libScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/scrollbar", "ScrollBar")
@js.native
/**
  * Construct a new scroll bar.
  *
  * @param options - The options for initializing the scroll bar.
  */
class ScrollBar ()
  extends atPhosphorWidgetsLib.libWidgetMod.Widget {
  def this(options: atPhosphorWidgetsLib.libScrollbarMod.ScrollBarNs.IOptions) = this()
  var _maximum: js.Any = js.native
  /**
    * A timeout callback for repeating the mouse press.
    */
  var _onRepeat: js.Any = js.native
  var _orientation: js.Any = js.native
  var _page: js.Any = js.native
  var _pageRequested: js.Any = js.native
  var _pressData: js.Any = js.native
  var _repeatTimer: js.Any = js.native
  var _stepRequested: js.Any = js.native
  var _thumbMoved: js.Any = js.native
  var _value: js.Any = js.native
  /**
    * The scroll bar decrement button node.
    *
    * #### Notes
    * Modifying this node directly can lead to undefined behavior.
    */
  val decrementNode: stdLib.HTMLDivElement = js.native
  /**
    * The scroll bar increment button node.
    *
    * #### Notes
    * Modifying this node directly can lead to undefined behavior.
    */
  val incrementNode: stdLib.HTMLDivElement = js.native
  /**
    * Get the maximum value of the scroll bar.
    */
  /**
    * Set the maximum value of the scroll bar.
    *
    * #### Notes
    * The max size will be clamped to the range `[0, Infinity]`.
    */
  var maximum: scala.Double = js.native
  /**
    * Get the orientation of the scroll bar.
    */
  /**
    * Set the orientation of the scroll bar.
    */
  var orientation: atPhosphorWidgetsLib.libScrollbarMod.ScrollBarNs.Orientation = js.native
  /**
    * Get the page size of the scroll bar.
    *
    * #### Notes
    * The page size is the amount of visible content in the scrolled
    * region, expressed in data units. It determines the size of the
    * scroll bar thumb.
    */
  /**
    * Set the page size of the scroll bar.
    *
    * #### Notes
    * The page size will be clamped to the range `[0, Infinity]`.
    */
  var page: scala.Double = js.native
  /**
    * A signal emitted when the user clicks the scroll track.
    *
    * #### Notes
    * The payload is whether a decrease or increase is requested.
    */
  val pageRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.decrement | atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.increment
  ] = js.native
  /**
    * A signal emitted when the user clicks a step button.
    *
    * #### Notes
    * The payload is whether a decrease or increase is requested.
    */
  val stepRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.decrement | atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.increment
  ] = js.native
  /**
    * A signal emitted when the user moves the scroll thumb.
    *
    * #### Notes
    * The payload is the current value of the scroll bar.
    */
  val thumbMoved: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Double] = js.native
  /**
    * The scroll bar thumb node.
    *
    * #### Notes
    * Modifying this node directly can lead to undefined behavior.
    */
  val thumbNode: stdLib.HTMLDivElement = js.native
  /**
    * The scroll bar track node.
    *
    * #### Notes
    * Modifying this node directly can lead to undefined behavior.
    */
  val trackNode: stdLib.HTMLDivElement = js.native
  /**
    * Get the current value of the scroll bar.
    */
  /**
    * Set the current value of the scroll bar.
    *
    * #### Notes
    * The value will be clamped to the range `[0, maximum]`.
    */
  var value: scala.Double = js.native
  /**
    * Handle the `'keydown'` event for the scroll bar.
    */
  /* private */ def _evtKeyDown(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mousedown'` event for the scroll bar.
    */
  /* private */ def _evtMouseDown(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mousemove'` event for the scroll bar.
    */
  /* private */ def _evtMouseMove(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mouseup'` event for the scroll bar.
    */
  /* private */ def _evtMouseUp(event: js.Any): js.Any = js.native
  /**
    * Move the thumb to the specified position.
    */
  /* private */ def _moveThumb(value: js.Any): js.Any = js.native
  /**
    * Release the mouse and restore the node states.
    */
  /* private */ def _releaseMouse(): js.Any = js.native
  /**
    * Handle the DOM events for the scroll bar.
    *
    * @param event - The DOM event sent to the scroll bar.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the scroll bar's DOM node.
    *
    * This should not be called directly by user code.
    */
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
}

