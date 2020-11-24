package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedDeviceOverview extends Entity {
  
  // Distribution of Exchange Access State in Intune
  var deviceExchangeAccessStateSummary: js.UndefOr[NullableOption[DeviceExchangeAccessStateSummary]] = js.native
  
  // Device operating system summary.
  var deviceOperatingSystemSummary: js.UndefOr[NullableOption[DeviceOperatingSystemSummary]] = js.native
  
  // The number of devices enrolled in both MDM and EAS
  var dualEnrolledDeviceCount: js.UndefOr[Double] = js.native
  
  // Total enrolled device count. Does not include PC devices managed via Intune PC Agent
  var enrolledDeviceCount: js.UndefOr[Double] = js.native
  
  // The number of devices enrolled in MDM
  var mdmEnrolledCount: js.UndefOr[Double] = js.native
}
object ManagedDeviceOverview {
  
  @scala.inline
  def apply(): ManagedDeviceOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDeviceOverview]
  }
  
  @scala.inline
  implicit class ManagedDeviceOverviewOps[Self <: ManagedDeviceOverview] (val x: Self) extends AnyVal {
    
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
    def setDeviceExchangeAccessStateSummary(value: NullableOption[DeviceExchangeAccessStateSummary]): Self = this.set("deviceExchangeAccessStateSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceExchangeAccessStateSummary: Self = this.set("deviceExchangeAccessStateSummary", js.undefined)
    
    @scala.inline
    def setDeviceExchangeAccessStateSummaryNull: Self = this.set("deviceExchangeAccessStateSummary", null)
    
    @scala.inline
    def setDeviceOperatingSystemSummary(value: NullableOption[DeviceOperatingSystemSummary]): Self = this.set("deviceOperatingSystemSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceOperatingSystemSummary: Self = this.set("deviceOperatingSystemSummary", js.undefined)
    
    @scala.inline
    def setDeviceOperatingSystemSummaryNull: Self = this.set("deviceOperatingSystemSummary", null)
    
    @scala.inline
    def setDualEnrolledDeviceCount(value: Double): Self = this.set("dualEnrolledDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDualEnrolledDeviceCount: Self = this.set("dualEnrolledDeviceCount", js.undefined)
    
    @scala.inline
    def setEnrolledDeviceCount(value: Double): Self = this.set("enrolledDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnrolledDeviceCount: Self = this.set("enrolledDeviceCount", js.undefined)
    
    @scala.inline
    def setMdmEnrolledCount(value: Double): Self = this.set("mdmEnrolledCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMdmEnrolledCount: Self = this.set("mdmEnrolledCount", js.undefined)
  }
}
