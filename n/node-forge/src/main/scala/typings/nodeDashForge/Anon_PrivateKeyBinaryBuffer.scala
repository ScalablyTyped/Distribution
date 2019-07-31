package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.pkiNs.ed25519Ns.BinaryBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKeyBinaryBuffer extends js.Object {
  var privateKey: BinaryBuffer
}

object Anon_PrivateKeyBinaryBuffer {
  @scala.inline
  def apply(privateKey: BinaryBuffer): Anon_PrivateKeyBinaryBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PrivateKeyBinaryBuffer]
  }
}

