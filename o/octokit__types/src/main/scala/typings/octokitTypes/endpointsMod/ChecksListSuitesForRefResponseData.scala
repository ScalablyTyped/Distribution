package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.After
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksListSuitesForRefResponseData extends js.Object {
  var check_suites: js.Array[After] = js.native
  var total_count: Double = js.native
}

object ChecksListSuitesForRefResponseData {
  @scala.inline
  def apply(check_suites: js.Array[After], total_count: Double): ChecksListSuitesForRefResponseData = {
    val __obj = js.Dynamic.literal(check_suites = check_suites.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListSuitesForRefResponseData]
  }
  @scala.inline
  implicit class ChecksListSuitesForRefResponseDataOps[Self <: ChecksListSuitesForRefResponseData] (val x: Self) extends AnyVal {
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
    def setCheck_suitesVarargs(value: After*): Self = this.set("check_suites", js.Array(value :_*))
    @scala.inline
    def setCheck_suites(value: js.Array[After]): Self = this.set("check_suites", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
  
}

