package typings.mysql.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mysql", "format")
@js.native
object format extends js.Object {
  def apply(sql: String, values: js.Array[_]): String = js.native
  def apply(sql: String, values: js.Array[_], stringifyObjects: Boolean): String = js.native
  def apply(sql: String, values: js.Array[_], stringifyObjects: Boolean, timeZone: String): String = js.native
}

