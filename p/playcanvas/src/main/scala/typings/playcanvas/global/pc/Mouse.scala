package typings.playcanvas.global.pc

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new Mouse device.
  * @param [element] - The Element that the mouse events are attached to.
  */
@JSGlobal("pc.Mouse")
@js.native
class Mouse ()
  extends StObject
     with typings.playcanvas.pc.Mouse {
  def this(element: Element) = this()
}
object Mouse {
  
  @JSGlobal("pc.Mouse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the mouse pointer has been locked, using {@link pc.Mouse#enabledPointerLock}.
    * @returns True if locked.
    */
  /* static member */
  inline def isPointerLocked(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPointerLocked")().asInstanceOf[Boolean]
}
