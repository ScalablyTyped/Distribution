package typings.nodeSql2.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition[Name /* <: String */, Row] extends js.Object {
  var columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
    */ typings.nodeSql2.nodeSql2Strings.TableDefinition with TopLevel[Row]
  var dialect: js.UndefOr[SQLDialects] = js.undefined
  var foreignKeys: js.UndefOr[typings.nodeSql2.anon.Columns[Row]] = js.undefined
  var isTemporary: js.UndefOr[Boolean] = js.undefined
  var name: Name
  var schema: String
}

object TableDefinition {
  @scala.inline
  def apply[Name, Row](
    columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
    */ typings.nodeSql2.nodeSql2Strings.TableDefinition with TopLevel[Row],
    name: Name,
    schema: String,
    dialect: SQLDialects = null,
    foreignKeys: typings.nodeSql2.anon.Columns[Row] = null,
    isTemporary: js.UndefOr[Boolean] = js.undefined
  ): TableDefinition[Name, Row] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (dialect != null) __obj.updateDynamic("dialect")(dialect.asInstanceOf[js.Any])
    if (foreignKeys != null) __obj.updateDynamic("foreignKeys")(foreignKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(isTemporary)) __obj.updateDynamic("isTemporary")(isTemporary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDefinition[Name, Row]]
  }
}

