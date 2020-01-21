package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "Table")
@js.native
class Table () extends js.Object {
  def this(tableName: String) = this()
  var columns: typings.mssql.mod.columns = js.native
  var create: Boolean = js.native
  var database: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var rows: typings.mssql.mod.rows = js.native
  var schema: js.UndefOr[String] = js.native
  var temporary: js.UndefOr[Boolean] = js.native
}

