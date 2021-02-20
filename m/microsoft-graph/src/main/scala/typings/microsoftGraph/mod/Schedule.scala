package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ScheduleMutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOfferShiftRequests(value: NullableOption[js.Array[OfferShiftRequest]]): Self = StObject.set(x, "offerShiftRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferShiftRequestsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "offerShiftRequestsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferShiftRequestsEnabledNull: Self = StObject.set(x, "offerShiftRequestsEnabled", null)
    
    @scala.inline
    def setOfferShiftRequestsEnabledUndefined: Self = StObject.set(x, "offerShiftRequestsEnabled", js.undefined)
    
    @scala.inline
    def setOfferShiftRequestsNull: Self = StObject.set(x, "offerShiftRequests", null)
    
    @scala.inline
    def setOfferShiftRequestsUndefined: Self = StObject.set(x, "offerShiftRequests", js.undefined)
    
    @scala.inline
    def setOfferShiftRequestsVarargs(value: OfferShiftRequest*): Self = StObject.set(x, "offerShiftRequests", js.Array(value :_*))
    
    @scala.inline
    def setOpenShiftChangeRequests(value: NullableOption[js.Array[OpenShiftChangeRequest]]): Self = StObject.set(x, "openShiftChangeRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenShiftChangeRequestsNull: Self = StObject.set(x, "openShiftChangeRequests", null)
    
    @scala.inline
    def setOpenShiftChangeRequestsUndefined: Self = StObject.set(x, "openShiftChangeRequests", js.undefined)
    
    @scala.inline
    def setOpenShiftChangeRequestsVarargs(value: OpenShiftChangeRequest*): Self = StObject.set(x, "openShiftChangeRequests", js.Array(value :_*))
    
    @scala.inline
    def setOpenShifts(value: NullableOption[js.Array[OpenShift]]): Self = StObject.set(x, "openShifts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenShiftsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "openShiftsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenShiftsEnabledNull: Self = StObject.set(x, "openShiftsEnabled", null)
    
    @scala.inline
    def setOpenShiftsEnabledUndefined: Self = StObject.set(x, "openShiftsEnabled", js.undefined)
    
    @scala.inline
    def setOpenShiftsNull: Self = StObject.set(x, "openShifts", null)
    
    @scala.inline
    def setOpenShiftsUndefined: Self = StObject.set(x, "openShifts", js.undefined)
    
    @scala.inline
    def setOpenShiftsVarargs(value: OpenShift*): Self = StObject.set(x, "openShifts", js.Array(value :_*))
    
    @scala.inline
    def setProvisionStatus(value: NullableOption[OperationStatus]): Self = StObject.set(x, "provisionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionStatusCode(value: NullableOption[String]): Self = StObject.set(x, "provisionStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionStatusCodeNull: Self = StObject.set(x, "provisionStatusCode", null)
    
    @scala.inline
    def setProvisionStatusCodeUndefined: Self = StObject.set(x, "provisionStatusCode", js.undefined)
    
    @scala.inline
    def setProvisionStatusNull: Self = StObject.set(x, "provisionStatus", null)
    
    @scala.inline
    def setProvisionStatusUndefined: Self = StObject.set(x, "provisionStatus", js.undefined)
    
    @scala.inline
    def setSchedulingGroups(value: NullableOption[js.Array[SchedulingGroup]]): Self = StObject.set(x, "schedulingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulingGroupsNull: Self = StObject.set(x, "schedulingGroups", null)
    
    @scala.inline
    def setSchedulingGroupsUndefined: Self = StObject.set(x, "schedulingGroups", js.undefined)
    
    @scala.inline
    def setSchedulingGroupsVarargs(value: SchedulingGroup*): Self = StObject.set(x, "schedulingGroups", js.Array(value :_*))
    
    @scala.inline
    def setShifts(value: NullableOption[js.Array[Shift]]): Self = StObject.set(x, "shifts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftsNull: Self = StObject.set(x, "shifts", null)
    
    @scala.inline
    def setShiftsUndefined: Self = StObject.set(x, "shifts", js.undefined)
    
    @scala.inline
    def setShiftsVarargs(value: Shift*): Self = StObject.set(x, "shifts", js.Array(value :_*))
    
    @scala.inline
    def setSwapShiftsChangeRequests(value: NullableOption[js.Array[SwapShiftsChangeRequest]]): Self = StObject.set(x, "swapShiftsChangeRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapShiftsChangeRequestsNull: Self = StObject.set(x, "swapShiftsChangeRequests", null)
    
    @scala.inline
    def setSwapShiftsChangeRequestsUndefined: Self = StObject.set(x, "swapShiftsChangeRequests", js.undefined)
    
    @scala.inline
    def setSwapShiftsChangeRequestsVarargs(value: SwapShiftsChangeRequest*): Self = StObject.set(x, "swapShiftsChangeRequests", js.Array(value :_*))
    
    @scala.inline
    def setSwapShiftsRequestsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "swapShiftsRequestsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapShiftsRequestsEnabledNull: Self = StObject.set(x, "swapShiftsRequestsEnabled", null)
    
    @scala.inline
    def setSwapShiftsRequestsEnabledUndefined: Self = StObject.set(x, "swapShiftsRequestsEnabled", js.undefined)
    
    @scala.inline
    def setTimeClockEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "timeClockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeClockEnabledNull: Self = StObject.set(x, "timeClockEnabled", null)
    
    @scala.inline
    def setTimeClockEnabledUndefined: Self = StObject.set(x, "timeClockEnabled", js.undefined)
    
    @scala.inline
    def setTimeOffReasons(value: NullableOption[js.Array[TimeOffReason]]): Self = StObject.set(x, "timeOffReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffReasonsNull: Self = StObject.set(x, "timeOffReasons", null)
    
    @scala.inline
    def setTimeOffReasonsUndefined: Self = StObject.set(x, "timeOffReasons", js.undefined)
    
    @scala.inline
    def setTimeOffReasonsVarargs(value: TimeOffReason*): Self = StObject.set(x, "timeOffReasons", js.Array(value :_*))
    
    @scala.inline
    def setTimeOffRequests(value: NullableOption[js.Array[TimeOffRequest]]): Self = StObject.set(x, "timeOffRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffRequestsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "timeOffRequestsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffRequestsEnabledNull: Self = StObject.set(x, "timeOffRequestsEnabled", null)
    
    @scala.inline
    def setTimeOffRequestsEnabledUndefined: Self = StObject.set(x, "timeOffRequestsEnabled", js.undefined)
    
    @scala.inline
    def setTimeOffRequestsNull: Self = StObject.set(x, "timeOffRequests", null)
    
    @scala.inline
    def setTimeOffRequestsUndefined: Self = StObject.set(x, "timeOffRequests", js.undefined)
    
    @scala.inline
    def setTimeOffRequestsVarargs(value: TimeOffRequest*): Self = StObject.set(x, "timeOffRequests", js.Array(value :_*))
    
    @scala.inline
    def setTimeZone(value: NullableOption[String]): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setTimesOff(value: NullableOption[js.Array[TimeOff]]): Self = StObject.set(x, "timesOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesOffNull: Self = StObject.set(x, "timesOff", null)
    
    @scala.inline
    def setTimesOffUndefined: Self = StObject.set(x, "timesOff", js.undefined)
    
    @scala.inline
    def setTimesOffVarargs(value: TimeOff*): Self = StObject.set(x, "timesOff", js.Array(value :_*))
    
    @scala.inline
    def setWorkforceIntegrationIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "workforceIntegrationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkforceIntegrationIdsNull: Self = StObject.set(x, "workforceIntegrationIds", null)
    
    @scala.inline
    def setWorkforceIntegrationIdsUndefined: Self = StObject.set(x, "workforceIntegrationIds", js.undefined)
    
    @scala.inline
    def setWorkforceIntegrationIdsVarargs(value: String*): Self = StObject.set(x, "workforceIntegrationIds", js.Array(value :_*))
  }
}
