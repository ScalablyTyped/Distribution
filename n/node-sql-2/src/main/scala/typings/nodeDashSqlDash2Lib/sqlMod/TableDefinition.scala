package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition[Name /* <: java.lang.String */, Row] extends js.Object {
  var columns: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
    */ nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.TableDefinition with Row
  var dialect: js.UndefOr[SQLDialects] = js.undefined
  var foreignKeys: js.UndefOr[nodeDashSqlDash2Lib.Anon_CascadeColumns[Row]] = js.undefined
  var isTemporary: js.UndefOr[scala.Boolean] = js.undefined
  var name: Name
  var schema: java.lang.String
}

object TableDefinition {
  @scala.inline
  def apply[Name /* <: java.lang.String */, Row](
    columns: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
    */ nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.TableDefinition with Row,
    name: Name,
    schema: java.lang.String,
    dialect: SQLDialects = null,
    foreignKeys: nodeDashSqlDash2Lib.Anon_CascadeColumns[Row] = null,
    isTemporary: js.UndefOr[scala.Boolean] = js.undefined
  ): TableDefinition[Name, Row] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("schema")(schema)
    if (dialect != null) __obj.updateDynamic("dialect")(dialect)
    if (foreignKeys != null) __obj.updateDynamic("foreignKeys")(foreignKeys)
    if (!js.isUndefined(isTemporary)) __obj.updateDynamic("isTemporary")(isTemporary)
    __obj.asInstanceOf[TableDefinition[Name, Row]]
  }
}

