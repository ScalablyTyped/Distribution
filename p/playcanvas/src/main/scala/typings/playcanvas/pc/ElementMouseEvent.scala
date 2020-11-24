package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait ElementMouseEvent extends ElementInputEvent {
  
  /**
    * Whether the alt key was pressed.
    */
  var altKey: Boolean = js.native
  
  /**
    * The mouse button.
    */
  var button: Double = js.native
  
  /**
    * Whether the ctrl key was pressed.
    */
  var ctrlKey: Boolean = js.native
  
  /**
    * The amount of horizontal movement of the cursor.
    */
  var dx: Double = js.native
  
  /**
    * The amount of vertical movement of the cursor.
    */
  var dy: Double = js.native
  
  /**
    * Whether the meta key was pressed.
    */
  var metaKey: Boolean = js.native
  
  /**
    * Whether the shift key was pressed.
    */
  var shiftKey: Boolean = js.native
  
  /**
    * The amount of the wheel movement.
    */
  var wheelDelta: Double = js.native
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
  implicit class ElementMouseEventOps[Self <: ElementMouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelDelta(value: Double): Self = this.set("wheelDelta", value.asInstanceOf[js.Any])
  }
}
