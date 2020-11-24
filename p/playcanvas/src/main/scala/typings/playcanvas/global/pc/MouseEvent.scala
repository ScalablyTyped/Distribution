package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an new MouseEvent.
  * @property x - The x co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
  * @property y - The y co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
  * @property dx - The change in x co-ordinate since the last mouse event.
  * @property dy - The change in y co-ordinate since the last mouse event.
  * @property button - The mouse button associated with this event. Can be:
  *
  * * {@link pc.MOUSEBUTTON_LEFT}
  * * {@link pc.MOUSEBUTTON_MIDDLE}
  * * {@link pc.MOUSEBUTTON_RIGHT}
  * @property wheelDelta - A value representing the amount the mouse wheel has moved, only
  * valid for {@link mousewheel} events.
  * @property element - The element that the mouse was fired from.
  * @property ctrlKey - True if the ctrl key was pressed when this event was fired.
  * @property shiftKey - True if the shift key was pressed when this event was fired.
  * @property altKey - True if the alt key was pressed when this event was fired.
  * @property metaKey - True if the meta key was pressed when this event was fired.
  * @property event - The original browser event.
  * @param mouse - The Mouse device that is firing this event.
  * @param event - The original browser event that fired.
  */
@JSGlobal("pc.MouseEvent")
@js.native
class MouseEvent protected ()
  extends typings.playcanvas.pc.MouseEvent {
  def this(mouse: typings.playcanvas.pc.Mouse, event: typings.playcanvas.pc.MouseEvent) = this()
}
