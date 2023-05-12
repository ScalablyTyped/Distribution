package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path370QueryPerpageState extends StObject {
  
  var path: `370`
  
  var query: PerpageState
}
object Path370QueryPerpageState {
  
  inline def apply(path: `370`, query: PerpageState): Path370QueryPerpageState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path370QueryPerpageState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path370QueryPerpageState] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `370`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
