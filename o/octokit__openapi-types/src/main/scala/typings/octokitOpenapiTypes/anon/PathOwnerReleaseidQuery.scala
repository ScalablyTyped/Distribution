package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerReleaseidQuery extends StObject {
  
  var path: OwnerReleaseid
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathOwnerReleaseidQuery {
  
  inline def apply(path: OwnerReleaseid): PathOwnerReleaseidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerReleaseidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerReleaseidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
