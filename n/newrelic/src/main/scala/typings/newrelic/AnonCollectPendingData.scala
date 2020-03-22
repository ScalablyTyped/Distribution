package typings.newrelic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollectPendingData extends js.Object {
  var collectPendingData: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var waitForIdle: js.UndefOr[Boolean] = js.undefined
}

object AnonCollectPendingData {
  @scala.inline
  def apply(
    collectPendingData: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    waitForIdle: js.UndefOr[Boolean] = js.undefined
  ): AnonCollectPendingData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collectPendingData)) __obj.updateDynamic("collectPendingData")(collectPendingData.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForIdle)) __obj.updateDynamic("waitForIdle")(waitForIdle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollectPendingData]
  }
}

