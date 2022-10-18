package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathUsernameStringQuerySince extends StObject {
  
  var path: UsernameString
  
  var query: Since
}
object PathUsernameStringQuerySince {
  
  inline def apply(path: UsernameString, query: Since): PathUsernameStringQuerySince = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathUsernameStringQuerySince]
  }
  
  extension [Self <: PathUsernameStringQuerySince](x: Self) {
    
    inline def setPath(value: UsernameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Since): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
