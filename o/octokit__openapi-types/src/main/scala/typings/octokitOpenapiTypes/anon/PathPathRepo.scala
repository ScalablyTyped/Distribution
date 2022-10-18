package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPathRepo extends StObject {
  
  var path: PathRepo
  
  var query: `107`
}
object PathPathRepo {
  
  inline def apply(path: PathRepo, query: `107`): PathPathRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPathRepo]
  }
  
  extension [Self <: PathPathRepo](x: Self) {
    
    inline def setPath(value: PathRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `107`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
