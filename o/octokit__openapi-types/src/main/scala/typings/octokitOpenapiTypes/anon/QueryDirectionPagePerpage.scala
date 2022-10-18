package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDirectionPagePerpage extends StObject {
  
  var path: Discussionnumber
  
  var query: DirectionPagePerpage
}
object QueryDirectionPagePerpage {
  
  inline def apply(path: Discussionnumber, query: DirectionPagePerpage): QueryDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDirectionPagePerpage]
  }
  
  extension [Self <: QueryDirectionPagePerpage](x: Self) {
    
    inline def setPath(value: Discussionnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
