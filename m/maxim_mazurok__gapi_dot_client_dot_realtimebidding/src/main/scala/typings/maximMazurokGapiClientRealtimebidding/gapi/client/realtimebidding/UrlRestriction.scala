package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlRestriction extends StObject {
  
  /** End date (if specified) of the URL restriction. End date should be later than the start date for the date range to be valid. */
  var endDate: js.UndefOr[Date] = js.undefined
  
  /** The restriction type for the specified URL. */
  var restrictionType: js.UndefOr[String] = js.undefined
  
  /** Start date (if specified) of the URL restriction. */
  var startDate: js.UndefOr[Date] = js.undefined
  
  /** Required. The URL to use for applying the restriction on the user list. */
  var url: js.UndefOr[String] = js.undefined
}
object UrlRestriction {
  
  inline def apply(): UrlRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlRestriction]
  }
  
  extension [Self <: UrlRestriction](x: Self) {
    
    inline def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setRestrictionType(value: String): Self = StObject.set(x, "restrictionType", value.asInstanceOf[js.Any])
    
    inline def setRestrictionTypeUndefined: Self = StObject.set(x, "restrictionType", js.undefined)
    
    inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
