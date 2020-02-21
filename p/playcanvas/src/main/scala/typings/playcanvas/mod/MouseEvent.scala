package typings.playcanvas.mod

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
@JSImport("playcanvas", "MouseEvent")
@js.native
class MouseEvent protected ()
  extends typings.playcanvas.pc.MouseEvent {
  def this(mouse: typings.playcanvas.pc.Mouse, event: typings.playcanvas.pc.MouseEvent) = this()
}

