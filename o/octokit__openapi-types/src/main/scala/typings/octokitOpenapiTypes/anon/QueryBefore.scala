package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBefore extends StObject {
  
  var path: Enterprise
  
  var query: Before
}
object QueryBefore {
  
  inline def apply(path: Enterprise, query: Before): QueryBefore = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBefore]
  }
  
  extension [Self <: QueryBefore](x: Self) {
    
    inline def setPath(value: Enterprise): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Before): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
