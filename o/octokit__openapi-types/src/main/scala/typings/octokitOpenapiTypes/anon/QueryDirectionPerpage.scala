package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDirectionPerpage extends StObject {
  
  var path: OwnerString
  
  var query: DirectionPerpage
}
object QueryDirectionPerpage {
  
  inline def apply(path: OwnerString, query: DirectionPerpage): QueryDirectionPerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDirectionPerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDirectionPerpage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
