package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiscKeyword extends StObject {
  
  /** Output only. The type of the miscellaneous keyword translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale. */
  var formattedType: js.UndefOr[String] = js.undefined
  
  /** Metadata about the miscellaneous keyword. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The miscellaneous keyword type. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The value of the miscellaneous keyword. */
  var value: js.UndefOr[String] = js.undefined
}
object MiscKeyword {
  
  inline def apply(): MiscKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiscKeyword]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MiscKeyword] (val x: Self) extends AnyVal {
    
    inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
