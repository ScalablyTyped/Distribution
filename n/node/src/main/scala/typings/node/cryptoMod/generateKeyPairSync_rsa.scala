package typings.node.cryptoMod

import typings.node.nodeStrings.rsa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "generateKeyPairSync")
@js.native
object generateKeyPairSync_rsa extends js.Object {
  def apply(`type`: rsa, options: RSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
}

