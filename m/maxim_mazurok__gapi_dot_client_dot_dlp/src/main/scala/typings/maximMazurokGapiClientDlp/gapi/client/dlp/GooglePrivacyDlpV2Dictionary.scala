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
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Dictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Dictionary]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DictionaryMutableBuilder[Self <: GooglePrivacyDlpV2Dictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudStoragePath(value: GooglePrivacyDlpV2CloudStoragePath): Self = StObject.set(x, "cloudStoragePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudStoragePathUndefined: Self = StObject.set(x, "cloudStoragePath", js.undefined)
    
    @scala.inline
    def setWordList(value: GooglePrivacyDlpV2WordList): Self = StObject.set(x, "wordList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordListUndefined: Self = StObject.set(x, "wordList", js.undefined)
  }
}
