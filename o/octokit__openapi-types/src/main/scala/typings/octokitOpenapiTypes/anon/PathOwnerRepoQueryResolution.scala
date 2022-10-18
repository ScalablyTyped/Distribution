package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoQueryResolution extends StObject {
  
  var path: OwnerRepo
  
  var query: Resolution
}
object PathOwnerRepoQueryResolution {
  
  inline def apply(path: OwnerRepo, query: Resolution): PathOwnerRepoQueryResolution = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoQueryResolution]
  }
  
  extension [Self <: PathOwnerRepoQueryResolution](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Resolution): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
