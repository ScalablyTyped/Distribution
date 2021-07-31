package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of a pc.ElementMouseEvent.
  * @property ctrlKey - Whether the ctrl key was pressed.
  * @property altKey - Whether the alt key was pressed.
  * @property shiftKey - Whether the shift key was pressed.
  * @property metaKey - Whether the meta key was pressed.
  * @property button - The mouse button.
  * @property dx - The amount of horizontal movement of the cursor.
  * @property dy - The amount of vertical movement of the cursor.
  * @property wheelDelta - The amount of the wheel movement.
  * @param event - The MouseEvent that was originally raised.
  * @param element - The ElementComponent that this event was originally raised on.
  * @param camera - The CameraComponent that this event was originally raised via.
  * @param x - The x coordinate.
  * @param y - The y coordinate.
  * @param lastX - The last x coordinate.
  * @param lastY - The last y coordinate.
  */
trait ElementMouseEvent
  extends StObject
     with ElementInputEvent {
  
  /**
    * Whether the alt key was pressed.
    */
  var altKey: Boolean
  
  /**
    * The mouse button.
    */
  var button: Double
  
  /**
    * Whether the ctrl key was pressed.
    */
  var ctrlKey: Boolean
  
  /**
    * The amount of horizontal movement of the cursor.
    */
  var dx: Double
  
  /**
    * The amount of vertical movement of the cursor.
    */
  var dy: Double
  
  /**
    * Whether the meta key was pressed.
    */
  var metaKey: Boolean
  
  /**
    * Whether the shift key was pressed.
    */
  var shiftKey: Boolean
  
  /**
    * The amount of the wheel movement.
    */
  var wheelDelta: Double
}
object ElementMouseEvent {
  
  @scala.inline
  def apply(
    altKey: Boolean,
    button: Double,
    camera: CameraComponent,
    ctrlKey: Boolean,
    dx: Double,
    dy: Double,
    element: ElementComponent,
    event: MouseEvent | TouchEvent,
    metaKey: Boolean,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    wheelDelta: Double
  ): ElementMouseEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), wheelDelta = wheelDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementMouseEvent]
  }
  
  @scala.inline
  implicit class ElementMouseEventMutableBuilder[Self <: ElementMouseEvent] (val x: Self) extends AnyVal {
    
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
    def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelDelta(value: Double): Self = StObject.set(x, "wheelDelta", value.asInstanceOf[js.Any])
  }
}
