package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Hash")
@js.native
class Hash protected () extends Transform {
  def digest(): Buffer = js.native
  def digest(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Hash = js.native
  def update(data: BinaryLike): Hash = js.native
}

