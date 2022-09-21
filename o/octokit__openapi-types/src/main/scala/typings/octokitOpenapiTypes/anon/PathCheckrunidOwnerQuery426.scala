package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCheckrunidOwnerQuery426 extends StObject {
  
  var path: CheckrunidOwner
  
  var query: `426`
}
object PathCheckrunidOwnerQuery426 {
  
  inline def apply(path: CheckrunidOwner, query: `426`): PathCheckrunidOwnerQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCheckrunidOwnerQuery426]
  }
  
  extension [Self <: PathCheckrunidOwnerQuery426](x: Self) {
    
    inline def setPath(value: CheckrunidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
