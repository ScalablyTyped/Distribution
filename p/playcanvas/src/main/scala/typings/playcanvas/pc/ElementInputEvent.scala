package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create an instance of a pc.ElementInputEvent.
  * @property event - The MouseEvent or TouchEvent that was originally raised.
  * @property element - The ElementComponent that this event was originally raised on.
  * @property camera - The CameraComponent that this event was originally raised via.
  * @param event - The MouseEvent or TouchEvent that was originally raised.
  * @param element - The ElementComponent that this event was originally raised on.
  * @param camera - The CameraComponent that this event was originally raised via.
  */
trait ElementInputEvent extends js.Object {
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
}

