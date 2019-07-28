package typings.node.stringUnderscoreDecoderMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("string_decoder", "StringDecoder")
@js.native
class StringDecoder () extends js.Object {
  def this(encoding: java.lang.String) = this()
  def end(): java.lang.String = js.native
  def end(buffer: Buffer): java.lang.String = js.native
  def write(buffer: Buffer): java.lang.String = js.native
}

