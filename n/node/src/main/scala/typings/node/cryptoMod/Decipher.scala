package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Decipher")
@js.native
class Decipher protected () extends Transform {
  def `final`(): Buffer = js.native
  def `final`(output_encoding: String): String = js.native
  def setAutoPadding(): this.type = js.native
  def setAutoPadding(auto_padding: Boolean): this.type = js.native
  def update(data: String, input_encoding: js.UndefOr[scala.Nothing], output_encoding: Utf8AsciiBinaryEncoding): String = js.native
  def update(data: String, input_encoding: HexBase64BinaryEncoding): Buffer = js.native
  def update(data: String, input_encoding: HexBase64BinaryEncoding, output_encoding: Utf8AsciiBinaryEncoding): String = js.native
  def update(data: ArrayBufferView): Buffer = js.native
  def update(
    data: ArrayBufferView,
    input_encoding: js.UndefOr[scala.Nothing],
    output_encoding: Utf8AsciiBinaryEncoding
  ): String = js.native
  def update(
    data: ArrayBufferView,
    input_encoding: HexBase64BinaryEncoding,
    output_encoding: Utf8AsciiBinaryEncoding
  ): String = js.native
}

