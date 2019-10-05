package typings.nodeDashUuid.nodeDashUuidMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-uuid", "v1")
@js.native
object v1 extends js.Object {
  def apply(): Buffer = js.native
  def apply(options: UUIDOptions): Buffer = js.native
  def apply(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = js.native
  def apply(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def apply(options: UUIDOptions, buffer: Buffer): Buffer = js.native
  def apply(options: UUIDOptions, buffer: Buffer, offset: Double): Buffer = js.native
}

