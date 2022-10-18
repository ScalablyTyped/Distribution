package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRefRepoQuery250 extends StObject {
  
  var path: OwnerRefRepo
  
  var query: `250`
}
object PathOwnerRefRepoQuery250 {
  
  inline def apply(path: OwnerRefRepo, query: `250`): PathOwnerRefRepoQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRefRepoQuery250]
  }
  
  extension [Self <: PathOwnerRefRepoQuery250](x: Self) {
    
    inline def setPath(value: OwnerRefRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
