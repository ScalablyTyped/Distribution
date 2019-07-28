package typings.pgDashEscape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-escape", JSImport.Namespace)
@js.native
object pgDashEscapeMod extends js.Object {
  def apply(fmt: String, args: js.Any*): String = js.native
  def dollarQuotedString(`val`: String): String = js.native
  def ident(`val`: String): String = js.native
  def literal(`val`: String): String = js.native
  def string(`val`: String): String = js.native
}

