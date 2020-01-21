package typings.node.cryptoMod

import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "verify")
@js.native
object verify extends js.Object {
  def apply(
    algorithm: js.UndefOr[scala.Nothing],
    data: ArrayBufferView,
    key: KeyLike,
    signature: ArrayBufferView
  ): Boolean = js.native
  def apply(
    algorithm: js.UndefOr[scala.Nothing],
    data: ArrayBufferView,
    key: VerifyKeyWithOptions,
    signature: ArrayBufferView
  ): Boolean = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  def apply(algorithm: String, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = js.native
  def apply(algorithm: String, data: ArrayBufferView, key: VerifyKeyWithOptions, signature: ArrayBufferView): Boolean = js.native
  def apply(algorithm: Null, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = js.native
  def apply(algorithm: Null, data: ArrayBufferView, key: VerifyKeyWithOptions, signature: ArrayBufferView): Boolean = js.native
}

