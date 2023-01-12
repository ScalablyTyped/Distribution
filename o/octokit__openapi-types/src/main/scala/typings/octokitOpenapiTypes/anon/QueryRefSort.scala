package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRefSort extends StObject {
  
  var path: OwnerString
  
  var query: RefSort
}
object QueryRefSort {
  
  inline def apply(path: OwnerString, query: RefSort): QueryRefSort = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRefSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRefSort] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: RefSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
