package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2LargeCustomDictionaryStats extends StObject {
  
  /** Approximate number of distinct phrases in the dictionary. */
  var approxNumPhrases: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2LargeCustomDictionaryStats {
  
  inline def apply(): GooglePrivacyDlpV2LargeCustomDictionaryStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LargeCustomDictionaryStats]
  }
  
  extension [Self <: GooglePrivacyDlpV2LargeCustomDictionaryStats](x: Self) {
    
    inline def setApproxNumPhrases(value: String): Self = StObject.set(x, "approxNumPhrases", value.asInstanceOf[js.Any])
    
    inline def setApproxNumPhrasesUndefined: Self = StObject.set(x, "approxNumPhrases", js.undefined)
  }
}
