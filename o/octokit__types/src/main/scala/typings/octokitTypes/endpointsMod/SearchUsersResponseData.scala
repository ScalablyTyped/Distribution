package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Organizationsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchUsersResponseData extends js.Object {
  var incomplete_results: Boolean = js.native
  var items: js.Array[Organizationsurl] = js.native
  var total_count: Double = js.native
}

object SearchUsersResponseData {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Organizationsurl], total_count: Double): SearchUsersResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUsersResponseData]
  }
  @scala.inline
  implicit class SearchUsersResponseDataOps[Self <: SearchUsersResponseData] (val x: Self) extends AnyVal {
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
    def setIncomplete_results(value: Boolean): Self = this.set("incomplete_results", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: Organizationsurl*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Organizationsurl]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
  
}

