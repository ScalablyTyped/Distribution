package typings.node.cryptoMod

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

