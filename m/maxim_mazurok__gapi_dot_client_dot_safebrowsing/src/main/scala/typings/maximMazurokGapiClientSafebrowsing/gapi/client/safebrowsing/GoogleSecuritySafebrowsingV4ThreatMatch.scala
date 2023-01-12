package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4ThreatMatch extends StObject {
  
  /** The cache lifetime for the returned match. Clients must not cache this response for more than this duration to avoid false positives. */
  var cacheDuration: js.UndefOr[String] = js.undefined
  
  /** The platform type matching this threat. */
  var platformType: js.UndefOr[String] = js.undefined
  
  /** The threat matching this threat. */
  var threat: js.UndefOr[GoogleSecuritySafebrowsingV4ThreatEntry] = js.undefined
  
  /** Optional metadata associated with this threat. */
  var threatEntryMetadata: js.UndefOr[GoogleSecuritySafebrowsingV4ThreatEntryMetadata] = js.undefined
  
  /** The threat entry type matching this threat. */
  var threatEntryType: js.UndefOr[String] = js.undefined
  
  /** The threat type matching this threat. */
  var threatType: js.UndefOr[String] = js.undefined
}
object GoogleSecuritySafebrowsingV4ThreatMatch {
  
  inline def apply(): GoogleSecuritySafebrowsingV4ThreatMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4ThreatMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleSecuritySafebrowsingV4ThreatMatch] (val x: Self) extends AnyVal {
    
    inline def setCacheDuration(value: String): Self = StObject.set(x, "cacheDuration", value.asInstanceOf[js.Any])
    
    inline def setCacheDurationUndefined: Self = StObject.set(x, "cacheDuration", js.undefined)
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setThreat(value: GoogleSecuritySafebrowsingV4ThreatEntry): Self = StObject.set(x, "threat", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryMetadata(value: GoogleSecuritySafebrowsingV4ThreatEntryMetadata): Self = StObject.set(x, "threatEntryMetadata", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryMetadataUndefined: Self = StObject.set(x, "threatEntryMetadata", js.undefined)
    
    inline def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
    
    inline def setThreatUndefined: Self = StObject.set(x, "threat", js.undefined)
  }
}
