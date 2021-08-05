package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schedule
  extends StObject
     with Entity {
  
  // Indicates whether the schedule is enabled for the team. Required.
  var enabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var offerShiftRequests: js.UndefOr[NullableOption[js.Array[OfferShiftRequest]]] = js.undefined
  
  // Indicates whether offer shift requests are enabled for the schedule.
  var offerShiftRequestsEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var openShiftChangeRequests: js.UndefOr[NullableOption[js.Array[OpenShiftChangeRequest]]] = js.undefined
  
  var openShifts: js.UndefOr[NullableOption[js.Array[OpenShift]]] = js.undefined
  
  // Indicates whether open shifts are enabled for the schedule.
  var openShiftsEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The status of the schedule provisioning. The possible values are notStarted, running, completed, failed.
  var provisionStatus: js.UndefOr[NullableOption[OperationStatus]] = js.undefined
  
  // Additional information about why schedule provisioning failed.
  var provisionStatusCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The logical grouping of users in the schedule (usually by role).
  var schedulingGroups: js.UndefOr[NullableOption[js.Array[SchedulingGroup]]] = js.undefined
  
  // The shifts in the schedule.
  var shifts: js.UndefOr[NullableOption[js.Array[Shift]]] = js.undefined
  
  var swapShiftsChangeRequests: js.UndefOr[NullableOption[js.Array[SwapShiftsChangeRequest]]] = js.undefined
  
  // Indicates whether swap shifts requests are enabled for the schedule.
  var swapShiftsRequestsEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether time clock is enabled for the schedule.
  var timeClockEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The set of reasons for a time off in the schedule.
  var timeOffReasons: js.UndefOr[NullableOption[js.Array[TimeOffReason]]] = js.undefined
  
  var timeOffRequests: js.UndefOr[NullableOption[js.Array[TimeOffRequest]]] = js.undefined
  
  // Indicates whether time off requests are enabled for the schedule.
  var timeOffRequestsEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates the time zone of the schedule team using tz database format. Required.
  var timeZone: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The instances of times off in the schedule.
  var timesOff: js.UndefOr[NullableOption[js.Array[TimeOff]]] = js.undefined
  
  var workforceIntegrationIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object Schedule {
  
  inline def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  
  extension [Self <: Schedule](x: Self) {
    
    inline def setEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOfferShiftRequests(value: NullableOption[js.Array[OfferShiftRequest]]): Self = StObject.set(x, "offerShiftRequests", value.asInstanceOf[js.Any])
    
    inline def setOfferShiftRequestsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "offerShiftRequestsEnabled", value.asInstanceOf[js.Any])
    
    inline def setOfferShiftRequestsEnabledNull: Self = StObject.set(x, "offerShiftRequestsEnabled", null)
    
    inline def setOfferShiftRequestsEnabledUndefined: Self = StObject.set(x, "offerShiftRequestsEnabled", js.undefined)
    
    inline def setOfferShiftRequestsNull: Self = StObject.set(x, "offerShiftRequests", null)
    
    inline def setOfferShiftRequestsUndefined: Self = StObject.set(x, "offerShiftRequests", js.undefined)
    
    inline def setOfferShiftRequestsVarargs(value: OfferShiftRequest*): Self = StObject.set(x, "offerShiftRequests", js.Array(value :_*))
    
    inline def setOpenShiftChangeRequests(value: NullableOption[js.Array[OpenShiftChangeRequest]]): Self = StObject.set(x, "openShiftChangeRequests", value.asInstanceOf[js.Any])
    
    inline def setOpenShiftChangeRequestsNull: Self = StObject.set(x, "openShiftChangeRequests", null)
    
    inline def setOpenShiftChangeRequestsUndefined: Self = StObject.set(x, "openShiftChangeRequests", js.undefined)
    
    inline def setOpenShiftChangeRequestsVarargs(value: OpenShiftChangeRequest*): Self = StObject.set(x, "openShiftChangeRequests", js.Array(value :_*))
    
    inline def setOpenShifts(value: NullableOption[js.Array[OpenShift]]): Self = StObject.set(x, "openShifts", value.asInstanceOf[js.Any])
    
    inline def setOpenShiftsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "openShiftsEnabled", value.asInstanceOf[js.Any])
    
    inline def setOpenShiftsEnabledNull: Self = StObject.set(x, "openShiftsEnabled", null)
    
    inline def setOpenShiftsEnabledUndefined: Self = StObject.set(x, "openShiftsEnabled", js.undefined)
    
    inline def setOpenShiftsNull: Self = StObject.set(x, "openShifts", null)
    
    inline def setOpenShiftsUndefined: Self = StObject.set(x, "openShifts", js.undefined)
    
    inline def setOpenShiftsVarargs(value: OpenShift*): Self = StObject.set(x, "openShifts", js.Array(value :_*))
    
    inline def setProvisionStatus(value: NullableOption[OperationStatus]): Self = StObject.set(x, "provisionStatus", value.asInstanceOf[js.Any])
    
    inline def setProvisionStatusCode(value: NullableOption[String]): Self = StObject.set(x, "provisionStatusCode", value.asInstanceOf[js.Any])
    
    inline def setProvisionStatusCodeNull: Self = StObject.set(x, "provisionStatusCode", null)
    
    inline def setProvisionStatusCodeUndefined: Self = StObject.set(x, "provisionStatusCode", js.undefined)
    
    inline def setProvisionStatusNull: Self = StObject.set(x, "provisionStatus", null)
    
    inline def setProvisionStatusUndefined: Self = StObject.set(x, "provisionStatus", js.undefined)
    
    inline def setSchedulingGroups(value: NullableOption[js.Array[SchedulingGroup]]): Self = StObject.set(x, "schedulingGroups", value.asInstanceOf[js.Any])
    
    inline def setSchedulingGroupsNull: Self = StObject.set(x, "schedulingGroups", null)
    
    inline def setSchedulingGroupsUndefined: Self = StObject.set(x, "schedulingGroups", js.undefined)
    
    inline def setSchedulingGroupsVarargs(value: SchedulingGroup*): Self = StObject.set(x, "schedulingGroups", js.Array(value :_*))
    
    inline def setShifts(value: NullableOption[js.Array[Shift]]): Self = StObject.set(x, "shifts", value.asInstanceOf[js.Any])
    
    inline def setShiftsNull: Self = StObject.set(x, "shifts", null)
    
    inline def setShiftsUndefined: Self = StObject.set(x, "shifts", js.undefined)
    
    inline def setShiftsVarargs(value: Shift*): Self = StObject.set(x, "shifts", js.Array(value :_*))
    
    inline def setSwapShiftsChangeRequests(value: NullableOption[js.Array[SwapShiftsChangeRequest]]): Self = StObject.set(x, "swapShiftsChangeRequests", value.asInstanceOf[js.Any])
    
    inline def setSwapShiftsChangeRequestsNull: Self = StObject.set(x, "swapShiftsChangeRequests", null)
    
    inline def setSwapShiftsChangeRequestsUndefined: Self = StObject.set(x, "swapShiftsChangeRequests", js.undefined)
    
    inline def setSwapShiftsChangeRequestsVarargs(value: SwapShiftsChangeRequest*): Self = StObject.set(x, "swapShiftsChangeRequests", js.Array(value :_*))
    
    inline def setSwapShiftsRequestsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "swapShiftsRequestsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSwapShiftsRequestsEnabledNull: Self = StObject.set(x, "swapShiftsRequestsEnabled", null)
    
    inline def setSwapShiftsRequestsEnabledUndefined: Self = StObject.set(x, "swapShiftsRequestsEnabled", js.undefined)
    
    inline def setTimeClockEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "timeClockEnabled", value.asInstanceOf[js.Any])
    
    inline def setTimeClockEnabledNull: Self = StObject.set(x, "timeClockEnabled", null)
    
    inline def setTimeClockEnabledUndefined: Self = StObject.set(x, "timeClockEnabled", js.undefined)
    
    inline def setTimeOffReasons(value: NullableOption[js.Array[TimeOffReason]]): Self = StObject.set(x, "timeOffReasons", value.asInstanceOf[js.Any])
    
    inline def setTimeOffReasonsNull: Self = StObject.set(x, "timeOffReasons", null)
    
    inline def setTimeOffReasonsUndefined: Self = StObject.set(x, "timeOffReasons", js.undefined)
    
    inline def setTimeOffReasonsVarargs(value: TimeOffReason*): Self = StObject.set(x, "timeOffReasons", js.Array(value :_*))
    
    inline def setTimeOffRequests(value: NullableOption[js.Array[TimeOffRequest]]): Self = StObject.set(x, "timeOffRequests", value.asInstanceOf[js.Any])
    
    inline def setTimeOffRequestsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "timeOffRequestsEnabled", value.asInstanceOf[js.Any])
    
    inline def setTimeOffRequestsEnabledNull: Self = StObject.set(x, "timeOffRequestsEnabled", null)
    
    inline def setTimeOffRequestsEnabledUndefined: Self = StObject.set(x, "timeOffRequestsEnabled", js.undefined)
    
    inline def setTimeOffRequestsNull: Self = StObject.set(x, "timeOffRequests", null)
    
    inline def setTimeOffRequestsUndefined: Self = StObject.set(x, "timeOffRequests", js.undefined)
    
    inline def setTimeOffRequestsVarargs(value: TimeOffRequest*): Self = StObject.set(x, "timeOffRequests", js.Array(value :_*))
    
    inline def setTimeZone(value: NullableOption[String]): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setTimesOff(value: NullableOption[js.Array[TimeOff]]): Self = StObject.set(x, "timesOff", value.asInstanceOf[js.Any])
    
    inline def setTimesOffNull: Self = StObject.set(x, "timesOff", null)
    
    inline def setTimesOffUndefined: Self = StObject.set(x, "timesOff", js.undefined)
    
    inline def setTimesOffVarargs(value: TimeOff*): Self = StObject.set(x, "timesOff", js.Array(value :_*))
    
    inline def setWorkforceIntegrationIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "workforceIntegrationIds", value.asInstanceOf[js.Any])
    
    inline def setWorkforceIntegrationIdsNull: Self = StObject.set(x, "workforceIntegrationIds", null)
    
    inline def setWorkforceIntegrationIdsUndefined: Self = StObject.set(x, "workforceIntegrationIds", js.undefined)
    
    inline def setWorkforceIntegrationIdsVarargs(value: String*): Self = StObject.set(x, "workforceIntegrationIds", js.Array(value :_*))
  }
}
