package typings.novaEditorNode

import typings.novaEditorNode.novaEditorNodeStrings.`secure-input`
import typings.novaEditorNode.novaEditorNodeStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/notification-request/
@js.native
trait NotificationRequest extends StObject {
  
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
  implicit class NotificationRequestMutableBuilder[Self <: NotificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInputPlaceholder(value: String): Self = StObject.set(x, "textInputPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInputPlaceholderUndefined: Self = StObject.set(x, "textInputPlaceholder", js.undefined)
    
    @scala.inline
    def setTextInputValue(value: String): Self = StObject.set(x, "textInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInputValueUndefined: Self = StObject.set(x, "textInputValue", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: input | `secure-input`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
