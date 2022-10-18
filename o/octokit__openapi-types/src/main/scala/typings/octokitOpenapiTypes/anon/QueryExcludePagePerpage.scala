package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExcludePagePerpage extends StObject {
  
  var path: `300`
  
  var query: ExcludePagePerpage
}
object QueryExcludePagePerpage {
  
  inline def apply(path: `300`, query: ExcludePagePerpage): QueryExcludePagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExcludePagePerpage]
  }
  
  extension [Self <: QueryExcludePagePerpage](x: Self) {
    
    inline def setPath(value: `300`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ExcludePagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
