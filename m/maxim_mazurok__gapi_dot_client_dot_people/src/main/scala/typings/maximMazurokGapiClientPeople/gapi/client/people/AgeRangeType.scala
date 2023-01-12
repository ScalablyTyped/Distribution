package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgeRangeType extends StObject {
  
  /** The age range. */
  var ageRange: js.UndefOr[String] = js.undefined
  
  /** Metadata about the age range. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
}
object AgeRangeType {
  
  inline def apply(): AgeRangeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgeRangeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgeRangeType] (val x: Self) extends AnyVal {
    
    inline def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
