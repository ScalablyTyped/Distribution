package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Key")
@js.native
class Key ()
  extends typings.paper.paper.Key

/* static members */
@JSImport("paper", "Key")
@js.native
object Key extends js.Object {
  /** 
    * The current state of the keyboard modifiers.
    * 
    * @option modifiers.shift {Boolean} {@true if the shift key is
    *     pressed}.
    * @option modifiers.control {Boolean} {@true if the control key is
    *     pressed}.
    * @option modifiers.alt {Boolean} {@true if the alt/option key is
    *     pressed}.
    * @option modifiers.meta {Boolean} {@true if the meta/windows/command
    *     key is pressed}.
    * @option modifiers.capsLock {Boolean} {@true if the caps-lock key is
    *     active}.
    * @option modifiers.space {Boolean} {@true if the space key is
    *     pressed}.
    * @option modifiers.option {Boolean} {@true if the alt/option key is
    *     pressed}. This is the same as `modifiers.alt`
    * @option modifiers.command {Boolean} {@true if the meta key is pressed
    *     on Mac, or the control key is pressed on Windows and Linux}.
    */
  var modifiers: js.Any = js.native
  /** 
    * Checks whether the specified key is pressed.
    * 
    * @param key - any character or special key descriptor:
    *     {@values 'enter', 'space', 'shift', 'control', 'alt', 'meta',
    *     'caps-lock', 'left', 'up', 'right', 'down', 'escape', 'delete',
    *     ...}
    * 
    * @return true if the key is pressed
    */
  def isDown(key: String): Boolean = js.native
}

