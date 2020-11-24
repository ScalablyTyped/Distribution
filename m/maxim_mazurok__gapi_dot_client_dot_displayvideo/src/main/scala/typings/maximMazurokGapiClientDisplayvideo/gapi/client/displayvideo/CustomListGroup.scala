package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomListGroup extends js.Object {
  
  /** Required. All custom list targeting settings in custom list group. Repeated settings with same id will be ignored. */
  var settings: js.UndefOr[js.Array[CustomListTargetingSetting]] = js.native
}
object CustomListGroup {
  
  @scala.inline
  def apply(): CustomListGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomListGroup]
  }
  
  @scala.inline
  implicit class CustomListGroupOps[Self <: CustomListGroup] (val x: Self) extends AnyVal {
    
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
    def setSettingsVarargs(value: CustomListTargetingSetting*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: js.Array[CustomListTargetingSetting]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
