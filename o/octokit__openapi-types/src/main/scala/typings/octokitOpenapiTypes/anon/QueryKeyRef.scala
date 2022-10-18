package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryKeyRef extends StObject {
  
  var path: OwnerRepo
  
  var query: KeyRef
}
object QueryKeyRef {
  
  inline def apply(path: OwnerRepo, query: KeyRef): QueryKeyRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryKeyRef]
  }
  
  extension [Self <: QueryKeyRef](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: KeyRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
