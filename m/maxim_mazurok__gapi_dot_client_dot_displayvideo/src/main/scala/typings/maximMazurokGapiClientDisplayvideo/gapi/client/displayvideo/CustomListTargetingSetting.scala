package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomListTargetingSetting extends js.Object {
  
  /** Required. Custom id of custom list targeting setting. This id is custom_list_id. */
  var customListId: js.UndefOr[String] = js.native
}
object CustomListTargetingSetting {
  
  @scala.inline
  def apply(): CustomListTargetingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomListTargetingSetting]
  }
  
  @scala.inline
  implicit class CustomListTargetingSettingOps[Self <: CustomListTargetingSetting] (val x: Self) extends AnyVal {
    
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
    def setCustomListId(value: String): Self = this.set("customListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomListId: Self = this.set("customListId", js.undefined)
  }
}
