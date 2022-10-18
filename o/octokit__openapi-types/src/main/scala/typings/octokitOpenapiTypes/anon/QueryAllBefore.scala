package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAllBefore extends StObject {
  
  var path: OwnerRepo
  
  var query: AllBefore
}
object QueryAllBefore {
  
  inline def apply(path: OwnerRepo, query: AllBefore): QueryAllBefore = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAllBefore]
  }
  
  extension [Self <: QueryAllBefore](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AllBefore): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
