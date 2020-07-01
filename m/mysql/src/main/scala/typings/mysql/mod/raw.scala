package typings.mysql.mod

import typings.mysql.anon.ToSqlString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mysql", "raw")
@js.native
object raw extends js.Object {
  def apply(sql: String): ToSqlString = js.native
}

