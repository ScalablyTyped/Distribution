package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameOwnerQuery extends StObject {
  
  var path: EnvironmentnameOwner
  
  var query: js.UndefOr[PagePerpage] = js.undefined
}
object PathEnvironmentnameOwnerQuery {
  
  inline def apply(path: EnvironmentnameOwner): PathEnvironmentnameOwnerQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
