package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathUsernameStringQueryPackagetype extends StObject {
  
  var path: UsernameString
  
  var query: Packagetype
}
object PathUsernameStringQueryPackagetype {
  
  inline def apply(path: UsernameString, query: Packagetype): PathUsernameStringQueryPackagetype = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathUsernameStringQueryPackagetype]
  }
  
  extension [Self <: PathUsernameStringQueryPackagetype](x: Self) {
    
    inline def setPath(value: UsernameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Packagetype): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
