package typings.microsoftGraph.mod

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
    if (missingDataBeforeDateTime != null) __obj.updateDynamic("missingDataBeforeDateTime")(missingDataBeforeDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(wasThrottled)) __obj.updateDynamic("wasThrottled")(wasThrottled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncompleteData]
  }
}

