package typings.mobileMessagingCordova.MobileMessagingCordova

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Installation extends js.Object {
  
  var appVersion: js.UndefOr[String] = js.native
  
  var applicationUserId: js.UndefOr[String] = js.native
  
  var customAttributes: js.UndefOr[Record[String, String]] = js.native
  
  var deviceManufacturer: js.UndefOr[String] = js.native
  
  var deviceModel: js.UndefOr[String] = js.native
  
  var deviceName: js.UndefOr[String] = js.native
  
  var deviceSecure: js.UndefOr[Boolean] = js.native
  
  var deviceTimezoneId: js.UndefOr[String] = js.native
  
  var geoEnabled: js.UndefOr[Boolean] = js.native
  
  var isPrimaryDevice: js.UndefOr[Boolean] = js.native
  
  var isPushRegistrationEnabled: js.UndefOr[Boolean] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var notificationsEnabled: js.UndefOr[Boolean] = js.native
  
  var os: js.UndefOr[OS] = js.native
  
  var osVersion: String = js.native
  
  var sdkVersion: js.UndefOr[String] = js.native
}
object Installation {
  
  @scala.inline
  def apply(osVersion: String): Installation = {
    val __obj = js.Dynamic.literal(osVersion = osVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Installation]
  }
  
  @scala.inline
  implicit class InstallationOps[Self <: Installation] (val x: Self) extends AnyVal {
    
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
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppVersion: Self = this.set("appVersion", js.undefined)
    
    @scala.inline
    def setApplicationUserId(value: String): Self = this.set("applicationUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationUserId: Self = this.set("applicationUserId", js.undefined)
    
    @scala.inline
    def setCustomAttributes(value: Record[String, String]): Self = this.set("customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAttributes: Self = this.set("customAttributes", js.undefined)
    
    @scala.inline
    def setDeviceManufacturer(value: String): Self = this.set("deviceManufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceManufacturer: Self = this.set("deviceManufacturer", js.undefined)
    
    @scala.inline
    def setDeviceModel(value: String): Self = this.set("deviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceModel: Self = this.set("deviceModel", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setDeviceSecure(value: Boolean): Self = this.set("deviceSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSecure: Self = this.set("deviceSecure", js.undefined)
    
    @scala.inline
    def setDeviceTimezoneId(value: String): Self = this.set("deviceTimezoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceTimezoneId: Self = this.set("deviceTimezoneId", js.undefined)
    
    @scala.inline
    def setGeoEnabled(value: Boolean): Self = this.set("geoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoEnabled: Self = this.set("geoEnabled", js.undefined)
    
    @scala.inline
    def setIsPrimaryDevice(value: Boolean): Self = this.set("isPrimaryDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrimaryDevice: Self = this.set("isPrimaryDevice", js.undefined)
    
    @scala.inline
    def setIsPushRegistrationEnabled(value: Boolean): Self = this.set("isPushRegistrationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPushRegistrationEnabled: Self = this.set("isPushRegistrationEnabled", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setNotificationsEnabled(value: Boolean): Self = this.set("notificationsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationsEnabled: Self = this.set("notificationsEnabled", js.undefined)
    
    @scala.inline
    def setOs(value: OS): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: String): Self = this.set("sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkVersion: Self = this.set("sdkVersion", js.undefined)
  }
}
