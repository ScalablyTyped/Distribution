package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatSource extends StObject {
  
  /** Referrer of the resource. Only set if the referrer is available. */
  var referrer: js.UndefOr[String] = js.native
  
  /** The remote IP of the resource in ASCII format. Either IPv4 or IPv6. */
  var remoteIp: js.UndefOr[String] = js.native
  
  /** The type of source reported. */
  var `type`: js.UndefOr[String] = js.native
  
  /** The URL of the resource. */
  var url: js.UndefOr[String] = js.native
}
object ThreatSource {
  
  @scala.inline
  def apply(): ThreatSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatSource]
  }
  
  @scala.inline
  implicit class ThreatSourceMutableBuilder[Self <: ThreatSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    @scala.inline
    def setRemoteIp(value: String): Self = StObject.set(x, "remoteIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpUndefined: Self = StObject.set(x, "remoteIp", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
