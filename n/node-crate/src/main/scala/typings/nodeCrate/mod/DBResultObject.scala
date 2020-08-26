package typings.nodeCrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBResultObject extends js.Object {
  var cols: js.Array[String] = js.native
  var duration: Double = js.native
  var json: js.Array[js.Object] = js.native
  var rowcount: Double = js.native
  var rows: js.Array[js.Array[js.Object]] = js.native
}

object DBResultObject {
  @scala.inline
  def apply(
    cols: js.Array[String],
    duration: Double,
    json: js.Array[js.Object],
    rowcount: Double,
    rows: js.Array[js.Array[js.Object]]
  ): DBResultObject = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], rowcount = rowcount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBResultObject]
  }
  @scala.inline
  implicit class DBResultObjectOps[Self <: DBResultObject] (val x: Self) extends AnyVal {
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
    def setColsVarargs(value: String*): Self = this.set("cols", js.Array(value :_*))
    @scala.inline
    def setCols(value: js.Array[String]): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsonVarargs(value: js.Object*): Self = this.set("json", js.Array(value :_*))
    @scala.inline
    def setJson(value: js.Array[js.Object]): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowcount(value: Double): Self = this.set("rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Object]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[js.Object]]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

