package typings
package newrelicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollectPendingData extends js.Object {
  var collectPendingData: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CollectPendingData {
  @scala.inline
  def apply(
    collectPendingData: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): Anon_CollectPendingData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collectPendingData)) __obj.updateDynamic("collectPendingData")(collectPendingData)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CollectPendingData]
  }
}

