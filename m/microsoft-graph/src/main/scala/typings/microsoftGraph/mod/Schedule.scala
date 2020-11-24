package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends Entity {
  
  // Indicates whether the schedule is enabled for the team. Required.
  var enabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var offerShiftRequests: js.UndefOr[NullableOption[js.Array[OfferShiftRequest]]] = js.native
  
  // Indicates whether offer shift requests are enabled for the schedule.
  var offerShiftRequestsEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var openShiftChangeRequests: js.UndefOr[NullableOption[js.Array[OpenShiftChangeRequest]]] = js.native
  
  var openShifts: js.UndefOr[NullableOption[js.Array[OpenShift]]] = js.native
  
  // Indicates whether open shifts are enabled for the schedule.
  var openShiftsEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The status of the schedule provisioning. The possible values are notStarted, running, completed, failed.
  var provisionStatus: js.UndefOr[NullableOption[OperationStatus]] = js.native
  
  // Additional information about why schedule provisioning failed.
  var provisionStatusCode: js.UndefOr[NullableOption[String]] = js.native
  
  // The logical grouping of users in the schedule (usually by role).
  var schedulingGroups: js.UndefOr[NullableOption[js.Array[SchedulingGroup]]] = js.native
  
  // The shifts in the schedule.
  var shifts: js.UndefOr[NullableOption[js.Array[Shift]]] = js.native
  
  var swapShiftsChangeRequests: js.UndefOr[NullableOption[js.Array[SwapShiftsChangeRequest]]] = js.native
  
  // Indicates whether swap shifts requests are enabled for the schedule.
  var swapShiftsRequestsEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether time clock is enabled for the schedule.
  var timeClockEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The set of reasons for a time off in the schedule.
  var timeOffReasons: js.UndefOr[NullableOption[js.Array[TimeOffReason]]] = js.native
  
  var timeOffRequests: js.UndefOr[NullableOption[js.Array[TimeOffRequest]]] = js.native
  
  // Indicates whether time off requests are enabled for the schedule.
  var timeOffRequestsEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates the time zone of the schedule team using tz database format. Required.
  var timeZone: js.UndefOr[NullableOption[String]] = js.native
  
  // The instances of times off in the schedule.
  var timesOff: js.UndefOr[NullableOption[js.Array[TimeOff]]] = js.native
  
  var workforceIntegrationIds: js.UndefOr[NullableOption[js.Array[String]]] = js.native
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
    def setEnabled(value: NullableOption[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEnabledNull: Self = this.set("enabled", null)
    
    @scala.inline
    def setOfferShiftRequestsVarargs(value: OfferShiftRequest*): Self = this.set("offerShiftRequests", js.Array(value :_*))
    
    @scala.inline
    def setOfferShiftRequests(value: NullableOption[js.Array[OfferShiftRequest]]): Self = this.set("offerShiftRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferShiftRequests: Self = this.set("offerShiftRequests", js.undefined)
    
    @scala.inline
    def setOfferShiftRequestsNull: Self = this.set("offerShiftRequests", null)
    
    @scala.inline
    def setOfferShiftRequestsEnabled(value: NullableOption[Boolean]): Self = this.set("offerShiftRequestsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferShiftRequestsEnabled: Self = this.set("offerShiftRequestsEnabled", js.undefined)
    
    @scala.inline
    def setOfferShiftRequestsEnabledNull: Self = this.set("offerShiftRequestsEnabled", null)
    
    @scala.inline
    def setOpenShiftChangeRequestsVarargs(value: OpenShiftChangeRequest*): Self = this.set("openShiftChangeRequests", js.Array(value :_*))
    
    @scala.inline
    def setOpenShiftChangeRequests(value: NullableOption[js.Array[OpenShiftChangeRequest]]): Self = this.set("openShiftChangeRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenShiftChangeRequests: Self = this.set("openShiftChangeRequests", js.undefined)
    
    @scala.inline
    def setOpenShiftChangeRequestsNull: Self = this.set("openShiftChangeRequests", null)
    
    @scala.inline
    def setOpenShiftsVarargs(value: OpenShift*): Self = this.set("openShifts", js.Array(value :_*))
    
    @scala.inline
    def setOpenShifts(value: NullableOption[js.Array[OpenShift]]): Self = this.set("openShifts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenShifts: Self = this.set("openShifts", js.undefined)
    
    @scala.inline
    def setOpenShiftsNull: Self = this.set("openShifts", null)
    
    @scala.inline
    def setOpenShiftsEnabled(value: NullableOption[Boolean]): Self = this.set("openShiftsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenShiftsEnabled: Self = this.set("openShiftsEnabled", js.undefined)
    
    @scala.inline
    def setOpenShiftsEnabledNull: Self = this.set("openShiftsEnabled", null)
    
    @scala.inline
    def setProvisionStatus(value: NullableOption[OperationStatus]): Self = this.set("provisionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionStatus: Self = this.set("provisionStatus", js.undefined)
    
    @scala.inline
    def setProvisionStatusNull: Self = this.set("provisionStatus", null)
    
    @scala.inline
    def setProvisionStatusCode(value: NullableOption[String]): Self = this.set("provisionStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionStatusCode: Self = this.set("provisionStatusCode", js.undefined)
    
    @scala.inline
    def setProvisionStatusCodeNull: Self = this.set("provisionStatusCode", null)
    
    @scala.inline
    def setSchedulingGroupsVarargs(value: SchedulingGroup*): Self = this.set("schedulingGroups", js.Array(value :_*))
    
    @scala.inline
    def setSchedulingGroups(value: NullableOption[js.Array[SchedulingGroup]]): Self = this.set("schedulingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedulingGroups: Self = this.set("schedulingGroups", js.undefined)
    
    @scala.inline
    def setSchedulingGroupsNull: Self = this.set("schedulingGroups", null)
    
    @scala.inline
    def setShiftsVarargs(value: Shift*): Self = this.set("shifts", js.Array(value :_*))
    
    @scala.inline
    def setShifts(value: NullableOption[js.Array[Shift]]): Self = this.set("shifts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShifts: Self = this.set("shifts", js.undefined)
    
    @scala.inline
    def setShiftsNull: Self = this.set("shifts", null)
    
    @scala.inline
    def setSwapShiftsChangeRequestsVarargs(value: SwapShiftsChangeRequest*): Self = this.set("swapShiftsChangeRequests", js.Array(value :_*))
    
    @scala.inline
    def setSwapShiftsChangeRequests(value: NullableOption[js.Array[SwapShiftsChangeRequest]]): Self = this.set("swapShiftsChangeRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapShiftsChangeRequests: Self = this.set("swapShiftsChangeRequests", js.undefined)
    
    @scala.inline
    def setSwapShiftsChangeRequestsNull: Self = this.set("swapShiftsChangeRequests", null)
    
    @scala.inline
    def setSwapShiftsRequestsEnabled(value: NullableOption[Boolean]): Self = this.set("swapShiftsRequestsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapShiftsRequestsEnabled: Self = this.set("swapShiftsRequestsEnabled", js.undefined)
    
    @scala.inline
    def setSwapShiftsRequestsEnabledNull: Self = this.set("swapShiftsRequestsEnabled", null)
    
    @scala.inline
    def setTimeClockEnabled(value: NullableOption[Boolean]): Self = this.set("timeClockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeClockEnabled: Self = this.set("timeClockEnabled", js.undefined)
    
    @scala.inline
    def setTimeClockEnabledNull: Self = this.set("timeClockEnabled", null)
    
    @scala.inline
    def setTimeOffReasonsVarargs(value: TimeOffReason*): Self = this.set("timeOffReasons", js.Array(value :_*))
    
    @scala.inline
    def setTimeOffReasons(value: NullableOption[js.Array[TimeOffReason]]): Self = this.set("timeOffReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOffReasons: Self = this.set("timeOffReasons", js.undefined)
    
    @scala.inline
    def setTimeOffReasonsNull: Self = this.set("timeOffReasons", null)
    
    @scala.inline
    def setTimeOffRequestsVarargs(value: TimeOffRequest*): Self = this.set("timeOffRequests", js.Array(value :_*))
    
    @scala.inline
    def setTimeOffRequests(value: NullableOption[js.Array[TimeOffRequest]]): Self = this.set("timeOffRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOffRequests: Self = this.set("timeOffRequests", js.undefined)
    
    @scala.inline
    def setTimeOffRequestsNull: Self = this.set("timeOffRequests", null)
    
    @scala.inline
    def setTimeOffRequestsEnabled(value: NullableOption[Boolean]): Self = this.set("timeOffRequestsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOffRequestsEnabled: Self = this.set("timeOffRequestsEnabled", js.undefined)
    
    @scala.inline
    def setTimeOffRequestsEnabledNull: Self = this.set("timeOffRequestsEnabled", null)
    
    @scala.inline
    def setTimeZone(value: NullableOption[String]): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setTimeZoneNull: Self = this.set("timeZone", null)
    
    @scala.inline
    def setTimesOffVarargs(value: TimeOff*): Self = this.set("timesOff", js.Array(value :_*))
    
    @scala.inline
    def setTimesOff(value: NullableOption[js.Array[TimeOff]]): Self = this.set("timesOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimesOff: Self = this.set("timesOff", js.undefined)
    
    @scala.inline
    def setTimesOffNull: Self = this.set("timesOff", null)
    
    @scala.inline
    def setWorkforceIntegrationIdsVarargs(value: String*): Self = this.set("workforceIntegrationIds", js.Array(value :_*))
    
    @scala.inline
    def setWorkforceIntegrationIds(value: NullableOption[js.Array[String]]): Self = this.set("workforceIntegrationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkforceIntegrationIds: Self = this.set("workforceIntegrationIds", js.undefined)
    
    @scala.inline
    def setWorkforceIntegrationIdsNull: Self = this.set("workforceIntegrationIds", null)
  }
}
