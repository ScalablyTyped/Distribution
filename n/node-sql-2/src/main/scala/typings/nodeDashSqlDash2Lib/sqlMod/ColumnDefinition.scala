package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition[Name /* <: java.lang.String */, Type] extends Named[Name] {
  var dataType: java.lang.String
  var defaultValue: js.UndefOr[Type] = js.undefined
  var jsType: js.UndefOr[Type] = js.undefined
  var notNull: js.UndefOr[scala.Boolean] = js.undefined
  var primaryKey: js.UndefOr[scala.Boolean] = js.undefined
  var references: js.UndefOr[nodeDashSqlDash2Lib.Anon_Cascade] = js.undefined
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

