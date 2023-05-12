package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLast extends StObject {
  
  var path: OwnerString
  
  var query: Last
}
object QueryLast {
  
  inline def apply(path: OwnerString, query: Last): QueryLast = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLast]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryLast] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Last): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
