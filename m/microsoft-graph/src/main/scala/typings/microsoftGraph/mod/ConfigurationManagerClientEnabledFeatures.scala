package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationManagerClientEnabledFeatures extends StObject {
  
  // Whether compliance policy is managed by Intune
  var compliancePolicy: js.UndefOr[Boolean] = js.undefined
  
  // Whether device configuration is managed by Intune
  var deviceConfiguration: js.UndefOr[Boolean] = js.undefined
  
  // Whether inventory is managed by Intune
  var inventory: js.UndefOr[Boolean] = js.undefined
  
  // Whether modern application is managed by Intune
  var modernApps: js.UndefOr[Boolean] = js.undefined
  
  // Whether resource access is managed by Intune
  var resourceAccess: js.UndefOr[Boolean] = js.undefined
  
  // Whether Windows Update for Business is managed by Intune
  var windowsUpdateForBusiness: js.UndefOr[Boolean] = js.undefined
}
object ConfigurationManagerClientEnabledFeatures {
  
  inline def apply(): ConfigurationManagerClientEnabledFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationManagerClientEnabledFeatures]
  }
  
  extension [Self <: ConfigurationManagerClientEnabledFeatures](x: Self) {
    
    inline def setCompliancePolicy(value: Boolean): Self = StObject.set(x, "compliancePolicy", value.asInstanceOf[js.Any])
    
    inline def setCompliancePolicyUndefined: Self = StObject.set(x, "compliancePolicy", js.undefined)
    
    inline def setDeviceConfiguration(value: Boolean): Self = StObject.set(x, "deviceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfigurationUndefined: Self = StObject.set(x, "deviceConfiguration", js.undefined)
    
    inline def setInventory(value: Boolean): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    inline def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
    
    inline def setModernApps(value: Boolean): Self = StObject.set(x, "modernApps", value.asInstanceOf[js.Any])
    
    inline def setModernAppsUndefined: Self = StObject.set(x, "modernApps", js.undefined)
    
    inline def setResourceAccess(value: Boolean): Self = StObject.set(x, "resourceAccess", value.asInstanceOf[js.Any])
    
    inline def setResourceAccessUndefined: Self = StObject.set(x, "resourceAccess", js.undefined)
    
    inline def setWindowsUpdateForBusiness(value: Boolean): Self = StObject.set(x, "windowsUpdateForBusiness", value.asInstanceOf[js.Any])
    
    inline def setWindowsUpdateForBusinessUndefined: Self = StObject.set(x, "windowsUpdateForBusiness", js.undefined)
  }
}
