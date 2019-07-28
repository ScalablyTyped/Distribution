package typings.mdurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdurl/encode", JSImport.Namespace)
@js.native
object encodeMod extends js.Object {
  val componentChars: String = js.native
  val defaultChars: String = js.native
  def apply(str: String): String = js.native
  def apply(str: String, exclude: String): String = js.native
  def apply(str: String, exclude: String, keepEscaped: Boolean): String = js.native
}

