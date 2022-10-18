package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryUntil extends StObject {
  
  var path: OwnerRepo
  
  var query: Until
}
object QueryUntil {
  
  inline def apply(path: OwnerRepo, query: Until): QueryUntil = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryUntil]
  }
  
  extension [Self <: QueryUntil](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Until): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
