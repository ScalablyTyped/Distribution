package typings.playcanvas.pcNs

import typings.playcanvas.BrowserMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.ElementMouseEvent
  * @class Represents a Mouse event fired on a {@link pc.ElementComponent}.
  * @extends pc.ElementInputEvent
  * @description Create an instance of a pc.ElementMouseEvent.
  * @param {MouseEvent} event The MouseEvent that was originally raised.
  * @param {pc.ElementComponent} element The ElementComponent that this event was originally raised on.
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
    event: BrowserMouseEvent,
    element: ElementComponent,
    x: Double,
    y: Double,
    lastX: Double,
    lastY: Double
  ) = this()
  var altKey: Boolean = js.native
  var button: Double = js.native
  var ctrlKey: Boolean = js.native
  var dx: Double = js.native
  var dy: Double = js.native
  var metaKey: Boolean = js.native
  var shiftKey: Boolean = js.native
  var wheel: Double = js.native
}

