package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2MetadataLocation extends StObject {
  
  /** Storage metadata. */
  var storageLabel: js.UndefOr[GooglePrivacyDlpV2StorageMetadataLabel] = js.native
  
  /** Type of metadata containing the finding. */
  var `type`: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2MetadataLocation {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2MetadataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2MetadataLocation]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2MetadataLocationMutableBuilder[Self <: GooglePrivacyDlpV2MetadataLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageLabel(value: GooglePrivacyDlpV2StorageMetadataLabel): Self = StObject.set(x, "storageLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLabelUndefined: Self = StObject.set(x, "storageLabel", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
