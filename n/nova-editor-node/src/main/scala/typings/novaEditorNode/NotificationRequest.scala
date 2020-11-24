package typings.novaEditorNode

import typings.novaEditorNode.novaEditorNodeStrings.`secure-input`
import typings.novaEditorNode.novaEditorNodeStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/notification-request/
@js.native
trait NotificationRequest extends js.Object {
  
  var actions: js.UndefOr[js.Array[String]] = js.native
  
  var body: js.UndefOr[String] = js.native
  
  val identifier: String = js.native
  
  var textInputPlaceholder: js.UndefOr[String] = js.native
  
  var textInputValue: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[input | `secure-input`] = js.native
}
object NotificationRequest {
  
  @scala.inline
  def apply(identifier: String): NotificationRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationRequest]
  }
  
  @scala.inline
  implicit class NotificationRequestOps[Self <: NotificationRequest] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setTextInputPlaceholder(value: String): Self = this.set("textInputPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextInputPlaceholder: Self = this.set("textInputPlaceholder", js.undefined)
    
    @scala.inline
    def setTextInputValue(value: String): Self = this.set("textInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextInputValue: Self = this.set("textInputValue", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: input | `secure-input`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
