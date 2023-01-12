package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRefRepo extends StObject {
  
  var path: OwnerRefRepo
  
  var query: `434`
}
object PathOwnerRefRepo {
  
  inline def apply(path: OwnerRefRepo, query: `434`): PathOwnerRefRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRefRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerRefRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRefRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `434`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
