package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosDevice extends js.Object {
  
  /** Required. The id of the iOS device to be used. Use the TestEnvironmentDiscoveryService to get supported options. */
  var iosModelId: js.UndefOr[String] = js.native
  
  /** Required. The id of the iOS major software version to be used. Use the TestEnvironmentDiscoveryService to get supported options. */
  var iosVersionId: js.UndefOr[String] = js.native
  
  /** Required. The locale the test device used for testing. Use the TestEnvironmentDiscoveryService to get supported options. */
  var locale: js.UndefOr[String] = js.native
  
  /** Required. How the device is oriented during the test. Use the TestEnvironmentDiscoveryService to get supported options. */
  var orientation: js.UndefOr[String] = js.native
}
object IosDevice {
  
  @scala.inline
  def apply(): IosDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDevice]
  }
  
  @scala.inline
  implicit class IosDeviceOps[Self <: IosDevice] (val x: Self) extends AnyVal {
    
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
    def setIosModelId(value: String): Self = this.set("iosModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosModelId: Self = this.set("iosModelId", js.undefined)
    
    @scala.inline
    def setIosVersionId(value: String): Self = this.set("iosVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosVersionId: Self = this.set("iosVersionId", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
}
