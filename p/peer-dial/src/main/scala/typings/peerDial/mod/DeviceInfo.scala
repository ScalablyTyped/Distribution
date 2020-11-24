package typings.peerDial.mod

import typings.peerDial.anon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceInfo extends js.Object {
  
  var UDN: String = js.native
  
  var applicationUrl: String = js.native
  
  var descriptionUrl: String = js.native
  
  var deviceType: String = js.native
  
  var friendlyName: String = js.native
  
  var iconList: js.Array[js.Object] | Icon = js.native
  
  var manufacturer: String = js.native
  
  var modelName: String = js.native
}
object DeviceInfo {
  
  @scala.inline
  def apply(
    UDN: String,
    applicationUrl: String,
    descriptionUrl: String,
    deviceType: String,
    friendlyName: String,
    iconList: js.Array[js.Object] | Icon,
    manufacturer: String,
    modelName: String
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(UDN = UDN.asInstanceOf[js.Any], applicationUrl = applicationUrl.asInstanceOf[js.Any], descriptionUrl = descriptionUrl.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], iconList = iconList.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
  
  @scala.inline
  implicit class DeviceInfoOps[Self <: DeviceInfo] (val x: Self) extends AnyVal {
    
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
    def setApplicationUrl(value: String): Self = this.set("applicationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUrl(value: String): Self = this.set("descriptionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceType(value: String): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconListVarargs(value: js.Object*): Self = this.set("iconList", js.Array(value :_*))
    
    @scala.inline
    def setIconList(value: js.Array[js.Object] | Icon): Self = this.set("iconList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
  }
}
