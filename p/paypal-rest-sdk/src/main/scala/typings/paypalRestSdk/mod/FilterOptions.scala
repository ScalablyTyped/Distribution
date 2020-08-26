package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOptions extends js.Object {
  var end_time: String = js.native
  var page_size: Double = js.native
  var start_time: String = js.native
}

object FilterOptions {
  @scala.inline
  def apply(end_time: String, page_size: Double, start_time: String): FilterOptions = {
    val __obj = js.Dynamic.literal(end_time = end_time.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
  @scala.inline
  implicit class FilterOptionsOps[Self <: FilterOptions] (val x: Self) extends AnyVal {
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
    def setEnd_time(value: String): Self = this.set("end_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage_size(value: Double): Self = this.set("page_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_time(value: String): Self = this.set("start_time", value.asInstanceOf[js.Any])
  }
  
}

