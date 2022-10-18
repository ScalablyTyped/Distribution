package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query89 extends StObject {
  
  var path: OwnerRepo
  
  var query: `89`
}
object Query89 {
  
  inline def apply(path: OwnerRepo, query: `89`): Query89 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query89]
  }
  
  extension [Self <: Query89](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `89`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
