package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpage extends StObject {
  
  var path: Enterprise
  
  var query: Perpage
}
object QueryPerpage {
  
  inline def apply(path: Enterprise, query: Perpage): QueryPerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpage]
  }
  
  extension [Self <: QueryPerpage](x: Self) {
    
    inline def setPath(value: Enterprise): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Perpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
