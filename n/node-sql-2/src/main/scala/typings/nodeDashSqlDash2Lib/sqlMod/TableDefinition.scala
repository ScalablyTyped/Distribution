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

