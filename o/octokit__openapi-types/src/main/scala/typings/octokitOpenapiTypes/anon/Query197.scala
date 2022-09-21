package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query197 extends StObject {
  
  var path: Owner
  
  var query: `197`
}
object Query197 {
  
  inline def apply(path: Owner, query: `197`): Query197 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query197]
  }
  
  extension [Self <: Query197](x: Self) {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `197`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
