package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerReleaseidQuery250 extends StObject {
  
  var path: OwnerReleaseid
  
  var query: `250`
}
object PathOwnerReleaseidQuery250 {
  
  inline def apply(path: OwnerReleaseid, query: `250`): PathOwnerReleaseidQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerReleaseidQuery250]
  }
  
  extension [Self <: PathOwnerReleaseidQuery250](x: Self) {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
