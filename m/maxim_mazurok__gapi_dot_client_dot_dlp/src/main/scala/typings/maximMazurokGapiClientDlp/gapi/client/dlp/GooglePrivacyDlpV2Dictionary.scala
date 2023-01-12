package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Dictionary extends StObject {
  
  /** Newline-delimited file of words in Cloud Storage. Only a single file is accepted. */
  var cloudStoragePath: js.UndefOr[GooglePrivacyDlpV2CloudStoragePath] = js.undefined
  
  /** List of words or phrases to search for. */
  var wordList: js.UndefOr[GooglePrivacyDlpV2WordList] = js.undefined
}
object GooglePrivacyDlpV2Dictionary {
  
  inline def apply(): GooglePrivacyDlpV2Dictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Dictionary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2Dictionary] (val x: Self) extends AnyVal {
    
    inline def setCloudStoragePath(value: GooglePrivacyDlpV2CloudStoragePath): Self = StObject.set(x, "cloudStoragePath", value.asInstanceOf[js.Any])
    
    inline def setCloudStoragePathUndefined: Self = StObject.set(x, "cloudStoragePath", js.undefined)
    
    inline def setWordList(value: GooglePrivacyDlpV2WordList): Self = StObject.set(x, "wordList", value.asInstanceOf[js.Any])
    
    inline def setWordListUndefined: Self = StObject.set(x, "wordList", js.undefined)
  }
}
