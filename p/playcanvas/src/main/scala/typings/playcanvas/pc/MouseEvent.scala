package typings.playcanvas.pc

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create an new MouseEvent.
  * @property x - The x co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
  * @property y - The y co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
  * @property dx - The change in x co-ordinate since the last mouse event.
  * @property dy - The change in y co-ordinate since the last mouse event.
  * @property button - The mouse button associated with this event. Can be:
  
  * {@link pc.MOUSEBUTTON_LEFT}
  * {@link pc.MOUSEBUTTON_MIDDLE}
  * {@link pc.MOUSEBUTTON_RIGHT}
  * @property wheelDelta - A value representing the amount the mouse wheel has moved, only
  valid for {@link mousewheel} events.
  * @property element - The element that the mouse was fired from.
  * @property ctrlKey - True if the ctrl key was pressed when this event was fired.
  * @property shiftKey - True if the shift key was pressed when this event was fired.
  * @property altKey - True if the alt key was pressed when this event was fired.
  * @property metaKey - True if the meta key was pressed when this event was fired.
  * @property event - The original browser event.
  * @param mouse - The Mouse device that is firing this event.
  * @param event - The original browser event that fired.
  */
trait MouseEvent extends js.Object {
  /**
    * True if the alt key was pressed when this event was fired.
    */
  var altKey: Boolean
  /**
    * The mouse button associated with this event. Can be:
    * * {@link pc.MOUSEBUTTON_LEFT}
    * * {@link pc.MOUSEBUTTON_MIDDLE}
    * * {@link pc.MOUSEBUTTON_RIGHT}
    */
  var button: Double
  /**
    * True if the ctrl key was pressed when this event was fired.
    */
  var ctrlKey: Boolean
  /**
    * The change in x co-ordinate since the last mouse event.
    */
  var dx: Double
  /**
    * The change in y co-ordinate since the last mouse event.
    */
  var dy: Double
  /**
    * The element that the mouse was fired from.
    */
  var element: Element
  /**
    * The original browser event.
    */
  var event: MouseEvent
  /**
    * True if the meta key was pressed when this event was fired.
    */
  var metaKey: Boolean
  /**
    * True if the shift key was pressed when this event was fired.
    */
  var shiftKey: Boolean
  /**
    * A value representing the amount the mouse wheel has moved, only
    * valid for {@link mousewheel} events.
    */
  var wheelDelta: Double
  /**
    * The x co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
    */
  var x: Double
  /**
    * The y co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
    */
  var y: Double
}

object MouseEvent {
  @scala.inline
  def apply(
    altKey: Boolean,
    button: Double,
    ctrlKey: Boolean,
    dx: Double,
    dy: Double,
    element: Element,
    event: MouseEvent,
    metaKey: Boolean,
    shiftKey: Boolean,
    wheelDelta: Double,
    x: Double,
    y: Double
  ): MouseEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], wheelDelta = wheelDelta.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent]
  }
}

