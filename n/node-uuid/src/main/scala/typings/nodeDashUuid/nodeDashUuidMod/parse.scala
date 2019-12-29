package typings.nodeDashUuid.nodeDashUuidMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-uuid", "parse")
@js.native
object parse extends js.Object {
  def apply(id: String): js.Array[Double] = js.native
  def apply(id: String, buffer: js.Array[Double]): js.Array[Double] = js.native
  def apply(id: String, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def apply(id: String, buffer: Buffer): Buffer = js.native
  def apply(id: String, buffer: Buffer, offset: Double): Buffer = js.native
}

