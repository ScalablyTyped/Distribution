package typings.maximMazurokGapiClientFile.gapi.client.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DenyMaintenancePeriod extends js.Object {
  
  /**
    * Deny period end date. This can be: * A full date, with non-zero year, month and day values. * A month and day value, with a zero year. Allows recurring deny periods each year. Date
    * matching this period will have to be before the end.
    */
  var endDate: js.UndefOr[Date] = js.native
  
  /**
    * Deny period start date. This can be: * A full date, with non-zero year, month and day values. * A month and day value, with a zero year. Allows recurring deny periods each year.
    * Date matching this period will have to be the same or after the start.
    */
  var startDate: js.UndefOr[Date] = js.native
  
  /** Time in UTC when the Blackout period starts on start_date and ends on end_date. This can be: * Full time. * All zeros for 00:00:00 UTC */
  var time: js.UndefOr[TimeOfDay] = js.native
}
object DenyMaintenancePeriod {
  
  @scala.inline
  def apply(): DenyMaintenancePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DenyMaintenancePeriod]
  }
  
  @scala.inline
  implicit class DenyMaintenancePeriodOps[Self <: DenyMaintenancePeriod] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setTime(value: TimeOfDay): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
