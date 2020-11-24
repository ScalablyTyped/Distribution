package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalDeviceModel extends js.Object {
  
  /** The firmware version of the device. */
  var firmwareVersion: js.UndefOr[String] = js.native
  
  /** The hardware version of the device. */
  var hardwareVersion: js.UndefOr[String] = js.native
  
  /** The name of the device model. */
  var name: js.UndefOr[String] = js.native
  
  /** The software version of the device. */
  var softwareVersion: js.UndefOr[String] = js.native
  
  /** The name of the device vendor. */
  var vendor: js.UndefOr[String] = js.native
}
object SasPortalDeviceModel {
  
  @scala.inline
  def apply(): SasPortalDeviceModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDeviceModel]
  }
  
  @scala.inline
  implicit class SasPortalDeviceModelOps[Self <: SasPortalDeviceModel] (val x: Self) extends AnyVal {
    
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
    def setFirmwareVersion(value: String): Self = this.set("firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirmwareVersion: Self = this.set("firmwareVersion", js.undefined)
    
    @scala.inline
    def setHardwareVersion(value: String): Self = this.set("hardwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardwareVersion: Self = this.set("hardwareVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSoftwareVersion(value: String): Self = this.set("softwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareVersion: Self = this.set("softwareVersion", js.undefined)
    
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
  }
}
