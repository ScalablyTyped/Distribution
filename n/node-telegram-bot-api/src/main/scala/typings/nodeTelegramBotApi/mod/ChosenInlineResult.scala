package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChosenInlineResult extends StObject {
  
  var from: User
  
  var inline_message_id: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[Location] = js.undefined
  
  var query: String
  
  var result_id: String
}
object ChosenInlineResult {
  
  inline def apply(from: User, query: String, result_id: String): ChosenInlineResult = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], result_id = result_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChosenInlineResult]
  }
  
  extension [Self <: ChosenInlineResult](x: Self) {
    
    inline def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setInline_message_id(value: String): Self = StObject.set(x, "inline_message_id", value.asInstanceOf[js.Any])
    
    inline def setInline_message_idUndefined: Self = StObject.set(x, "inline_message_id", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult_id(value: String): Self = StObject.set(x, "result_id", value.asInstanceOf[js.Any])
  }
}
