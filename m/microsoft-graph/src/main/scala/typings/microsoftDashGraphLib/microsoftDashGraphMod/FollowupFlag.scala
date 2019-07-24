package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowupFlag extends js.Object {
  // The date and time that the follow-up was finished.
  var completedDateTime: js.UndefOr[DateTimeTimeZone] = js.undefined
  // The date and time that the follow-up is to be finished.
  var dueDateTime: js.UndefOr[DateTimeTimeZone] = js.undefined
  // The status for follow-up for an item. Possible values are notFlagged, complete, and flagged.
  var flagStatus: js.UndefOr[FollowupFlagStatus] = js.undefined
  // The date and time that the follow-up is to begin.
  var startDateTime: js.UndefOr[DateTimeTimeZone] = js.undefined
}

object FollowupFlag {
  @scala.inline
  def apply(
    completedDateTime: DateTimeTimeZone = null,
    dueDateTime: DateTimeTimeZone = null,
    flagStatus: FollowupFlagStatus = null,
    startDateTime: DateTimeTimeZone = null
  ): FollowupFlag = {
    val __obj = js.Dynamic.literal()
    if (completedDateTime != null) __obj.updateDynamic("completedDateTime")(completedDateTime)
    if (dueDateTime != null) __obj.updateDynamic("dueDateTime")(dueDateTime)
    if (flagStatus != null) __obj.updateDynamic("flagStatus")(flagStatus)
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime)
    __obj.asInstanceOf[FollowupFlag]
  }
}

