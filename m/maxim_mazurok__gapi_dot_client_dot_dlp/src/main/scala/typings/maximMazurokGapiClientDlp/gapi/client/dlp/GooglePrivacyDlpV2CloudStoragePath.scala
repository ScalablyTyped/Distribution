package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CloudStoragePath extends StObject {
  
  /** A url representing a file or path (no wildcards) in Cloud Storage. Example: gs://[BUCKET_NAME]/dictionary.txt */
  var path: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2CloudStoragePath {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CloudStoragePath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CloudStoragePath]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CloudStoragePathMutableBuilder[Self <: GooglePrivacyDlpV2CloudStoragePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
