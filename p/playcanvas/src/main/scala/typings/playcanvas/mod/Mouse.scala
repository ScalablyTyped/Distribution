package typings.playcanvas.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Mouse device.
  * @param [element] - The Element that the mouse events are attached to.
  */
@JSImport("playcanvas", "Mouse")
@js.native
class Mouse ()
  extends typings.playcanvas.pc.Mouse {
  def this(element: Element) = this()
}

/* static members */
@JSImport("playcanvas", "Mouse")
@js.native
object Mouse extends js.Object {
  /**
    * Check if the mouse pointer has been locked, using {@link pc.Mouse#enabledPointerLock}.
    * @returns True if locked.
    */
  def isPointerLocked(): Boolean = js.native
}

