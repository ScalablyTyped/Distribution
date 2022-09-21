package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryInclude extends StObject {
  
  var path: Org
  
  var query: Include
}
object QueryInclude {
  
  inline def apply(path: Org, query: Include): QueryInclude = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInclude]
  }
  
  extension [Self <: QueryInclude](x: Self) {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Include): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
