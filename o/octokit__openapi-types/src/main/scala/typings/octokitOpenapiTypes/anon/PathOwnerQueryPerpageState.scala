package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerQueryPerpageState extends StObject {
  
  var path: Owner
  
  var query: PerpageState
}
object PathOwnerQueryPerpageState {
  
  inline def apply(path: Owner, query: PerpageState): PathOwnerQueryPerpageState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerQueryPerpageState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerQueryPerpageState] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
