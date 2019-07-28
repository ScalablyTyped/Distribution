package typings.node.punycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("punycode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ucs2: typings.node.punycodeMod.ucs2 = js.native
  val version: java.lang.String = js.native
  def decode(string: java.lang.String): java.lang.String = js.native
  def encode(string: java.lang.String): java.lang.String = js.native
  def toASCII(domain: java.lang.String): java.lang.String = js.native
  def toUnicode(domain: java.lang.String): java.lang.String = js.native
}

