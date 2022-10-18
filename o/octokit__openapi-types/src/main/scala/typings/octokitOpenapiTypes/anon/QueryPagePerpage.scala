package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpage extends StObject {
  
  var path: Secretname
  
  var query: PagePerpage
}
object QueryPagePerpage {
  
  inline def apply(path: Secretname, query: PagePerpage): QueryPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpage]
  }
  
  extension [Self <: QueryPagePerpage](x: Self) {
    
    inline def setPath(value: Secretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
