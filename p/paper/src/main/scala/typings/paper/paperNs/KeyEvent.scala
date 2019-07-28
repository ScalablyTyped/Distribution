package typings.paper.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.KeyEvent")
@js.native
class KeyEvent () extends Event {
  /**
    * The string character of the key that caused this key event.
    */
  var character: String = js.native
  /**
    * The key that caused this key event.
    */
  var key: String = js.native
  /**
    * The type of key event.
    * String('keydown', 'keyup')
    */
  var `type`: String = js.native
}

