package typings
package openui5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofReadyState extends js.Object {
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

object TypeofReadyState {
  @scala.inline
  def apply(CLOSED: js.Any, CLOSING: js.Any, CONNECTING: js.Any, OPEN: js.Any): TypeofReadyState = {
    val __obj = js.Dynamic.literal(CLOSED = CLOSED, CLOSING = CLOSING, CONNECTING = CONNECTING, OPEN = OPEN)
  
    __obj.asInstanceOf[TypeofReadyState]
  }
}

