package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signer
  extends nodeLib.NodeJSNs.WritableStream {
  def sign(private_key: java.lang.String): nodeLib.Buffer = js.native
  def sign(private_key: java.lang.String, output_format: HexBase64Latin1Encoding): java.lang.String = js.native
  def sign(private_key: nodeLib.Anon_Key): nodeLib.Buffer = js.native
  def sign(private_key: nodeLib.Anon_Key, output_format: HexBase64Latin1Encoding): java.lang.String = js.native
  def update(data: java.lang.String): Signer = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Signer = js.native
  def update(data: nodeLib.Buffer): Signer = js.native
  def update(data: nodeLib.NodeJSNs.TypedArray): Signer = js.native
  def update(data: stdLib.DataView): Signer = js.native
}

