package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstAndThirdPartyAudienceGroup extends js.Object {
  
  /** Required. All first and third party audience targeting settings in first and third party audience group. Repeated settings with same id are not allowed. */
  var settings: js.UndefOr[js.Array[FirstAndThirdPartyAudienceTargetingSetting]] = js.native
}
object FirstAndThirdPartyAudienceGroup {
  
  @scala.inline
  def apply(): FirstAndThirdPartyAudienceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstAndThirdPartyAudienceGroup]
  }
  
  @scala.inline
  implicit class FirstAndThirdPartyAudienceGroupOps[Self <: FirstAndThirdPartyAudienceGroup] (val x: Self) extends AnyVal {
    
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
    def setSettingsVarargs(value: FirstAndThirdPartyAudienceTargetingSetting*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: js.Array[FirstAndThirdPartyAudienceTargetingSetting]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
