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
  
  inline def apply(): GooglePrivacyDlpV2StoredInfoTypeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StoredInfoTypeConfig]
  }
  
  extension [Self <: GooglePrivacyDlpV2StoredInfoTypeConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDictionary(value: GooglePrivacyDlpV2Dictionary): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    inline def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLargeCustomDictionary(value: GooglePrivacyDlpV2LargeCustomDictionaryConfig): Self = StObject.set(x, "largeCustomDictionary", value.asInstanceOf[js.Any])
    
    inline def setLargeCustomDictionaryUndefined: Self = StObject.set(x, "largeCustomDictionary", js.undefined)
    
    inline def setRegex(value: GooglePrivacyDlpV2Regex): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
