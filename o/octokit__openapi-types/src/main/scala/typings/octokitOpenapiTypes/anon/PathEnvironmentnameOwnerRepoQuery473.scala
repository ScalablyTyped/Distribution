package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameOwnerRepoQuery473 extends StObject {
  
  var path: EnvironmentnameOwnerRepo
  
  var query: `473`
}
object PathEnvironmentnameOwnerRepoQuery473 {
  
  inline def apply(path: EnvironmentnameOwnerRepo, query: `473`): PathEnvironmentnameOwnerRepoQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameOwnerRepoQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameOwnerRepoQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
