package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationManagerClientEnabledFeatures extends js.Object {
  
  // Whether compliance policy is managed by Intune
  var compliancePolicy: js.UndefOr[Boolean] = js.native
  
  // Whether device configuration is managed by Intune
  var deviceConfiguration: js.UndefOr[Boolean] = js.native
  
  // Whether inventory is managed by Intune
  var inventory: js.UndefOr[Boolean] = js.native
  
  // Whether modern application is managed by Intune
  var modernApps: js.UndefOr[Boolean] = js.native
  
  // Whether resource access is managed by Intune
  var resourceAccess: js.UndefOr[Boolean] = js.native
  
  // Whether Windows Update for Business is managed by Intune
  var windowsUpdateForBusiness: js.UndefOr[Boolean] = js.native
}
object ConfigurationManagerClientEnabledFeatures {
  
  @scala.inline
  def apply(): ConfigurationManagerClientEnabledFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationManagerClientEnabledFeatures]
  }
  
  @scala.inline
  implicit class ConfigurationManagerClientEnabledFeaturesOps[Self <: ConfigurationManagerClientEnabledFeatures] (val x: Self) extends AnyVal {
    
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
    def setCompliancePolicy(value: Boolean): Self = this.set("compliancePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompliancePolicy: Self = this.set("compliancePolicy", js.undefined)
    
    @scala.inline
    def setDeviceConfiguration(value: Boolean): Self = this.set("deviceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceConfiguration: Self = this.set("deviceConfiguration", js.undefined)
    
    @scala.inline
    def setInventory(value: Boolean): Self = this.set("inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventory: Self = this.set("inventory", js.undefined)
    
    @scala.inline
    def setModernApps(value: Boolean): Self = this.set("modernApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModernApps: Self = this.set("modernApps", js.undefined)
    
    @scala.inline
    def setResourceAccess(value: Boolean): Self = this.set("resourceAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAccess: Self = this.set("resourceAccess", js.undefined)
    
    @scala.inline
    def setWindowsUpdateForBusiness(value: Boolean): Self = this.set("windowsUpdateForBusiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsUpdateForBusiness: Self = this.set("windowsUpdateForBusiness", js.undefined)
  }
}
