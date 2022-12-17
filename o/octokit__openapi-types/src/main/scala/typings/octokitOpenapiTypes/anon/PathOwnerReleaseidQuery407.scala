package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerReleaseidQuery407 extends StObject {
  
  var path: OwnerReleaseid
  
  var query: `407`
}
object PathOwnerReleaseidQuery407 {
  
  inline def apply(path: OwnerReleaseid, query: `407`): PathOwnerReleaseidQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerReleaseidQuery407]
  }
  
  extension [Self <: PathOwnerReleaseidQuery407](x: Self) {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
