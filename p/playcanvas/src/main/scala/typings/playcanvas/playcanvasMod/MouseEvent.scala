package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.MouseEvent
  * @classdesc MouseEvent object that is passed to events 'mousemove', 'mouseup', 'mousedown' and 'mousewheel'.
  * @description Create an new MouseEvent
  * @param {pc.Mouse} mouse The Mouse device that is firing this event
  * @param {MouseEvent} event The original browser event that fired
  * @property {Number} x The x co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to
  * @property {Number} y The y co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to
  * @property {Number} dx The change in x co-ordinate since the last mouse event
  * @property {Number} dy The change in y co-ordinate since the last mouse event
  * @property {Number} button The mouse button associated with this event. Can be:
  * <ul>
  *     <li>{@link pc.MOUSEBUTTON_LEFT}</li>
  *     <li>{@link pc.MOUSEBUTTON_MIDDLE}</li>
  *     <li>{@link pc.MOUSEBUTTON_RIGHT}</li>
  * </ul>
  * @property {Number} wheel A value representing the amount the mouse wheel has moved, only valid for {@link mousemove} events
  * @property {Element} element The element that the mouse was fired from
  * @property {Boolean} ctrlKey True if the ctrl key was pressed when this event was fired
  * @property {Boolean} shiftKey True if the shift key was pressed when this event was fired
  * @property {Boolean} altKey True if the alt key was pressed when this event was fired
  * @property {Boolean} metaKey True if the meta key was pressed when this event was fired
  * @property {MouseEvent} event The original browser event
  * @since 0.88.0
  */
@JSImport("playcanvas", "MouseEvent")
@js.native
class MouseEvent protected ()
  extends typings.playcanvas.pcNs.MouseEvent {
  def this(mouse: typings.playcanvas.pcNs.Mouse, event: typings.playcanvas.pcNs.MouseEvent) = this()
}

