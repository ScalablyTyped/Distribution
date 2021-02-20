package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DenyMaintenancePeriod extends StObject {
  
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
  implicit class DenyMaintenancePeriodMutableBuilder[Self <: DenyMaintenancePeriod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setTime(value: TimeOfDay): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
