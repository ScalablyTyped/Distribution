package typings.phoenix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.phoenix.phoenixStrings.connecting
  - typings.phoenix.phoenixStrings.open
  - typings.phoenix.phoenixStrings.closing
  - typings.phoenix.phoenixStrings.closed
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.phoenix.phoenixStrings.closed = this.cast("closed")
  @scala.inline
  def closing: typings.phoenix.phoenixStrings.closing = this.cast("closing")
  @scala.inline
  def connecting: typings.phoenix.phoenixStrings.connecting = this.cast("connecting")
  @scala.inline
  def open: typings.phoenix.phoenixStrings.open = this.cast("open")
}

