package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerRepoQuery426 extends StObject {
  
  var path: IssuenumberOwnerRepo
  
  var query: `426`
}
object PathIssuenumberOwnerRepoQuery426 {
  
  inline def apply(path: IssuenumberOwnerRepo, query: `426`): PathIssuenumberOwnerRepoQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerRepoQuery426]
  }
  
  extension [Self <: PathIssuenumberOwnerRepoQuery426](x: Self) {
    
    inline def setPath(value: IssuenumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
