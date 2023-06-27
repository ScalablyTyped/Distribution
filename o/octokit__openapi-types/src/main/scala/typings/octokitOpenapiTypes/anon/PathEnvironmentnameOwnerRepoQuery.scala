package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameOwnerRepoQuery extends StObject {
  
  var path: EnvironmentnameOwnerRepo
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathEnvironmentnameOwnerRepoQuery {
  
  inline def apply(path: EnvironmentnameOwnerRepo): PathEnvironmentnameOwnerRepoQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameOwnerRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameOwnerRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
