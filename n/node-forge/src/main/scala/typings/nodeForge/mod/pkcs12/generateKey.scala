package typings.nodeForge.mod.pkcs12

import typings.nodeForge.mod.Byte
import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pkcs12.generateKey")
@js.native
object generateKey extends js.Object {
  def apply(password: js.UndefOr[Null | String], salt: ByteBuffer, id: Byte, iter: Double, n: Double): ByteBuffer = js.native
  def apply(
    password: js.UndefOr[Null | String],
    salt: ByteBuffer,
    id: Byte,
    iter: Double,
    n: Double,
    md: MessageDigest
  ): ByteBuffer = js.native
}

