package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommsNotification extends js.Object {
  
  // Possible values are: created, updated, deleted.
  var changeType: js.UndefOr[ChangeType] = js.native
  
  // URI of the resource that was changed.
  var resourceUrl: js.UndefOr[String] = js.native
}
object CommsNotification {
  
  @scala.inline
  def apply(): CommsNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommsNotification]
  }
  
  @scala.inline
  implicit class CommsNotificationOps[Self <: CommsNotification] (val x: Self) extends AnyVal {
    
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
    def setChangeType(value: ChangeType): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeType: Self = this.set("changeType", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = this.set("resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUrl: Self = this.set("resourceUrl", js.undefined)
  }
}
