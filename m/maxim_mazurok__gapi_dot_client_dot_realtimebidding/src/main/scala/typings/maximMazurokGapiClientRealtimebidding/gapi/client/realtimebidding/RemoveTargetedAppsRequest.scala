package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTargetedAppsRequest extends js.Object {
  
  /**
    * A list of app IDs to stop targeting in the pretargeting configuration. These values will be removed from the list of targeted app IDs in
    * PretargetingConfig.appTargeting.mobileAppTargeting.values.
    */
  var appIds: js.UndefOr[js.Array[String]] = js.native
}
object RemoveTargetedAppsRequest {
  
  @scala.inline
  def apply(): RemoveTargetedAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTargetedAppsRequest]
  }
  
  @scala.inline
  implicit class RemoveTargetedAppsRequestOps[Self <: RemoveTargetedAppsRequest] (val x: Self) extends AnyVal {
    
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
  }
}
