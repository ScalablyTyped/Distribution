package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4ThreatHit extends StObject {
  
  /** Client-reported identification. */
  var clientInfo: js.UndefOr[GoogleSecuritySafebrowsingV4ClientInfo] = js.undefined
  
  /** The threat entry responsible for the hit. Full hash should be reported for hash-based hits. */
  var entry: js.UndefOr[GoogleSecuritySafebrowsingV4ThreatEntry] = js.undefined
  
  /** The platform type reported. */
  var platformType: js.UndefOr[String] = js.undefined
  
  /** The resources related to the threat hit. */
  var resources: js.UndefOr[js.Array[GoogleSecuritySafebrowsingV4ThreatHitThreatSource]] = js.undefined
  
  /** The threat type reported. */
  var threatType: js.UndefOr[String] = js.undefined
  
  /** Details about the user that encountered the threat. */
  var userInfo: js.UndefOr[GoogleSecuritySafebrowsingV4ThreatHitUserInfo] = js.undefined
}
object GoogleSecuritySafebrowsingV4ThreatHit {
  
  inline def apply(): GoogleSecuritySafebrowsingV4ThreatHit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4ThreatHit]
  }
  
  extension [Self <: GoogleSecuritySafebrowsingV4ThreatHit](x: Self) {
    
    inline def setClientInfo(value: GoogleSecuritySafebrowsingV4ClientInfo): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
    
    inline def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
    
    inline def setEntry(value: GoogleSecuritySafebrowsingV4ThreatEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setResources(value: js.Array[GoogleSecuritySafebrowsingV4ThreatHitThreatSource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: GoogleSecuritySafebrowsingV4ThreatHitThreatSource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
    
    inline def setUserInfo(value: GoogleSecuritySafebrowsingV4ThreatHitUserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
