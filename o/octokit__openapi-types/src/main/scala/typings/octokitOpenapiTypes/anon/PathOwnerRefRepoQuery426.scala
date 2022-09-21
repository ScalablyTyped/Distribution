package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRefRepoQuery426 extends StObject {
  
  var path: OwnerRefRepo
  
  var query: `426`
}
object PathOwnerRefRepoQuery426 {
  
  inline def apply(path: OwnerRefRepo, query: `426`): PathOwnerRefRepoQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRefRepoQuery426]
  }
  
  extension [Self <: PathOwnerRefRepoQuery426](x: Self) {
    
    inline def setPath(value: OwnerRefRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
