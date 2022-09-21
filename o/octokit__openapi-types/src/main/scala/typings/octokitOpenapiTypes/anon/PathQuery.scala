package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathQuery extends StObject {
  
  var path: Enterpriseororg
  
  var query: Dateend
}
object PathQuery {
  
  inline def apply(path: Enterpriseororg, query: Dateend): PathQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathQuery]
  }
  
  extension [Self <: PathQuery](x: Self) {
    
    inline def setPath(value: Enterpriseororg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Dateend): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
