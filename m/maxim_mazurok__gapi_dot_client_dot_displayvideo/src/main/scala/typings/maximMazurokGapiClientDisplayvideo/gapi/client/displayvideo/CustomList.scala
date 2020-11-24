package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomList extends js.Object {
  
  /** Output only. The unique ID of the custom list. Assigned by the system. */
  var customListId: js.UndefOr[String] = js.native
  
  /** Output only. The display name of the custom list. . */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the custom list. */
  var name: js.UndefOr[String] = js.native
}
object CustomList {
  
  @scala.inline
  def apply(): CustomList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomList]
  }
  
  @scala.inline
  implicit class CustomListOps[Self <: CustomList] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
