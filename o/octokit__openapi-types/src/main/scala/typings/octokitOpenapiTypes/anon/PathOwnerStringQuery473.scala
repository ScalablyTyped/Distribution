package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerStringQuery473 extends StObject {
  
  var path: OwnerString
  
  var query: `473`
}
object PathOwnerStringQuery473 {
  
  inline def apply(path: OwnerString, query: `473`): PathOwnerStringQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerStringQuery473]
  }
  
  extension [Self <: PathOwnerStringQuery473](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
