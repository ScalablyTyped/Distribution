package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipInterest extends StObject {
  
  /** Output only. The value of the relationship interest translated and formatted in the viewer's account locale or the locale specified in the Accept-Language HTTP header. */
  var formattedValue: js.UndefOr[String] = js.undefined
  
  /** Metadata about the relationship interest. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The kind of relationship the person is looking for. The value can be custom or one of these predefined values: * `friend` * `date` * `relationship` * `networking` */
  var value: js.UndefOr[String] = js.undefined
}
object RelationshipInterest {
  
  inline def apply(): RelationshipInterest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipInterest]
  }
  
  extension [Self <: RelationshipInterest](x: Self) {
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
