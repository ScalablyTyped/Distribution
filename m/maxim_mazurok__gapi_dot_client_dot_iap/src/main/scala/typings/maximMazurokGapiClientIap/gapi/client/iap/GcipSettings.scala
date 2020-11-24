package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcipSettings extends js.Object {
  
  /** Login page URI associated with the GCIP tenants. Typically, all resources within the same project share the same login page, though it could be overridden at the sub resource level. */
  var loginPageUri: js.UndefOr[String] = js.native
  
  /**
    * GCIP tenant ids that are linked to the IAP resource. tenant_ids could be a string beginning with a number character to indicate authenticating with GCIP tenant flow, or in the
    * format of _ to indicate authenticating with GCIP agent flow. If agent flow is used, tenant_ids should only contain one single element, while for tenant flow, tenant_ids can contain
    * multiple elements.
    */
  var tenantIds: js.UndefOr[js.Array[String]] = js.native
}
object GcipSettings {
  
  @scala.inline
  def apply(): GcipSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcipSettings]
  }
  
  @scala.inline
  implicit class GcipSettingsOps[Self <: GcipSettings] (val x: Self) extends AnyVal {
    
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
    def setLoginPageUri(value: String): Self = this.set("loginPageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginPageUri: Self = this.set("loginPageUri", js.undefined)
    
    @scala.inline
    def setTenantIdsVarargs(value: String*): Self = this.set("tenantIds", js.Array(value :_*))
    
    @scala.inline
    def setTenantIds(value: js.Array[String]): Self = this.set("tenantIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantIds: Self = this.set("tenantIds", js.undefined)
  }
}
