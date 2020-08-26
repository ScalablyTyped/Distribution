package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataDataIndex extends js.Object {
  var data: js.Array[_] = js.native
  var dataIndex: Double = js.native
}

object DataDataIndex {
  @scala.inline
  def apply(data: js.Array[_], dataIndex: Double): DataDataIndex = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDataIndex]
  }
  @scala.inline
  implicit class DataDataIndexOps[Self <: DataDataIndex] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataIndex(value: Double): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
  }
  
}

