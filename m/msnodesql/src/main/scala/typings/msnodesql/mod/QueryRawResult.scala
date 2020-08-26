package typings.msnodesql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryRawResult extends js.Object {
  var meta: js.Array[QueryRawColumn] = js.native
  var rows: js.Array[js.Array[_]] = js.native
}

object QueryRawResult {
  @scala.inline
  def apply(meta: js.Array[QueryRawColumn], rows: js.Array[js.Array[_]]): QueryRawResult = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRawResult]
  }
  @scala.inline
  implicit class QueryRawResultOps[Self <: QueryRawResult] (val x: Self) extends AnyVal {
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
    def setMetaVarargs(value: QueryRawColumn*): Self = this.set("meta", js.Array(value :_*))
    @scala.inline
    def setMeta(value: js.Array[QueryRawColumn]): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[_]]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

