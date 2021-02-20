package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends StObject {
  
  /**
    * The time in UTC that no further transfer operations are scheduled. Combined with schedule_end_date, `end_time_of_day` specifies the end date and time for starting new transfer
    * operations. This field must be greater than or equal to the timestamp corresponding to the combintation of schedule_start_date and start_time_of_day, and is subject to the
    * following: * If `end_time_of_day` is not set and `schedule_end_date` is set, then a default value of `23:59:59` is used for `end_time_of_day`. * If `end_time_of_day` is set and
    * `schedule_end_date` is not set, then INVALID_ARGUMENT is returned.
    */
  var endTimeOfDay: js.UndefOr[TimeOfDay] = js.native
  
  /** Interval between the start of each scheduled TransferOperation. If unspecified, the default value is 24 hours. This value may not be less than 1 hour. */
  var repeatInterval: js.UndefOr[String] = js.native
  
  /**
    * The last day a transfer runs. Date boundaries are determined relative to UTC time. A job will run once per 24 hours within the following guidelines: * If `schedule_end_date` and
    * schedule_start_date are the same and in the future relative to UTC, the transfer is executed only one time. * If `schedule_end_date` is later than `schedule_start_date` and
    * `schedule_end_date` is in the future relative to UTC, the job will run each day at start_time_of_day through `schedule_end_date`.
    */
  var scheduleEndDate: js.UndefOr[Date] = js.native
  
  /**
    * Required. The start date of a transfer. Date boundaries are determined relative to UTC time. If `schedule_start_date` and start_time_of_day are in the past relative to the job's
    * creation time, the transfer starts the day after you schedule the transfer request. **Note:** When starting jobs at or near midnight UTC it is possible that a job will start later
    * than expected. For example, if you send an outbound request on June 1 one millisecond prior to midnight UTC and the Storage Transfer Service server receives the request on June 2,
    * then it will create a TransferJob with `schedule_start_date` set to June 2 and a `start_time_of_day` set to midnight UTC. The first scheduled TransferOperation will take place on
    * June 3 at midnight UTC.
    */
  var scheduleStartDate: js.UndefOr[Date] = js.native
  
  /**
    * The time in UTC that a transfer job is scheduled to run. Transfers may start later than this time. If `start_time_of_day` is not specified: * One-time transfers run immediately. *
    * Recurring transfers run immediately, and each day at midnight UTC, through schedule_end_date. If `start_time_of_day` is specified: * One-time transfers run at the specified time. *
    * Recurring transfers run at the specified time each day, through `schedule_end_date`.
    */
  var startTimeOfDay: js.UndefOr[TimeOfDay] = js.native
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
    def setEndTimeOfDay(value: TimeOfDay): Self = StObject.set(x, "endTimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeOfDayUndefined: Self = StObject.set(x, "endTimeOfDay", js.undefined)
    
    @scala.inline
    def setRepeatInterval(value: String): Self = StObject.set(x, "repeatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatIntervalUndefined: Self = StObject.set(x, "repeatInterval", js.undefined)
    
    @scala.inline
    def setScheduleEndDate(value: Date): Self = StObject.set(x, "scheduleEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleEndDateUndefined: Self = StObject.set(x, "scheduleEndDate", js.undefined)
    
    @scala.inline
    def setScheduleStartDate(value: Date): Self = StObject.set(x, "scheduleStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleStartDateUndefined: Self = StObject.set(x, "scheduleStartDate", js.undefined)
    
    @scala.inline
    def setStartTimeOfDay(value: TimeOfDay): Self = StObject.set(x, "startTimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeOfDayUndefined: Self = StObject.set(x, "startTimeOfDay", js.undefined)
  }
}
