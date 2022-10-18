package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathUsernameStringQueryPagePerpageSort extends StObject {
  
  var path: UsernameString
  
  var query: PagePerpageSort
}
object PathUsernameStringQueryPagePerpageSort {
  
  inline def apply(path: UsernameString, query: PagePerpageSort): PathUsernameStringQueryPagePerpageSort = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathUsernameStringQueryPagePerpageSort]
  }
  
  extension [Self <: PathUsernameStringQueryPagePerpageSort](x: Self) {
    
    inline def setPath(value: UsernameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
