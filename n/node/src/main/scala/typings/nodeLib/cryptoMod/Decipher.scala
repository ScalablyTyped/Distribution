package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decipher
  extends nodeLib.NodeJSNs.ReadWriteStream {
  def `final`(): nodeLib.Buffer = js.native
  def `final`(output_encoding: java.lang.String): java.lang.String = js.native
  def setAutoPadding(): this.type = js.native
  def setAutoPadding(auto_padding: scala.Boolean): this.type = js.native
  def update(data: java.lang.String, input_encoding: HexBase64BinaryEncoding): nodeLib.Buffer = js.native
  // second arg is ignored
  def update(
    data: java.lang.String,
    input_encoding: HexBase64BinaryEncoding,
    output_encoding: Utf8AsciiBinaryEncoding
  ): java.lang.String = js.native
  def update(data: nodeLib.Buffer): nodeLib.Buffer = js.native
  def update(data: nodeLib.Buffer, input_encoding: js.Any, output_encoding: Utf8AsciiBinaryEncoding): java.lang.String = js.native
  def update(data: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def update(
    data: nodeLib.NodeJSNs.TypedArray,
    input_encoding: js.Any,
    output_encoding: Utf8AsciiBinaryEncoding
  ): java.lang.String = js.native
  def update(data: stdLib.DataView): nodeLib.Buffer = js.native
  def update(data: stdLib.DataView, input_encoding: js.Any, output_encoding: Utf8AsciiBinaryEncoding): java.lang.String = js.native
}

