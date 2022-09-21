package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ReplaceDictionaryConfig extends StObject {
  
  /** A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries. */
  var wordList: js.UndefOr[GooglePrivacyDlpV2WordList] = js.undefined
}
object GooglePrivacyDlpV2ReplaceDictionaryConfig {
  
  inline def apply(): GooglePrivacyDlpV2ReplaceDictionaryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ReplaceDictionaryConfig]
  }
  
  extension [Self <: GooglePrivacyDlpV2ReplaceDictionaryConfig](x: Self) {
    
    inline def setWordList(value: GooglePrivacyDlpV2WordList): Self = StObject.set(x, "wordList", value.asInstanceOf[js.Any])
    
    inline def setWordListUndefined: Self = StObject.set(x, "wordList", js.undefined)
  }
}
