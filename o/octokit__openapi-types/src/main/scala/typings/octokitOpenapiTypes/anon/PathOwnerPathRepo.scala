package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerPathRepo extends StObject {
  
  var path: OwnerPathRepo
  
  var query: `197`
}
object PathOwnerPathRepo {
  
  inline def apply(path: OwnerPathRepo, query: `197`): PathOwnerPathRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerPathRepo]
  }
  
  extension [Self <: PathOwnerPathRepo](x: Self) {
    
    inline def setPath(value: OwnerPathRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `197`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
