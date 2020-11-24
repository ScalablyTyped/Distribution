package typings.notyf.notyfModelsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRenderedNotification extends js.Object {
  
  var node: HTMLElement = js.native
  
  var notification: NotyfNotification = js.native
}
object IRenderedNotification {
  
  @scala.inline
  def apply(node: HTMLElement, notification: NotyfNotification): IRenderedNotification = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderedNotification]
  }
  
  @scala.inline
  implicit class IRenderedNotificationOps[Self <: IRenderedNotification] (val x: Self) extends AnyVal {
    
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
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: NotyfNotification): Self = this.set("notification", value.asInstanceOf[js.Any])
  }
}
