package typings.playcanvas.playcanvasMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Mouse
  * @classdesc A Mouse Device, bound to a DOM Element.
  * @description Create a new Mouse device
  * @param {Element} [element] The Element that the mouse events are attached to
  */
@JSImport("playcanvas", "Mouse")
@js.native
class Mouse ()
  extends typings.playcanvas.pcNs.Mouse {
  def this(element: Element) = this()
}

/* static members */
@JSImport("playcanvas", "Mouse")
@js.native
object Mouse extends js.Object {
  /**
    * @static
    * @function
    * @name pc.Mouse.isPointerLocked
    * @description Check if the mouse pointer has been locked, using {@link pc.Mouse#enabledPointerLock}
    * @returns {Boolean} True if locked
    */
  def isPointerLocked(): Boolean = js.native
}

