package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestEnvironmentCatalog extends js.Object {
  
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
  implicit class TestEnvironmentCatalogOps[Self <: TestEnvironmentCatalog] (val x: Self) extends AnyVal {
    
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
    def setAndroidDeviceCatalog(value: AndroidDeviceCatalog): Self = this.set("androidDeviceCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidDeviceCatalog: Self = this.set("androidDeviceCatalog", js.undefined)
    
    @scala.inline
    def setDeviceIpBlockCatalog(value: DeviceIpBlockCatalog): Self = this.set("deviceIpBlockCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIpBlockCatalog: Self = this.set("deviceIpBlockCatalog", js.undefined)
    
    @scala.inline
    def setIosDeviceCatalog(value: IosDeviceCatalog): Self = this.set("iosDeviceCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosDeviceCatalog: Self = this.set("iosDeviceCatalog", js.undefined)
    
    @scala.inline
    def setNetworkConfigurationCatalog(value: NetworkConfigurationCatalog): Self = this.set("networkConfigurationCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkConfigurationCatalog: Self = this.set("networkConfigurationCatalog", js.undefined)
    
    @scala.inline
    def setSoftwareCatalog(value: ProvidedSoftwareCatalog): Self = this.set("softwareCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareCatalog: Self = this.set("softwareCatalog", js.undefined)
  }
}
