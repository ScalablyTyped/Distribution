package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.openstack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenstackProviderOptions extends StObject {
  
  var authUrl: String
  
  var domainId: js.UndefOr[String] = js.undefined
  
  var domainName: js.UndefOr[String] = js.undefined
  
  var keystoneAuthVersion: js.UndefOr[String] = js.undefined
  
  var password: String
  
  var provider: openstack
  
  var region: js.UndefOr[String] = js.undefined
  
  var tenantId: js.UndefOr[String] = js.undefined
  
  var username: String
  
  var version: js.UndefOr[String] = js.undefined
}
object OpenstackProviderOptions {
  
  inline def apply(authUrl: String, password: String, username: String): OpenstackProviderOptions = {
    val __obj = js.Dynamic.literal(authUrl = authUrl.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = "openstack", username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenstackProviderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenstackProviderOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthUrl(value: String): Self = StObject.set(x, "authUrl", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: String): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setKeystoneAuthVersion(value: String): Self = StObject.set(x, "keystoneAuthVersion", value.asInstanceOf[js.Any])
    
    inline def setKeystoneAuthVersionUndefined: Self = StObject.set(x, "keystoneAuthVersion", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: openstack): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
