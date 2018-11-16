package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hmac
  extends nodeLib.NodeJSNs.ReadWriteStream {
  def digest(): nodeLib.Buffer = js.native
  def digest(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def update(data: java.lang.String): Hmac = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Hmac = js.native
  def update(data: nodeLib.Buffer): Hmac = js.native
  def update(data: nodeLib.NodeJSNs.TypedArray): Hmac = js.native
  def update(data: stdLib.DataView): Hmac = js.native
}

