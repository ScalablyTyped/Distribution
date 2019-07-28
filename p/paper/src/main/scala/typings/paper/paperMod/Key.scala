package typings.paper.paperMod

import typings.paper.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Key")
@js.native
class Key ()
  extends typings.paper.paperNs.Key

/* static members */
@JSImport("paper", "Key")
@js.native
object Key extends js.Object {
  /**
    *
    * The current state of the keyboard modifiers.
    *   modifiers.shift - true if the shift key is pressed, false otherwise.
    *   modifiers.control - true if the control key is pressed, false otherwise.
    *   modifiers.alt — true if the alt/option key is pressed, false otherwise.
    *   modifiers.meta — true if the meta/windows/command key is pressed, false otherwise.
    *   modifiers.capsLock — true if the caps-lock key is active, false otherwise.
    *   modifiers.space — true if the space key is pressed, false otherwise.
    *   modifiers.option — true if the alt/option key is pressed, false otherwise. This is the same as modifiers.alt
    *   modifiers.command — true if the meta key is pressed on Mac, or the control key is pressed on Windows and Linux, false otherwise.
    */
  var modifiers: Anon_Alt = js.native
  /**
    * Checks whether the specified key is pressed.
    * @param key - One of: 'backspace', 'enter', 'shift', 'control', 'option', 'pause', 'caps-lock', 'escape', 'space', 'end', 'home', 'left', 'up', 'right', 'down', 'delete', 'command'
    */
  def isDown(key: String): Boolean = js.native
}

