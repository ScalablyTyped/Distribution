package typings.node.cryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "publicDecrypt")
@js.native
object publicDecrypt extends js.Object {
  def apply(public_key: KeyLike, buffer: Binary): Buffer = js.native
  def apply(public_key: RsaPublicKey, buffer: Binary): Buffer = js.native
}

