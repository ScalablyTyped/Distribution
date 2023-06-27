package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRefRepoQuery extends StObject {
  
  var path: OwnerRefRepo
  
  var query: js.UndefOr[PerpageStatus] = js.undefined
}
object PathOwnerRefRepoQuery {
  
  inline def apply(path: OwnerRefRepo): PathOwnerRefRepoQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRefRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerRefRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRefRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageStatus): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
