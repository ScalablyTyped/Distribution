package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncompleteData extends js.Object {
  var missingDataBeforeDateTime: js.UndefOr[java.lang.String] = js.undefined
  var wasThrottled: js.UndefOr[scala.Boolean] = js.undefined
}

object IncompleteData {
  @scala.inline
  def apply(
    missingDataBeforeDateTime: java.lang.String = null,
    wasThrottled: js.UndefOr[scala.Boolean] = js.undefined
  ): IncompleteData = {
    val __obj = js.Dynamic.literal()
    if (missingDataBeforeDateTime != null) __obj.updateDynamic("missingDataBeforeDateTime")(missingDataBeforeDateTime)
    if (!js.isUndefined(wasThrottled)) __obj.updateDynamic("wasThrottled")(wasThrottled)
    __obj.asInstanceOf[IncompleteData]
  }
}

