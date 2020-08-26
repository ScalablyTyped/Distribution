package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schedule extends Entity {
  // Indicates whether the schedule is enabled for the team. Required.
  var enabled: js.UndefOr[Boolean] = js.native
  var offerShiftRequests: js.UndefOr[js.Array[OfferShiftRequest]] = js.native
  // Indicates whether offer shift requests are enabled for the schedule.
  var offerShiftRequestsEnabled: js.UndefOr[Boolean] = js.native
  var openShiftChangeRequests: js.UndefOr[js.Array[OpenShiftChangeRequest]] = js.native
  var openShifts: js.UndefOr[js.Array[OpenShift]] = js.native
  // Indicates whether open shifts are enabled for the schedule.
  var openShiftsEnabled: js.UndefOr[Boolean] = js.native
  // The status of the schedule provisioning. The possible values are notStarted, running, completed, failed.
  var provisionStatus: js.UndefOr[OperationStatus] = js.native
  // Additional information about why schedule provisioning failed.
  var provisionStatusCode: js.UndefOr[String] = js.native
  // The logical grouping of users in the schedule (usually by role).
  var schedulingGroups: js.UndefOr[js.Array[SchedulingGroup]] = js.native
  // The shifts in the schedule.
  var shifts: js.UndefOr[js.Array[Shift]] = js.native
  var swapShiftsChangeRequests: js.UndefOr[js.Array[SwapShiftsChangeRequest]] = js.native
  // Indicates whether swap shifts requests are enabled for the schedule.
  var swapShiftsRequestsEnabled: js.UndefOr[Boolean] = js.native
  // Indicates whether time clock is enabled for the schedule.
  var timeClockEnabled: js.UndefOr[Boolean] = js.native
  // The set of reasons for a time off in the schedule.
  var timeOffReasons: js.UndefOr[js.Array[TimeOffReason]] = js.native
  var timeOffRequests: js.UndefOr[js.Array[TimeOffRequest]] = js.native
  // Indicates whether time off requests are enabled for the schedule.
  var timeOffRequestsEnabled: js.UndefOr[Boolean] = js.native
  // Indicates the time zone of the schedule team using tz database format. Required.
  var timeZone: js.UndefOr[String] = js.native
  // The instances of times off in the schedule.
  var timesOff: js.UndefOr[js.Array[TimeOff]] = js.native
  var workforceIntegrationIds: js.UndefOr[js.Array[String]] = js.native
}

object Schedule {
  @scala.inline
  def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  @scala.inline
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setOfferShiftRequestsVarargs(value: OfferShiftRequest*): Self = this.set("offerShiftRequests", js.Array(value :_*))
    @scala.inline
    def setOfferShiftRequests(value: js.Array[OfferShiftRequest]): Self = this.set("offerShiftRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferShiftRequests: Self = this.set("offerShiftRequests", js.undefined)
    @scala.inline
    def setOfferShiftRequestsEnabled(value: Boolean): Self = this.set("offerShiftRequestsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferShiftRequestsEnabled: Self = this.set("offerShiftRequestsEnabled", js.undefined)
    @scala.inline
    def setOpenShiftChangeRequestsVarargs(value: OpenShiftChangeRequest*): Self = this.set("openShiftChangeRequests", js.Array(value :_*))
    @scala.inline
    def setOpenShiftChangeRequests(value: js.Array[OpenShiftChangeRequest]): Self = this.set("openShiftChangeRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenShiftChangeRequests: Self = this.set("openShiftChangeRequests", js.undefined)
    @scala.inline
    def setOpenShiftsVarargs(value: OpenShift*): Self = this.set("openShifts", js.Array(value :_*))
    @scala.inline
    def setOpenShifts(value: js.Array[OpenShift]): Self = this.set("openShifts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenShifts: Self = this.set("openShifts", js.undefined)
    @scala.inline
    def setOpenShiftsEnabled(value: Boolean): Self = this.set("openShiftsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenShiftsEnabled: Self = this.set("openShiftsEnabled", js.undefined)
    @scala.inline
    def setProvisionStatus(value: OperationStatus): Self = this.set("provisionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionStatus: Self = this.set("provisionStatus", js.undefined)
    @scala.inline
    def setProvisionStatusCode(value: String): Self = this.set("provisionStatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionStatusCode: Self = this.set("provisionStatusCode", js.undefined)
    @scala.inline
    def setSchedulingGroupsVarargs(value: SchedulingGroup*): Self = this.set("schedulingGroups", js.Array(value :_*))
    @scala.inline
    def setSchedulingGroups(value: js.Array[SchedulingGroup]): Self = this.set("schedulingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedulingGroups: Self = this.set("schedulingGroups", js.undefined)
    @scala.inline
    def setShiftsVarargs(value: Shift*): Self = this.set("shifts", js.Array(value :_*))
    @scala.inline
    def setShifts(value: js.Array[Shift]): Self = this.set("shifts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShifts: Self = this.set("shifts", js.undefined)
    @scala.inline
    def setSwapShiftsChangeRequestsVarargs(value: SwapShiftsChangeRequest*): Self = this.set("swapShiftsChangeRequests", js.Array(value :_*))
    @scala.inline
    def setSwapShiftsChangeRequests(value: js.Array[SwapShiftsChangeRequest]): Self = this.set("swapShiftsChangeRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwapShiftsChangeRequests: Self = this.set("swapShiftsChangeRequests", js.undefined)
    @scala.inline
    def setSwapShiftsRequestsEnabled(value: Boolean): Self = this.set("swapShiftsRequestsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwapShiftsRequestsEnabled: Self = this.set("swapShiftsRequestsEnabled", js.undefined)
    @scala.inline
    def setTimeClockEnabled(value: Boolean): Self = this.set("timeClockEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeClockEnabled: Self = this.set("timeClockEnabled", js.undefined)
    @scala.inline
    def setTimeOffReasonsVarargs(value: TimeOffReason*): Self = this.set("timeOffReasons", js.Array(value :_*))
    @scala.inline
    def setTimeOffReasons(value: js.Array[TimeOffReason]): Self = this.set("timeOffReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOffReasons: Self = this.set("timeOffReasons", js.undefined)
    @scala.inline
    def setTimeOffRequestsVarargs(value: TimeOffRequest*): Self = this.set("timeOffRequests", js.Array(value :_*))
    @scala.inline
    def setTimeOffRequests(value: js.Array[TimeOffRequest]): Self = this.set("timeOffRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOffRequests: Self = this.set("timeOffRequests", js.undefined)
    @scala.inline
    def setTimeOffRequestsEnabled(value: Boolean): Self = this.set("timeOffRequestsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOffRequestsEnabled: Self = this.set("timeOffRequestsEnabled", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    @scala.inline
    def setTimesOffVarargs(value: TimeOff*): Self = this.set("timesOff", js.Array(value :_*))
    @scala.inline
    def setTimesOff(value: js.Array[TimeOff]): Self = this.set("timesOff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimesOff: Self = this.set("timesOff", js.undefined)
    @scala.inline
    def setWorkforceIntegrationIdsVarargs(value: String*): Self = this.set("workforceIntegrationIds", js.Array(value :_*))
    @scala.inline
    def setWorkforceIntegrationIds(value: js.Array[String]): Self = this.set("workforceIntegrationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkforceIntegrationIds: Self = this.set("workforceIntegrationIds", js.undefined)
  }
  
}

