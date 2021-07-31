package typings.playcanvas.global.pc

import typings.playcanvas.anon.Gamepads
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new instance of a Controller.
  * @example
  * var c = new pc.Controller(document);
  *
  * // Register the "fire" action and assign it to both the Enter key and the Spacebar.
  * c.registerKeys("fire", [pc.KEY_ENTER, pc.KEY_SPACE]);
  * @param [element] - Element to attach Controller to.
  * @param [options] - Optional arguments.
  * @param [options.keyboard] - A Keyboard object to use.
  * @param [options.mouse] - A Mouse object to use.
  * @param [options.gamepads] - A Gamepads object to use.
  */
@JSGlobal("pc.Controller")
@js.native
class Controller ()
  extends StObject
     with typings.playcanvas.pc.Controller {
  def this(element: Element) = this()
  def this(element: Unit, options: Gamepads) = this()
  def this(element: Element, options: Gamepads) = this()
}
