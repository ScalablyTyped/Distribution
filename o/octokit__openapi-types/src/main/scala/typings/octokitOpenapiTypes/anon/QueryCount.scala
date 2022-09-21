package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryCount extends StObject {
  
  var path: Enterprise
  
  var query: Count
}
object QueryCount {
  
  inline def apply(path: Enterprise, query: Count): QueryCount = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCount]
  }
  
  extension [Self <: QueryCount](x: Self) {
    
    inline def setPath(value: Enterprise): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Count): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
