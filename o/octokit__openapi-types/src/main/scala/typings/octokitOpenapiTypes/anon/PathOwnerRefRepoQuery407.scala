package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRefRepoQuery407 extends StObject {
  
  var path: OwnerRefRepo
  
  var query: `407`
}
object PathOwnerRefRepoQuery407 {
  
  inline def apply(path: OwnerRefRepo, query: `407`): PathOwnerRefRepoQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRefRepoQuery407]
  }
  
  extension [Self <: PathOwnerRefRepoQuery407](x: Self) {
    
    inline def setPath(value: OwnerRefRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
