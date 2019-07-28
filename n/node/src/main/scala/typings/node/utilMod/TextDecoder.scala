package typings.node.utilMod

import typings.node.Anon_Fatal
import typings.node.Anon_Stream
import typings.node.NodeJSNs.TypedArray
import typings.std.ArrayBuffer
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", "TextDecoder")
@js.native
class TextDecoder () extends js.Object {
  def this(encoding: java.lang.String) = this()
  def this(encoding: java.lang.String, options: Anon_Fatal) = this()
  val encoding: java.lang.String = js.native
  val fatal: Boolean = js.native
  val ignoreBOM: Boolean = js.native
  def decode(): java.lang.String = js.native
  def decode(input: Null, options: Anon_Stream): java.lang.String = js.native
  def decode(input: TypedArray): java.lang.String = js.native
  def decode(input: TypedArray, options: Anon_Stream): java.lang.String = js.native
  def decode(input: ArrayBuffer): java.lang.String = js.native
  def decode(input: ArrayBuffer, options: Anon_Stream): java.lang.String = js.native
  def decode(input: DataView): java.lang.String = js.native
  def decode(input: DataView, options: Anon_Stream): java.lang.String = js.native
}

