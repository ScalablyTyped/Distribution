package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ElementMouseEvent
  * @extends pc.ElementInputEvent
  * @classdesc Represents a Mouse event fired on a {@link pc.ElementComponent}.
  * @description Create an instance of a pc.ElementMouseEvent.
  * @param {MouseEvent} event The MouseEvent that was originally raised.
  * @param {pc.ElementComponent} element The ElementComponent that this event was originally raised on.
  * @param {pc.CameraComponent} camera The CameraComponent that this event was originally raised via.
  * @param {Number} x The x coordinate
  * @param {Number} y The y coordinate
  * @param {Number} lastX The last x coordinate
  * @param {Number} lastY The last y coordinate
  * @property {Boolean} ctrlKey Whether the ctrl key was pressed
  * @property {Boolean} altKey Whether the alt key was pressed
  * @property {Boolean} shiftKey Whether the shift key was pressed
  * @property {Boolean} metaKey Whether the meta key was pressed
  * @property {Number} button The mouse button
  * @property {Number} dx The amount of horizontal movement of the cursor
  * @property {Number} dy The amount of vertical movement of the cursor
  * @property {Number} wheel The amount of the wheel movement
  */
@JSGlobal("pc.ElementMouseEvent")
@js.native
class ElementMouseEvent protected () extends ElementInputEvent {
  def this(
    event: MouseEvent,
    element: ElementComponent,
    camera: CameraComponent,
    x: Double,
    y: Double,
    lastX: Double,
    lastY: Double
  ) = this()
  /**
    * Whether the alt key was pressed
    */
  var altKey: Boolean = js.native
  /**
    * The mouse button
    */
  var button: Double = js.native
  /**
    * Whether the ctrl key was pressed
    */
  var ctrlKey: Boolean = js.native
  /**
    * The amount of horizontal movement of the cursor
    */
  var dx: Double = js.native
  /**
    * The amount of vertical movement of the cursor
    */
  var dy: Double = js.native
  /**
    * Whether the meta key was pressed
    */
  var metaKey: Boolean = js.native
  /**
    * Whether the shift key was pressed
    */
  var shiftKey: Boolean = js.native
  /**
    * The amount of the wheel movement
    */
  var wheel: Double = js.native
}

