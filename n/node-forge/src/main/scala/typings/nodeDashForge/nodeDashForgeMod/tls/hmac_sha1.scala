package typings.nodeDashForge.nodeDashForgeMod.tls

import typings.nodeDashForge.nodeDashForgeMod.Byte
import typings.nodeDashForge.nodeDashForgeMod.Bytes
import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "tls.hmac_sha1")
@js.native
object hmac_sha1 extends js.Object {
  def apply(key: String, seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
  def apply(key: js.Array[Byte], seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
  def apply(key: ByteBuffer, seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
}

