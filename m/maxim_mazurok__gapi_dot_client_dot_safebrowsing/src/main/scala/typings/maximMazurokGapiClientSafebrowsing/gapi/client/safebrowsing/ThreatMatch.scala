package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatMatch extends StObject {
  
  /** The cache lifetime for the returned match. Clients must not cache this response for more than this duration to avoid false positives. */
  var cacheDuration: js.UndefOr[String] = js.native
  
  /** The platform type matching this threat. */
  var platformType: js.UndefOr[String] = js.native
  
  /** The threat matching this threat. */
  var threat: js.UndefOr[ThreatEntry] = js.native
  
  /** Optional metadata associated with this threat. */
  var threatEntryMetadata: js.UndefOr[ThreatEntryMetadata] = js.native
  
  /** The threat entry type matching this threat. */
  var threatEntryType: js.UndefOr[String] = js.native
  
  /** The threat type matching this threat. */
  var threatType: js.UndefOr[String] = js.native
}
object ThreatMatch {
  
  @scala.inline
  def apply(): ThreatMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatMatch]
  }
  
  @scala.inline
  implicit class ThreatMatchMutableBuilder[Self <: ThreatMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheDuration(value: String): Self = StObject.set(x, "cacheDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheDurationUndefined: Self = StObject.set(x, "cacheDuration", js.undefined)
    
    @scala.inline
    def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    @scala.inline
    def setThreat(value: ThreatEntry): Self = StObject.set(x, "threat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatEntryMetadata(value: ThreatEntryMetadata): Self = StObject.set(x, "threatEntryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatEntryMetadataUndefined: Self = StObject.set(x, "threatEntryMetadata", js.undefined)
    
    @scala.inline
    def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    @scala.inline
    def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
    
    @scala.inline
    def setThreatUndefined: Self = StObject.set(x, "threat", js.undefined)
  }
}
