package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Hmac")
@js.native
class Hmac protected ()
  extends nodeLib.streamMod.Duplex {
  def digest(): nodeLib.Buffer = js.native
  def digest(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Hmac = js.native
  def update(data: BinaryLike): Hmac = js.native
}

