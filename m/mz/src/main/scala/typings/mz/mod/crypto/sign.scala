package typings.mz.mod.crypto

import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.SignPrivateKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz", "crypto.sign")
@js.native
object sign extends js.Object {
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  def apply(algorithm: js.UndefOr[Null | String], data: ArrayBufferView, key: KeyLike): Buffer = js.native
  def apply(algorithm: js.UndefOr[Null | String], data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = js.native
}

