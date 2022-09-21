package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an input event fired on a {@link ElementComponent}. When an event is raised on an
  * ElementComponent it bubbles up to its parent ElementComponents unless we call stopPropagation().
  */
@JSGlobal("pc.ElementInputEvent")
@js.native
open class ElementInputEvent protected ()
  extends typings.playcanvas.mod.ElementInputEvent {
  /**
    * Create a new ElementInputEvent instance.
    *
    * @param {MouseEvent|TouchEvent} event - The MouseEvent or TouchEvent that was originally
    * raised.
    * @param {ElementComponent} element - The ElementComponent that this event was originally
    * raised on.
    * @param {CameraComponent} camera - The CameraComponent that this event was originally raised
    * via.
    */
  def this(
    event: typings.std.MouseEvent,
    element: typings.playcanvas.mod.ElementComponent,
    camera: typings.playcanvas.mod.CameraComponent
  ) = this()
  def this(
    event: typings.std.TouchEvent,
    element: typings.playcanvas.mod.ElementComponent,
    camera: typings.playcanvas.mod.CameraComponent
  ) = this()
}
