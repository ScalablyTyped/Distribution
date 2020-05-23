package typings.nano.mod

import typings.nano.nanoStrings.continuous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseScopeFollowUpdatesParams extends DocumentScopeFollowUpdatesParams {
  var db: String
}

object DatabaseScopeFollowUpdatesParams {
  @scala.inline
  def apply(
    db: String,
    feed: continuous = null,
    filter: String | FollowUpdatesParamsFilterFunction = null,
    headers: js.Any = null,
    heartbeat: js.UndefOr[Double] = js.undefined,
    inactivity_ms: js.UndefOr[Double] = js.undefined,
    include_docs: js.UndefOr[Boolean] = js.undefined,
    initial_retry_delay: js.UndefOr[Double] = js.undefined,
    max_retry_seconds: js.UndefOr[Double] = js.undefined,
    query_params: js.Any = null,
    response_grace_time: js.UndefOr[Double] = js.undefined,
    since: String = null
  ): DatabaseScopeFollowUpdatesParams = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    if (feed != null) __obj.updateDynamic("feed")(feed.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeat)) __obj.updateDynamic("heartbeat")(heartbeat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inactivity_ms)) __obj.updateDynamic("inactivity_ms")(inactivity_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initial_retry_delay)) __obj.updateDynamic("initial_retry_delay")(initial_retry_delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_retry_seconds)) __obj.updateDynamic("max_retry_seconds")(max_retry_seconds.get.asInstanceOf[js.Any])
    if (query_params != null) __obj.updateDynamic("query_params")(query_params.asInstanceOf[js.Any])
    if (!js.isUndefined(response_grace_time)) __obj.updateDynamic("response_grace_time")(response_grace_time.get.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseScopeFollowUpdatesParams]
  }
}

