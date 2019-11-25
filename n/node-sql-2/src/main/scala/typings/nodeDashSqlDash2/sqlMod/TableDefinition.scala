package typings.nodeDashSqlDash2.sqlMod

import typings.nodeDashSqlDash2.Anon_CascadeColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition[Name /* <: String */, Row] extends js.Object {
  var columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
    */ typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.TableDefinition with Row
  var dialect: js.UndefOr[SQLDialects] = js.undefined
  var foreignKeys: js.UndefOr[Anon_CascadeColumns[Row]] = js.undefined
  var isTemporary: js.UndefOr[Boolean] = js.undefined
  var name: Name
  var schema: String
}

object TableDefinition {
  @scala.inline
  def apply[Name /* <: String */, Row](
    columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
    */ typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.TableDefinition with Row,
    name: Name,
    schema: String,
    dialect: SQLDialects = null,
    foreignKeys: Anon_CascadeColumns[Row] = null,
    isTemporary: js.UndefOr[Boolean] = js.undefined
  ): TableDefinition[Name, Row] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (dialect != null) __obj.updateDynamic("dialect")(dialect.asInstanceOf[js.Any])
    if (foreignKeys != null) __obj.updateDynamic("foreignKeys")(foreignKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(isTemporary)) __obj.updateDynamic("isTemporary")(isTemporary.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDefinition[Name, Row]]
  }
}

