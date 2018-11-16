package typings
package nodeLib.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", "TextDecoder")
@js.native
class TextDecoder () extends js.Object {
  def this(encoding: java.lang.String) = this()
  def this(encoding: java.lang.String, options: nodeLib.Anon_IgnoreBOM) = this()
  val encoding: java.lang.String = js.native
  val fatal: scala.Boolean = js.native
  val ignoreBOM: scala.Boolean = js.native
  def decode(): java.lang.String = js.native
  def decode(input: nodeLib.NodeJSNs.TypedArray): java.lang.String = js.native
  def decode(input: nodeLib.NodeJSNs.TypedArray, options: nodeLib.Anon_Stream): java.lang.String = js.native
  def decode(input: scala.Null, options: nodeLib.Anon_Stream): java.lang.String = js.native
  def decode(input: stdLib.ArrayBuffer): java.lang.String = js.native
  def decode(input: stdLib.ArrayBuffer, options: nodeLib.Anon_Stream): java.lang.String = js.native
  def decode(input: stdLib.DataView): java.lang.String = js.native
  def decode(input: stdLib.DataView, options: nodeLib.Anon_Stream): java.lang.String = js.native
}

