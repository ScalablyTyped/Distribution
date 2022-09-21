package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerStringQuery197 extends StObject {
  
  var path: OwnerString
  
  var query: `197`
}
object PathOwnerStringQuery197 {
  
  inline def apply(path: OwnerString, query: `197`): PathOwnerStringQuery197 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerStringQuery197]
  }
  
  extension [Self <: PathOwnerStringQuery197](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `197`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
