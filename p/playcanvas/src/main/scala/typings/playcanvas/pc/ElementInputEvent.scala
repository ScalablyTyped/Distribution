package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of a pc.ElementInputEvent.
  * @property event - The MouseEvent or TouchEvent that was originally raised.
  * @property element - The ElementComponent that this event was originally raised on.
  * @property camera - The CameraComponent that this event was originally raised via.
  * @param event - The MouseEvent or TouchEvent that was originally raised.
  * @param element - The ElementComponent that this event was originally raised on.
  * @param camera - The CameraComponent that this event was originally raised via.
  */
trait ElementInputEvent extends StObject {
  
  /**
    * The CameraComponent that this event was originally raised via.
    */
  var camera: CameraComponent
  
  /**
    * The ElementComponent that this event was originally raised on.
    */
  var element: ElementComponent
  
  /**
    * The MouseEvent or TouchEvent that was originally raised.
    */
  var event: MouseEvent | TouchEvent
  
  /**
    * Stop propagation of the event to parent {@link pc.ElementComponent}s. This also stops propagation of the event to other event listeners of the original DOM Event.
    */
  def stopPropagation(): Unit
}
object ElementInputEvent {
  
  @scala.inline
  def apply(
    camera: CameraComponent,
    element: ElementComponent,
    event: MouseEvent | TouchEvent,
    stopPropagation: () => Unit
  ): ElementInputEvent = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[ElementInputEvent]
  }
  
  @scala.inline
  implicit class ElementInputEventMutableBuilder[Self <: ElementInputEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamera(value: CameraComponent): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: ElementComponent): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: MouseEvent | TouchEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
  }
}
