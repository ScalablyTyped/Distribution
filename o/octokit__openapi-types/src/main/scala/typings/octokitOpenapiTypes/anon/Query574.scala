package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query574 extends StObject {
  
  var path: OwnerReleaseid
  
  var query: `574`
}
object Query574 {
  
  inline def apply(path: OwnerReleaseid, query: `574`): Query574 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query574]
  }
  
  extension [Self <: Query574](x: Self) {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `574`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
