package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCheckrunidOwnerQuery250 extends StObject {
  
  var path: CheckrunidOwner
  
  var query: `250`
}
object PathCheckrunidOwnerQuery250 {
  
  inline def apply(path: CheckrunidOwner, query: `250`): PathCheckrunidOwnerQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCheckrunidOwnerQuery250]
  }
  
  extension [Self <: PathCheckrunidOwnerQuery250](x: Self) {
    
    inline def setPath(value: CheckrunidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
