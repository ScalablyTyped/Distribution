package typings.nodeForge

import typings.nodeForge.mod.pki.ed25519.BinaryBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivateKeyBinaryBuffer extends js.Object {
  var privateKey: BinaryBuffer
}

object AnonPrivateKeyBinaryBuffer {
  @scala.inline
  def apply(privateKey: BinaryBuffer): AnonPrivateKeyBinaryBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrivateKeyBinaryBuffer]
  }
}

