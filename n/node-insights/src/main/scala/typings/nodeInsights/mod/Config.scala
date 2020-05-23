package typings.nodeInsights.mod

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
    maxPending: js.UndefOr[Double] = js.undefined,
    timerInterval: js.UndefOr[Double] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], insertKey = insertKey.asInstanceOf[js.Any], queryKey = queryKey.asInstanceOf[js.Any])
    if (defaultEventType != null) __obj.updateDynamic("defaultEventType")(defaultEventType.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPending)) __obj.updateDynamic("maxPending")(maxPending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timerInterval)) __obj.updateDynamic("timerInterval")(timerInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

