package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumberOwnerRepoQuery extends StObject {
  
  var path: AlertnumberOwnerRepo
  
  var query: js.UndefOr[PagePerpageRef] = js.undefined
}
object PathAlertnumberOwnerRepoQuery {
  
  inline def apply(path: AlertnumberOwnerRepo): PathAlertnumberOwnerRepoQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumberOwnerRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAlertnumberOwnerRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AlertnumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
