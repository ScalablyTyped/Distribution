package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceRefreshMonthlySchedule extends js.Object {
  
  /** Days of the month to refresh. Only 1-28 are supported, mapping to the 1st to the 28th day. At lesat one day must be specified. */
  var daysOfMonth: js.UndefOr[js.Array[Double]] = js.native
  
  /** The start time of a time interval in which a data source refresh is scheduled. Only `hours` part is used. The time interval size defaults to that in the Sheets editor. */
  var startTime: js.UndefOr[TimeOfDay] = js.native
}
object DataSourceRefreshMonthlySchedule {
  
  @scala.inline
  def apply(): DataSourceRefreshMonthlySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRefreshMonthlySchedule]
  }
  
  @scala.inline
  implicit class DataSourceRefreshMonthlyScheduleOps[Self <: DataSourceRefreshMonthlySchedule] (val x: Self) extends AnyVal {
    
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
    def setDaysOfMonthVarargs(value: Double*): Self = this.set("daysOfMonth", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfMonth(value: js.Array[Double]): Self = this.set("daysOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfMonth: Self = this.set("daysOfMonth", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimeOfDay): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
