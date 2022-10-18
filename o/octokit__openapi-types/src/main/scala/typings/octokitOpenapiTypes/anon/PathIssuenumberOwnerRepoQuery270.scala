package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerRepoQuery270 extends StObject {
  
  var path: IssuenumberOwnerRepo
  
  var query: `270`
}
object PathIssuenumberOwnerRepoQuery270 {
  
  inline def apply(path: IssuenumberOwnerRepo, query: `270`): PathIssuenumberOwnerRepoQuery270 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerRepoQuery270]
  }
  
  extension [Self <: PathIssuenumberOwnerRepoQuery270](x: Self) {
    
    inline def setPath(value: IssuenumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `270`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
