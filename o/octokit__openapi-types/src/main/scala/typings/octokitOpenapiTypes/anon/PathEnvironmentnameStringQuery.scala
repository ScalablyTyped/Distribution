package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameStringQuery extends StObject {
  
  var path: EnvironmentnameString
  
  var query: js.UndefOr[`591`] = js.undefined
}
object PathEnvironmentnameStringQuery {
  
  inline def apply(path: EnvironmentnameString): PathEnvironmentnameStringQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameStringQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `591`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
