package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPlanid extends StObject {
  
  var path: Planid
  
  var query: Sort
}
object PathPlanid {
  
  inline def apply(path: Planid, query: Sort): PathPlanid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPlanid]
  }
  
  extension [Self <: PathPlanid](x: Self) {
    
    inline def setPath(value: Planid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Sort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
