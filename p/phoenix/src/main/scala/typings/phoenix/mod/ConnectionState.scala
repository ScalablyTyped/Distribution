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
  def closed: typings.phoenix.phoenixStrings.closed = "closed".asInstanceOf[typings.phoenix.phoenixStrings.closed]
  @scala.inline
  def closing: typings.phoenix.phoenixStrings.closing = "closing".asInstanceOf[typings.phoenix.phoenixStrings.closing]
  @scala.inline
  def connecting: typings.phoenix.phoenixStrings.connecting = "connecting".asInstanceOf[typings.phoenix.phoenixStrings.connecting]
  @scala.inline
  def open: typings.phoenix.phoenixStrings.open = "open".asInstanceOf[typings.phoenix.phoenixStrings.open]
}

