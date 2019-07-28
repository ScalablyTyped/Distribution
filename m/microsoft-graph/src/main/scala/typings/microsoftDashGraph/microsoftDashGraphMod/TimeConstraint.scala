package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeConstraint extends js.Object {
  // The nature of the activity, optional. The possible values are: work, personal, unrestricted, or unknown.
  var activityDomain: js.UndefOr[ActivityDomain] = js.undefined
  var timeSlots: js.UndefOr[js.Array[TimeSlot]] = js.undefined
}

object TimeConstraint {
  @scala.inline
  def apply(activityDomain: ActivityDomain = null, timeSlots: js.Array[TimeSlot] = null): TimeConstraint = {
    val __obj = js.Dynamic.literal()
    if (activityDomain != null) __obj.updateDynamic("activityDomain")(activityDomain)
    if (timeSlots != null) __obj.updateDynamic("timeSlots")(timeSlots)
    __obj.asInstanceOf[TimeConstraint]
  }
}

