package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBaseDirection extends StObject {
  
  var path: OwnerRepo
  
  var query: BaseDirection
}
object QueryBaseDirection {
  
  inline def apply(path: OwnerRepo, query: BaseDirection): QueryBaseDirection = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBaseDirection]
  }
  
  extension [Self <: QueryBaseDirection](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: BaseDirection): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
