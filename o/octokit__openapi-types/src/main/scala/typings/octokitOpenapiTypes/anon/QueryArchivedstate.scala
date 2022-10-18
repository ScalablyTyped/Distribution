package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryArchivedstate extends StObject {
  
  var path: ColumnidNumber
  
  var query: Archivedstate
}
object QueryArchivedstate {
  
  inline def apply(path: ColumnidNumber, query: Archivedstate): QueryArchivedstate = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArchivedstate]
  }
  
  extension [Self <: QueryArchivedstate](x: Self) {
    
    inline def setPath(value: ColumnidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Archivedstate): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
