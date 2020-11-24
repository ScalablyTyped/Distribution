package typings.notyf.notyfOptionsMod

import typings.notyf.notyfBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotyfNotificationOptions extends js.Object {
  
  var background: String = js.native
  
  /**
    * @deprecated Use `background` instead. Removal target: v4.0.0.
    */
  var backgroundColor: String = js.native
  
  var className: String = js.native
  
  var dismissible: Boolean = js.native
  
  var duration: Double = js.native
  
  var icon: INotyfIcon | `false` = js.native
  
  var message: String = js.native
  
  var position: INotyfPosition = js.native
  
  var ripple: Boolean = js.native
  
  var `type`: String = js.native
}
object INotyfNotificationOptions {
  
  @scala.inline
  def apply(
    background: String,
    backgroundColor: String,
    className: String,
    dismissible: Boolean,
    duration: Double,
    icon: INotyfIcon | `false`,
    message: String,
    position: INotyfPosition,
    ripple: Boolean,
    `type`: String
  ): INotyfNotificationOptions = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dismissible = dismissible.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ripple = ripple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotyfNotificationOptions]
  }
  
  @scala.inline
  implicit class INotyfNotificationOptionsOps[Self <: INotyfNotificationOptions] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissible(value: Boolean): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: INotyfIcon | `false`): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: INotyfPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRipple(value: Boolean): Self = this.set("ripple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
