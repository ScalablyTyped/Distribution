package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2LargeCustomDictionaryStats extends StObject {
  
  /** Approximate number of distinct phrases in the dictionary. */
  var approxNumPhrases: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2LargeCustomDictionaryStats {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2LargeCustomDictionaryStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LargeCustomDictionaryStats]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2LargeCustomDictionaryStatsMutableBuilder[Self <: GooglePrivacyDlpV2LargeCustomDictionaryStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproxNumPhrases(value: String): Self = StObject.set(x, "approxNumPhrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproxNumPhrasesUndefined: Self = StObject.set(x, "approxNumPhrases", js.undefined)
  }
}
