package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceEnrollmentPlatformRestriction extends js.Object {
  
  // Max OS version supported
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Min OS version supported
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Block personally owned devices from enrolling
  var personalDeviceEnrollmentBlocked: js.UndefOr[Boolean] = js.native
  
  // Block the platform from enrolling
  var platformBlocked: js.UndefOr[Boolean] = js.native
}
object DeviceEnrollmentPlatformRestriction {
  
  @scala.inline
  def apply(): DeviceEnrollmentPlatformRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestriction]
  }
  
  @scala.inline
  implicit class DeviceEnrollmentPlatformRestrictionOps[Self <: DeviceEnrollmentPlatformRestriction] (val x: Self) extends AnyVal {
    
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
    def setOsMaximumVersion(value: NullableOption[String]): Self = this.set("osMaximumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsMaximumVersion: Self = this.set("osMaximumVersion", js.undefined)
    
    @scala.inline
    def setOsMaximumVersionNull: Self = this.set("osMaximumVersion", null)
    
    @scala.inline
    def setOsMinimumVersion(value: NullableOption[String]): Self = this.set("osMinimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsMinimumVersion: Self = this.set("osMinimumVersion", js.undefined)
    
    @scala.inline
    def setOsMinimumVersionNull: Self = this.set("osMinimumVersion", null)
    
    @scala.inline
    def setPersonalDeviceEnrollmentBlocked(value: Boolean): Self = this.set("personalDeviceEnrollmentBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalDeviceEnrollmentBlocked: Self = this.set("personalDeviceEnrollmentBlocked", js.undefined)
    
    @scala.inline
    def setPlatformBlocked(value: Boolean): Self = this.set("platformBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformBlocked: Self = this.set("platformBlocked", js.undefined)
  }
}
