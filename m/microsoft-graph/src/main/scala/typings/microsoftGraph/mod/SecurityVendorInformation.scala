package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityVendorInformation extends StObject {
  
  // Specific provider (product/service - not vendor company); for example, WindowsDefenderATP.
  var provider: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Version of the provider or subprovider, if it exists, that generated the alert. Required
  var providerVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specific subprovider (under aggregating provider); for example, WindowsDefenderATP.SmartScreen.
  var subProvider: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the alert vendor (for example, Microsoft, Dell, FireEye). Required
  var vendor: js.UndefOr[NullableOption[String]] = js.undefined
}
object SecurityVendorInformation {
  
  @scala.inline
  def apply(): SecurityVendorInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityVendorInformation]
  }
  
  @scala.inline
  implicit class SecurityVendorInformationMutableBuilder[Self <: SecurityVendorInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvider(value: NullableOption[String]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNull: Self = StObject.set(x, "provider", null)
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setProviderVersion(value: NullableOption[String]): Self = StObject.set(x, "providerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderVersionNull: Self = StObject.set(x, "providerVersion", null)
    
    @scala.inline
    def setProviderVersionUndefined: Self = StObject.set(x, "providerVersion", js.undefined)
    
    @scala.inline
    def setSubProvider(value: NullableOption[String]): Self = StObject.set(x, "subProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubProviderNull: Self = StObject.set(x, "subProvider", null)
    
    @scala.inline
    def setSubProviderUndefined: Self = StObject.set(x, "subProvider", js.undefined)
    
    @scala.inline
    def setVendor(value: NullableOption[String]): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorNull: Self = StObject.set(x, "vendor", null)
    
    @scala.inline
    def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
