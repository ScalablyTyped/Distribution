package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChosenInlineResult extends StObject {
  
  var from: User = js.native
  
  var inline_message_id: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var query: String = js.native
  
  var result_id: String = js.native
}
object ChosenInlineResult {
  
  @scala.inline
  def apply(from: User, query: String, result_id: String): ChosenInlineResult = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], result_id = result_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChosenInlineResult]
  }
  
  @scala.inline
  implicit class ChosenInlineResultMutableBuilder[Self <: ChosenInlineResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_message_id(value: String): Self = StObject.set(x, "inline_message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_message_idUndefined: Self = StObject.set(x, "inline_message_id", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult_id(value: String): Self = StObject.set(x, "result_id", value.asInstanceOf[js.Any])
  }
}
