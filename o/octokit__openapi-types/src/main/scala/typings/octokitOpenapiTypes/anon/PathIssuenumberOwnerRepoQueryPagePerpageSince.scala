package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerRepoQueryPagePerpageSince extends StObject {
  
  var path: IssuenumberOwnerRepo
  
  var query: PagePerpageSince
}
object PathIssuenumberOwnerRepoQueryPagePerpageSince {
  
  inline def apply(path: IssuenumberOwnerRepo, query: PagePerpageSince): PathIssuenumberOwnerRepoQueryPagePerpageSince = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerRepoQueryPagePerpageSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathIssuenumberOwnerRepoQueryPagePerpageSince] (val x: Self) extends AnyVal {
    
    inline def setPath(value: IssuenumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
