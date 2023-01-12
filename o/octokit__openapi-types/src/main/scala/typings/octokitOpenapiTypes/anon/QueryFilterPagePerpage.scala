package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFilterPagePerpage extends StObject {
  
  var path: Runid
  
  var query: FilterPagePerpage
}
object QueryFilterPagePerpage {
  
  inline def apply(path: Runid, query: FilterPagePerpage): QueryFilterPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFilterPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryFilterPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Runid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: FilterPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
