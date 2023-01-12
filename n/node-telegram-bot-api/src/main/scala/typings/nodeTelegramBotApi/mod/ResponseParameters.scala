package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseParameters extends StObject {
  
  var migrate_to_chat_id: js.UndefOr[Double] = js.undefined
  
  var retry_after: js.UndefOr[Double] = js.undefined
}
object ResponseParameters {
  
  inline def apply(): ResponseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseParameters] (val x: Self) extends AnyVal {
    
    inline def setMigrate_to_chat_id(value: Double): Self = StObject.set(x, "migrate_to_chat_id", value.asInstanceOf[js.Any])
    
    inline def setMigrate_to_chat_idUndefined: Self = StObject.set(x, "migrate_to_chat_id", js.undefined)
    
    inline def setRetry_after(value: Double): Self = StObject.set(x, "retry_after", value.asInstanceOf[js.Any])
    
    inline def setRetry_afterUndefined: Self = StObject.set(x, "retry_after", js.undefined)
  }
}
