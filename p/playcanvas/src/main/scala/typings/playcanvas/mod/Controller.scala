package typings.playcanvas.mod

import typings.playcanvas.AnonGamepads
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Controller
  * @classdesc A general input handler which handles both mouse and keyboard input assigned to named actions.
  * This allows you to define input handlers separately to defining keyboard/mouse configurations.
  * @description Create a new instance of a Controller.
  * @param {Element} [element] - Element to attach Controller to.
  * @param {object} [options] - Optional arguments.
  * @param {pc.Keyboard} [options.keyboard] - A Keyboard object to use.
  * @param {pc.Mouse} [options.mouse] - A Mouse object to use.
  * @param {pc.GamePads} [options.gamepads] - A Gamepads object to use.
  * @example
  * var c = new pc.Controller(document);
  *
  * // Register the "fire" action and assign it to both the Enter key and the Spacebar.
  * c.registerKeys("fire", [pc.KEY_ENTER, pc.KEY_SPACE]);
  */
@JSImport("playcanvas", "Controller")
@js.native
class Controller ()
  extends typings.playcanvas.pc.Controller {
  def this(element: Element) = this()
  def this(element: Element, options: AnonGamepads) = this()
}

