package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.Asterisk
import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.DISTINCT
import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Select extends AST {
  var columns: js.Array[_] | Asterisk
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
    columns: js.Array[_] | Asterisk,
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
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (distinct != null) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (having != null) __obj.updateDynamic("having")(having.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (orderby != null) __obj.updateDynamic("orderby")(orderby.asInstanceOf[js.Any])
    if (`with` != null) __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Select]
  }
}

