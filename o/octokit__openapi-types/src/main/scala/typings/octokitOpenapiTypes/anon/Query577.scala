package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query577 extends StObject {
  
  var path: OwnerReleaseid
  
  var query: `577`
}
object Query577 {
  
  inline def apply(path: OwnerReleaseid, query: `577`): Query577 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query577]
  }
  
  extension [Self <: Query577](x: Self) {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `577`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
