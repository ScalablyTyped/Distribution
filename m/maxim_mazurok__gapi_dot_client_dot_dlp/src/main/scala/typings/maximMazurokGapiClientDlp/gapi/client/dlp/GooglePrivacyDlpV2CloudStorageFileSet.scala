package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2CloudStorageFileSet extends StObject {
  
  /** The url, in the format `gs:///`. Trailing wildcard in the path is allowed. */
  var url: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2CloudStorageFileSet {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CloudStorageFileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CloudStorageFileSet]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CloudStorageFileSetMutableBuilder[Self <: GooglePrivacyDlpV2CloudStorageFileSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
