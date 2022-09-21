package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerRepoQuery481 extends StObject {
  
  var path: IssuenumberOwnerRepo
  
  var query: `481`
}
object PathIssuenumberOwnerRepoQuery481 {
  
  inline def apply(path: IssuenumberOwnerRepo, query: `481`): PathIssuenumberOwnerRepoQuery481 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerRepoQuery481]
  }
  
  extension [Self <: PathIssuenumberOwnerRepoQuery481](x: Self) {
    
    inline def setPath(value: IssuenumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `481`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
