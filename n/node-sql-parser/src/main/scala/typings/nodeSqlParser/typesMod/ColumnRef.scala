package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.column_ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnRef extends js.Object {
  var column: String = js.native
  var table: String | Null = js.native
  var `type`: column_ref = js.native
}

object ColumnRef {
  @scala.inline
  def apply(column: String, `type`: column_ref): ColumnRef = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnRef]
  }
  @scala.inline
  implicit class ColumnRefOps[Self <: ColumnRef] (val x: Self) extends AnyVal {
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
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: column_ref): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableNull: Self = this.set("table", null)
  }
  
}

