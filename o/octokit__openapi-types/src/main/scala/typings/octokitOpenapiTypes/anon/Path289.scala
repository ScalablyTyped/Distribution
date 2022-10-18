package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path289 extends StObject {
  
  var path: `289`
  
  var query: DirectionPagePerpageSort
}
object Path289 {
  
  inline def apply(path: `289`, query: DirectionPagePerpageSort): Path289 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path289]
  }
  
  extension [Self <: Path289](x: Self) {
    
    inline def setPath(value: `289`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPagePerpageSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
