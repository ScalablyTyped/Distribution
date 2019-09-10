package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ElementTouchEvent
  * @extends pc.ElementInputEvent
  * @classdesc Represents a TouchEvent fired on a {@link pc.ElementComponent}.
  * @description Create an instance of a pc.ElementTouchEvent.
  * @param {TouchEvent} event The TouchEvent that was originally raised.
  * @param {pc.ElementComponent} element The ElementComponent that this event was originally raised on.
  * @param {pc.CameraComponent} camera The CameraComponent that this event was originally raised via.
  * @param {Number} x The x coordinate of the touch that triggered the event
  * @param {Number} y The y coordinate of the touch that triggered the event
  * @param {pc.ElementInput} input The pc.ElementInput instance
  * @property {Touch[]} touches The Touch objects representing all current points of contact with the surface, regardless of target or changed status.
  * @property {Touch[]} changedTouches The Touch objects representing individual points of contact whose states changed between the previous touch event and this one.
  */
@JSImport("playcanvas", "ElementTouchEvent")
@js.native
class ElementTouchEvent protected ()
  extends typings.playcanvas.pcNs.ElementTouchEvent {
  def this(
    event: typings.playcanvas.pcNs.TouchEvent,
    element: typings.playcanvas.pcNs.ElementComponent,
    camera: typings.playcanvas.pcNs.CameraComponent,
    x: Double,
    y: Double,
    input: typings.playcanvas.pcNs.ElementInput
  ) = this()
}

