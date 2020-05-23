package typings.pgFormat

import typings.pgFormat.anon.Pattern
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-format", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(fmt: String, args: js.Any*): String = js.native
  def config(): Unit = js.native
  def config(config: Pattern): Unit = js.native
  def ident(`val`: String): String = js.native
  def ident(`val`: js.Array[_]): String = js.native
  def ident(`val`: Boolean): String = js.native
  def ident(`val`: Double): String = js.native
  def ident(`val`: Date): String = js.native
  def literal(): String = js.native
  def literal(`val`: String): String = js.native
  def literal(`val`: js.Array[_]): String = js.native
  def literal(`val`: js.Object): String = js.native
  def literal(`val`: Boolean): String = js.native
  def literal(`val`: Double): String = js.native
  def literal(`val`: Date): String = js.native
  def string(): String = js.native
  def string(`val`: String): String = js.native
  def string(`val`: js.Array[_]): String = js.native
  def string(`val`: js.Object): String = js.native
  def string(`val`: Boolean): String = js.native
  def string(`val`: Double): String = js.native
  def string(`val`: Date): String = js.native
  def withArray(fmt: String, array: js.Array[_]): String = js.native
}

