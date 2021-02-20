package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleTypeDate extends StObject {
  
  /** Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant. */
  var day: js.UndefOr[Double] = js.native
  
  /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
  var month: js.UndefOr[Double] = js.native
  
  /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
  var year: js.UndefOr[Double] = js.native
}
object GoogleTypeDate {
  
  @scala.inline
  def apply(): GoogleTypeDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleTypeDate]
  }
  
  @scala.inline
  implicit class GoogleTypeDateMutableBuilder[Self <: GoogleTypeDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
