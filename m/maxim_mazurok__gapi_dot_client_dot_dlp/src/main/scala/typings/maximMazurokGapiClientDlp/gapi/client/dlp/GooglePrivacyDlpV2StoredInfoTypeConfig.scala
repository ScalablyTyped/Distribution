package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2StoredInfoTypeConfig extends js.Object {
  
  /** Description of the StoredInfoType (max 256 characters). */
  var description: js.UndefOr[String] = js.native
  
  /** Store dictionary-based CustomInfoType. */
  var dictionary: js.UndefOr[GooglePrivacyDlpV2Dictionary] = js.native
  
  /** Display name of the StoredInfoType (max 256 characters). */
  var displayName: js.UndefOr[String] = js.native
  
  /** StoredInfoType where findings are defined by a dictionary of phrases. */
  var largeCustomDictionary: js.UndefOr[GooglePrivacyDlpV2LargeCustomDictionaryConfig] = js.native
  
  /** Store regular expression-based StoredInfoType. */
  var regex: js.UndefOr[GooglePrivacyDlpV2Regex] = js.native
}
object GooglePrivacyDlpV2StoredInfoTypeConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2StoredInfoTypeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StoredInfoTypeConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2StoredInfoTypeConfigOps[Self <: GooglePrivacyDlpV2StoredInfoTypeConfig] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDictionary(value: GooglePrivacyDlpV2Dictionary): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionary: Self = this.set("dictionary", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLargeCustomDictionary(value: GooglePrivacyDlpV2LargeCustomDictionaryConfig): Self = this.set("largeCustomDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeCustomDictionary: Self = this.set("largeCustomDictionary", js.undefined)
    
    @scala.inline
    def setRegex(value: GooglePrivacyDlpV2Regex): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
  }
}
