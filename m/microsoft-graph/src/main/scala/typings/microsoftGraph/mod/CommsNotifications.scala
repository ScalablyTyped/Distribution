package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommsNotifications extends js.Object {
  
  // The notification of a change in the resource.
  var value: js.UndefOr[NullableOption[js.Array[CommsNotification]]] = js.native
}
object CommsNotifications {
  
  @scala.inline
  def apply(): CommsNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommsNotifications]
  }
  
  @scala.inline
  implicit class CommsNotificationsOps[Self <: CommsNotifications] (val x: Self) extends AnyVal {
    
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
    def setValueVarargs(value: CommsNotification*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: NullableOption[js.Array[CommsNotification]]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
