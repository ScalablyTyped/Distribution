package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableStateRows extends js.Object {
  var data: js.Array[String] = js.native
  var lookup: js.Any = js.native
}

object MUIDataTableStateRows {
  @scala.inline
  def apply(data: js.Array[String], lookup: js.Any): MUIDataTableStateRows = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableStateRows]
  }
  @scala.inline
  implicit class MUIDataTableStateRowsOps[Self <: MUIDataTableStateRows] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: String*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setLookup(value: js.Any): Self = this.set("lookup", value.asInstanceOf[js.Any])
  }
  
}

