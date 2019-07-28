package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncompleteData extends js.Object {
  // The service does not have source data before the specified time.
  var missingDataBeforeDateTime: js.UndefOr[String] = js.undefined
  // Some data was not recorded due to excessive activity.
  var wasThrottled: js.UndefOr[Boolean] = js.undefined
}

object IncompleteData {
  @scala.inline
  def apply(missingDataBeforeDateTime: String = null, wasThrottled: js.UndefOr[Boolean] = js.undefined): IncompleteData = {
    val __obj = js.Dynamic.literal()
    if (missingDataBeforeDateTime != null) __obj.updateDynamic("missingDataBeforeDateTime")(missingDataBeforeDateTime)
    if (!js.isUndefined(wasThrottled)) __obj.updateDynamic("wasThrottled")(wasThrottled)
    __obj.asInstanceOf[IncompleteData]
  }
}

