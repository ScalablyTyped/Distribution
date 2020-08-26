package typings.ngTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  var columns: String = js.native
  var tableParams: String = js.native
}

object Columns {
  @scala.inline
  def apply(columns: String, tableParams: String): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], tableParams = tableParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
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
    def setColumns(value: String): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableParams(value: String): Self = this.set("tableParams", value.asInstanceOf[js.Any])
  }
  
}

