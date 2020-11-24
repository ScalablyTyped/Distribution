package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftwareUpdateStatusSummary extends Entity {
  
  // Number of compliant devices.
  var compliantDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of compliant users.
  var compliantUserCount: js.UndefOr[Double] = js.native
  
  // Number of conflict devices.
  var conflictDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of conflict users.
  var conflictUserCount: js.UndefOr[Double] = js.native
  
  // The name of the policy.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Number of devices had error.
  var errorDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of users had error.
  var errorUserCount: js.UndefOr[Double] = js.native
  
  // Number of non compliant devices.
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of non compliant users.
  var nonCompliantUserCount: js.UndefOr[Double] = js.native
  
  // Number of not applicable devices.
  var notApplicableDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of not applicable users.
  var notApplicableUserCount: js.UndefOr[Double] = js.native
  
  // Number of remediated devices.
  var remediatedDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of remediated users.
  var remediatedUserCount: js.UndefOr[Double] = js.native
  
  // Number of unknown devices.
  var unknownDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of unknown users.
  var unknownUserCount: js.UndefOr[Double] = js.native
}
object SoftwareUpdateStatusSummary {
  
  @scala.inline
  def apply(): SoftwareUpdateStatusSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareUpdateStatusSummary]
  }
  
  @scala.inline
  implicit class SoftwareUpdateStatusSummaryOps[Self <: SoftwareUpdateStatusSummary] (val x: Self) extends AnyVal {
    
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
    def setCompliantDeviceCount(value: Double): Self = this.set("compliantDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompliantDeviceCount: Self = this.set("compliantDeviceCount", js.undefined)
    
    @scala.inline
    def setCompliantUserCount(value: Double): Self = this.set("compliantUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompliantUserCount: Self = this.set("compliantUserCount", js.undefined)
    
    @scala.inline
    def setConflictDeviceCount(value: Double): Self = this.set("conflictDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictDeviceCount: Self = this.set("conflictDeviceCount", js.undefined)
    
    @scala.inline
    def setConflictUserCount(value: Double): Self = this.set("conflictUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictUserCount: Self = this.set("conflictUserCount", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setErrorDeviceCount(value: Double): Self = this.set("errorDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDeviceCount: Self = this.set("errorDeviceCount", js.undefined)
    
    @scala.inline
    def setErrorUserCount(value: Double): Self = this.set("errorUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorUserCount: Self = this.set("errorUserCount", js.undefined)
    
    @scala.inline
    def setNonCompliantDeviceCount(value: Double): Self = this.set("nonCompliantDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonCompliantDeviceCount: Self = this.set("nonCompliantDeviceCount", js.undefined)
    
    @scala.inline
    def setNonCompliantUserCount(value: Double): Self = this.set("nonCompliantUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonCompliantUserCount: Self = this.set("nonCompliantUserCount", js.undefined)
    
    @scala.inline
    def setNotApplicableDeviceCount(value: Double): Self = this.set("notApplicableDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotApplicableDeviceCount: Self = this.set("notApplicableDeviceCount", js.undefined)
    
    @scala.inline
    def setNotApplicableUserCount(value: Double): Self = this.set("notApplicableUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotApplicableUserCount: Self = this.set("notApplicableUserCount", js.undefined)
    
    @scala.inline
    def setRemediatedDeviceCount(value: Double): Self = this.set("remediatedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemediatedDeviceCount: Self = this.set("remediatedDeviceCount", js.undefined)
    
    @scala.inline
    def setRemediatedUserCount(value: Double): Self = this.set("remediatedUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemediatedUserCount: Self = this.set("remediatedUserCount", js.undefined)
    
    @scala.inline
    def setUnknownDeviceCount(value: Double): Self = this.set("unknownDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownDeviceCount: Self = this.set("unknownDeviceCount", js.undefined)
    
    @scala.inline
    def setUnknownUserCount(value: Double): Self = this.set("unknownUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownUserCount: Self = this.set("unknownUserCount", js.undefined)
  }
}
