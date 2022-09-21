package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path361QueryPerpageState extends StObject {
  
  var path: `361`
  
  var query: PerpageState
}
object Path361QueryPerpageState {
  
  inline def apply(path: `361`, query: PerpageState): Path361QueryPerpageState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path361QueryPerpageState]
  }
  
  extension [Self <: Path361QueryPerpageState](x: Self) {
    
    inline def setPath(value: `361`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
