package typings.playcanvas.pc

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.MouseEvent
  * @classdesc MouseEvent object that is passed to events 'mousemove', 'mouseup', 'mousedown' and 'mousewheel'.
  * @description Create an new MouseEvent.
  * @param {pc.Mouse} mouse - The Mouse device that is firing this event.
  * @param {MouseEvent} event - The original browser event that fired.
  * @property {number} x The x co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
  * @property {number} y The y co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
  * @property {number} dx The change in x co-ordinate since the last mouse event.
  * @property {number} dy The change in y co-ordinate since the last mouse event.
  * @property {number} button The mouse button associated with this event. Can be:
  *
  * * {@link pc.MOUSEBUTTON_LEFT}
  * * {@link pc.MOUSEBUTTON_MIDDLE}
  * * {@link pc.MOUSEBUTTON_RIGHT}
  *
  * @property {number} wheelDelta A value representing the amount the mouse wheel has moved, only
  * valid for {@link mousewheel} events.
  * @property {Element} element The element that the mouse was fired from.
  * @property {boolean} ctrlKey True if the ctrl key was pressed when this event was fired.
  * @property {boolean} shiftKey True if the shift key was pressed when this event was fired.
  * @property {boolean} altKey True if the alt key was pressed when this event was fired.
  * @property {boolean} metaKey True if the meta key was pressed when this event was fired.
  * @property {MouseEvent} event The original browser event.
  */
@JSGlobal("pc.MouseEvent")
@js.native
class MouseEvent protected () extends js.Object {
  def this(mouse: Mouse, event: MouseEvent) = this()
  /**
    * True if the alt key was pressed when this event was fired.
    */
  var altKey: Boolean = js.native
  /**
    * The mouse button associated with this event. Can be:
    * * {@link pc.MOUSEBUTTON_LEFT}
    * * {@link pc.MOUSEBUTTON_MIDDLE}
    * * {@link pc.MOUSEBUTTON_RIGHT}
    */
  var button: Double = js.native
  /**
    * True if the ctrl key was pressed when this event was fired.
    */
  var ctrlKey: Boolean = js.native
  /**
    * The change in x co-ordinate since the last mouse event.
    */
  var dx: Double = js.native
  /**
    * The change in y co-ordinate since the last mouse event.
    */
  var dy: Double = js.native
  /**
    * The element that the mouse was fired from.
    */
  var element: Element = js.native
  /**
    * The original browser event.
    */
  var event: MouseEvent = js.native
  /**
    * True if the meta key was pressed when this event was fired.
    */
  var metaKey: Boolean = js.native
  /**
    * True if the shift key was pressed when this event was fired.
    */
  var shiftKey: Boolean = js.native
  /**
    * A value representing the amount the mouse wheel has moved, only
    * valid for {@link mousewheel} events.
    */
  var wheelDelta: Double = js.native
  /**
    * The x co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
    */
  var x: Double = js.native
  /**
    * The y co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
    */
  var y: Double = js.native
}

