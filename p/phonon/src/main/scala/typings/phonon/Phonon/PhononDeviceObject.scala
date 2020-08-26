package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononDeviceObject extends js.Object {
  var ANDROID: String = js.native
  var IOS: String = js.native
  var os: String = js.native
  var osVersion: String = js.native
}

object PhononDeviceObject {
  @scala.inline
  def apply(ANDROID: String, IOS: String, os: String, osVersion: String): PhononDeviceObject = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], IOS = IOS.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononDeviceObject]
  }
  @scala.inline
  implicit class PhononDeviceObjectOps[Self <: PhononDeviceObject] (val x: Self) extends AnyVal {
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
    def setANDROID(value: String): Self = this.set("ANDROID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIOS(value: String): Self = this.set("IOS", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
  }
  
}

