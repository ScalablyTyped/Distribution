package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4ThreatHitThreatSource extends StObject {
  
  /** Referrer of the resource. Only set if the referrer is available. */
  var referrer: js.UndefOr[String] = js.undefined
  
  /** The remote IP of the resource in ASCII format. Either IPv4 or IPv6. */
  var remoteIp: js.UndefOr[String] = js.undefined
  
  /** The type of source reported. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The URL of the resource. */
  var url: js.UndefOr[String] = js.undefined
}
object GoogleSecuritySafebrowsingV4ThreatHitThreatSource {
  
  inline def apply(): GoogleSecuritySafebrowsingV4ThreatHitThreatSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4ThreatHitThreatSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleSecuritySafebrowsingV4ThreatHitThreatSource] (val x: Self) extends AnyVal {
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setRemoteIp(value: String): Self = StObject.set(x, "remoteIp", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpUndefined: Self = StObject.set(x, "remoteIp", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
