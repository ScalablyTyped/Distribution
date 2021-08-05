package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtectionProxiedDomainCollection extends StObject {
  
  // Display name
  var displayName: js.UndefOr[String] = js.undefined
  
  // Collection of proxied domains
  var proxiedDomains: js.UndefOr[js.Array[ProxiedDomain]] = js.undefined
}
object WindowsInformationProtectionProxiedDomainCollection {
  
  inline def apply(): WindowsInformationProtectionProxiedDomainCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionProxiedDomainCollection]
  }
  
  extension [Self <: WindowsInformationProtectionProxiedDomainCollection](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setProxiedDomains(value: js.Array[ProxiedDomain]): Self = StObject.set(x, "proxiedDomains", value.asInstanceOf[js.Any])
    
    inline def setProxiedDomainsUndefined: Self = StObject.set(x, "proxiedDomains", js.undefined)
    
    inline def setProxiedDomainsVarargs(value: ProxiedDomain*): Self = StObject.set(x, "proxiedDomains", js.Array(value :_*))
  }
}
