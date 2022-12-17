package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryState extends StObject {
  
  var path: Packagename
  
  var query: State
}
object QueryState {
  
  inline def apply(path: Packagename, query: State): QueryState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryState]
  }
  
  extension [Self <: QueryState](x: Self) {
    
    inline def setPath(value: Packagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: State): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
