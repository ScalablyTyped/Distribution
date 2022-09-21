package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query585 extends StObject {
  
  var path: OwnerString
  
  var query: `585`
}
object Query585 {
  
  inline def apply(path: OwnerString, query: `585`): Query585 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query585]
  }
  
  extension [Self <: Query585](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `585`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
