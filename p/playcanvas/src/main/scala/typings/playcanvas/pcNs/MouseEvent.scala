package typings.playcanvas.pcNs

import typings.playcanvas.BrowserMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.MouseEvent
  * @class MouseEvent object that is passed to events 'mousemove', 'mouseup', 'mousedown' and 'mousewheel'.
  * @description Create an new MouseEvent
  * @param {pc.Mouse} mouse The Mouse device that is firing this event
  * @param {MouseEvent} event The original browser event that fired
  * @property {Number} x The x co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to
  * @property {Number} y The y co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to
  * @property {Number} dx The change in x co-ordinate since the last mouse event
  * @property {Number} dy The change in y co-ordinate since the last mouse event
  * @property {pc.MOUSEBUTTON} button The button
  * @property {Number} wheel A value representing the amount the mouse wheel has moved, only valid for {@link mousemove} events
  * @property {Element} element The element that the mouse was fired from
  * @property {Boolean} ctrlKey True if the ctrl key was pressed when this event was fired
  * @property {Boolean} shiftKey True if the shift key was pressed when this event was fired
  * @property {Boolean} altKey True if the alt key was pressed when this event was fired
  * @property {Boolean} metaKey True if the meta key was pressed when this event was fired
  * @property {MouseEvent} event The original browser event
  * @since 0.88.0
  */
@JSGlobal("pc.MouseEvent")
@js.native
class MouseEvent protected () extends js.Object {
  def this(mouse: Mouse, event: BrowserMouseEvent) = this()
  var altKey: Boolean = js.native
  var button: Double = js.native
  var ctrlKey: Boolean = js.native
  var dx: Double = js.native
  var dy: Double = js.native
  var element: Element = js.native
  var event: BrowserMouseEvent = js.native
  var metaKey: Boolean = js.native
  var shiftKey: Boolean = js.native
  var wheel: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

