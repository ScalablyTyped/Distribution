package typings.nodeDashCron.nodeDashCronMod

import typings.tzDashOffset.tzDashOffsetMod.Timezone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleOptions extends js.Object {
  /**
    * A boolean to set if the created task is scheduled.
    *
    * Defaults to `true`
    */
  var scheduled: js.UndefOr[Boolean] = js.undefined
  /**
    * The timezone that is used for job scheduling
    */
  var timezone: js.UndefOr[Timezone] = js.undefined
}

object ScheduleOptions {
  @scala.inline
  def apply(scheduled: js.UndefOr[Boolean] = js.undefined, timezone: Timezone = null): ScheduleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scheduled)) __obj.updateDynamic("scheduled")(scheduled.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleOptions]
  }
}

