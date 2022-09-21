package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageRef extends StObject {
  
  var path: Alertnumber
  
  var query: PerpageRef
}
object QueryPerpageRef {
  
  inline def apply(path: Alertnumber, query: PerpageRef): QueryPerpageRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageRef]
  }
  
  extension [Self <: QueryPerpageRef](x: Self) {
    
    inline def setPath(value: Alertnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
