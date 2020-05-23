package typings.mz.cryptoMod

import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.RsaPrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "privateDecrypt")
@js.native
object privateDecrypt extends js.Object {
  def apply(private_key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  def apply(private_key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
}

