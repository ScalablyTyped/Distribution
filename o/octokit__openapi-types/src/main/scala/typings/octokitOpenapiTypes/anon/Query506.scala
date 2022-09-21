package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query506 extends StObject {
  
  var path: OwnerString
  
  var query: `506`
}
object Query506 {
  
  inline def apply(path: OwnerString, query: `506`): Query506 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query506]
  }
  
  extension [Self <: Query506](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `506`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
