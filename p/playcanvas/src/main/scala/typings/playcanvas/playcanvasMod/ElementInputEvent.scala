package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ElementInputEvent
  * @classdesc Represents an input event fired on a {@link pc.ElementComponent}. When an event is raised
  * on an ElementComponent it bubbles up to its parent ElementComponents unless we call stopPropagation().
  * @description Create an instance of a pc.ElementInputEvent.
  * @param {MouseEvent|TouchEvent} event The MouseEvent or TouchEvent that was originally raised.
  * @param {pc.ElementComponent} element The ElementComponent that this event was originally raised on.
  * @param {pc.CameraComponent} camera The CameraComponent that this event was originally raised via.
  * @property {MouseEvent|TouchEvent} event The MouseEvent or TouchEvent that was originally raised.
  * @property {pc.ElementComponent} element The ElementComponent that this event was originally raised on.
  */
@JSImport("playcanvas", "ElementInputEvent")
@js.native
class ElementInputEvent protected ()
  extends typings.playcanvas.pcNs.ElementInputEvent {
  def this(
    event: typings.playcanvas.pcNs.MouseEvent,
    element: typings.playcanvas.pcNs.ElementComponent,
    camera: typings.playcanvas.pcNs.CameraComponent
  ) = this()
  def this(
    event: typings.playcanvas.pcNs.TouchEvent,
    element: typings.playcanvas.pcNs.ElementComponent,
    camera: typings.playcanvas.pcNs.CameraComponent
  ) = this()
}

