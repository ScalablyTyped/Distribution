package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableData extends js.Object {
  var data: js.Array[js.Object | (js.Array[Double | String])] = js.native
  var index: Double = js.native
}

object MUIDataTableData {
  @scala.inline
  def apply(data: js.Array[js.Object | (js.Array[Double | String])], index: Double): MUIDataTableData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableData]
  }
  @scala.inline
  implicit class MUIDataTableDataOps[Self <: MUIDataTableData] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: (js.Object | (js.Array[Double | String]))*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Object | (js.Array[Double | String])]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
  
}

