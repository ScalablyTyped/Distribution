package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Mouse event fired on a {@link ElementComponent}.
  *
  * @augments ElementInputEvent
  */
@JSImport("playcanvas", "ElementMouseEvent")
@js.native
open class ElementMouseEvent protected () extends ElementInputEvent {
  /**
    * Create an instance of an ElementMouseEvent.
    *
    * @param {MouseEvent} event - The MouseEvent that was originally raised.
    * @param {import('../components/element/component.js').ElementComponent} element - The
    * ElementComponent that this event was originally raised on.
    * @param {import('../components/camera/component.js').CameraComponent} camera - The
    * CameraComponent that this event was originally raised via.
    * @param {number} x - The x coordinate.
    * @param {number} y - The y coordinate.
    * @param {number} lastX - The last x coordinate.
    * @param {number} lastY - The last y coordinate.
    */
  def this(
    event: typings.std.MouseEvent,
    element: ElementComponent,
    camera: CameraComponent,
    x: Double,
    y: Double,
    lastX: Double,
    lastY: Double
  ) = this()
  
  /**
    * Whether the alt key was pressed.
    *
    * @type {boolean}
    */
  var altKey: Boolean = js.native
  
  /**
    * The mouse button.
    *
    * @type {number}
    */
  var button: Double = js.native
  
  /**
    * Whether the ctrl key was pressed.
    *
    * @type {boolean}
    */
  var ctrlKey: Boolean = js.native
  
  /**
    * The amount of horizontal movement of the cursor.
    *
    * @type {number}
    */
  var dx: Double = js.native
  
  /**
    * The amount of vertical movement of the cursor.
    *
    * @type {number}
    */
  var dy: Double = js.native
  
  /**
    * Whether the meta key was pressed.
    *
    * @type {boolean}
    */
  var metaKey: Boolean = js.native
  
  /**
    * Whether the shift key was pressed.
    *
    * @type {boolean}
    */
  var shiftKey: Boolean = js.native
  
  /**
    * The amount of the wheel movement.
    *
    * @type {number}
    */
  var wheelDelta: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
