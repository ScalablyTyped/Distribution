package typings.playcanvas.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./keyboard.js').Keyboard} Keyboard */
/**
  * The KeyboardEvent is passed into all event callbacks from the {@link Keyboard}. It corresponds
  * to a key press or release.
  */
@JSImport("playcanvas", "KeyboardEvent")
@js.native
open class KeyboardEvent protected () extends StObject {
  /**
    * Create a new KeyboardEvent.
    *
    * @param {Keyboard} keyboard - The keyboard object which is firing the event.
    * @param {globalThis.KeyboardEvent} event - The original browser event that was fired.
    * @example
    * var onKeyDown = function (e) {
    *     if (e.key === pc.KEY_SPACE) {
    *         // space key pressed
    *     }
    *     e.event.preventDefault(); // Use original browser event to prevent browser action.
    * };
    * app.keyboard.on("keydown", onKeyDown, this);
    */
  def this(
    keyboard: Keyboard,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.KeyboardEvent */ Any
  ) = this()
  
  /**
    * The element that fired the keyboard event.
    *
    * @type {Element}
    */
  var element: Element = js.native
  
  /**
    * The original browser event which was fired.
    *
    * @type {globalThis.KeyboardEvent}
    */
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.KeyboardEvent */ Any = js.native
  
  /**
    * The keyCode of the key that has changed. See the KEY_* constants.
    *
    * @type {number}
    */
  var key: Double = js.native
}
