package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoQueryPagePerpageState extends StObject {
  
  var path: OwnerRepo
  
  var query: PagePerpageState
}
object PathOwnerRepoQueryPagePerpageState {
  
  inline def apply(path: OwnerRepo, query: PagePerpageState): PathOwnerRepoQueryPagePerpageState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoQueryPagePerpageState]
  }
  
  extension [Self <: PathOwnerRepoQueryPagePerpageState](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
