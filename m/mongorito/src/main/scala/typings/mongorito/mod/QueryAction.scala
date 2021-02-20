package typings.mongorito.mod

import typings.mongorito.anon.Args
import typings.mongorito.mod.ActionTypes.QUERY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryAction extends Action {
  
  var method: String = js.native
  
  var query: js.Array[Args] = js.native
  
  var `type`: QUERY = js.native
}
object QueryAction {
  
  @scala.inline
  def apply(method: String, query: js.Array[Args], `type`: QUERY): QueryAction = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAction]
  }
  
  @scala.inline
  implicit class QueryActionMutableBuilder[Self <: QueryAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Array[Args]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryVarargs(value: Args*): Self = StObject.set(x, "query", js.Array(value :_*))
    
    @scala.inline
    def setType(value: QUERY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
