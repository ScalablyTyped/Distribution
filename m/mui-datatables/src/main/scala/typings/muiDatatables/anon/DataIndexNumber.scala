package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataIndexNumber extends js.Object {
  var dataIndex: Double = js.native
}

object DataIndexNumber {
  @scala.inline
  def apply(dataIndex: Double): DataIndexNumber = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndexNumber]
  }
  @scala.inline
  implicit class DataIndexNumberOps[Self <: DataIndexNumber] (val x: Self) extends AnyVal {
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
    def setDataIndex(value: Double): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
  }
  
}

