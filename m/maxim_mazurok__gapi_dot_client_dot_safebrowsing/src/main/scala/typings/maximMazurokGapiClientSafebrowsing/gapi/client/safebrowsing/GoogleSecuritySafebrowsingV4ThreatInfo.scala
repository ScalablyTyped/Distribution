package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4ThreatInfo extends StObject {
  
  /** The platform types to be checked. */
  var platformTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The threat entries to be checked. */
  var threatEntries: js.UndefOr[js.Array[GoogleSecuritySafebrowsingV4ThreatEntry]] = js.undefined
  
  /** The entry types to be checked. */
  var threatEntryTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The threat types to be checked. */
  var threatTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleSecuritySafebrowsingV4ThreatInfo {
  
  inline def apply(): GoogleSecuritySafebrowsingV4ThreatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4ThreatInfo]
  }
  
  extension [Self <: GoogleSecuritySafebrowsingV4ThreatInfo](x: Self) {
    
    inline def setPlatformTypes(value: js.Array[String]): Self = StObject.set(x, "platformTypes", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypesUndefined: Self = StObject.set(x, "platformTypes", js.undefined)
    
    inline def setPlatformTypesVarargs(value: String*): Self = StObject.set(x, "platformTypes", js.Array(value*))
    
    inline def setThreatEntries(value: js.Array[GoogleSecuritySafebrowsingV4ThreatEntry]): Self = StObject.set(x, "threatEntries", value.asInstanceOf[js.Any])
    
    inline def setThreatEntriesUndefined: Self = StObject.set(x, "threatEntries", js.undefined)
    
    inline def setThreatEntriesVarargs(value: GoogleSecuritySafebrowsingV4ThreatEntry*): Self = StObject.set(x, "threatEntries", js.Array(value*))
    
    inline def setThreatEntryTypes(value: js.Array[String]): Self = StObject.set(x, "threatEntryTypes", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryTypesUndefined: Self = StObject.set(x, "threatEntryTypes", js.undefined)
    
    inline def setThreatEntryTypesVarargs(value: String*): Self = StObject.set(x, "threatEntryTypes", js.Array(value*))
    
    inline def setThreatTypes(value: js.Array[String]): Self = StObject.set(x, "threatTypes", value.asInstanceOf[js.Any])
    
    inline def setThreatTypesUndefined: Self = StObject.set(x, "threatTypes", js.undefined)
    
    inline def setThreatTypesVarargs(value: String*): Self = StObject.set(x, "threatTypes", js.Array(value*))
  }
}
