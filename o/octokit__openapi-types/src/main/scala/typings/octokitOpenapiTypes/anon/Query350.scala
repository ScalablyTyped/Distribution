package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query350 extends StObject {
  
  var path: `300`
  
  var query: `350`
}
object Query350 {
  
  inline def apply(path: `300`, query: `350`): Query350 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query350]
  }
  
  extension [Self <: Query350](x: Self) {
    
    inline def setPath(value: `300`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `350`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
