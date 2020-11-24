package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/notification-response/
@js.native
trait NotificationResponse extends js.Object {
  
  val actionIdx: Double | Null = js.native
  
  val identifier: String = js.native
  
  val textInputValue: js.UndefOr[String] = js.native
}
object NotificationResponse {
  
  @scala.inline
  def apply(identifier: String): NotificationResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationResponse]
  }
  
  @scala.inline
  implicit class NotificationResponseOps[Self <: NotificationResponse] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdx(value: Double): Self = this.set("actionIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdxNull: Self = this.set("actionIdx", null)
    
    @scala.inline
    def setTextInputValue(value: String): Self = this.set("textInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextInputValue: Self = this.set("textInputValue", js.undefined)
  }
}
