package typings.pgPacketStream.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-packet-stream/dist/messages", "Field")
@js.native
class Field protected () extends js.Object {
  def this(
    name: String,
    tableID: Double,
    columnID: Double,
    dataTypeID: Double,
    dataTypeSize: Double,
    dataTypeModifier: Double,
    format: Mode
  ) = this()
  val columnID: Double = js.native
  val dataTypeID: Double = js.native
  val dataTypeModifier: Double = js.native
  val dataTypeSize: Double = js.native
  val format: Mode = js.native
  val name: String = js.native
  val tableID: Double = js.native
}

