package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxiedDomain extends StObject {
  
  // The IP address or FQDN
  var ipAddressOrFQDN: js.UndefOr[String] = js.undefined
  
  // Proxy IP or FQDN
  var proxy: js.UndefOr[NullableOption[String]] = js.undefined
}
object ProxiedDomain {
  
  @scala.inline
  def apply(): ProxiedDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxiedDomain]
  }
  
  @scala.inline
  implicit class ProxiedDomainMutableBuilder[Self <: ProxiedDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddressOrFQDN(value: String): Self = StObject.set(x, "ipAddressOrFQDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressOrFQDNUndefined: Self = StObject.set(x, "ipAddressOrFQDN", js.undefined)
    
    @scala.inline
    def setProxy(value: NullableOption[String]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyNull: Self = StObject.set(x, "proxy", null)
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
  }
}
