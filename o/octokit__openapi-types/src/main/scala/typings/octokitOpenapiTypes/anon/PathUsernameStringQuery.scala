package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathUsernameStringQuery extends StObject {
  
  var path: UsernameString
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathUsernameStringQuery {
  
  inline def apply(path: UsernameString): PathUsernameStringQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathUsernameStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathUsernameStringQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: UsernameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
