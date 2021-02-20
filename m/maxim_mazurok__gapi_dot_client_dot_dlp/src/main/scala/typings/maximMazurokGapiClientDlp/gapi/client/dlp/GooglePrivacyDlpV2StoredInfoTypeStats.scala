package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2StoredInfoTypeStats extends StObject {
  
  /** StoredInfoType where findings are defined by a dictionary of phrases. */
  var largeCustomDictionary: js.UndefOr[GooglePrivacyDlpV2LargeCustomDictionaryStats] = js.native
}
object GooglePrivacyDlpV2StoredInfoTypeStats {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2StoredInfoTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StoredInfoTypeStats]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2StoredInfoTypeStatsMutableBuilder[Self <: GooglePrivacyDlpV2StoredInfoTypeStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLargeCustomDictionary(value: GooglePrivacyDlpV2LargeCustomDictionaryStats): Self = StObject.set(x, "largeCustomDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeCustomDictionaryUndefined: Self = StObject.set(x, "largeCustomDictionary", js.undefined)
  }
}
