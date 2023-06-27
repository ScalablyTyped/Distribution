package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameRepositoryidQuery extends StObject {
  
  var path: EnvironmentnameRepositoryid
  
  var query: js.UndefOr[`76`] = js.undefined
}
object PathEnvironmentnameRepositoryidQuery {
  
  inline def apply(path: EnvironmentnameRepositoryid): PathEnvironmentnameRepositoryidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameRepositoryidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameRepositoryidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameRepositoryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `76`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
