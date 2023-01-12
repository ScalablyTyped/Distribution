package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageRef extends StObject {
  
  var path: AlertnumberOwnerRepo
  
  var query: PagePerpageRef
}
object QueryPagePerpageRef {
  
  inline def apply(path: AlertnumberOwnerRepo, query: PagePerpageRef): QueryPagePerpageRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPagePerpageRef] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AlertnumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
