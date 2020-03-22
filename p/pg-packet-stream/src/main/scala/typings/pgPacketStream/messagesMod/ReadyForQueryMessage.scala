package typings.pgPacketStream.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-packet-stream/dist/messages", "ReadyForQueryMessage")
@js.native
class ReadyForQueryMessage protected () extends js.Object {
  def this(length: Double, status: String) = this()
  val length: Double = js.native
  val name: MessageName = js.native
  val status: String = js.native
}

