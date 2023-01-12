package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageProtected extends StObject {
  
  var path: OwnerString
  
  var query: PerpageProtected
}
object QueryPerpageProtected {
  
  inline def apply(path: OwnerString, query: PerpageProtected): QueryPerpageProtected = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageProtected]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPerpageProtected] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageProtected): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
