package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query432 extends StObject {
  
  var path: `292`
  
  var query: `432`
}
object Query432 {
  
  inline def apply(path: `292`, query: `432`): Query432 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query432]
  }
  
  extension [Self <: Query432](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `432`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
