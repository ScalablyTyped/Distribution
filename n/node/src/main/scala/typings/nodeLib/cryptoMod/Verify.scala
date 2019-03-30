package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Verify")
@js.native
class Verify protected ()
  extends nodeLib.streamMod.Writable {
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Verify = js.native
  def update(data: BinaryLike): Verify = js.native
  def verify(`object`: js.Object, signature: java.lang.String): scala.Boolean = js.native
  def verify(`object`: js.Object, signature: java.lang.String, signature_format: HexBase64Latin1Encoding): scala.Boolean = js.native
  def verify(`object`: js.Object, signature: Binary): scala.Boolean = js.native
  def verify(`object`: KeyLike, signature: java.lang.String): scala.Boolean = js.native
  def verify(`object`: KeyLike, signature: java.lang.String, signature_format: HexBase64Latin1Encoding): scala.Boolean = js.native
  def verify(`object`: KeyLike, signature: Binary): scala.Boolean = js.native
}

