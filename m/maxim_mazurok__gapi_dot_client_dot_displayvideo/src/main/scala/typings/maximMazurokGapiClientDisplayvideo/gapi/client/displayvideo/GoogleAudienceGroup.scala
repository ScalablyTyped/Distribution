package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAudienceGroup extends js.Object {
  
  /** Required. All Google audience targeting settings in Google audience group. Repeated settings with same id will be ignored. */
  var settings: js.UndefOr[js.Array[GoogleAudienceTargetingSetting]] = js.native
}
object GoogleAudienceGroup {
  
  @scala.inline
  def apply(): GoogleAudienceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAudienceGroup]
  }
  
  @scala.inline
  implicit class GoogleAudienceGroupOps[Self <: GoogleAudienceGroup] (val x: Self) extends AnyVal {
    
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
    def setSettingsVarargs(value: GoogleAudienceTargetingSetting*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: js.Array[GoogleAudienceTargetingSetting]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
