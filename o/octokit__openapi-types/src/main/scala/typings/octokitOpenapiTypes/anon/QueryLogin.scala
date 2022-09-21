package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLogin extends StObject {
  
  var path: Org
  
  var query: Login
}
object QueryLogin {
  
  inline def apply(path: Org, query: Login): QueryLogin = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLogin]
  }
  
  extension [Self <: QueryLogin](x: Self) {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Login): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
