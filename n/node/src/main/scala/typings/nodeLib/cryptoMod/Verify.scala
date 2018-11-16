package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verify
  extends nodeLib.NodeJSNs.WritableStream {
  def update(data: java.lang.String): Verify = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Verify = js.native
  def update(data: nodeLib.Buffer): Verify = js.native
  def update(data: nodeLib.NodeJSNs.TypedArray): Verify = js.native
  def update(data: stdLib.DataView): Verify = js.native
  def verify(`object`: java.lang.String, signature: java.lang.String, signature_format: HexBase64Latin1Encoding): scala.Boolean = js.native
  def verify(`object`: java.lang.String, signature: nodeLib.Buffer): scala.Boolean = js.native
  def verify(`object`: java.lang.String, signature: nodeLib.NodeJSNs.TypedArray): scala.Boolean = js.native
  def verify(`object`: java.lang.String, signature: stdLib.DataView): scala.Boolean = js.native
  def verify(`object`: js.Object, signature: java.lang.String, signature_format: HexBase64Latin1Encoding): scala.Boolean = js.native
  def verify(`object`: js.Object, signature: nodeLib.Buffer): scala.Boolean = js.native
  def verify(`object`: js.Object, signature: nodeLib.NodeJSNs.TypedArray): scala.Boolean = js.native
  def verify(`object`: js.Object, signature: stdLib.DataView): scala.Boolean = js.native
}

