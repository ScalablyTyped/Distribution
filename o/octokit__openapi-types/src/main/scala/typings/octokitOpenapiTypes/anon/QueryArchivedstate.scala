package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryArchivedstate extends StObject {
  
  var path: `135`
  
  var query: Archivedstate
}
object QueryArchivedstate {
  
  inline def apply(path: `135`, query: Archivedstate): QueryArchivedstate = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArchivedstate]
  }
  
  extension [Self <: QueryArchivedstate](x: Self) {
    
    inline def setPath(value: `135`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Archivedstate): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
