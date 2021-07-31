package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TenantProjectConfig extends StObject {
  
  /** Billing account properties. The billing account must be specified. */
  var billingConfig: js.UndefOr[BillingConfig] = js.undefined
  
  /**
    * Folder where project in this tenancy unit must be located This folder must have been previously created with the required permissions for the caller to create and configure a
    * project in it. Valid folder resource names have the format `folders/{folder_number}` (for example, `folders/123456`).
    */
  var folder: js.UndefOr[String] = js.undefined
  
  /** Labels that are applied to this project. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.TenantProjectConfig & TopLevel[js.Any]
  ] = js.undefined
  
  /** Configuration for the IAM service account on the tenant project. */
  var serviceAccountConfig: js.UndefOr[ServiceAccountConfig] = js.undefined
  
  /**
    * Google Cloud API names of services that are activated on this project during provisioning. If any of these services can't be activated, the request fails. For example:
    * 'compute.googleapis.com','cloudfunctions.googleapis.com'
    */
  var services: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Describes ownership and policies for the new tenant project. Required. */
  var tenantProjectPolicy: js.UndefOr[TenantProjectPolicy] = js.undefined
}
object TenantProjectConfig {
  
  @scala.inline
  def apply(): TenantProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenantProjectConfig]
  }
  
  @scala.inline
  implicit class TenantProjectConfigMutableBuilder[Self <: TenantProjectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingConfig(value: BillingConfig): Self = StObject.set(x, "billingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingConfigUndefined: Self = StObject.set(x, "billingConfig", js.undefined)
    
    @scala.inline
    def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.TenantProjectConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setServiceAccountConfig(value: ServiceAccountConfig): Self = StObject.set(x, "serviceAccountConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountConfigUndefined: Self = StObject.set(x, "serviceAccountConfig", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
    
    @scala.inline
    def setTenantProjectPolicy(value: TenantProjectPolicy): Self = StObject.set(x, "tenantProjectPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantProjectPolicyUndefined: Self = StObject.set(x, "tenantProjectPolicy", js.undefined)
  }
}
