package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerRepoQuery extends StObject {
  
  var path: IssuenumberOwnerRepo
  
  var query: js.UndefOr[PagePerpageSince] = js.undefined
}
object PathIssuenumberOwnerRepoQuery {
  
  inline def apply(path: IssuenumberOwnerRepo): PathIssuenumberOwnerRepoQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathIssuenumberOwnerRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: IssuenumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
