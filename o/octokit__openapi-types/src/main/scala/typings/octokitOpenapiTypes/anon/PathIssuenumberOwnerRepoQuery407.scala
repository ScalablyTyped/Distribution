package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerRepoQuery407 extends StObject {
  
  var path: IssuenumberOwnerRepo
  
  var query: `407`
}
object PathIssuenumberOwnerRepoQuery407 {
  
  inline def apply(path: IssuenumberOwnerRepo, query: `407`): PathIssuenumberOwnerRepoQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerRepoQuery407]
  }
  
  extension [Self <: PathIssuenumberOwnerRepoQuery407](x: Self) {
    
    inline def setPath(value: IssuenumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
