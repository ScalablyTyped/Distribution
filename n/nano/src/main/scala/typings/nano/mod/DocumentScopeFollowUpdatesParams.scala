package typings.nano.mod

import typings.nano.nanoStrings.continuous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentScopeFollowUpdatesParams extends js.Object {
  var feed: js.UndefOr[continuous] = js.native
  var filter: js.UndefOr[String | FollowUpdatesParamsFilterFunction] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var heartbeat: js.UndefOr[Double] = js.native
  var inactivity_ms: js.UndefOr[Double] = js.native
  var include_docs: js.UndefOr[Boolean] = js.native
  var initial_retry_delay: js.UndefOr[Double] = js.native
  var max_retry_seconds: js.UndefOr[Double] = js.native
  var query_params: js.UndefOr[js.Any] = js.native
  var response_grace_time: js.UndefOr[Double] = js.native
  var since: js.UndefOr[String] = js.native
}

object DocumentScopeFollowUpdatesParams {
  @scala.inline
  def apply(): DocumentScopeFollowUpdatesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentScopeFollowUpdatesParams]
  }
  @scala.inline
  implicit class DocumentScopeFollowUpdatesParamsOps[Self <: DocumentScopeFollowUpdatesParams] (val x: Self) extends AnyVal {
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
    def setFeed(value: continuous): Self = this.set("feed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeed: Self = this.set("feed", js.undefined)
    @scala.inline
    def setFilterFunction2(value: (/* doc */ js.Any, /* req */ js.Any) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def setFilter(value: String | FollowUpdatesParamsFilterFunction): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHeartbeat(value: Double): Self = this.set("heartbeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeartbeat: Self = this.set("heartbeat", js.undefined)
    @scala.inline
    def setInactivity_ms(value: Double): Self = this.set("inactivity_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactivity_ms: Self = this.set("inactivity_ms", js.undefined)
    @scala.inline
    def setInclude_docs(value: Boolean): Self = this.set("include_docs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_docs: Self = this.set("include_docs", js.undefined)
    @scala.inline
    def setInitial_retry_delay(value: Double): Self = this.set("initial_retry_delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial_retry_delay: Self = this.set("initial_retry_delay", js.undefined)
    @scala.inline
    def setMax_retry_seconds(value: Double): Self = this.set("max_retry_seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_retry_seconds: Self = this.set("max_retry_seconds", js.undefined)
    @scala.inline
    def setQuery_params(value: js.Any): Self = this.set("query_params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery_params: Self = this.set("query_params", js.undefined)
    @scala.inline
    def setResponse_grace_time(value: Double): Self = this.set("response_grace_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse_grace_time: Self = this.set("response_grace_time", js.undefined)
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
  }
  
}

