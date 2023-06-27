package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerStringQuery extends StObject {
  
  var path: OwnerString
  
  var query: js.UndefOr[NamePagePerpage] = js.undefined
}
object PathOwnerStringQuery {
  
  inline def apply(path: OwnerString): PathOwnerStringQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerStringQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: NamePagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
