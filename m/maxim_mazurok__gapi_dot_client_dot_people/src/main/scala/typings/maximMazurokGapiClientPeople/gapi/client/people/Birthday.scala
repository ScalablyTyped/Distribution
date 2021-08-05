package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Birthday extends StObject {
  
  /** The date of the birthday. */
  var date: js.UndefOr[Date] = js.undefined
  
  /** Metadata about the birthday. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** A free-form string representing the user's birthday. */
  var text: js.UndefOr[String] = js.undefined
}
object Birthday {
  
  inline def apply(): Birthday = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Birthday]
  }
  
  extension [Self <: Birthday](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
