package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageRole extends StObject {
  
  var path: Teamslug
  
  var query: PerpageRole
}
object QueryPerpageRole {
  
  inline def apply(path: Teamslug, query: PerpageRole): QueryPerpageRole = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPerpageRole] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Teamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageRole): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
