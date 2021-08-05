package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2CloudStorageFileSet extends StObject {
  
  /** The url, in the format `gs:///`. Trailing wildcard in the path is allowed. */
  var url: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2CloudStorageFileSet {
  
  inline def apply(): GooglePrivacyDlpV2CloudStorageFileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CloudStorageFileSet]
  }
  
  extension [Self <: GooglePrivacyDlpV2CloudStorageFileSet](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
