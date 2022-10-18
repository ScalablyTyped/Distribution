package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathUsernameStringQueryPagePerpageState extends StObject {
  
  var path: UsernameString
  
  var query: PagePerpageState
}
object PathUsernameStringQueryPagePerpageState {
  
  inline def apply(path: UsernameString, query: PagePerpageState): PathUsernameStringQueryPagePerpageState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathUsernameStringQueryPagePerpageState]
  }
  
  extension [Self <: PathUsernameStringQueryPagePerpageState](x: Self) {
    
    inline def setPath(value: UsernameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
