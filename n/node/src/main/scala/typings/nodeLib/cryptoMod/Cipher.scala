package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cipher
  extends nodeLib.NodeJSNs.ReadWriteStream {
  def `final`(): nodeLib.Buffer = js.native
  def `final`(output_encoding: java.lang.String): java.lang.String = js.native
  def setAutoPadding(): this.type = js.native
  def setAutoPadding(auto_padding: scala.Boolean): this.type = js.native
  def update(data: java.lang.String): nodeLib.Buffer = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiBinaryEncoding): nodeLib.Buffer = js.native
  // second arg ignored
  def update(
    data: java.lang.String,
    input_encoding: Utf8AsciiBinaryEncoding,
    output_encoding: HexBase64BinaryEncoding
  ): java.lang.String = js.native
  def update(data: nodeLib.Buffer): nodeLib.Buffer = js.native
  def update(data: nodeLib.Buffer, input_encoding: js.Any, output_encoding: HexBase64BinaryEncoding): java.lang.String = js.native
  def update(data: nodeLib.Buffer, output_encoding: HexBase64BinaryEncoding): java.lang.String = js.native
  def update(data: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def update(
    data: nodeLib.NodeJSNs.TypedArray,
    input_encoding: js.Any,
    output_encoding: HexBase64BinaryEncoding
  ): java.lang.String = js.native
  def update(data: nodeLib.NodeJSNs.TypedArray, output_encoding: HexBase64BinaryEncoding): java.lang.String = js.native
  def update(data: stdLib.DataView): nodeLib.Buffer = js.native
  def update(data: stdLib.DataView, input_encoding: js.Any, output_encoding: HexBase64BinaryEncoding): java.lang.String = js.native
  def update(data: stdLib.DataView, output_encoding: HexBase64BinaryEncoding): java.lang.String = js.native
}

