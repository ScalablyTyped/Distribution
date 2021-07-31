package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQuery extends StObject {
  
  var from: User
  
  var id: String
  
  var location: js.UndefOr[Location] = js.undefined
  
  var offset: String
  
  var query: String
}
object InlineQuery {
  
  @scala.inline
  def apply(from: User, id: String, offset: String, query: String): InlineQuery = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQuery]
  }
  
  @scala.inline
  implicit class InlineQueryMutableBuilder[Self <: InlineQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
