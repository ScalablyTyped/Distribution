package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./keyboard.js').Keyboard} Keyboard */
/**
  * The KeyboardEvent is passed into all event callbacks from the {@link Keyboard}. It corresponds
  * to a key press or release.
  */
@JSGlobal("pc.KeyboardEvent")
@js.native
open class KeyboardEvent protected ()
  extends typings.playcanvas.mod.KeyboardEvent {
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
    keyboard: typings.playcanvas.mod.Keyboard,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.KeyboardEvent */ Any
  ) = this()
}
