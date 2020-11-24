package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkforceIntegration extends ChangeTrackedEntity {
  
  // API version for the call back URL. Start with 1.
  var apiVersion: js.UndefOr[NullableOption[Double]] = js.native
  
  // Name of the workforce integration.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The workforce integration encryption resource.
  var encryption: js.UndefOr[NullableOption[WorkforceIntegrationEncryption]] = js.native
  
  // Indicates whether this workforce integration is currently active and available.
  var isActive: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on
    * client changes on those entities added here. By default, no entities are supported for change notifications. Possible
    * values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences
    */
  var supportedEntities: js.UndefOr[NullableOption[WorkforceIntegrationSupportedEntities]] = js.native
  
  // Workforce Integration URL for callbacks from the Shifts service.
  var url: js.UndefOr[NullableOption[String]] = js.native
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
    def setApiVersion(value: NullableOption[Double]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setApiVersionNull: Self = this.set("apiVersion", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setEncryption(value: NullableOption[WorkforceIntegrationEncryption]): Self = this.set("encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    
    @scala.inline
    def setEncryptionNull: Self = this.set("encryption", null)
    
    @scala.inline
    def setIsActive(value: NullableOption[Boolean]): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setIsActiveNull: Self = this.set("isActive", null)
    
    @scala.inline
    def setSupportedEntities(value: NullableOption[WorkforceIntegrationSupportedEntities]): Self = this.set("supportedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedEntities: Self = this.set("supportedEntities", js.undefined)
    
    @scala.inline
    def setSupportedEntitiesNull: Self = this.set("supportedEntities", null)
    
    @scala.inline
    def setUrl(value: NullableOption[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlNull: Self = this.set("url", null)
  }
}
