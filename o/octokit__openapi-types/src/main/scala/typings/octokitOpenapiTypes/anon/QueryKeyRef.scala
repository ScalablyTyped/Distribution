package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryKeyRef extends StObject {
  
  var path: Owner
  
  var query: KeyRef
}
object QueryKeyRef {
  
  inline def apply(path: Owner, query: KeyRef): QueryKeyRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryKeyRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryKeyRef] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: KeyRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
