package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceRefreshSchedule extends js.Object {
  
  /** Daily refresh schedule. */
  var dailySchedule: js.UndefOr[DataSourceRefreshDailySchedule] = js.native
  
  /** True if the refresh schedule is enabled, or false otherwise. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Monthly refresh schedule. */
  var monthlySchedule: js.UndefOr[DataSourceRefreshMonthlySchedule] = js.native
  
  /** Output only. The time interval of the next run. */
  var nextRun: js.UndefOr[Interval] = js.native
  
  /** The scope of the refresh. Must be ALL_DATA_SOURCES. */
  var refreshScope: js.UndefOr[String] = js.native
  
  /** Weekly refresh schedule. */
  var weeklySchedule: js.UndefOr[DataSourceRefreshWeeklySchedule] = js.native
}
object DataSourceRefreshSchedule {
  
  @scala.inline
  def apply(): DataSourceRefreshSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRefreshSchedule]
  }
  
  @scala.inline
  implicit class DataSourceRefreshScheduleOps[Self <: DataSourceRefreshSchedule] (val x: Self) extends AnyVal {
    
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
    def setDailySchedule(value: DataSourceRefreshDailySchedule): Self = this.set("dailySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDailySchedule: Self = this.set("dailySchedule", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setMonthlySchedule(value: DataSourceRefreshMonthlySchedule): Self = this.set("monthlySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthlySchedule: Self = this.set("monthlySchedule", js.undefined)
    
    @scala.inline
    def setNextRun(value: Interval): Self = this.set("nextRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextRun: Self = this.set("nextRun", js.undefined)
    
    @scala.inline
    def setRefreshScope(value: String): Self = this.set("refreshScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshScope: Self = this.set("refreshScope", js.undefined)
    
    @scala.inline
    def setWeeklySchedule(value: DataSourceRefreshWeeklySchedule): Self = this.set("weeklySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeklySchedule: Self = this.set("weeklySchedule", js.undefined)
  }
}
