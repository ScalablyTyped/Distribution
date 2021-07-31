package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of a pc.ElementSelectEvent.
  * @property inputSource - The XR input source that this event was originally raised from.
  * @param event - The XRInputSourceEvent that was originally raised.
  * @param element - The ElementComponent that this event was originally raised on.
  * @param camera - The CameraComponent that this event was originally raised via.
  * @param inputSource - The XR input source that this event was originally raised from.
  */
trait ElementSelectEvent
  extends StObject
     with ElementInputEvent {
  
  /**
    * The XR input source that this event was originally raised from.
    */
  var inputSource: XrInputSource
}
object ElementSelectEvent {
  
  @scala.inline
  def apply(
    camera: CameraComponent,
    element: ElementComponent,
    event: MouseEvent | TouchEvent,
    inputSource: XrInputSource,
    stopPropagation: () => Unit
  ): ElementSelectEvent = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], inputSource = inputSource.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[ElementSelectEvent]
  }
  
  @scala.inline
  implicit class ElementSelectEventMutableBuilder[Self <: ElementSelectEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputSource(value: XrInputSource): Self = StObject.set(x, "inputSource", value.asInstanceOf[js.Any])
  }
}
