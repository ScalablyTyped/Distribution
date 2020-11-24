package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.openstack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenstackProviderOptions extends js.Object {
  
  var authUrl: String = js.native
  
  var domainId: js.UndefOr[String] = js.native
  
  var domainName: js.UndefOr[String] = js.native
  
  var keystoneAuthVersion: js.UndefOr[String] = js.native
  
  var password: String = js.native
  
  var provider: openstack = js.native
  
  var region: js.UndefOr[String] = js.native
  
  var tenantId: js.UndefOr[String] = js.native
  
  var username: String = js.native
  
  var version: js.UndefOr[String] = js.native
}
object OpenstackProviderOptions {
  
  @scala.inline
  def apply(authUrl: String, password: String, provider: openstack, username: String): OpenstackProviderOptions = {
    val __obj = js.Dynamic.literal(authUrl = authUrl.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenstackProviderOptions]
  }
  
  @scala.inline
  implicit class OpenstackProviderOptionsOps[Self <: OpenstackProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthUrl(value: String): Self = this.set("authUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: openstack): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainId(value: String): Self = this.set("domainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainId: Self = this.set("domainId", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setKeystoneAuthVersion(value: String): Self = this.set("keystoneAuthVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeystoneAuthVersion: Self = this.set("keystoneAuthVersion", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
