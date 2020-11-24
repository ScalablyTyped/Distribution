package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2LargeCustomDictionaryStats extends js.Object {
  
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
  implicit class GooglePrivacyDlpV2LargeCustomDictionaryStatsOps[Self <: GooglePrivacyDlpV2LargeCustomDictionaryStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApproxNumPhrases(value: String): Self = this.set("approxNumPhrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproxNumPhrases: Self = this.set("approxNumPhrases", js.undefined)
  }
}
