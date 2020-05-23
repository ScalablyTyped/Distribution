package typings.newrelic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectPendingData extends js.Object {
  var collectPendingData: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var waitForIdle: js.UndefOr[Boolean] = js.undefined
}

object CollectPendingData {
  @scala.inline
  def apply(
    collectPendingData: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    waitForIdle: js.UndefOr[Boolean] = js.undefined
  ): CollectPendingData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collectPendingData)) __obj.updateDynamic("collectPendingData")(collectPendingData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForIdle)) __obj.updateDynamic("waitForIdle")(waitForIdle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectPendingData]
  }
}

