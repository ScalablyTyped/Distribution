package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FhirConfig extends StObject {
  
  /**
    * Specifies FHIR paths to match and how to transform them. Any field that is not matched by a FieldMetadata is passed through to the output dataset unmodified. All extensions are
    * removed in the output.
    */
  var fieldMetadataList: js.UndefOr[js.Array[FieldMetadata]] = js.native
}
object FhirConfig {
  
  @scala.inline
  def apply(): FhirConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FhirConfig]
  }
  
  @scala.inline
  implicit class FhirConfigMutableBuilder[Self <: FhirConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldMetadataList(value: js.Array[FieldMetadata]): Self = StObject.set(x, "fieldMetadataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMetadataListUndefined: Self = StObject.set(x, "fieldMetadataList", js.undefined)
    
    @scala.inline
    def setFieldMetadataListVarargs(value: FieldMetadata*): Self = StObject.set(x, "fieldMetadataList", js.Array(value :_*))
  }
}
