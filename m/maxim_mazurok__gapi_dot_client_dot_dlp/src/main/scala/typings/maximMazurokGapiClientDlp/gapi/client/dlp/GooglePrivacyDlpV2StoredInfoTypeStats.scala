package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2StoredInfoTypeStats extends js.Object {
  
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
  implicit class GooglePrivacyDlpV2StoredInfoTypeStatsOps[Self <: GooglePrivacyDlpV2StoredInfoTypeStats] (val x: Self) extends AnyVal {
    
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
    def setLargeCustomDictionary(value: GooglePrivacyDlpV2LargeCustomDictionaryStats): Self = this.set("largeCustomDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeCustomDictionary: Self = this.set("largeCustomDictionary", js.undefined)
  }
}
