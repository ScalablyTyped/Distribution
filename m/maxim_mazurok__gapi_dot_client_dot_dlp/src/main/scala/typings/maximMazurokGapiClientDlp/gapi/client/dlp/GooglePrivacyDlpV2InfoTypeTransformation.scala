package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2InfoTypeTransformation extends StObject {
  
  /** InfoTypes to apply the transformation to. An empty list will cause this transformation to apply to all findings that correspond to infoTypes that were requested in `InspectConfig`. */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoType]] = js.native
  
  /** Required. Primitive transformation to apply to the infoType. */
  var primitiveTransformation: js.UndefOr[GooglePrivacyDlpV2PrimitiveTransformation] = js.native
}
object GooglePrivacyDlpV2InfoTypeTransformation {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InfoTypeTransformation]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InfoTypeTransformationMutableBuilder[Self <: GooglePrivacyDlpV2InfoTypeTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoTypes(value: js.Array[GooglePrivacyDlpV2InfoType]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    @scala.inline
    def setInfoTypesVarargs(value: GooglePrivacyDlpV2InfoType*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
    
    @scala.inline
    def setPrimitiveTransformation(value: GooglePrivacyDlpV2PrimitiveTransformation): Self = StObject.set(x, "primitiveTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveTransformationUndefined: Self = StObject.set(x, "primitiveTransformation", js.undefined)
  }
}
