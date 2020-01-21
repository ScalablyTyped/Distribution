package typings.newrelic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollectPendingData extends js.Object {
  var collectPendingData: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonCollectPendingData {
  @scala.inline
  def apply(collectPendingData: js.UndefOr[Boolean] = js.undefined, timeout: Int | Double = null): AnonCollectPendingData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collectPendingData)) __obj.updateDynamic("collectPendingData")(collectPendingData.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollectPendingData]
  }
}

