package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  extends StObject
     with typings.playcanvas.pc.ElementMouseEvent {
  def this(
    event: typings.playcanvas.pc.MouseEvent,
    element: typings.playcanvas.pc.ElementComponent,
    camera: typings.playcanvas.pc.CameraComponent,
    x: Double,
    y: Double,
    lastX: Double,
    lastY: Double
  ) = this()
  
  /**
    * Whether the alt key was pressed.
    */
  /* CompleteClass */
  var altKey: Boolean = js.native
  
  /**
    * The mouse button.
    */
  /* CompleteClass */
  var button: Double = js.native
  
  /**
    * The CameraComponent that this event was originally raised via.
    */
  /* CompleteClass */
  var camera: typings.playcanvas.pc.CameraComponent = js.native
  
  /**
    * Whether the ctrl key was pressed.
    */
  /* CompleteClass */
  var ctrlKey: Boolean = js.native
  
  /**
    * The amount of horizontal movement of the cursor.
    */
  /* CompleteClass */
  var dx: Double = js.native
  
  /**
    * The amount of vertical movement of the cursor.
    */
  /* CompleteClass */
  var dy: Double = js.native
  
  /**
    * The ElementComponent that this event was originally raised on.
    */
  /* CompleteClass */
  var element: typings.playcanvas.pc.ElementComponent = js.native
  
  /**
    * The MouseEvent or TouchEvent that was originally raised.
    */
  /* CompleteClass */
  var event: typings.playcanvas.pc.MouseEvent | typings.playcanvas.pc.TouchEvent = js.native
  
  /**
    * Whether the meta key was pressed.
    */
  /* CompleteClass */
  var metaKey: Boolean = js.native
  
  /**
    * Whether the shift key was pressed.
    */
  /* CompleteClass */
  var shiftKey: Boolean = js.native
  
  /**
    * Stop propagation of the event to parent {@link pc.ElementComponent}s. This also stops propagation of the event to other event listeners of the original DOM Event.
    */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
  
  /**
    * The amount of the wheel movement.
    */
  /* CompleteClass */
  var wheelDelta: Double = js.native
}
