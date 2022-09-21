package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Mouse event fired on a {@link ElementComponent}.
  *
  * @augments ElementInputEvent
  */
@JSGlobal("pc.ElementMouseEvent")
@js.native
open class ElementMouseEvent protected ()
  extends typings.playcanvas.mod.ElementMouseEvent {
  /**
    * Create an instance of an ElementMouseEvent.
    *
    * @param {MouseEvent} event - The MouseEvent that was originally raised.
    * @param {ElementComponent} element - The ElementComponent that this event was originally
    * raised on.
    * @param {CameraComponent} camera - The CameraComponent that this event was originally raised
    * via.
    * @param {number} x - The x coordinate.
    * @param {number} y - The y coordinate.
    * @param {number} lastX - The last x coordinate.
    * @param {number} lastY - The last y coordinate.
    */
  def this(
    event: typings.std.MouseEvent,
    element: typings.playcanvas.mod.ElementComponent,
    camera: typings.playcanvas.mod.CameraComponent,
    x: Double,
    y: Double,
    lastX: Double,
    lastY: Double
  ) = this()
}
