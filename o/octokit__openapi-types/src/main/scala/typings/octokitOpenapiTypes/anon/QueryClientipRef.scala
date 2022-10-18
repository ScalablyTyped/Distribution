package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryClientipRef extends StObject {
  
  var path: OwnerRepo
  
  var query: ClientipRef
}
object QueryClientipRef {
  
  inline def apply(path: OwnerRepo, query: ClientipRef): QueryClientipRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryClientipRef]
  }
  
  extension [Self <: QueryClientipRef](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ClientipRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
