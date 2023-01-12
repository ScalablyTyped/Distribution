package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRef extends StObject {
  
  var path: Owner
  
  var query: Ref
}
object QueryRef {
  
  inline def apply(path: Owner, query: Ref): QueryRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRef] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Ref): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
