package typings.pgPacketStream.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pgPacketStream.pgPacketStreamStrings.text
  - typings.pgPacketStream.pgPacketStreamStrings.binary
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  def binary: typings.pgPacketStream.pgPacketStreamStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def text: typings.pgPacketStream.pgPacketStreamStrings.text = this.cast("text")
}

