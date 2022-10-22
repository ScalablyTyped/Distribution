package typings.mongorito.mod

import typings.mongorito.anon.Args
import typings.mongorito.mod.ActionTypes.QUERY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAction
  extends StObject
     with Action {
  
  var method: String
  
  var query: js.Array[Args]
  
  var `type`: QUERY
}
object QueryAction {
  
  inline def apply(method: String, query: js.Array[Args], `type`: QUERY): QueryAction = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAction]
  }
  
  extension [Self <: QueryAction](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: js.Array[Args]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryVarargs(value: Args*): Self = StObject.set(x, "query", js.Array(value*))
    
    inline def setType(value: QUERY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
