package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create an instance of a pc.ElementTouchEvent.
  * @property touches - The Touch objects representing all current points of contact with the surface, regardless of target or changed status.
  * @property changedTouches - The Touch objects representing individual points of contact whose states changed between the previous touch event and this one.
  * @property touch - The touch object that triggered the event.
  * @param event - The TouchEvent that was originally raised.
  * @param element - The ElementComponent that this event was originally raised on.
  * @param camera - The CameraComponent that this event was originally raised via.
  * @param x - The x coordinate of the touch that triggered the event.
  * @param y - The y coordinate of the touch that triggered the event.
  * @param touch - The touch object that triggered the event.
  */
@JSGlobal("pc.ElementTouchEvent")
@js.native
class ElementTouchEvent protected ()
  extends typings.playcanvas.pc.ElementTouchEvent {
  def this(
    event: typings.playcanvas.pc.TouchEvent,
    element: typings.playcanvas.pc.ElementComponent,
    camera: typings.playcanvas.pc.CameraComponent,
    x: Double,
    y: Double,
    touch: typings.playcanvas.pc.Touch
  ) = this()
  /**
    * The CameraComponent that this event was originally raised via.
    */
  /* CompleteClass */
  override var camera: typings.playcanvas.pc.CameraComponent = js.native
  /**
    * The Touch objects representing individual points of contact whose states changed between the previous touch event and this one.
    */
  /* CompleteClass */
  override var changedTouches: js.Array[typings.playcanvas.pc.Touch] = js.native
  /**
    * The ElementComponent that this event was originally raised on.
    */
  /* CompleteClass */
  override var element: typings.playcanvas.pc.ElementComponent = js.native
  /**
    * The MouseEvent or TouchEvent that was originally raised.
    */
  /* CompleteClass */
  override var event: typings.playcanvas.pc.MouseEvent | typings.playcanvas.pc.TouchEvent = js.native
  /**
    * The touch object that triggered the event.
    */
  /* CompleteClass */
  override var touch: typings.playcanvas.pc.Touch = js.native
  /**
    * The Touch objects representing all current points of contact with the surface, regardless of target or changed status.
    */
  /* CompleteClass */
  override var touches: js.Array[typings.playcanvas.pc.Touch] = js.native
  /**
    * Stop propagation of the event to parent {@link pc.ElementComponent}s. This also stops propagation of the event to other event listeners of the original DOM Event.
    */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}

