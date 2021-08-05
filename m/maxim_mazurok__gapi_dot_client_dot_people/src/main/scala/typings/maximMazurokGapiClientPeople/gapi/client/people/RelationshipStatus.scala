package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipStatus extends StObject {
  
  /** Output only. The value of the relationship status translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale. */
  var formattedValue: js.UndefOr[String] = js.undefined
  
  /** Metadata about the relationship status. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /**
    * The relationship status. The value can be custom or one of these predefined values: * `single` * `inARelationship` * `engaged` * `married` * `itsComplicated` * `openRelationship` *
    * `widowed` * `inDomesticPartnership` * `inCivilUnion`
    */
  var value: js.UndefOr[String] = js.undefined
}
object RelationshipStatus {
  
  inline def apply(): RelationshipStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipStatus]
  }
  
  extension [Self <: RelationshipStatus](x: Self) {
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
