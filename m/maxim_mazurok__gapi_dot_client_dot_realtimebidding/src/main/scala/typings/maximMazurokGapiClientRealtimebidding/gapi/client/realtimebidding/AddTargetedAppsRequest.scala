package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTargetedAppsRequest extends js.Object {
  
  /**
    * A list of app IDs to target in the pretargeting configuration. These values will be added to the list of targeted app IDs in
    * PretargetingConfig.appTargeting.mobileAppTargeting.values.
    */
  var appIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. The targeting mode that should be applied to the list of app IDs. If there are existing targeted app IDs, must be equal to the existing
    * PretargetingConfig.appTargeting.mobileAppTargeting.targetingMode or a 400 bad request error will be returned.
    */
  var targetingMode: js.UndefOr[String] = js.native
}
object AddTargetedAppsRequest {
  
  @scala.inline
  def apply(): AddTargetedAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTargetedAppsRequest]
  }
  
  @scala.inline
  implicit class AddTargetedAppsRequestOps[Self <: AddTargetedAppsRequest] (val x: Self) extends AnyVal {
    
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
    def setAppIdsVarargs(value: String*): Self = this.set("appIds", js.Array(value :_*))
    
    @scala.inline
    def setAppIds(value: js.Array[String]): Self = this.set("appIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppIds: Self = this.set("appIds", js.undefined)
    
    @scala.inline
    def setTargetingMode(value: String): Self = this.set("targetingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingMode: Self = this.set("targetingMode", js.undefined)
  }
}
