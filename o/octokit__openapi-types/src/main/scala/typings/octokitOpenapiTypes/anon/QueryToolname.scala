package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryToolname extends StObject {
  
  var path: `246`
  
  var query: Toolname
}
object QueryToolname {
  
  inline def apply(path: `246`, query: Toolname): QueryToolname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryToolname]
  }
  
  extension [Self <: QueryToolname](x: Self) {
    
    inline def setPath(value: `246`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Toolname): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
