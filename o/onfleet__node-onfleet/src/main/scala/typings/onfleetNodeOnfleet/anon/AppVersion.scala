package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppVersion extends js.Object {
  var appVersion: String = js.native
  var batteryLevel: Double = js.native
  var deviceDescription: String = js.native
  var platform: String = js.native
}

object AppVersion {
  @scala.inline
  def apply(appVersion: String, batteryLevel: Double, deviceDescription: String, platform: String): AppVersion = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], batteryLevel = batteryLevel.asInstanceOf[js.Any], deviceDescription = deviceDescription.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppVersion]
  }
  @scala.inline
  implicit class AppVersionOps[Self <: AppVersion] (val x: Self) extends AnyVal {
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
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatteryLevel(value: Double): Self = this.set("batteryLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceDescription(value: String): Self = this.set("deviceDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
  }
  
}

