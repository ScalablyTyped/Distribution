package typings.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mysql", "format")
@js.native
object format extends js.Object {
  
  def apply(sql: String, values: js.Array[_]): String = js.native
  def apply(sql: String, values: js.Array[_], stringifyObjects: js.UndefOr[scala.Nothing], timeZone: String): String = js.native
  def apply(sql: String, values: js.Array[_], stringifyObjects: Boolean): String = js.native
  def apply(sql: String, values: js.Array[_], stringifyObjects: Boolean, timeZone: String): String = js.native
}
