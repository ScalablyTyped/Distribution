package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICriteriaParts extends js.Object {
  var noDatabaseProperties: js.Array[java.lang.String]
  var rawCriteriaObject: js.Any
  var tables: js.Array[nodeDashMysqlDashWrapperLib.TableToSearchPart]
  var whereClause: java.lang.String
  def selectFromClause[T](_table: Table[T]): java.lang.String
}

object ICriteriaParts {
  @scala.inline
  def apply(
    noDatabaseProperties: js.Array[java.lang.String],
    rawCriteriaObject: js.Any,
    selectFromClause: js.Function1[Table[js.Any], java.lang.String],
    tables: js.Array[nodeDashMysqlDashWrapperLib.TableToSearchPart],
    whereClause: java.lang.String
  ): ICriteriaParts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("noDatabaseProperties")(noDatabaseProperties)
    __obj.updateDynamic("rawCriteriaObject")(rawCriteriaObject)
    __obj.updateDynamic("selectFromClause")(selectFromClause)
    __obj.updateDynamic("tables")(tables)
    __obj.updateDynamic("whereClause")(whereClause)
    __obj.asInstanceOf[ICriteriaParts]
  }
}

