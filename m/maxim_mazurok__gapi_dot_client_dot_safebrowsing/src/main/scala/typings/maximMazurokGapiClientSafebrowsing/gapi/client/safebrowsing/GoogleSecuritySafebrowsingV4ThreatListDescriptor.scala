package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4ThreatListDescriptor extends StObject {
  
  /** The platform type targeted by the list's entries. */
  var platformType: js.UndefOr[String] = js.undefined
  
  /** The entry types contained in the list. */
  var threatEntryType: js.UndefOr[String] = js.undefined
  
  /** The threat type posed by the list's entries. */
  var threatType: js.UndefOr[String] = js.undefined
}
object GoogleSecuritySafebrowsingV4ThreatListDescriptor {
  
  inline def apply(): GoogleSecuritySafebrowsingV4ThreatListDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4ThreatListDescriptor]
  }
  
  extension [Self <: GoogleSecuritySafebrowsingV4ThreatListDescriptor](x: Self) {
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
  }
}
