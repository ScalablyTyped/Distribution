package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPackagetype extends StObject {
  
  var path: Org
  
  var query: Packagetype
}
object QueryPackagetype {
  
  inline def apply(path: Org, query: Packagetype): QueryPackagetype = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPackagetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPackagetype] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Packagetype): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
