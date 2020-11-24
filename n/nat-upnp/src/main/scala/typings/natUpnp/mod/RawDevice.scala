package typings.natUpnp.mod

import typings.natUpnp.anon.Device
import typings.natUpnp.anon.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawDevice extends js.Object {
  
  var UDN: String = js.native
  
  var UPC: String = js.native
  
  var deviceList: js.UndefOr[Device] = js.native
  
  var deviceType: String = js.native
  
  var friendlyName: String = js.native
  
  var manufacturer: String = js.native
  
  var manufacturerURL: String = js.native
  
  var modelDescription: String = js.native
  
  var modelName: String = js.native
  
  var modelNumber: String = js.native
  
  var modelURL: String = js.native
  
  var presentationURL: String = js.native
  
  var serialNumber: String = js.native
  
  var serviceList: js.UndefOr[Service] = js.native
}
object RawDevice {
  
  @scala.inline
  def apply(
    UDN: String,
    UPC: String,
    deviceType: String,
    friendlyName: String,
    manufacturer: String,
    manufacturerURL: String,
    modelDescription: String,
    modelName: String,
    modelNumber: String,
    modelURL: String,
    presentationURL: String,
    serialNumber: String
  ): RawDevice = {
    val __obj = js.Dynamic.literal(UDN = UDN.asInstanceOf[js.Any], UPC = UPC.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], manufacturerURL = manufacturerURL.asInstanceOf[js.Any], modelDescription = modelDescription.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], modelNumber = modelNumber.asInstanceOf[js.Any], modelURL = modelURL.asInstanceOf[js.Any], presentationURL = presentationURL.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDevice]
  }
  
  @scala.inline
  implicit class RawDeviceOps[Self <: RawDevice] (val x: Self) extends AnyVal {
    
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
    def setUDN(value: String): Self = this.set("UDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPC(value: String): Self = this.set("UPC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceType(value: String): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerURL(value: String): Self = this.set("manufacturerURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelDescription(value: String): Self = this.set("modelDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNumber(value: String): Self = this.set("modelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelURL(value: String): Self = this.set("modelURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationURL(value: String): Self = this.set("presentationURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceList(value: Device): Self = this.set("deviceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceList: Self = this.set("deviceList", js.undefined)
    
    @scala.inline
    def setServiceList(value: Service): Self = this.set("serviceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceList: Self = this.set("serviceList", js.undefined)
  }
}
