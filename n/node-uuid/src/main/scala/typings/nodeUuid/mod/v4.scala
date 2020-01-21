package typings.nodeUuid.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-uuid", "v4")
@js.native
object v4 extends js.Object {
  def apply(): String = js.native
  def apply(options: UUIDOptions): String = js.native
  def apply(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = js.native
  def apply(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def apply(options: UUIDOptions, buffer: Buffer): Buffer = js.native
  def apply(options: UUIDOptions, buffer: Buffer, offset: Double): Buffer = js.native
}

