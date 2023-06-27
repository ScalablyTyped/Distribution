package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttemptnumberOwnerQuery extends StObject {
  
  var path: AttemptnumberOwner
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathAttemptnumberOwnerQuery {
  
  inline def apply(path: AttemptnumberOwner): PathAttemptnumberOwnerQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttemptnumberOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAttemptnumberOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AttemptnumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
