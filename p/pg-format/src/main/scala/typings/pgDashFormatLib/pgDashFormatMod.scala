package typings
package pgDashFormatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-format", JSImport.Namespace)
@js.native
object pgDashFormatMod extends js.Object {
  def apply(fmt: java.lang.String, args: js.Any*): java.lang.String = js.native
  def config(): scala.Unit = js.native
  def config(config: pgDashFormatLib.Anon_Pattern): scala.Unit = js.native
  def ident(`val`: java.lang.String): java.lang.String = js.native
  def ident(`val`: js.Array[_]): java.lang.String = js.native
  def ident(`val`: scala.Boolean): java.lang.String = js.native
  def ident(`val`: scala.Double): java.lang.String = js.native
  def ident(`val`: stdLib.Date): java.lang.String = js.native
  def literal(): java.lang.String = js.native
  def literal(`val`: java.lang.String): java.lang.String = js.native
  def literal(`val`: js.Array[_]): java.lang.String = js.native
  def literal(`val`: js.Object): java.lang.String = js.native
  def literal(`val`: scala.Boolean): java.lang.String = js.native
  def literal(`val`: scala.Double): java.lang.String = js.native
  def literal(`val`: stdLib.Date): java.lang.String = js.native
  def string(): java.lang.String = js.native
  def string(`val`: java.lang.String): java.lang.String = js.native
  def string(`val`: js.Array[_]): java.lang.String = js.native
  def string(`val`: js.Object): java.lang.String = js.native
  def string(`val`: scala.Boolean): java.lang.String = js.native
  def string(`val`: scala.Double): java.lang.String = js.native
  def string(`val`: stdLib.Date): java.lang.String = js.native
  def withArray(fmt: java.lang.String, array: js.Array[_]): java.lang.String = js.native
}

