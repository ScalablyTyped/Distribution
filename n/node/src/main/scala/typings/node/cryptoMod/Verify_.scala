package typings.node.cryptoMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Verify")
@js.native
class Verify_ protected () extends Writable {
  def update(data: String, input_encoding: Utf8AsciiLatin1Encoding): Verify_ = js.native
  def update(data: BinaryLike): Verify_ = js.native
  def verify(`object`: js.Object, signature: String): Boolean = js.native
  def verify(`object`: js.Object, signature: String, signature_format: HexBase64Latin1Encoding): Boolean = js.native
  def verify(`object`: js.Object, signature: ArrayBufferView): Boolean = js.native
  def verify(`object`: KeyLike, signature: String): Boolean = js.native
  def verify(`object`: KeyLike, signature: String, signature_format: HexBase64Latin1Encoding): Boolean = js.native
  def verify(`object`: KeyLike, signature: ArrayBufferView): Boolean = js.native
}

