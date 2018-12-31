package typings
package playcanvasLib.pcNs

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
  def this(event: playcanvasLib.BrowserMouseEvent, element: ElementComponent, x: scala.Double, y: scala.Double, lastX: scala.Double, lastY: scala.Double) = this()
  var altKey: scala.Boolean = js.native
  var button: scala.Double = js.native
  var ctrlKey: scala.Boolean = js.native
  var dx: scala.Double = js.native
  var dy: scala.Double = js.native
  var metaKey: scala.Boolean = js.native
  var shiftKey: scala.Boolean = js.native
  var wheel: scala.Double = js.native
}

