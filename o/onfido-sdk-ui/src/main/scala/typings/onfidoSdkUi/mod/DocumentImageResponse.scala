package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentImageResponse
  extends StObject
     with UploadFileResponse {
  
  var applicant_id: String
  
  var issuing_country: js.UndefOr[String | Null] = js.undefined
  
  var sdk_warnings: js.UndefOr[ImageQualityWarnings] = js.undefined
  
  var side: DocumentSides
  
  var `type`: DocumentTypes | PoaTypes
}
object DocumentImageResponse {
  
  inline def apply(
    applicant_id: String,
    created_at: String,
    download_href: String,
    file_name: String,
    file_size: Double,
    file_type: String,
    href: String,
    id: String,
    side: DocumentSides,
    `type`: DocumentTypes | PoaTypes
  ): DocumentImageResponse = {
    val __obj = js.Dynamic.literal(applicant_id = applicant_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], download_href = download_href.asInstanceOf[js.Any], file_name = file_name.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any], file_type = file_type.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentImageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentImageResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicant_id(value: String): Self = StObject.set(x, "applicant_id", value.asInstanceOf[js.Any])
    
    inline def setIssuing_country(value: String): Self = StObject.set(x, "issuing_country", value.asInstanceOf[js.Any])
    
    inline def setIssuing_countryNull: Self = StObject.set(x, "issuing_country", null)
    
    inline def setIssuing_countryUndefined: Self = StObject.set(x, "issuing_country", js.undefined)
    
    inline def setSdk_warnings(value: ImageQualityWarnings): Self = StObject.set(x, "sdk_warnings", value.asInstanceOf[js.Any])
    
    inline def setSdk_warningsUndefined: Self = StObject.set(x, "sdk_warnings", js.undefined)
    
    inline def setSide(value: DocumentSides): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setType(value: DocumentTypes | PoaTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
