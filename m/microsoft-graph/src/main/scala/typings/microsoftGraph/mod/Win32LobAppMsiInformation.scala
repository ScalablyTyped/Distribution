package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobAppMsiInformation extends StObject {
  
  // The MSI package type. Possible values are: perMachine, perUser, dualPurpose.
  var packageType: js.UndefOr[Win32LobAppMsiPackageType] = js.undefined
  
  // The MSI product code.
  var productCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The MSI product name.
  var productName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The MSI product version.
  var productVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The MSI publisher.
  var publisher: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether the MSI app requires the machine to reboot to complete installation.
  var requiresReboot: js.UndefOr[Boolean] = js.undefined
  
  // The MSI upgrade code.
  var upgradeCode: js.UndefOr[NullableOption[String]] = js.undefined
}
object Win32LobAppMsiInformation {
  
  @scala.inline
  def apply(): Win32LobAppMsiInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppMsiInformation]
  }
  
  @scala.inline
  implicit class Win32LobAppMsiInformationMutableBuilder[Self <: Win32LobAppMsiInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageType(value: Win32LobAppMsiPackageType): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    @scala.inline
    def setProductCode(value: NullableOption[String]): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodeNull: Self = StObject.set(x, "productCode", null)
    
    @scala.inline
    def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    @scala.inline
    def setProductName(value: NullableOption[String]): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNameNull: Self = StObject.set(x, "productName", null)
    
    @scala.inline
    def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    @scala.inline
    def setProductVersion(value: NullableOption[String]): Self = StObject.set(x, "productVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductVersionNull: Self = StObject.set(x, "productVersion", null)
    
    @scala.inline
    def setProductVersionUndefined: Self = StObject.set(x, "productVersion", js.undefined)
    
    @scala.inline
    def setPublisher(value: NullableOption[String]): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setRequiresReboot(value: Boolean): Self = StObject.set(x, "requiresReboot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresRebootUndefined: Self = StObject.set(x, "requiresReboot", js.undefined)
    
    @scala.inline
    def setUpgradeCode(value: NullableOption[String]): Self = StObject.set(x, "upgradeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeCodeNull: Self = StObject.set(x, "upgradeCode", null)
    
    @scala.inline
    def setUpgradeCodeUndefined: Self = StObject.set(x, "upgradeCode", js.undefined)
  }
}
