package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/notification-response/
@js.native
trait NotificationResponse extends StObject {
  
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
  implicit class NotificationResponseMutableBuilder[Self <: NotificationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionIdx(value: Double): Self = StObject.set(x, "actionIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdxNull: Self = StObject.set(x, "actionIdx", null)
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInputValue(value: String): Self = StObject.set(x, "textInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInputValueUndefined: Self = StObject.set(x, "textInputValue", js.undefined)
  }
}
