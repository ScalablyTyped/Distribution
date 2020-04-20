package typings.pgProtocol.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-protocol/dist/messages", "CopyResponse")
@js.native
class CopyResponse protected () extends js.Object {
  def this(length: Double, name: MessageName, binary: Boolean, columnCount: Double) = this()
  val binary: Boolean = js.native
  val columnTypes: js.Array[Double] = js.native
  val length: Double = js.native
  val name: MessageName = js.native
}

