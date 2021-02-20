package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsInformationProtectionProxiedDomainCollection extends StObject {
  
  // Display name
  var displayName: js.UndefOr[String] = js.native
  
  // Collection of proxied domains
  var proxiedDomains: js.UndefOr[js.Array[ProxiedDomain]] = js.native
}
object WindowsInformationProtectionProxiedDomainCollection {
  
  @scala.inline
  def apply(): WindowsInformationProtectionProxiedDomainCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionProxiedDomainCollection]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionProxiedDomainCollectionMutableBuilder[Self <: WindowsInformationProtectionProxiedDomainCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setProxiedDomains(value: js.Array[ProxiedDomain]): Self = StObject.set(x, "proxiedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxiedDomainsUndefined: Self = StObject.set(x, "proxiedDomains", js.undefined)
    
    @scala.inline
    def setProxiedDomainsVarargs(value: ProxiedDomain*): Self = StObject.set(x, "proxiedDomains", js.Array(value :_*))
  }
}
