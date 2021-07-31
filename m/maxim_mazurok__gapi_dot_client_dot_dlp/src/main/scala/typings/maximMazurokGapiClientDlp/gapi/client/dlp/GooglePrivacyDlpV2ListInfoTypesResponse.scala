package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ListInfoTypesResponse extends StObject {
  
  /** Set of sensitive infoTypes. */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoTypeDescription]] = js.undefined
}
object GooglePrivacyDlpV2ListInfoTypesResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ListInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ListInfoTypesResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ListInfoTypesResponseMutableBuilder[Self <: GooglePrivacyDlpV2ListInfoTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoTypes(value: js.Array[GooglePrivacyDlpV2InfoTypeDescription]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    @scala.inline
    def setInfoTypesVarargs(value: GooglePrivacyDlpV2InfoTypeDescription*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
  }
}
