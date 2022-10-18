package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoQueryPagePerpage extends StObject {
  
  var path: OwnerRepo
  
  var query: PagePerpage
}
object PathOwnerRepoQueryPagePerpage {
  
  inline def apply(path: OwnerRepo, query: PagePerpage): PathOwnerRepoQueryPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoQueryPagePerpage]
  }
  
  extension [Self <: PathOwnerRepoQueryPagePerpage](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
