package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcipSettings extends StObject {
  
  /** Login page URI associated with the GCIP tenants. Typically, all resources within the same project share the same login page, though it could be overridden at the sub resource level. */
  var loginPageUri: js.UndefOr[String] = js.undefined
  
  /**
    * GCIP tenant ids that are linked to the IAP resource. tenant_ids could be a string beginning with a number character to indicate authenticating with GCIP tenant flow, or in the
    * format of _ to indicate authenticating with GCIP agent flow. If agent flow is used, tenant_ids should only contain one single element, while for tenant flow, tenant_ids can contain
    * multiple elements.
    */
  var tenantIds: js.UndefOr[js.Array[String]] = js.undefined
}
object GcipSettings {
  
  @scala.inline
  def apply(): GcipSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcipSettings]
  }
  
  @scala.inline
  implicit class GcipSettingsMutableBuilder[Self <: GcipSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoginPageUri(value: String): Self = StObject.set(x, "loginPageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginPageUriUndefined: Self = StObject.set(x, "loginPageUri", js.undefined)
    
    @scala.inline
    def setTenantIds(value: js.Array[String]): Self = StObject.set(x, "tenantIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdsUndefined: Self = StObject.set(x, "tenantIds", js.undefined)
    
    @scala.inline
    def setTenantIdsVarargs(value: String*): Self = StObject.set(x, "tenantIds", js.Array(value :_*))
  }
}
