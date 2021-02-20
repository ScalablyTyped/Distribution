package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgeRangeType extends StObject {
  
  /** The age range. */
  var ageRange: js.UndefOr[String] = js.native
  
  /** Metadata about the age range. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
}
object AgeRangeType {
  
  @scala.inline
  def apply(): AgeRangeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgeRangeType]
  }
  
  @scala.inline
  implicit class AgeRangeTypeMutableBuilder[Self <: AgeRangeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
