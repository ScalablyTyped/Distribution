package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.DISTINCT
import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Select extends AST {
  var columns: js.Array[_] | typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.`*`
  var distinct: DISTINCT | Null
  var from: (js.Array[From | Dual]) | Null
  var groupby: js.Array[ColumnRef] | Null
  var having: js.Array[_] | Null
  var limit: js.Array[Limit] | Null
  var options: js.Array[_] | Null
  var orderby: js.Array[OrderBy] | Null
  var `type`: select
  var where: js.Any
  var `with`: With | Null
}

object Select {
  @scala.inline
  def apply(
    columns: js.Array[_] | typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.`*`,
    `type`: select,
    where: js.Any,
    distinct: DISTINCT = null,
    from: js.Array[From | Dual] = null,
    groupby: js.Array[ColumnRef] = null,
    having: js.Array[_] = null,
    limit: js.Array[Limit] = null,
    options: js.Array[_] = null,
    orderby: js.Array[OrderBy] = null,
    `with`: With = null
  ): Select = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where)
    __obj.updateDynamic("type")(`type`)
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

