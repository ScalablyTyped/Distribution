package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an input event fired on a {@link ElementComponent}. When an event is raised on an
  * ElementComponent it bubbles up to its parent ElementComponents unless we call stopPropagation().
  */
@JSImport("playcanvas", "ElementInputEvent")
@js.native
open class ElementInputEvent protected () extends StObject {
  /**
    * Create a new ElementInputEvent instance.
    *
    * @param {MouseEvent|TouchEvent} event - The MouseEvent or TouchEvent that was originally
    * raised.
    * @param {import('../components/element/component.js').ElementComponent} element - The
    * ElementComponent that this event was originally raised on.
    * @param {import('../components/camera/component.js').CameraComponent} camera - The
    * CameraComponent that this event was originally raised via.
    */
  def this(event: typings.std.MouseEvent, element: ElementComponent, camera: CameraComponent) = this()
  def this(event: typings.std.TouchEvent, element: ElementComponent, camera: CameraComponent) = this()
  
  var _stopPropagation: Boolean = js.native
  
  /**
    * The CameraComponent that this event was originally raised via.
    *
    * @type {import('../components/camera/component.js').CameraComponent}
    */
  var camera: CameraComponent = js.native
  
  /**
    * The ElementComponent that this event was originally raised on.
    *
    * @type {import('../components/element/component.js').ElementComponent}
    */
  var element: ElementComponent = js.native
  
  /**
    * The MouseEvent or TouchEvent that was originally raised.
    *
    * @type {MouseEvent|TouchEvent}
    */
  var event: typings.std.MouseEvent | typings.std.TouchEvent = js.native
  
  /**
    * Stop propagation of the event to parent {@link ElementComponent}s. This also stops
    * propagation of the event to other event listeners of the original DOM Event.
    */
  def stopPropagation(): Unit = js.native
}
