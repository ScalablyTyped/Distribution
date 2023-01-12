package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ListStoredInfoTypesResponse extends StObject {
  
  /** If the next page is available then the next page token to be used in following ListStoredInfoTypes request. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest. */
  var storedInfoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2StoredInfoType]] = js.undefined
}
object GooglePrivacyDlpV2ListStoredInfoTypesResponse {
  
  inline def apply(): GooglePrivacyDlpV2ListStoredInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ListStoredInfoTypesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2ListStoredInfoTypesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setStoredInfoTypes(value: js.Array[GooglePrivacyDlpV2StoredInfoType]): Self = StObject.set(x, "storedInfoTypes", value.asInstanceOf[js.Any])
    
    inline def setStoredInfoTypesUndefined: Self = StObject.set(x, "storedInfoTypes", js.undefined)
    
    inline def setStoredInfoTypesVarargs(value: GooglePrivacyDlpV2StoredInfoType*): Self = StObject.set(x, "storedInfoTypes", js.Array(value*))
  }
}
