package typings.nodeSqlParser.mod

import typings.nodeSqlParser.nodeSqlParserStrings.Asterisk
import typings.nodeSqlParser.nodeSqlParserStrings.DISTINCT
import typings.nodeSqlParser.nodeSqlParserStrings.select
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
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any], distinct = distinct.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], having = having.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], orderby = orderby.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Select]
  }
}

