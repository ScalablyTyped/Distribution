package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Signer")
@js.native
class Signer protected ()
  extends nodeLib.streamMod.Writable {
  def sign(private_key: KeyLike): nodeLib.Buffer = js.native
  def sign(private_key: KeyLike, output_format: HexBase64Latin1Encoding): java.lang.String = js.native
  def sign(private_key: SignPrivateKeyInput): nodeLib.Buffer = js.native
  def sign(private_key: SignPrivateKeyInput, output_format: HexBase64Latin1Encoding): java.lang.String = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Signer = js.native
  def update(data: BinaryLike): Signer = js.native
}

