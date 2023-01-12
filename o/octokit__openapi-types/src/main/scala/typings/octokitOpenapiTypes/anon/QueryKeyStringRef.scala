package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryKeyStringRef extends StObject {
  
  var path: OwnerString
  
  var query: KeyStringRef
}
object QueryKeyStringRef {
  
  inline def apply(path: OwnerString, query: KeyStringRef): QueryKeyStringRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryKeyStringRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryKeyStringRef] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: KeyStringRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
