package typings.playcanvas.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new KeyboardEvent.
  * @example
  * var onKeyDown = function (e) {
  *     if (e.key === pc.KEY_SPACE) {
  *         // space key pressed
  *     }
  *     e.event.preventDefault(); // Use original browser event to prevent browser action.
  * };
  * app.keyboard.on("keydown", onKeyDown, this);
  * @property key - The keyCode of the key that has changed. See the pc.KEY_* constants.
  * @property element - The element that fired the keyboard event.
  * @property event - The original browser event which was fired.
  * @param keyboard - The keyboard object which is firing the event.
  * @param event - The original browser event that was fired.
  */
@JSImport("playcanvas", "KeyboardEvent")
@js.native
class KeyboardEvent protected ()
  extends StObject
     with typings.playcanvas.pc.KeyboardEvent {
  def this(keyboard: typings.playcanvas.pc.Keyboard, event: typings.playcanvas.pc.KeyboardEvent) = this()
  
  /**
    * The element that fired the keyboard event.
    */
  /* CompleteClass */
  var element: Element = js.native
  
  /**
    * The original browser event which was fired.
    */
  /* CompleteClass */
  var event: typings.playcanvas.pc.KeyboardEvent = js.native
  
  /**
    * The keyCode of the key that has changed. See the pc.KEY_* constants.
    */
  /* CompleteClass */
  var key: Double = js.native
}
