package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Verify")
@js.native
class Verify protected () extends Writable {
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Verify = js.native
  def update(data: BinaryLike): Verify = js.native
  def verify(`object`: js.Object, signature: java.lang.String): Boolean = js.native
  def verify(`object`: js.Object, signature: java.lang.String, signature_format: HexBase64Latin1Encoding): Boolean = js.native
  def verify(`object`: js.Object, signature: Binary): Boolean = js.native
  def verify(`object`: KeyLike, signature: java.lang.String): Boolean = js.native
  def verify(`object`: KeyLike, signature: java.lang.String, signature_format: HexBase64Latin1Encoding): Boolean = js.native
  def verify(`object`: KeyLike, signature: Binary): Boolean = js.native
}

@JSImport("crypto", "verify")
@js.native
object verify extends js.Object {
  def apply(algorithm: js.UndefOr[scala.Nothing], data: Binary, key: KeyLike, signature: Binary): Buffer = js.native
  def apply(algorithm: js.UndefOr[scala.Nothing], data: Binary, key: VerifyKeyWithOptions, signature: Binary): Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  def apply(algorithm: java.lang.String, data: Binary, key: KeyLike, signature: Binary): Buffer = js.native
  def apply(algorithm: java.lang.String, data: Binary, key: VerifyKeyWithOptions, signature: Binary): Buffer = js.native
  def apply(algorithm: Null, data: Binary, key: KeyLike, signature: Binary): Buffer = js.native
  def apply(algorithm: Null, data: Binary, key: VerifyKeyWithOptions, signature: Binary): Buffer = js.native
}

