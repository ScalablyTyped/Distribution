package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition[Name /* <: java.lang.String */, Row] extends js.Object {
  var columns: nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.TableDefinition with Row
  var dialect: js.UndefOr[SQLDialects] = js.undefined
  var foreignKeys: js.UndefOr[nodeDashSqlDash2Lib.Anon_CascadeColumns[Row]] = js.undefined
  var isTemporary: js.UndefOr[scala.Boolean] = js.undefined
  var name: Name
  var schema: java.lang.String
}

