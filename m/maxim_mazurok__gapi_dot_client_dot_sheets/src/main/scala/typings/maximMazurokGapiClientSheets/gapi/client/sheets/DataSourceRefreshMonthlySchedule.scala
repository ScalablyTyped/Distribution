package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceRefreshMonthlySchedule extends StObject {
  
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
  implicit class DataSourceRefreshMonthlyScheduleMutableBuilder[Self <: DataSourceRefreshMonthlySchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysOfMonth(value: js.Array[Double]): Self = StObject.set(x, "daysOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfMonthUndefined: Self = StObject.set(x, "daysOfMonth", js.undefined)
    
    @scala.inline
    def setDaysOfMonthVarargs(value: Double*): Self = StObject.set(x, "daysOfMonth", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: TimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
