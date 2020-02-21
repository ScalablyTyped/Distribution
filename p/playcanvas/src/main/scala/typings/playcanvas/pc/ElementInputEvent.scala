package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ElementInputEvent
  * @classdesc Represents an input event fired on a {@link pc.ElementComponent}. When an event is raised
  * on an ElementComponent it bubbles up to its parent ElementComponents unless we call stopPropagation().
  * @description Create an instance of a pc.ElementInputEvent.
  * @param {MouseEvent|TouchEvent} event - The MouseEvent or TouchEvent that was originally raised.
  * @param {pc.ElementComponent} element - The ElementComponent that this event was originally raised on.
  * @param {pc.CameraComponent} camera - The CameraComponent that this event was originally raised via.
  * @property {MouseEvent|TouchEvent} event The MouseEvent or TouchEvent that was originally raised.
  * @property {pc.ElementComponent} element The ElementComponent that this event was originally raised on.
  * @property {pc.CameraComponent} camera The CameraComponent that this event was originally raised via.
  */
@JSGlobal("pc.ElementInputEvent")
@js.native
class ElementInputEvent protected () extends js.Object {
  def this(event: MouseEvent, element: ElementComponent, camera: CameraComponent) = this()
  def this(event: TouchEvent, element: ElementComponent, camera: CameraComponent) = this()
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
    * @function
    * @name pc.ElementInputEvent#stopPropagation
    * @description Stop propagation of the event to parent {@link pc.ElementComponent}s. This also stops propagation of the event to other event listeners of the original DOM Event.
    */
  def stopPropagation(): Unit = js.native
}

