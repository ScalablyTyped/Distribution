package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2StorageMetadataLabel extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2StorageMetadataLabel {
  
  inline def apply(): GooglePrivacyDlpV2StorageMetadataLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StorageMetadataLabel]
  }
  
  extension [Self <: GooglePrivacyDlpV2StorageMetadataLabel](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
