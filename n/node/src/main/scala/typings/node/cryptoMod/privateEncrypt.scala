package typings.node.cryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "privateEncrypt")
@js.native
object privateEncrypt extends js.Object {
  def apply(private_key: KeyLike, buffer: Binary): Buffer = js.native
  def apply(private_key: RsaPrivateKey, buffer: Binary): Buffer = js.native
}

