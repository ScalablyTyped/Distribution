package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.KeyEvent")
@js.native
class KeyEvent () extends Event {
  /**
    * The string character of the key that caused this key event.
    */
  var character: java.lang.String = js.native
  /**
    * The key that caused this key event.
    */
  var key: java.lang.String = js.native
  /**
    * The type of key event.
    * String('keydown', 'keyup')
    */
  var `type`: java.lang.String = js.native
}

