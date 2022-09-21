package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerReleaseidQuery426 extends StObject {
  
  var path: OwnerReleaseid
  
  var query: `426`
}
object PathOwnerReleaseidQuery426 {
  
  inline def apply(path: OwnerReleaseid, query: `426`): PathOwnerReleaseidQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerReleaseidQuery426]
  }
  
  extension [Self <: PathOwnerReleaseidQuery426](x: Self) {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
