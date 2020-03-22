package typings.pgPacketStream.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-packet-stream/dist/messages", "DataRowMessage")
@js.native
class DataRowMessage protected () extends js.Object {
  def this(length: Double, fields: js.Array[_]) = this()
  val fieldCount: Double = js.native
  var fields: js.Array[_] = js.native
  var length: Double = js.native
  val name: MessageName = js.native
}

