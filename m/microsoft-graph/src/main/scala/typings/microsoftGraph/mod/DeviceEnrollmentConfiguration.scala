package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEnrollmentConfiguration extends Entity {
  // The list of group assignments for the device configuration profile.
  var assignments: js.UndefOr[js.Array[EnrollmentConfigurationAssignment]] = js.native
  // Not yet documented
  var createdDateTime: js.UndefOr[String] = js.native
  // Not yet documented
  var description: js.UndefOr[String] = js.native
  // Not yet documented
  var displayName: js.UndefOr[String] = js.native
  // Not yet documented
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Not yet documented
  var priority: js.UndefOr[Double] = js.native
  // Not yet documented
  var version: js.UndefOr[Double] = js.native
}

object DeviceEnrollmentConfiguration {
  @scala.inline
  def apply(): DeviceEnrollmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentConfiguration]
  }
  @scala.inline
  implicit class DeviceEnrollmentConfigurationOps[Self <: DeviceEnrollmentConfiguration] (val x: Self) extends AnyVal {
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
    def setAssignmentsVarargs(value: EnrollmentConfigurationAssignment*): Self = this.set("assignments", js.Array(value :_*))
    @scala.inline
    def setAssignments(value: js.Array[EnrollmentConfigurationAssignment]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

