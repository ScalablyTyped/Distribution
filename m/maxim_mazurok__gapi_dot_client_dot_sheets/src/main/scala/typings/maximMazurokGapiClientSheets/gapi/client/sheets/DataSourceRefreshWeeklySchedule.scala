package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceRefreshWeeklySchedule extends js.Object {
  
  /** Days of the week to refresh. At least one day must be specified. */
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.native
  
  /** The start time of a time interval in which a data source refresh is scheduled. Only `hours` part is used. The time interval size defaults to that in the Sheets editor. */
  var startTime: js.UndefOr[TimeOfDay] = js.native
}
object DataSourceRefreshWeeklySchedule {
  
  @scala.inline
  def apply(): DataSourceRefreshWeeklySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRefreshWeeklySchedule]
  }
  
  @scala.inline
  implicit class DataSourceRefreshWeeklyScheduleOps[Self <: DataSourceRefreshWeeklySchedule] (val x: Self) extends AnyVal {
    
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
    def setDaysOfWeekVarargs(value: String*): Self = this.set("daysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeek(value: js.Array[String]): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfWeek: Self = this.set("daysOfWeek", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimeOfDay): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
