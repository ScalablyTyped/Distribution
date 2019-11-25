package typings.nodeDashInsights.nodeDashInsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var accountId: String
  var defaultEventType: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var gzip: js.UndefOr[Boolean] = js.undefined
  var insertKey: String
  var maxPending: js.UndefOr[Double] = js.undefined
  var queryKey: String
  var timerInterval: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    accountId: String,
    insertKey: String,
    queryKey: String,
    defaultEventType: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    gzip: js.UndefOr[Boolean] = js.undefined,
    maxPending: Int | Double = null,
    timerInterval: Int | Double = null
  ): Config = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], insertKey = insertKey.asInstanceOf[js.Any], queryKey = queryKey.asInstanceOf[js.Any])
    if (defaultEventType != null) __obj.updateDynamic("defaultEventType")(defaultEventType.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (maxPending != null) __obj.updateDynamic("maxPending")(maxPending.asInstanceOf[js.Any])
    if (timerInterval != null) __obj.updateDynamic("timerInterval")(timerInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

