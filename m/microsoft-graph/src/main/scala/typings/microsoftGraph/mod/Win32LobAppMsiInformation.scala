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
  
  inline def apply(): Win32LobAppMsiInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppMsiInformation]
  }
  
  extension [Self <: Win32LobAppMsiInformation](x: Self) {
    
    inline def setPackageType(value: Win32LobAppMsiPackageType): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setProductCode(value: NullableOption[String]): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeNull: Self = StObject.set(x, "productCode", null)
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def setProductName(value: NullableOption[String]): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameNull: Self = StObject.set(x, "productName", null)
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setProductVersion(value: NullableOption[String]): Self = StObject.set(x, "productVersion", value.asInstanceOf[js.Any])
    
    inline def setProductVersionNull: Self = StObject.set(x, "productVersion", null)
    
    inline def setProductVersionUndefined: Self = StObject.set(x, "productVersion", js.undefined)
    
    inline def setPublisher(value: NullableOption[String]): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setRequiresReboot(value: Boolean): Self = StObject.set(x, "requiresReboot", value.asInstanceOf[js.Any])
    
    inline def setRequiresRebootUndefined: Self = StObject.set(x, "requiresReboot", js.undefined)
    
    inline def setUpgradeCode(value: NullableOption[String]): Self = StObject.set(x, "upgradeCode", value.asInstanceOf[js.Any])
    
    inline def setUpgradeCodeNull: Self = StObject.set(x, "upgradeCode", null)
    
    inline def setUpgradeCodeUndefined: Self = StObject.set(x, "upgradeCode", js.undefined)
  }
}
