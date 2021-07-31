package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseParameters extends StObject {
  
  var migrate_to_chat_id: js.UndefOr[Double] = js.undefined
  
  var retry_after: js.UndefOr[Double] = js.undefined
}
object ResponseParameters {
  
  @scala.inline
  def apply(): ResponseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseParameters]
  }
  
  @scala.inline
  implicit class ResponseParametersMutableBuilder[Self <: ResponseParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMigrate_to_chat_id(value: Double): Self = StObject.set(x, "migrate_to_chat_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrate_to_chat_idUndefined: Self = StObject.set(x, "migrate_to_chat_id", js.undefined)
    
    @scala.inline
    def setRetry_after(value: Double): Self = StObject.set(x, "retry_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry_afterUndefined: Self = StObject.set(x, "retry_after", js.undefined)
  }
}
