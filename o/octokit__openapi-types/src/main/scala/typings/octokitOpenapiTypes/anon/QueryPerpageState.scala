package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageState extends StObject {
  
  var path: Packagename
  
  var query: PerpageState
}
object QueryPerpageState {
  
  inline def apply(path: Packagename, query: PerpageState): QueryPerpageState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageState]
  }
  
  extension [Self <: QueryPerpageState](x: Self) {
    
    inline def setPath(value: Packagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
