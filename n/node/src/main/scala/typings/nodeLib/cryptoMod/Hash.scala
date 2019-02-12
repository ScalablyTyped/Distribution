package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash
  extends nodeLib.NodeJSNs.ReadWriteStream {
  def digest(): nodeLib.Buffer = js.native
  def digest(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Hash = js.native
  def update(data: BinaryLike): Hash = js.native
}

