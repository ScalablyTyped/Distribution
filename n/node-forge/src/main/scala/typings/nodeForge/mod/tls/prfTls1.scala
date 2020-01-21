package typings.nodeForge.mod.tls

import typings.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "tls.prf_tls1")
@js.native
object prfTls1 extends js.Object {
  def apply(secret: String, label: String, seed: String, length: Double): ByteBuffer = js.native
}

