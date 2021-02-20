package typings.playcanvas.pc

import typings.std.Element
import org.scalablytyped.runtime.StObject
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
@js.native
trait MouseEvent extends StObject {
  
  /**
    * True if the alt key was pressed when this event was fired.
    */
  var altKey: Boolean = js.native
  
  /**
    * The mouse button associated with this event. Can be:
    
    * {@link pc.MOUSEBUTTON_LEFT}
    * {@link pc.MOUSEBUTTON_MIDDLE}
    * {@link pc.MOUSEBUTTON_RIGHT}
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
    valid for {@link mousewheel} events.
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
  
  @scala.inline
  implicit class MouseEventMutableBuilder[Self <: MouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelDelta(value: Double): Self = StObject.set(x, "wheelDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
