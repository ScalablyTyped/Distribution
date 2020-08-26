package typings.nodeSql2.anon

import typings.nodeSql2.nodeSql2Strings.`no action`
import typings.nodeSql2.nodeSql2Strings.`set default`
import typings.nodeSql2.nodeSql2Strings.`set null`
import typings.nodeSql2.nodeSql2Strings.cascade
import typings.nodeSql2.nodeSql2Strings.restrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns[Row] extends js.Object {
  var columns: js.Array[/* keyof Row */ String] = js.native
  var onDelete: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.native
  var onUpdate: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.native
  var refColumns: js.Array[String] = js.native
  var table: String = js.native
}

object Columns {
  @scala.inline
  def apply[Row](columns: js.Array[/* keyof Row */ String], refColumns: js.Array[String], table: String): Columns[Row] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], refColumns = refColumns.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns[Row]]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns[_], Row] (val x: Self with Columns[Row]) extends AnyVal {
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
    def setColumnsVarargs(value: (/* keyof Row */ String)*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[/* keyof Row */ String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefColumnsVarargs(value: String*): Self = this.set("refColumns", js.Array(value :_*))
    @scala.inline
    def setRefColumns(value: js.Array[String]): Self = this.set("refColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDelete(value: restrict | cascade | (`no action`) | (`set null`) | (`set default`)): Self = this.set("onDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDelete: Self = this.set("onDelete", js.undefined)
    @scala.inline
    def setOnUpdate(value: restrict | cascade | (`no action`) | (`set null`) | (`set default`)): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
  }
  
}

