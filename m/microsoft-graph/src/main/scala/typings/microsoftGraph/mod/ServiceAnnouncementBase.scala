package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAnnouncementBase
  extends StObject
     with Entity {
  
  // Additional details about service event. This property doesn't support filters.
  var details: js.UndefOr[NullableOption[js.Array[KeyValuePair]]] = js.undefined
  
  // The end time of the service event.
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The last modified time of the service event.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // The start time of the service event.
  var startDateTime: js.UndefOr[String] = js.undefined
  
  // The title of the service event.
  var title: js.UndefOr[String] = js.undefined
}
object ServiceAnnouncementBase {
  
  inline def apply(): ServiceAnnouncementBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAnnouncementBase]
  }
  
  extension [Self <: ServiceAnnouncementBase](x: Self) {
    
    inline def setDetails(value: NullableOption[js.Array[KeyValuePair]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: KeyValuePair*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
