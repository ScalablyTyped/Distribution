package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityContentDetailsBulletin extends js.Object {
  
  /** The resourceId object contains information that identifies the resource associated with a bulletin post. @mutable youtube.activities.insert */
  var resourceId: js.UndefOr[ResourceId] = js.native
}
object ActivityContentDetailsBulletin {
  
  @scala.inline
  def apply(): ActivityContentDetailsBulletin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsBulletin]
  }
  
  @scala.inline
  implicit class ActivityContentDetailsBulletinOps[Self <: ActivityContentDetailsBulletin] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: ResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
  }
}
