package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndDate extends StObject {
  
  var `@type`: String
  
  var endDate: js.UndefOr[String] = js.undefined
  
  var isLiveBroadcast: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var startDate: js.UndefOr[String] = js.undefined
}
object EndDate {
  
  inline def apply(`@type`: String): EndDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDate]
  }
  
  extension [Self <: EndDate](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setIsLiveBroadcast(value: Boolean): Self = StObject.set(x, "isLiveBroadcast", value.asInstanceOf[js.Any])
    
    inline def setIsLiveBroadcastUndefined: Self = StObject.set(x, "isLiveBroadcast", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
