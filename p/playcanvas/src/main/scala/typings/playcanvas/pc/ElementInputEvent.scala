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
@js.native
trait ElementInputEvent extends js.Object {
  /**
    * The CameraComponent that this event was originally raised via.
    */
  var camera: CameraComponent = js.native
  /**
    * The ElementComponent that this event was originally raised on.
    */
  var element: ElementComponent = js.native
  /**
    * The MouseEvent or TouchEvent that was originally raised.
    */
  var event: MouseEvent | TouchEvent = js.native
  /**
    * Stop propagation of the event to parent {@link pc.ElementComponent}s. This also stops propagation of the event to other event listeners of the original DOM Event.
    */
  def stopPropagation(): Unit = js.native
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
  implicit class ElementInputEventOps[Self <: ElementInputEvent] (val x: Self) extends AnyVal {
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
    def setCamera(value: CameraComponent): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: ElementComponent): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: MouseEvent | TouchEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
  }
  
}

