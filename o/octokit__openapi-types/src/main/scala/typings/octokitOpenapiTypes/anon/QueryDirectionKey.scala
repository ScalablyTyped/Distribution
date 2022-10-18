package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDirectionKey extends StObject {
  
  var path: OwnerRepo
  
  var query: DirectionKey
}
object QueryDirectionKey {
  
  inline def apply(path: OwnerRepo, query: DirectionKey): QueryDirectionKey = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDirectionKey]
  }
  
  extension [Self <: QueryDirectionKey](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionKey): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
