package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageProtected extends StObject {
  
  var path: `292`
  
  var query: PagePerpageProtected
}
object QueryPagePerpageProtected {
  
  inline def apply(path: `292`, query: PagePerpageProtected): QueryPagePerpageProtected = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageProtected]
  }
  
  extension [Self <: QueryPagePerpageProtected](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageProtected): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
