package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The KeyEvent object is received by the {@link Tool}'s keyboard
  * handlers {@link Tool#onKeyDown}, {@link Tool#onKeyUp}. The KeyEvent object is
  * the only parameter passed to these functions and contains information about
  * the keyboard event.
  */
@JSGlobal("paper.KeyEvent")
@js.native
class KeyEvent () extends Event {
  /** 
    * The character representation of the key that caused this key event,
    * taking into account the current key-modifiers (e.g. shift, control,
    * caps-lock, etc.)
    */
  var character: String = js.native
  /** 
    * The key that caused this key event, either as a lower-case character or
    * special key descriptor.
    */
  var key: String = js.native
  /** 
    * The type of mouse event.
    */
  var `type`: String = js.native
}

