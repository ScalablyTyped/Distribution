package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query533 extends StObject {
  
  var path: OwnerString
  
  var query: `533`
}
object Query533 {
  
  inline def apply(path: OwnerString, query: `533`): Query533 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query533]
  }
  
  extension [Self <: Query533](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `533`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
