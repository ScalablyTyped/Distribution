package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/notification-response/
trait NotificationResponse extends StObject {
  
  val actionIdx: Double | Null
  
  val identifier: String
  
  val textInputValue: js.UndefOr[String] = js.undefined
}
object NotificationResponse {
  
  inline def apply(identifier: String): NotificationResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], actionIdx = null)
    __obj.asInstanceOf[NotificationResponse]
  }
  
  extension [Self <: NotificationResponse](x: Self) {
    
    inline def setActionIdx(value: Double): Self = StObject.set(x, "actionIdx", value.asInstanceOf[js.Any])
    
    inline def setActionIdxNull: Self = StObject.set(x, "actionIdx", null)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setTextInputValue(value: String): Self = StObject.set(x, "textInputValue", value.asInstanceOf[js.Any])
    
    inline def setTextInputValueUndefined: Self = StObject.set(x, "textInputValue", js.undefined)
  }
}
