package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageRef extends StObject {
  
  var path: AlertnumberOwner
  
  var query: PagePerpageRef
}
object QueryPagePerpageRef {
  
  inline def apply(path: AlertnumberOwner, query: PagePerpageRef): QueryPagePerpageRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageRef]
  }
  
  extension [Self <: QueryPagePerpageRef](x: Self) {
    
    inline def setPath(value: AlertnumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
