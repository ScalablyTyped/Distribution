package typings
package nodeDashCronLib.nodeDashCronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleOptions extends js.Object {
  /**
    * A boolean to set if the created task is scheduled.
    *
    * Defaults to `true`
    */
  var scheduled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The timezone that is used for job scheduling
    */
  var timezone: js.UndefOr[tzDashOffsetLib.tzDashOffsetMod.Timezone] = js.undefined
}

object ScheduleOptions {
  @scala.inline
  def apply(
    scheduled: js.UndefOr[scala.Boolean] = js.undefined,
    timezone: tzDashOffsetLib.tzDashOffsetMod.Timezone = null
  ): ScheduleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scheduled)) __obj.updateDynamic("scheduled")(scheduled)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[ScheduleOptions]
  }
}

