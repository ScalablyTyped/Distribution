package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.BinaryBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyBinaryBuffer extends js.Object {
  var privateKey: BinaryBuffer
}

object PrivateKeyBinaryBuffer {
  @scala.inline
  def apply(privateKey: BinaryBuffer): PrivateKeyBinaryBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyBinaryBuffer]
  }
}

