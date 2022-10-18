package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerRepoQuery374 extends StObject {
  
  var path: IssuenumberOwnerRepo
  
  var query: `374`
}
object PathIssuenumberOwnerRepoQuery374 {
  
  inline def apply(path: IssuenumberOwnerRepo, query: `374`): PathIssuenumberOwnerRepoQuery374 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerRepoQuery374]
  }
  
  extension [Self <: PathIssuenumberOwnerRepoQuery374](x: Self) {
    
    inline def setPath(value: IssuenumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `374`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
