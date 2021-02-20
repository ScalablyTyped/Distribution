package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestEnvironmentCatalog extends StObject {
  
  /** Supported Android devices. */
  var androidDeviceCatalog: js.UndefOr[AndroidDeviceCatalog] = js.native
  
  /** The IP blocks used by devices in the test environment. */
  var deviceIpBlockCatalog: js.UndefOr[DeviceIpBlockCatalog] = js.native
  
  /** Supported iOS devices. */
  var iosDeviceCatalog: js.UndefOr[IosDeviceCatalog] = js.native
  
  /** Supported network configurations. */
  var networkConfigurationCatalog: js.UndefOr[NetworkConfigurationCatalog] = js.native
  
  /** The software test environment provided by TestExecutionService. */
  var softwareCatalog: js.UndefOr[ProvidedSoftwareCatalog] = js.native
}
object TestEnvironmentCatalog {
  
  @scala.inline
  def apply(): TestEnvironmentCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestEnvironmentCatalog]
  }
  
  @scala.inline
  implicit class TestEnvironmentCatalogMutableBuilder[Self <: TestEnvironmentCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidDeviceCatalog(value: AndroidDeviceCatalog): Self = StObject.set(x, "androidDeviceCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDeviceCatalogUndefined: Self = StObject.set(x, "androidDeviceCatalog", js.undefined)
    
    @scala.inline
    def setDeviceIpBlockCatalog(value: DeviceIpBlockCatalog): Self = StObject.set(x, "deviceIpBlockCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIpBlockCatalogUndefined: Self = StObject.set(x, "deviceIpBlockCatalog", js.undefined)
    
    @scala.inline
    def setIosDeviceCatalog(value: IosDeviceCatalog): Self = StObject.set(x, "iosDeviceCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosDeviceCatalogUndefined: Self = StObject.set(x, "iosDeviceCatalog", js.undefined)
    
    @scala.inline
    def setNetworkConfigurationCatalog(value: NetworkConfigurationCatalog): Self = StObject.set(x, "networkConfigurationCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigurationCatalogUndefined: Self = StObject.set(x, "networkConfigurationCatalog", js.undefined)
    
    @scala.inline
    def setSoftwareCatalog(value: ProvidedSoftwareCatalog): Self = StObject.set(x, "softwareCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareCatalogUndefined: Self = StObject.set(x, "softwareCatalog", js.undefined)
  }
}
