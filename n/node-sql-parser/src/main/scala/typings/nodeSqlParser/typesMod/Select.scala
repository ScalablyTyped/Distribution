package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.Asterisk
import typings.nodeSqlParser.nodeSqlParserStrings.DISTINCT
import typings.nodeSqlParser.nodeSqlParserStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select extends AST {
  var columns: (js.Array[_ | Column]) | Asterisk = js.native
  var distinct: DISTINCT | Null = js.native
  var from: (js.Array[From | Dual]) | Null = js.native
  var groupby: js.Array[ColumnRef] | Null = js.native
  var having: js.Array[_] | Null = js.native
  var limit: js.Array[Limit] | Null = js.native
  var options: js.Array[_] | Null = js.native
  var orderby: js.Array[OrderBy] | Null = js.native
  var `type`: select = js.native
  var where: js.Any = js.native
  var `with`: With | Null = js.native
}

object Select {
  @scala.inline
  def apply(columns: (js.Array[_ | Column]) | Asterisk, `type`: select, where: js.Any): Select = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Select]
  }
  @scala.inline
  implicit class SelectOps[Self <: Select] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnsVarargs(value: (js.Any | Column)*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: (js.Array[_ | Column]) | Asterisk): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: select): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhere(value: js.Any): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistinct(value: DISTINCT): Self = this.set("distinct", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistinctNull: Self = this.set("distinct", null)
    @scala.inline
    def setFromVarargs(value: (From | Dual)*): Self = this.set("from", js.Array(value :_*))
    @scala.inline
    def setFrom(value: js.Array[From | Dual]): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromNull: Self = this.set("from", null)
    @scala.inline
    def setGroupbyVarargs(value: ColumnRef*): Self = this.set("groupby", js.Array(value :_*))
    @scala.inline
    def setGroupby(value: js.Array[ColumnRef]): Self = this.set("groupby", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupbyNull: Self = this.set("groupby", null)
    @scala.inline
    def setHavingVarargs(value: js.Any*): Self = this.set("having", js.Array(value :_*))
    @scala.inline
    def setHaving(value: js.Array[_]): Self = this.set("having", value.asInstanceOf[js.Any])
    @scala.inline
    def setHavingNull: Self = this.set("having", null)
    @scala.inline
    def setLimitVarargs(value: Limit*): Self = this.set("limit", js.Array(value :_*))
    @scala.inline
    def setLimit(value: js.Array[Limit]): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimitNull: Self = this.set("limit", null)
    @scala.inline
    def setOptionsVarargs(value: js.Any*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsNull: Self = this.set("options", null)
    @scala.inline
    def setOrderbyVarargs(value: OrderBy*): Self = this.set("orderby", js.Array(value :_*))
    @scala.inline
    def setOrderby(value: js.Array[OrderBy]): Self = this.set("orderby", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderbyNull: Self = this.set("orderby", null)
    @scala.inline
    def setWith(value: With): Self = this.set("with", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithNull: Self = this.set("with", null)
  }
  
}

