package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerStringQuery451 extends StObject {
  
  var path: OwnerString
  
  var query: `451`
}
object PathOwnerStringQuery451 {
  
  inline def apply(path: OwnerString, query: `451`): PathOwnerStringQuery451 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerStringQuery451]
  }
  
  extension [Self <: PathOwnerStringQuery451](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `451`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
