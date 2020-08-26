package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkforceIntegration extends ChangeTrackedEntity {
  // API version for the call back URL. Start with 1.
  var apiVersion: js.UndefOr[Double] = js.native
  // Name of the workforce integration.
  var displayName: js.UndefOr[String] = js.native
  // The workforce integration encryption resource.
  var encryption: js.UndefOr[WorkforceIntegrationEncryption] = js.native
  // Indicates whether this workforce integration is currently active and available.
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on
    * client changes on those entities added here. By default, no entities are supported for change notifications. Possible
    * values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences
    */
  var supportedEntities: js.UndefOr[WorkforceIntegrationSupportedEntities] = js.native
  // Workforce Integration URL for callbacks from the Shifts service.
  var url: js.UndefOr[String] = js.native
}

object WorkforceIntegration {
  @scala.inline
  def apply(): WorkforceIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkforceIntegration]
  }
  @scala.inline
  implicit class WorkforceIntegrationOps[Self <: WorkforceIntegration] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: Double): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEncryption(value: WorkforceIntegrationEncryption): Self = this.set("encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    @scala.inline
    def setSupportedEntities(value: WorkforceIntegrationSupportedEntities): Self = this.set("supportedEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedEntities: Self = this.set("supportedEntities", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

