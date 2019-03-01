package typings
package openui5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CLOSED extends js.Object {
  /**
    * The connection has been closed or could not be opened.
    */
  var CLOSED: js.Any
  /**
    * The connection is going through the closing handshake.
    */
  var CLOSING: js.Any
  /**
    * The connection has not yet been established.
    */
  var CONNECTING: js.Any
  /**
    * The WebSocket connection is established and communication is possible.
    */
  var OPEN: js.Any
}

object Anon_CLOSED {
  @scala.inline
  def apply(CLOSED: js.Any, CLOSING: js.Any, CONNECTING: js.Any, OPEN: js.Any): Anon_CLOSED = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CLOSED")(CLOSED)
    __obj.updateDynamic("CLOSING")(CLOSING)
    __obj.updateDynamic("CONNECTING")(CONNECTING)
    __obj.updateDynamic("OPEN")(OPEN)
    __obj.asInstanceOf[Anon_CLOSED]
  }
}

