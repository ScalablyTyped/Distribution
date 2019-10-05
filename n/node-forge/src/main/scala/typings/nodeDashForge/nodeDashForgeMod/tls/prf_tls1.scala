package typings.nodeDashForge.nodeDashForgeMod.tls

import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "tls.prf_tls1")
@js.native
object prf_tls1 extends js.Object {
  def apply(secret: String, label: String, seed: String, length: Double): ByteBuffer = js.native
}

