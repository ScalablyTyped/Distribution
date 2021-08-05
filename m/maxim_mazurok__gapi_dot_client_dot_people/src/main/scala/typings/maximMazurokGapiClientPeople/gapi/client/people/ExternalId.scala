package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalId extends StObject {
  
  /** Output only. The type of the event translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale. */
  var formattedType: js.UndefOr[String] = js.undefined
  
  /** Metadata about the external ID. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The type of the external ID. The type can be custom or one of these predefined values: * `account` * `customer` * `loginId` * `network` * `organization` */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The value of the external ID. */
  var value: js.UndefOr[String] = js.undefined
}
object ExternalId {
  
  inline def apply(): ExternalId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalId]
  }
  
  extension [Self <: ExternalId](x: Self) {
    
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
