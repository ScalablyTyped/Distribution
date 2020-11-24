package typings.mfiles

import typings.mfiles.mfilesNumbers.`1`
import typings.mfiles.mfilesNumbers.`2`
import typings.mfiles.mfilesNumbers.`3`
import typings.mfiles.mfilesNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessage extends js.Object {
  
  var button1_enabled: js.UndefOr[Boolean] = js.native
  
  var button1_title: js.UndefOr[String] = js.native
  
  var button2_enabled: js.UndefOr[Boolean] = js.native
  
  var button2_title: js.UndefOr[String] = js.native
  
  var button3_enabled: js.UndefOr[Boolean] = js.native
  
  var button3_title: js.UndefOr[String] = js.native
  
  var button4_enabled: js.UndefOr[Boolean] = js.native
  
  var button4_title: js.UndefOr[String] = js.native
  
  var cancelButton: js.UndefOr[`1` | `2` | `3` | `4`] = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var checkbox_checked: js.UndefOr[Boolean] = js.native
  
  var checkbox_enabled: js.UndefOr[Boolean] = js.native
  
  var checkbox_title: js.UndefOr[String] = js.native
  
  var defaultButton: js.UndefOr[`1` | `2` | `3` | `4`] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var timeOut: js.UndefOr[Double] = js.native
  
  var timeOutButton: js.UndefOr[`1` | `2` | `3` | `4`] = js.native
  
  var timeout_deactivateOnFocusChange: js.UndefOr[Boolean] = js.native
}
object IMessage {
  
  @scala.inline
  def apply(): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessage]
  }
  
  @scala.inline
  implicit class IMessageOps[Self <: IMessage] (val x: Self) extends AnyVal {
    
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
    def setButton1_enabled(value: Boolean): Self = this.set("button1_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton1_enabled: Self = this.set("button1_enabled", js.undefined)
    
    @scala.inline
    def setButton1_title(value: String): Self = this.set("button1_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton1_title: Self = this.set("button1_title", js.undefined)
    
    @scala.inline
    def setButton2_enabled(value: Boolean): Self = this.set("button2_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton2_enabled: Self = this.set("button2_enabled", js.undefined)
    
    @scala.inline
    def setButton2_title(value: String): Self = this.set("button2_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton2_title: Self = this.set("button2_title", js.undefined)
    
    @scala.inline
    def setButton3_enabled(value: Boolean): Self = this.set("button3_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton3_enabled: Self = this.set("button3_enabled", js.undefined)
    
    @scala.inline
    def setButton3_title(value: String): Self = this.set("button3_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton3_title: Self = this.set("button3_title", js.undefined)
    
    @scala.inline
    def setButton4_enabled(value: Boolean): Self = this.set("button4_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton4_enabled: Self = this.set("button4_enabled", js.undefined)
    
    @scala.inline
    def setButton4_title(value: String): Self = this.set("button4_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton4_title: Self = this.set("button4_title", js.undefined)
    
    @scala.inline
    def setCancelButton(value: `1` | `2` | `3` | `4`): Self = this.set("cancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButton: Self = this.set("cancelButton", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setCheckbox_checked(value: Boolean): Self = this.set("checkbox_checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckbox_checked: Self = this.set("checkbox_checked", js.undefined)
    
    @scala.inline
    def setCheckbox_enabled(value: Boolean): Self = this.set("checkbox_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckbox_enabled: Self = this.set("checkbox_enabled", js.undefined)
    
    @scala.inline
    def setCheckbox_title(value: String): Self = this.set("checkbox_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckbox_title: Self = this.set("checkbox_title", js.undefined)
    
    @scala.inline
    def setDefaultButton(value: `1` | `2` | `3` | `4`): Self = this.set("defaultButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultButton: Self = this.set("defaultButton", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setTimeOut(value: Double): Self = this.set("timeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOut: Self = this.set("timeOut", js.undefined)
    
    @scala.inline
    def setTimeOutButton(value: `1` | `2` | `3` | `4`): Self = this.set("timeOutButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOutButton: Self = this.set("timeOutButton", js.undefined)
    
    @scala.inline
    def setTimeout_deactivateOnFocusChange(value: Boolean): Self = this.set("timeout_deactivateOnFocusChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout_deactivateOnFocusChange: Self = this.set("timeout_deactivateOnFocusChange", js.undefined)
  }
}
