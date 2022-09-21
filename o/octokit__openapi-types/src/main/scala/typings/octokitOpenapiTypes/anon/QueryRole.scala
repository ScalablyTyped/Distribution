package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRole extends StObject {
  
  var path: Org
  
  var query: Role
}
object QueryRole {
  
  inline def apply(path: Org, query: Role): QueryRole = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRole]
  }
  
  extension [Self <: QueryRole](x: Self) {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Role): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
