package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query565 extends StObject {
  
  var path: OwnerString
  
  var query: `565`
}
object Query565 {
  
  inline def apply(path: OwnerString, query: `565`): Query565 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query565]
  }
  
  extension [Self <: Query565](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `565`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
