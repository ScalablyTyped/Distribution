package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of a pc.ElementMouseEvent.
  * @property ctrlKey - Whether the ctrl key was pressed.
  * @property altKey - Whether the alt key was pressed.
  * @property shiftKey - Whether the shift key was pressed.
  * @property metaKey - Whether the meta key was pressed.
  * @property button - The mouse button.
  * @property dx - The amount of horizontal movement of the cursor.
  * @property dy - The amount of vertical movement of the cursor.
  * @property wheelDelta - The amount of the wheel movement.
  * @param event - The MouseEvent that was originally raised.
  * @param element - The ElementComponent that this event was originally raised on.
  * @param camera - The CameraComponent that this event was originally raised via.
  * @param x - The x coordinate.
  * @param y - The y coordinate.
  * @param lastX - The last x coordinate.
  * @param lastY - The last y coordinate.
  */
@JSImport("playcanvas", "ElementMouseEvent")
@js.native
class ElementMouseEvent protected ()
  extends typings.playcanvas.pc.ElementMouseEvent {
  def this(
    event: typings.playcanvas.pc.MouseEvent,
    element: typings.playcanvas.pc.ElementComponent,
    camera: typings.playcanvas.pc.CameraComponent,
    x: Double,
    y: Double,
    lastX: Double,
    lastY: Double
  ) = this()
}
