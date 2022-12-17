package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExclude extends StObject {
  
  var path: Org
  
  var query: Exclude
}
object QueryExclude {
  
  inline def apply(path: Org, query: Exclude): QueryExclude = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExclude]
  }
  
  extension [Self <: QueryExclude](x: Self) {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Exclude): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
