package typings.novaEditorNode

import typings.novaEditorNode.novaEditorNodeStrings.`secure-input`
import typings.novaEditorNode.novaEditorNodeStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/notification-request/
trait NotificationRequest extends StObject {
  
  var actions: js.UndefOr[js.Array[String]] = js.undefined
  
  var body: js.UndefOr[String] = js.undefined
  
  val identifier: String
  
  var textInputPlaceholder: js.UndefOr[String] = js.undefined
  
  var textInputValue: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[input | `secure-input`] = js.undefined
}
object NotificationRequest {
  
  inline def apply(identifier: String): NotificationRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationRequest] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setTextInputPlaceholder(value: String): Self = StObject.set(x, "textInputPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setTextInputPlaceholderUndefined: Self = StObject.set(x, "textInputPlaceholder", js.undefined)
    
    inline def setTextInputValue(value: String): Self = StObject.set(x, "textInputValue", value.asInstanceOf[js.Any])
    
    inline def setTextInputValueUndefined: Self = StObject.set(x, "textInputValue", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: input | `secure-input`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
