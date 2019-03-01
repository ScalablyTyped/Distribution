package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Select extends AST {
  var columns: js.Array[_] | nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.`*`
  var distinct: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.DISTINCT | scala.Null
  var from: (js.Array[From | Dual]) | scala.Null
  var groupby: js.Array[ColumnRef] | scala.Null
  var having: js.Array[_] | scala.Null
  var limit: js.Array[Limit] | scala.Null
  var options: js.Array[_] | scala.Null
  var orderby: js.Array[OrderBy] | scala.Null
  var `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.select
  var where: js.Any
  var `with`: With | scala.Null
}

object Select {
  @scala.inline
  def apply(
    columns: js.Array[_] | nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.`*`,
    `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.select,
    where: js.Any,
    distinct: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.DISTINCT = null,
    from: js.Array[From | Dual] = null,
    groupby: js.Array[ColumnRef] = null,
    having: js.Array[_] = null,
    limit: js.Array[Limit] = null,
    options: js.Array[_] = null,
    orderby: js.Array[OrderBy] = null,
    `with`: With = null
  ): Select = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.updateDynamic("where")(where)
    if (distinct != null) __obj.updateDynamic("distinct")(distinct)
    if (from != null) __obj.updateDynamic("from")(from)
    if (groupby != null) __obj.updateDynamic("groupby")(groupby)
    if (having != null) __obj.updateDynamic("having")(having)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (options != null) __obj.updateDynamic("options")(options)
    if (orderby != null) __obj.updateDynamic("orderby")(orderby)
    if (`with` != null) __obj.updateDynamic("with")(`with`)
    __obj.asInstanceOf[Select]
  }
}

