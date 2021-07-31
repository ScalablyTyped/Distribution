package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2StoredInfoTypeConfig extends StObject {
  
  /** Description of the StoredInfoType (max 256 characters). */
  var description: js.UndefOr[String] = js.undefined
  
  /** Store dictionary-based CustomInfoType. */
  var dictionary: js.UndefOr[GooglePrivacyDlpV2Dictionary] = js.undefined
  
  /** Display name of the StoredInfoType (max 256 characters). */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** StoredInfoType where findings are defined by a dictionary of phrases. */
  var largeCustomDictionary: js.UndefOr[GooglePrivacyDlpV2LargeCustomDictionaryConfig] = js.undefined
  
  /** Store regular expression-based StoredInfoType. */
  var regex: js.UndefOr[GooglePrivacyDlpV2Regex] = js.undefined
}
object GooglePrivacyDlpV2StoredInfoTypeConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2StoredInfoTypeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StoredInfoTypeConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2StoredInfoTypeConfigMutableBuilder[Self <: GooglePrivacyDlpV2StoredInfoTypeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDictionary(value: GooglePrivacyDlpV2Dictionary): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLargeCustomDictionary(value: GooglePrivacyDlpV2LargeCustomDictionaryConfig): Self = StObject.set(x, "largeCustomDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeCustomDictionaryUndefined: Self = StObject.set(x, "largeCustomDictionary", js.undefined)
    
    @scala.inline
    def setRegex(value: GooglePrivacyDlpV2Regex): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
