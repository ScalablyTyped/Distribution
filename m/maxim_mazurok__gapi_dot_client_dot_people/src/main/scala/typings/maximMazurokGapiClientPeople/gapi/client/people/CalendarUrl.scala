package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarUrl extends StObject {
  
  /** Output only. The type of the calendar URL translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale. */
  var formattedType: js.UndefOr[String] = js.undefined
  
  /** Metadata about the calendar URL. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The type of the calendar URL. The type can be custom or one of these predefined values: * `home` * `freeBusy` * `work` */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The calendar URL. */
  var url: js.UndefOr[String] = js.undefined
}
object CalendarUrl {
  
  inline def apply(): CalendarUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarUrl]
  }
  
  extension [Self <: CalendarUrl](x: Self) {
    
    inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
