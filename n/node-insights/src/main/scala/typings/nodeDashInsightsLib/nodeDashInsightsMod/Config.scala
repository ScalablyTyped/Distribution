package typings
package nodeDashInsightsLib.nodeDashInsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var accountId: java.lang.String
  var defaultEventType: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  var insertKey: java.lang.String
  var maxPending: js.UndefOr[scala.Double] = js.undefined
  var queryKey: java.lang.String
  var timerInterval: js.UndefOr[scala.Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    insertKey: java.lang.String,
    queryKey: java.lang.String,
    defaultEventType: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    maxPending: scala.Int | scala.Double = null,
    timerInterval: scala.Int | scala.Double = null
  ): Config = {
    val __obj = js.Dynamic.literal(accountId = accountId, insertKey = insertKey, queryKey = queryKey)
    if (defaultEventType != null) __obj.updateDynamic("defaultEventType")(defaultEventType)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (maxPending != null) __obj.updateDynamic("maxPending")(maxPending.asInstanceOf[js.Any])
    if (timerInterval != null) __obj.updateDynamic("timerInterval")(timerInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

