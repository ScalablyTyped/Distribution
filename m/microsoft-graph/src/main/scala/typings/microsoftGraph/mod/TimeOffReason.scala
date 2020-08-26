package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeOffReason extends ChangeTrackedEntity {
  // The name of the timeOffReason. Required.
  var displayName: js.UndefOr[String] = js.native
  /**
    * Supported icon types: none; car; calendar; running; plane; firstAid; doctor; notWorking; clock; juryDuty; globe; cup;
    * phone; weather; umbrella; piggyBank; dog; cake; trafficCone; pin; sunny. Required.
    */
  var iconType: js.UndefOr[TimeOffReasonIconType] = js.native
  // Indicates whether the timeOffReason can be used when creating new entities or updating existing ones. Required.
  var isActive: js.UndefOr[Boolean] = js.native
}

object TimeOffReason {
  @scala.inline
  def apply(): TimeOffReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOffReason]
  }
  @scala.inline
  implicit class TimeOffReasonOps[Self <: TimeOffReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setIconType(value: TimeOffReasonIconType): Self = this.set("iconType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconType: Self = this.set("iconType", js.undefined)
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
  }
  
}

