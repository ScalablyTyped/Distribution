package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FhirConfig extends js.Object {
  
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
  implicit class FhirConfigOps[Self <: FhirConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldMetadataListVarargs(value: FieldMetadata*): Self = this.set("fieldMetadataList", js.Array(value :_*))
    
    @scala.inline
    def setFieldMetadataList(value: js.Array[FieldMetadata]): Self = this.set("fieldMetadataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldMetadataList: Self = this.set("fieldMetadataList", js.undefined)
  }
}
