package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a TouchEvent fired on a {@link ElementComponent}.
  *
  * @augments ElementInputEvent
  */
@JSImport("playcanvas", "ElementTouchEvent")
@js.native
open class ElementTouchEvent protected () extends ElementInputEvent {
  /**
    * Create an instance of an ElementTouchEvent.
    *
    * @param {TouchEvent} event - The TouchEvent that was originally raised.
    * @param {import('../components/element/component.js').ElementComponent} element - The
    * ElementComponent that this event was originally raised on.
    * @param {import('../components/camera/component.js').CameraComponent} camera - The
    * CameraComponent that this event was originally raised via.
    * @param {number} x - The x coordinate of the touch that triggered the event.
    * @param {number} y - The y coordinate of the touch that triggered the event.
    * @param {Touch} touch - The touch object that triggered the event.
    */
  def this(
    event: typings.std.TouchEvent,
    element: ElementComponent,
    camera: CameraComponent,
    x: Double,
    y: Double,
    touch: typings.std.Touch
  ) = this()
  
  /**
    * The Touch objects representing individual points of contact whose states changed between
    * the previous touch event and this one.
    *
    * @type {Touch[]}
    */
  var changedTouches: js.Array[typings.std.Touch] = js.native
  
  /**
    * The touch object that triggered the event.
    *
    * @type {Touch}
    */
  var touch: typings.std.Touch = js.native
  
  /**
    * The Touch objects representing all current points of contact with the surface,
    * regardless of target or changed status.
    *
    * @type {Touch[]}
    */
  var touches: js.Array[typings.std.Touch] = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
